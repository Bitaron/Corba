import CosEventChannelAdmin.AlreadyConnected;
import CosEventComm.Disconnected;
import CosNotification.*;
import CosNotifyChannelAdmin.*;
import CosNotifyComm.InvalidEventType;
import CosNotifyComm.StructuredPushSupplierHelper;
import CosNotifyComm.StructuredPushSupplierOperations;
import CosNotifyComm.StructuredPushSupplierPOA;
import HelloApp.Hello;
import HelloApp.HelloHelper;
import HelloApp.HelloPOA;
import com.sun.corba.se.impl.orb.ORBImpl;
import org.omg.CORBA.IntHolder;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;


public class HelloServer {

    static class HelloImp extends HelloPOA implements StructuredPushSupplierOperations {

        private POA rootPoa;
        private ORB orb;
        private EventChannel channel;
        int count = 0;

        public HelloImp(POA rootPoa, ORB orb, EventChannel channel) {
            this.rootPoa = rootPoa;
            this.orb = orb;
            this.channel = channel;
        }

        @Override
        public void disconnect_structured_push_supplier() {

        }

        @Override
        public void subscription_change(EventType[] added, EventType[] removed) throws InvalidEventType {

        }

        @Override
        public String sayHello() {
            return "helo";
        }

        @Override
        public void send() {
            count++;
            new NotificationSender().connect(channel, orb, rootPoa);
        }

        @Override
        public void shutdown() {

        }
    }

    public static void main(String args[]) {
        try {
            /*Properties props = new Properties();
    *//*props.setProperty("borland.enterprise.licenseDefaultDir", "C:/Borland/VisiBroker/license");*//*
            *//*props.setProperty("org.omg.CORBA.ORBClass", "com.inprise.vbroker.orb.ORB");
            props.setProperty("org.omg.CORBA.ORBSingletonClass", "com.inprise.vbroker.orb.ORBSingleton");
            props.setProperty("javax.rmi.CORBA.StubClass", "com.inprise.vbroker.rmi.CORBA.StubImpl");
            props.setProperty("javax.rmi.CORBA.UtilClass", "com.inprise.vbroker.rmi.CORBA.UtilImpl");
            props.setProperty("javax.rmi.CORBA.PortableRemoteObjectClass", "com.inprise.vbroker.rmi.CORBA.PortableRemoteObjectImpl");
            props.setProperty("vbroker.agent.enableLocator", "false");*//*
            //  props.setProperty("vbroker.orb.initRef", "NotificationService=IOR:000000000000003A49444C3A6F72672F6A61636F72622F6E6F74696669636174696F6E2F4A61634F52424576656E744368616E6E656C466163746F72793A312E30000000000000010000000000000118000102000000000F31302E3232312E3232322E3139310000D49200000000003D393433323333343838322F4E6F7469667953657276696365504F412F4576656E744368616E6E656C466163746F7279504F412F5F4543466163746F7279000000000000050000000300000018000000000000000D3139322E3136382E312E31320000D4920000000300000018000000000000000D3139322E3136382E322E31320000D492000000030000002E0000000000000023323030313A303A396433383A366162643A3861653A3465333A346232643A363863620000D49200000000000000000008000000004A41430000000001000000240000000000010001000000020001000F0501000100010109000000020501000100010100");*/
            // create and initialize the ORB
            String defArgs[] = new String[]{"-ORBInitialPort", "1050", "-ORBInitialHost", "10.221.222.191"};
            ORB orb = ORB.init(defArgs, null);

            ((ORBImpl) orb).register_initial_reference("NotificationService", orb.string_to_object("IOR:000000000000003A49444C3A6F72672F6A61636F72622F6E6F74696669636174696F6E2F4A61634F52424576656E744368616E6E656C466163746F72793A312E30000000000000010000000000000118000102000000000F31302E3232312E3232322E3139310000F0CA00000000003D323531383436393434352F4E6F7469667953657276696365504F412F4576656E744368616E6E656C466163746F7279504F412F5F4543466163746F7279000000000000050000000300000018000000000000000D3139322E3136382E312E31320000F0CA0000000300000018000000000000000D3139322E3136382E322E31320000F0CA000000030000002E0000000000000023323030313A303A396433383A366162643A3861653A3465333A346232643A363863620000F0CA00000000000000000008000000004A41430000000001000000240000000000010001000000020001000F0501000100010109000000020501000100010100"));
            // get reference to rootpoa & activate the POAManager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            Object notificationObject = orb.resolve_initial_references("NotificationService");

            // get the root naming context
            // NameService invokes the name service
            org.omg.CORBA.Object objRef =
                    orb.resolve_initial_references("NameService");
            // Use NamingContextExt which is part of the Interoperable
            // Naming Service (INS) specification.
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            EventChannelFactory eventChannelFactory = EventChannelFactoryHelper.narrow(notificationObject);

            IntHolder idHolder = new IntHolder();
            Property[] qos = new Property[0];
            Property[] adm = new Property[0];

            EventChannel channel = eventChannelFactory.create_channel(qos, adm, idHolder);
            ncRef.rebind(ncRef.to_name("testChanel"), channel);

            HelloImp helloImp = new HelloImp(rootpoa, orb, channel);
            Object ref = rootpoa.servant_to_reference(helloImp);
            Hello hello = HelloHelper.narrow(ref);

            ncRef.rebind(ncRef.to_name("Sender"), hello);
            //ncRef.bind(ncRef);

            //****************************************


            // wait for invocations from clients
            orb.run();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }

        System.out.println("HelloServer Exiting ...");

    }


    public static class NotificationSender extends StructuredPushSupplierPOA {

        @Override
        public void disconnect_structured_push_supplier() {

        }

        @Override
        public void subscription_change(EventType[] added, EventType[] removed) throws InvalidEventType {

        }

        private void connect(EventChannel channel, ORB orb, POA rootpoa) {
            // Get the default supplier admin object for this channel
            SupplierAdmin admin = channel.default_supplier_admin();
            // Now ask the admin for a reference to a push consumer proxy
            ClientType ctype = ClientType.STRUCTURED_EVENT;
            org.omg.CORBA.IntHolder pid = new org.omg.CORBA.IntHolder();
            //    ProxyConsumer proxy = null;
            StructuredProxyPushConsumer pushConsumer = null;
            try {
                //     proxy = admin.obtain_notification_push_consumer(ctype, pid);
                pushConsumer = StructuredProxyPushConsumerHelper.narrow(
                        admin.obtain_notification_push_consumer(ctype, pid));
            } catch (AdminLimitExceeded ex) {
                ex.printStackTrace();
            }
            //  StructuredProxyPushConsumer sp = StructuredProxyPushConsumerHelper.narrow(proxy);
            try {
                // connect to the channel
                //  sp.connect_structured_push_supplier(StructuredPushSupplierHelper.narrow(rootpoa.servant_to_reference(this)));
                pushConsumer.connect_structured_push_supplier(StructuredPushSupplierHelper.narrow(rootpoa.servant_to_reference(this)));

                pushConsumer.push_structured_event(getEvent(orb));

            } catch (AlreadyConnected alreadyConnected) {
                alreadyConnected.printStackTrace();
            } catch (ServantNotActive servantNotActive) {
                servantNotActive.printStackTrace();
            } catch (WrongPolicy wrongPolicy) {
                wrongPolicy.printStackTrace();
            } catch (Disconnected disconnected) {
                disconnected.printStackTrace();
            }
        }

        private StructuredEvent getEvent(ORB orb) {
            // domain, type, event name
            EventType type = new EventType("example", "test");
            FixedEventHeader fixed = new FixedEventHeader(type, "event");

// variable header, NV Pairs
// Let's add a priority QoS
            Property variable[] = new Property[1];
            variable[0] = new Property();
            variable[0].name = Priority.value;
            variable[0].value = orb.create_any();
            variable[0].value.insert_short((short) 3);

// Filterable data, NV Pairs
// Remember these are user defined and can be anything.
            Property filterable[] = new Property[1];
            filterable[0] = new Property();
            filterable[0].name = "name";
            filterable[0].value = orb.create_any();
            filterable[0].value.insert_long(11);

// Event Data
            org.omg.CORBA.Any data = orb.create_any();
            data.insert_string("Hello World");

// We have finished creating all the distinct pieces
// Now let's create a structured event
            StructuredEvent event = new StructuredEvent();
            event.header = new EventHeader(fixed, variable);
            event.filterable_data = filterable;
            event.remainder_of_body = data;
            return event;
        }

    }

}
