package CosNotifyComm;


/**
* CosNotifyComm/PushConsumerPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyComm.idl
* Thursday, February 1, 2018 2:55:10 PM BDT
*/


/**
    * An interface for push consumers.
    */
public abstract class PushConsumerPOA extends org.omg.PortableServer.Servant
 implements CosNotifyComm.PushConsumerOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("offer_change", new java.lang.Integer (0));
    _methods.put ("push", new java.lang.Integer (1));
    _methods.put ("disconnect_push_consumer", new java.lang.Integer (2));
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
         * Indicates that a supplier is changing the names of the types of
         * events it is publishing.
         * @parm <code>added</code> - The event types added.
         * @parm <code>removed</code> - The event types removed.
         * @raises InvalidEventType If any of the event type names in either 
         * the of the input sequences are invalid.
         */
       case 0:  // CosNotifyComm/NotifyPublish/offer_change
       {
         try {
           CosNotification.EventType added[] = CosNotification.EventTypeSeqHelper.read (in);
           CosNotification.EventType removed[] = CosNotification.EventTypeSeqHelper.read (in);
           this.offer_change (added, removed);
           out = $rh.createReply();
         } catch (CosNotifyComm.InvalidEventType $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyComm.InvalidEventTypeHelper.write (out, $ex);
         }
         break;
       }


  /**
       * Push an event onto this consumer.
       * @parm <code>data</code> - The event data.
       * @raises Disconnected If this consumer is disconnected.
       */
       case 1:  // CosEventComm/PushConsumer/push
       {
         try {
           org.omg.CORBA.Any data = in.read_any ();
           this.push (data);
           out = $rh.createReply();
         } catch (CosEventComm.Disconnected $ex) {
           out = $rh.createExceptionReply ();
           CosEventComm.DisconnectedHelper.write (out, $ex);
         }
         break;
       }


  /**
       * Disconnect a push consumer.
       */
       case 2:  // CosEventComm/PushConsumer/disconnect_push_consumer
       {
         this.disconnect_push_consumer ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyComm/PushConsumer:1.0", 
    "IDL:omg.org/CosNotifyComm/NotifyPublish:1.0", 
    "IDL:omg.org/CosEventComm/PushConsumer:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public PushConsumer _this() 
  {
    return PushConsumerHelper.narrow(
    super._this_object());
  }

  public PushConsumer _this(org.omg.CORBA.ORB orb) 
  {
    return PushConsumerHelper.narrow(
    super._this_object(orb));
  }


} // class PushConsumerPOA
