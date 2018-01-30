import HelloApp.Hello;
import HelloApp.HelloHelper;
import HelloApp.HelloPOA;
import HelloApp2.Hello2;
import HelloApp2.Hello2Holder;
import HelloApp2.Hello2POA;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

class HelloImpl extends HelloPOA {
    private ORB orb;
    private Hello2 hello2;

    public void setHello2(Hello2 hello2) {
        this.hello2 = hello2;
    }

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    // implement sayHello() method
    public String sayHello() {
        return "\nHello world !!\n";
    }

    @Override
    public void getHello2(Hello2Holder hello2Holder) {
        hello2Holder.value = hello2;
    }

    // implement shutdown() method
    public void shutdown() {
        orb.shutdown(false);
    }
}

class Hello2Impl extends Hello2POA {

    @Override
    public String sayHello2() {
        System.out.println("In hello2 implementation.");
        return "Saying hello 2";
    }
}


public class HelloServer {

    public static void main(String args[]) {
        try {
            // create and initialize the ORB
            ORB orb = ORB.init(args, null);

            // get reference to rootpoa & activate the POAManager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();



            Hello2Impl hello2ImpL = new Hello2Impl();

            // create servant and register it with the ORB
            HelloImpl helloImpl = new HelloImpl();
            helloImpl.setORB(orb);


            // get object reference from the servant
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(helloImpl);
            Hello href = HelloHelper.narrow(ref);

             rootpoa.servant_to_reference(hello2ImpL);

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


            helloImpl.setHello2(hello2ImpL._this());
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
