import CosNotification.EventType;
import CosNotification.FixedEventHeader;
import CosNotification.Property;
import CosNotification.StructuredEvent;
import CosNotifyChannelAdmin.*;
import CosNotifyComm.InvalidEventType;
import CosNotifyComm.StructuredPullConsumer;
import CosNotifyComm.StructuredPullConsumerPOA;
import CosNotifyFilter.ConstraintExp;
import CosNotifyFilter.Filter;
import CosNotifyFilter.FilterFactory;
import HelloApp.Hello;
import HelloApp.HelloHelper;
import org.omg.CORBA.IntHolder;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import java.util.Properties;


public class HelloClient {

    public static void main(String args[]) {
        try {
            Properties props = new Properties();
    /*props.setProperty("borland.enterprise.licenseDefaultDir", "C:/Borland/VisiBroker/license");*/
            /*props.setProperty("org.omg.CORBA.ORBClass", "com.inprise.vbroker.orb.ORB");
            props.setProperty("org.omg.CORBA.ORBSingletonClass", "com.inprise.vbroker.orb.ORBSingleton");
            props.setProperty("javax.rmi.CORBA.StubClass", "com.inprise.vbroker.rmi.CORBA.StubImpl");
            props.setProperty("javax.rmi.CORBA.UtilClass", "com.inprise.vbroker.rmi.CORBA.UtilImpl");
            props.setProperty("javax.rmi.CORBA.PortableRemoteObjectClass", "com.inprise.vbroker.rmi.CORBA.PortableRemoteObjectImpl");
            props.setProperty("vbroker.agent.enableLocator", "false");*/
            props.setProperty("vbroker.orb.initRef", "NotificationService=IOR:000000000000003A49444C3A6F72672F6A61636F72622F6E6F74696669636174696F6E2F4A61634F52424576656E744368616E6E656C466163746F72793A312E30000000000000010000000000000118000102000000000F31302E3232312E3232322E3139310000D49200000000003D393433323333343838322F4E6F7469667953657276696365504F412F4576656E744368616E6E656C466163746F7279504F412F5F4543466163746F7279000000000000050000000300000018000000000000000D3139322E3136382E312E31320000D4920000000300000018000000000000000D3139322E3136382E322E31320000D492000000030000002E0000000000000023323030313A303A396433383A366162643A3861653A3465333A346232643A363863620000D49200000000000000000008000000004A41430000000001000000240000000000010001000000020001000F0501000100010109000000020501000100010100");
            // create and initialize the ORB
            String defArgs[] = new String[]{"-ORBInitialPort", "1050", "-ORBInitialHost", "10.221.222.191"};
            ORB orb = ORB.init(defArgs, null);
            // get the root naming context
            org.omg.CORBA.Object objRef =
                    orb.resolve_initial_references("NameService");
            // Use NamingContextExt instead of NamingContext. This is
            // part of the Interoperable naming Service.
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // resolve the Object Reference in Naming
            EventChannel channel = EventChannelHelper.narrow(ncRef.resolve(ncRef.to_name("testChanel")));
            StructuredPullConsumer structuredPullConsumer =  new NotificationClient()._this(orb);

            Hello hello = HelloHelper.narrow(ncRef.resolve(ncRef.to_name("Sender")));



            // get the admin interface and the supplier proxy
            ConsumerAdmin consumerAdmin = channel.default_consumer_admin();

            StructuredProxyPullSupplier proxyPullSupplier = StructuredProxyPullSupplierHelper.narrow(
                    consumerAdmin.obtain_notification_pull_supplier(
                            ClientType.STRUCTURED_EVENT,
                            new IntHolder()));

            // connect ourselves to the event channel
            proxyPullSupplier.connect_structured_pull_consumer(structuredPullConsumer);

            FilterFactory filterFactory = channel.default_filter_factory();
            Filter filter = filterFactory.create_filter("EXTENDED_TCL");
            EventType[] eventTypes = new EventType[] {
                    new EventType("example", "test")
            };
            ConstraintExp constraintExp = new ConstraintExp(eventTypes, "$.header.fixed_header.event_name == 'event'");
            filter.add_constraints(new ConstraintExp[]{constraintExp});
            proxyPullSupplier.add_filter(filter);

            org.omg.CORBA.BooleanHolder bh =
                    new org.omg.CORBA.BooleanHolder();


            System.out.println("Looking for structured events....");


            for (int i = 0; i<5  ; i++) {
                hello.send();
                Thread.currentThread().sleep(7000);
                StructuredEvent event =
                        proxyPullSupplier.try_pull_structured_event(bh);

                if (bh.value) {
                    System.out.println("got structured event.");
                    FixedEventHeader fixed_header = event.header.fixed_header;
                    System.out.println("\t" + fixed_header.event_type.domain_name + "." +
                            fixed_header.event_type.type_name + "#" +
                            fixed_header.event_name);
                    /*Property properties[] = event.filterable_data;
                    System.out.println("\t" + properties[0].name +
                            " : " + properties[0].value.extract_long());
                    System.out.println("\t" + properties[1].name +
                            " : " + properties[1].value.extract_string());*/


                }
                Thread.currentThread().sleep(2000);
            }

            // helloImpl.shutdown();

        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }

    public static class NotificationClient extends StructuredPullConsumerPOA {

        @Override
        public void disconnect_structured_pull_consumer() {

        }

        @Override
        public void offer_change(EventType[] added, EventType[] removed) throws InvalidEventType {

        }
    }
}
