package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/EventChannelFactoryPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:10 PM BDT
*/


/**
    * An interface for the event channel factory.
    */
public abstract class EventChannelFactoryPOA extends org.omg.PortableServer.Servant
 implements CosNotifyChannelAdmin.EventChannelFactoryOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("create_channel", new java.lang.Integer (0));
    _methods.put ("get_all_channels", new java.lang.Integer (1));
    _methods.put ("get_event_channel", new java.lang.Integer (2));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /**
         * Create an event channel with specified quality of service.
         * @parm <code>initial_qos</code> - A list of name-value pair that
         * specify the desired quality of service settings for this event
         * channel.
         * @parm <code>initial_admin</code> - A list of name-value pair that
         * specify the desired administrative settings for this event channel.
         * @returns A new event channel object reference.
         * @raises UnsupportedQoS If any of the settings in the
         * <code>initial_qos</code> sequence could not be supported.
         * @raises UnsupportedAdmin If any of the settings in the
         * <code>initial_admin</code> sequence could not be supported.
         */
       case 0:  // CosNotifyChannelAdmin/EventChannelFactory/create_channel
       {
         try {
           CosNotification.Property initial_qos[] = CosNotification.QoSPropertiesHelper.read (in);
           CosNotification.Property initial_admin[] = CosNotification.AdminPropertiesHelper.read (in);
           org.omg.CORBA.IntHolder id = new org.omg.CORBA.IntHolder ();
           CosNotifyChannelAdmin.EventChannel $result = null;
           $result = this.create_channel (initial_qos, initial_admin, id);
           out = $rh.createReply();
           CosNotifyChannelAdmin.EventChannelHelper.write (out, $result);
           CosNotifyChannelAdmin.ChannelIDHelper.write (out, id.value);
         } catch (CosNotification.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           CosNotification.UnsupportedQoSHelper.write (out, $ex);
         } catch (CosNotification.UnsupportedAdmin $ex) {
           out = $rh.createExceptionReply ();
           CosNotification.UnsupportedAdminHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Get all event channels created by this factory.
         * @returns A sequence of channel object unique identifiers.
         */
       case 1:  // CosNotifyChannelAdmin/EventChannelFactory/get_all_channels
       {
         int $result[] = null;
         $result = this.get_all_channels ();
         out = $rh.createReply();
         CosNotifyChannelAdmin.ChannelIDSeqHelper.write (out, $result);
         break;
       }


  /**
         * Get an event channel object from its ID.
         * @parm <code>id</code> - A unique identifier for the channel object.
         * @returns An <code>EventChannel</code> object reference.
         * @raises ChannelNotFound If no channel object with that ID
         * could be found.
         */
       case 2:  // CosNotifyChannelAdmin/EventChannelFactory/get_event_channel
       {
         try {
           int id = CosNotifyChannelAdmin.ChannelIDHelper.read (in);
           CosNotifyChannelAdmin.EventChannel $result = null;
           $result = this.get_event_channel (id);
           out = $rh.createReply();
           CosNotifyChannelAdmin.EventChannelHelper.write (out, $result);
         } catch (CosNotifyChannelAdmin.ChannelNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyChannelAdmin.ChannelNotFoundHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyChannelAdmin/EventChannelFactory:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public EventChannelFactory _this() 
  {
    return EventChannelFactoryHelper.narrow(
    super._this_object());
  }

  public EventChannelFactory _this(org.omg.CORBA.ORB orb) 
  {
    return EventChannelFactoryHelper.narrow(
    super._this_object(orb));
  }


} // class EventChannelFactoryPOA