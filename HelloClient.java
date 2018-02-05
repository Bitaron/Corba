import HelloApp.Hello;
import HelloApp.Hello2ListHolder;
import HelloApp.HelloHelper;
import HelloApp.SampleIteratorHolder;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class HelloClient {
    static Hello helloImpl;

    public static void main(String args[]) {
        try {
            String defArgs[] = new String[]{"-ORBInitialPort", "1050", "-ORBInitialHost", "10.221.222.191"};
            ORB orb = ORB.init(defArgs, null);

            // get the root naming context
            org.omg.CORBA.Object objRef =
                    orb.resolve_initial_references("NameService");
            // Use NamingContextExt instead of NamingContext. This is
            // part of the Interoperable naming Service.
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // resolve the Object Reference in Naming
            String name = "Hello";
            helloImpl = HelloHelper.narrow(ncRef.resolve_str(name));

            System.out.println("Obtained a handle on server object: " + helloImpl);
            System.out.println("Testing general hello call...");
            System.out.println(helloImpl.sayHello());
            Hello2ListHolder hello2ListHolder = new Hello2ListHolder();
            SampleIteratorHolder sampleIteratorHolder = new SampleIteratorHolder();
            System.out.println("Before server call...");
            System.out.println(hello2ListHolder.value);
            System.out.println(sampleIteratorHolder.value);
            System.out.println("Calling server...");
            helloImpl.getHello2(10, hello2ListHolder, sampleIteratorHolder);
            System.out.println("Initial Fetched: " + hello2ListHolder.value[0].id + " to " + hello2ListHolder.value[hello2ListHolder.value.length - 1].id);
            System.out.println("After server call...");
            System.out.println(hello2ListHolder.value.length);
            for (int i = 0; i < 9; i++) {
                Hello2ListHolder meList = new Hello2ListHolder();
                sampleIteratorHolder.value.next_n(10, meList);
                System.out.println("Fetched size " + meList.value.length);
                if (meList.value.length > 0) {
                    System.out.println("Fetched: " + meList.value[0].id + " to " + meList.value[meList.value.length - 1].id);
                }
            }

            long size = sampleIteratorHolder.value.getLength();
            System.out.println(size);

            // helloImpl.shutdown();

        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }

}
