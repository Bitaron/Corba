package DsEventLogAdmin;


/**
* DsEventLogAdmin/EventLogFactoryPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/DsEventLogAdmin.idl
* Thursday, February 1, 2018 2:55:15 PM BDT
*/

public abstract class EventLogFactoryPOA extends org.omg.PortableServer.Servant
 implements DsEventLogAdmin.EventLogFactoryOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("create", new java.lang.Integer (0));
    _methods.put ("create_with_id", new java.lang.Integer (1));
    _methods.put ("list_logs", new java.lang.Integer (2));
    _methods.put ("find_log", new java.lang.Integer (3));
    _methods.put ("list_logs_by_id", new java.lang.Integer (4));
    _methods.put ("obtain_push_supplier", new java.lang.Integer (5));
    _methods.put ("obtain_pull_supplier", new java.lang.Integer (6));
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
       case 0:  // DsEventLogAdmin/EventLogFactory/create
       {
         try {
           short full_action = DsLogAdmin.LogFullActionTypeHelper.read (in);
           long max_size = in.read_ulonglong ();
           short thresholds[] = DsLogAdmin.CapacityAlarmThresholdListHelper.read (in);
           org.omg.CORBA.IntHolder id = new org.omg.CORBA.IntHolder ();
           DsEventLogAdmin.EventLog $result = null;
           $result = this.create (full_action, max_size, thresholds, id);
           out = $rh.createReply();
           DsEventLogAdmin.EventLogHelper.write (out, $result);
           DsLogAdmin.LogIdHelper.write (out, id.value);
         } catch (DsLogAdmin.InvalidLogFullAction $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidLogFullActionHelper.write (out, $ex);
         } catch (DsLogAdmin.InvalidThreshold $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidThresholdHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // DsEventLogAdmin/EventLogFactory/create_with_id
       {
         try {
           int id = DsLogAdmin.LogIdHelper.read (in);
           short full_action = DsLogAdmin.LogFullActionTypeHelper.read (in);
           long max_size = in.read_ulonglong ();
           short thresholds[] = DsLogAdmin.CapacityAlarmThresholdListHelper.read (in);
           DsEventLogAdmin.EventLog $result = null;
           $result = this.create_with_id (id, full_action, max_size, thresholds);
           out = $rh.createReply();
           DsEventLogAdmin.EventLogHelper.write (out, $result);
         } catch (DsLogAdmin.LogIdAlreadyExists $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.LogIdAlreadyExistsHelper.write (out, $ex);
         } catch (DsLogAdmin.InvalidLogFullAction $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidLogFullActionHelper.write (out, $ex);
         } catch (DsLogAdmin.InvalidThreshold $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidThresholdHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // DsLogAdmin/LogMgr/list_logs
       {
         DsLogAdmin.Log $result[] = null;
         $result = this.list_logs ();
         out = $rh.createReply();
         DsLogAdmin.LogListHelper.write (out, $result);
         break;
       }

       case 3:  // DsLogAdmin/LogMgr/find_log
       {
         int id = DsLogAdmin.LogIdHelper.read (in);
         DsLogAdmin.Log $result = null;
         $result = this.find_log (id);
         out = $rh.createReply();
         DsLogAdmin.LogHelper.write (out, $result);
         break;
       }

       case 4:  // DsLogAdmin/LogMgr/list_logs_by_id
       {
         int $result[] = null;
         $result = this.list_logs_by_id ();
         out = $rh.createReply();
         DsLogAdmin.LogIdListHelper.write (out, $result);
         break;
       }


  /**
         * Obtain a push supplier proxy for this administration object.
         * @returns A <code>ProxyPushSupplier</code> object reference.
         */
       case 5:  // CosEventChannelAdmin/ConsumerAdmin/obtain_push_supplier
       {
         CosEventChannelAdmin.ProxyPushSupplier $result = null;
         $result = this.obtain_push_supplier ();
         out = $rh.createReply();
         CosEventChannelAdmin.ProxyPushSupplierHelper.write (out, $result);
         break;
       }


  /**
         * Obtain a pull supplier proxy for this administration object.
         * @returns A <code>ProxyPullSupplier</code> object reference.
         */
       case 6:  // CosEventChannelAdmin/ConsumerAdmin/obtain_pull_supplier
       {
         CosEventChannelAdmin.ProxyPullSupplier $result = null;
         $result = this.obtain_pull_supplier ();
         out = $rh.createReply();
         CosEventChannelAdmin.ProxyPullSupplierHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/DsEventLogAdmin/EventLogFactory:1.0", 
    "IDL:omg.org/DsLogAdmin/LogMgr:1.0", 
    "IDL:omg.org/CosEventChannelAdmin/ConsumerAdmin:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public EventLogFactory _this() 
  {
    return EventLogFactoryHelper.narrow(
    super._this_object());
  }

  public EventLogFactory _this(org.omg.CORBA.ORB orb) 
  {
    return EventLogFactoryHelper.narrow(
    super._this_object(orb));
  }


} // class EventLogFactoryPOA
