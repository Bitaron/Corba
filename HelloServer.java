import HelloApp.*;
import HelloApp2.Hello2;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAPackage.ObjectNotActive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

import java.util.ArrayList;
import java.util.List;


class HelloImpl extends HelloPOA {
    static List<Hello2> Hello2Repository = new ArrayList<>(100);

    static {
        for (int i = 0; i < 100; i++) {
            Hello2 hello21 = new Hello2(String.valueOf(i));
            Hello2Repository.add(hello21);
        }
    }

    private ORB orb;
    private POA rootPoa;
    private SampleIteratorImpl sampleIterator;

    public void setSampleIterator(SampleIteratorImpl sampleIterator) {
        this.sampleIterator = sampleIterator;
    }

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    public void setRootPoa(POA rootPoa) {
        this.rootPoa = rootPoa;
    }

    // implement sayHello() method
    public String sayHello() {
        return "\nHello world !!\n";
    }

    @Override
    public void getHello2(int how_many, Hello2ListHolder hello2List, SampleIteratorHolder iterator) {
        List<Hello2> listToReturn = new ArrayList<>();
        for (int i = 0; i <= how_many; i++) {
            listToReturn.add(Hello2Repository.get(i));
        }
        hello2List.value = listToReturn.toArray(new Hello2[how_many]);
        try {
            // Add iterator.
            SampleIteratorImpl sampleIterator = new SampleIteratorImpl(rootPoa, how_many, listToReturn.size() - 1);
            Object itObject = rootPoa.servant_to_reference(sampleIterator);
            iterator.value = SampleIteratorHelper.narrow(itObject);
        } catch (ServantNotActive servantNotActive) {
            servantNotActive.printStackTrace();
        } catch (WrongPolicy wrongPolicy) {
            wrongPolicy.printStackTrace();
        }
    }


    // implement shutdown() method
    public void shutdown() {
        orb.shutdown(false);
    }
}

class SampleIteratorImpl extends SampleIteratorPOA {
    private int initialDataReturned = 0;
    private int lastIdFetched = -1;
    private POA rootPoa;

    public SampleIteratorImpl(POA rootPoa, int initialDataReturned, int lastIdFetched) {
        this.rootPoa = rootPoa;
        this.initialDataReturned = initialDataReturned;
        this.lastIdFetched = lastIdFetched;
    }

    @Override
    public boolean next_n(int how_many, Hello2ListHolder meList) {
        int remainingObject = getLength() - lastIdFetched;
        if (how_many == 0 && remainingObject > 0) {
            return true;
        }

        boolean dataRemain = true;
        if (remainingObject < how_many) {
            dataRemain = false;
        }

        if (dataRemain) {
            meList.value = getData(lastIdFetched, how_many);
            this.lastIdFetched = lastIdFetched + how_many;
            return true;
        } else {
            meList.value = getData(lastIdFetched, remainingObject);
            destroy();
            return false;
        }
    }

    private Hello2[] getData(int lastIdFetched, int how_many) {
        Hello2[] hello2s = new Hello2[how_many ];
        int count = 0;
        for (int i = (lastIdFetched + 1); i < lastIdFetched + 1 + how_many; i++) {
            if (i < HelloImpl.Hello2Repository.size()) {
                hello2s[count] = HelloImpl.Hello2Repository.get(i);
                count++;
            }
        }

        return hello2s;
    }

    @Override
    public int getLength() {
        int size = HelloImpl.Hello2Repository.size() - initialDataReturned;
        return size;
    }

    @Override
    public void destroy() {
       deactivate();
    }

    private void deactivate() {
        try {
            rootPoa.deactivate_object(rootPoa.servant_to_id(this));
        } catch (ObjectNotActive objectNotActive) {
            objectNotActive.printStackTrace();
        } catch (WrongPolicy wrongPolicy) {
            wrongPolicy.printStackTrace();
        } catch (ServantNotActive servantNotActive) {
            servantNotActive.printStackTrace();
        }
    }
}


public class HelloServer {

    public static void main(String args[]) {
        try {
            String defArgs[] = new String[]{"-ORBInitialPort", "1050", "-ORBInitialHost", "10.221.222.191"};
            ORB orb = ORB.init(defArgs, null);

            // get reference to rootpoa & activate the POAManager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();


            // create servant and register it with the ORB
            HelloImpl helloImpl = new HelloImpl();
            helloImpl.setORB(orb);
            helloImpl.setRootPoa(rootpoa);


            // get object reference from the servant
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(helloImpl);
            Hello href = HelloHelper.narrow(ref);


            // get the root naming context
            // NameService invokes the name service
            org.omg.CORBA.Object objRef =
                    orb.resolve_initial_references("NameService");
            // Use NamingContextExt which is part of the Interoperable
            // Naming Service (INS) specification.
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // bind the Object Reference in Naming
            String name = "Hello";
            NameComponent path[] = ncRef.to_name(name);
            ncRef.rebind(path, href);

            System.out.println("HelloServer ready and waiting ...");

            // wait for invocations from clients
            orb.run();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }

        System.out.println("HelloServer Exiting ...");

    }
}
