package DsNotifyLogAdmin;


/**
* DsNotifyLogAdmin/NotifyLogPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/DsNotifyLogAdmin.idl
* Thursday, February 1, 2018 2:55:18 PM BDT
*/

public abstract class NotifyLogPOA extends org.omg.PortableServer.Servant
 implements DsNotifyLogAdmin.NotifyLogOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("get_filter", new java.lang.Integer (0));
    _methods.put ("set_filter", new java.lang.Integer (1));
    _methods.put ("my_factory", new java.lang.Integer (2));
    _methods.put ("id", new java.lang.Integer (3));
    _methods.put ("get_log_qos", new java.lang.Integer (4));
    _methods.put ("set_log_qos", new java.lang.Integer (5));
    _methods.put ("get_max_record_life", new java.lang.Integer (6));
    _methods.put ("set_max_record_life", new java.lang.Integer (7));
    _methods.put ("get_max_size", new java.lang.Integer (8));
    _methods.put ("set_max_size", new java.lang.Integer (9));
    _methods.put ("get_current_size", new java.lang.Integer (10));
    _methods.put ("get_n_records", new java.lang.Integer (11));
    _methods.put ("get_log_full_action", new java.lang.Integer (12));
    _methods.put ("set_log_full_action", new java.lang.Integer (13));
    _methods.put ("get_administrative_state", new java.lang.Integer (14));
    _methods.put ("set_administrative_state", new java.lang.Integer (15));
    _methods.put ("get_forwarding_state", new java.lang.Integer (16));
    _methods.put ("set_forwarding_state", new java.lang.Integer (17));
    _methods.put ("get_operational_state", new java.lang.Integer (18));
    _methods.put ("get_interval", new java.lang.Integer (19));
    _methods.put ("set_interval", new java.lang.Integer (20));
    _methods.put ("get_availability_status", new java.lang.Integer (21));
    _methods.put ("get_capacity_alarm_thresholds", new java.lang.Integer (22));
    _methods.put ("set_capacity_alarm_thresholds", new java.lang.Integer (23));
    _methods.put ("get_week_mask", new java.lang.Integer (24));
    _methods.put ("set_week_mask", new java.lang.Integer (25));
    _methods.put ("query", new java.lang.Integer (26));
    _methods.put ("retrieve", new java.lang.Integer (27));
    _methods.put ("match", new java.lang.Integer (28));
    _methods.put ("delete_records", new java.lang.Integer (29));
    _methods.put ("delete_records_by_id", new java.lang.Integer (30));
    _methods.put ("write_records", new java.lang.Integer (31));
    _methods.put ("set_record_attribute", new java.lang.Integer (32));
    _methods.put ("set_records_attribute", new java.lang.Integer (33));
    _methods.put ("get_record_attribute", new java.lang.Integer (34));
    _methods.put ("copy", new java.lang.Integer (35));
    _methods.put ("copy_with_id", new java.lang.Integer (36));
    _methods.put ("flush", new java.lang.Integer (37));
    _methods.put ("for_consumers", new java.lang.Integer (38));
    _methods.put ("for_suppliers", new java.lang.Integer (39));
    _methods.put ("destroy", new java.lang.Integer (40));
    _methods.put ("_get_MyFactory", new java.lang.Integer (41));
    _methods.put ("_get_default_consumer_admin", new java.lang.Integer (42));
    _methods.put ("_get_default_supplier_admin", new java.lang.Integer (43));
    _methods.put ("_get_default_filter_factory", new java.lang.Integer (44));
    _methods.put ("new_for_consumers", new java.lang.Integer (45));
    _methods.put ("new_for_suppliers", new java.lang.Integer (46));
    _methods.put ("get_consumeradmin", new java.lang.Integer (47));
    _methods.put ("get_supplieradmin", new java.lang.Integer (48));
    _methods.put ("get_all_consumeradmins", new java.lang.Integer (49));
    _methods.put ("get_all_supplieradmins", new java.lang.Integer (50));
    _methods.put ("get_qos", new java.lang.Integer (51));
    _methods.put ("set_qos", new java.lang.Integer (52));
    _methods.put ("validate_qos", new java.lang.Integer (53));
    _methods.put ("get_admin", new java.lang.Integer (54));
    _methods.put ("set_admin", new java.lang.Integer (55));
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
       case 0:  // DsNotifyLogAdmin/NotifyLog/get_filter
       {
         CosNotifyFilter.Filter $result = null;
         $result = this.get_filter ();
         out = $rh.createReply();
         CosNotifyFilter.FilterHelper.write (out, $result);
         break;
       }

       case 1:  // DsNotifyLogAdmin/NotifyLog/set_filter
       {
         CosNotifyFilter.Filter filter = CosNotifyFilter.FilterHelper.read (in);
         this.set_filter (filter);
         out = $rh.createReply();
         break;
       }

       case 2:  // DsLogAdmin/Log/my_factory
       {
         DsLogAdmin.LogMgr $result = null;
         $result = this.my_factory ();
         out = $rh.createReply();
         DsLogAdmin.LogMgrHelper.write (out, $result);
         break;
       }

       case 3:  // DsLogAdmin/Log/id
       {
         int $result = (int)0;
         $result = this.id ();
         out = $rh.createReply();
         out.write_ulong ($result);
         break;
       }

       case 4:  // DsLogAdmin/Log/get_log_qos
       {
         short $result[] = null;
         $result = this.get_log_qos ();
         out = $rh.createReply();
         DsLogAdmin.QoSListHelper.write (out, $result);
         break;
       }

       case 5:  // DsLogAdmin/Log/set_log_qos
       {
         try {
           short qos[] = DsLogAdmin.QoSListHelper.read (in);
           this.set_log_qos (qos);
           out = $rh.createReply();
         } catch (DsLogAdmin.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }


  // life in seconds (0 infinite)
       case 6:  // DsLogAdmin/Log/get_max_record_life
       {
         int $result = (int)0;
         $result = this.get_max_record_life ();
         out = $rh.createReply();
         out.write_ulong ($result);
         break;
       }

       case 7:  // DsLogAdmin/Log/set_max_record_life
       {
         int life = in.read_ulong ();
         this.set_max_record_life (life);
         out = $rh.createReply();
         break;
       }


  // size in octets
       case 8:  // DsLogAdmin/Log/get_max_size
       {
         long $result = (long)0;
         $result = this.get_max_size ();
         out = $rh.createReply();
         out.write_ulonglong ($result);
         break;
       }

       case 9:  // DsLogAdmin/Log/set_max_size
       {
         try {
           long size = in.read_ulonglong ();
           this.set_max_size (size);
           out = $rh.createReply();
         } catch (DsLogAdmin.InvalidParam $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidParamHelper.write (out, $ex);
         }
         break;
       }

       case 10:  // DsLogAdmin/Log/get_current_size
       {
         long $result = (long)0;
         $result = this.get_current_size ();
         out = $rh.createReply();
         out.write_ulonglong ($result);
         break;
       }


  // size in octets
       case 11:  // DsLogAdmin/Log/get_n_records
       {
         long $result = (long)0;
         $result = this.get_n_records ();
         out = $rh.createReply();
         out.write_ulonglong ($result);
         break;
       }


  // number of records
       case 12:  // DsLogAdmin/Log/get_log_full_action
       {
         short $result = (short)0;
         $result = this.get_log_full_action ();
         out = $rh.createReply();
         out.write_ushort ($result);
         break;
       }

       case 13:  // DsLogAdmin/Log/set_log_full_action
       {
         try {
           short action = DsLogAdmin.LogFullActionTypeHelper.read (in);
           this.set_log_full_action (action);
           out = $rh.createReply();
         } catch (DsLogAdmin.InvalidLogFullAction $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidLogFullActionHelper.write (out, $ex);
         }
         break;
       }

       case 14:  // DsLogAdmin/Log/get_administrative_state
       {
         DsLogAdmin.AdministrativeState $result = null;
         $result = this.get_administrative_state ();
         out = $rh.createReply();
         DsLogAdmin.AdministrativeStateHelper.write (out, $result);
         break;
       }

       case 15:  // DsLogAdmin/Log/set_administrative_state
       {
         DsLogAdmin.AdministrativeState state = DsLogAdmin.AdministrativeStateHelper.read (in);
         this.set_administrative_state (state);
         out = $rh.createReply();
         break;
       }

       case 16:  // DsLogAdmin/Log/get_forwarding_state
       {
         DsLogAdmin.ForwardingState $result = null;
         $result = this.get_forwarding_state ();
         out = $rh.createReply();
         DsLogAdmin.ForwardingStateHelper.write (out, $result);
         break;
       }

       case 17:  // DsLogAdmin/Log/set_forwarding_state
       {
         DsLogAdmin.ForwardingState state = DsLogAdmin.ForwardingStateHelper.read (in);
         this.set_forwarding_state (state);
         out = $rh.createReply();
         break;
       }

       case 18:  // DsLogAdmin/Log/get_operational_state
       {
         DsLogAdmin.OperationalState $result = null;
         $result = this.get_operational_state ();
         out = $rh.createReply();
         DsLogAdmin.OperationalStateHelper.write (out, $result);
         break;
       }


  // log duration
       case 19:  // DsLogAdmin/Log/get_interval
       {
         DsLogAdmin.TimeInterval $result = null;
         $result = this.get_interval ();
         out = $rh.createReply();
         DsLogAdmin.TimeIntervalHelper.write (out, $result);
         break;
       }

       case 20:  // DsLogAdmin/Log/set_interval
       {
         try {
           DsLogAdmin.TimeInterval interval = DsLogAdmin.TimeIntervalHelper.read (in);
           this.set_interval (interval);
           out = $rh.createReply();
         } catch (DsLogAdmin.InvalidTime $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidTimeHelper.write (out, $ex);
         } catch (DsLogAdmin.InvalidTimeInterval $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidTimeIntervalHelper.write (out, $ex);
         }
         break;
       }


  // availability status
       case 21:  // DsLogAdmin/Log/get_availability_status
       {
         DsLogAdmin.AvailabilityStatus $result = null;
         $result = this.get_availability_status ();
         out = $rh.createReply();
         DsLogAdmin.AvailabilityStatusHelper.write (out, $result);
         break;
       }


  // capacity alarm threshold
       case 22:  // DsLogAdmin/Log/get_capacity_alarm_thresholds
       {
         short $result[] = null;
         $result = this.get_capacity_alarm_thresholds ();
         out = $rh.createReply();
         DsLogAdmin.CapacityAlarmThresholdListHelper.write (out, $result);
         break;
       }

       case 23:  // DsLogAdmin/Log/set_capacity_alarm_thresholds
       {
         try {
           short threshs[] = DsLogAdmin.CapacityAlarmThresholdListHelper.read (in);
           this.set_capacity_alarm_thresholds (threshs);
           out = $rh.createReply();
         } catch (DsLogAdmin.InvalidThreshold $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidThresholdHelper.write (out, $ex);
         }
         break;
       }


  // weekly scheduling
       case 24:  // DsLogAdmin/Log/get_week_mask
       {
         DsLogAdmin.WeekMaskItem $result[] = null;
         $result = this.get_week_mask ();
         out = $rh.createReply();
         DsLogAdmin.WeekMaskHelper.write (out, $result);
         break;
       }

       case 25:  // DsLogAdmin/Log/set_week_mask
       {
         try {
           DsLogAdmin.WeekMaskItem masks[] = DsLogAdmin.WeekMaskHelper.read (in);
           this.set_week_mask (masks);
           out = $rh.createReply();
         } catch (DsLogAdmin.InvalidTime $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidTimeHelper.write (out, $ex);
         } catch (DsLogAdmin.InvalidTimeInterval $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidTimeIntervalHelper.write (out, $ex);
         } catch (DsLogAdmin.InvalidMask $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidMaskHelper.write (out, $ex);
         }
         break;
       }

       case 26:  // DsLogAdmin/Log/query
       {
         try {
           String grammar = in.read_string ();
           String c = DsLogAdmin.ConstraintHelper.read (in);
           DsLogAdmin.IteratorHolder i = new DsLogAdmin.IteratorHolder ();
           DsLogAdmin.LogRecord $result[] = null;
           $result = this.query (grammar, c, i);
           out = $rh.createReply();
           DsLogAdmin.RecordListHelper.write (out, $result);
           DsLogAdmin.IteratorHelper.write (out, i.value);
         } catch (DsLogAdmin.InvalidGrammar $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidGrammarHelper.write (out, $ex);
         } catch (DsLogAdmin.InvalidConstraint $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidConstraintHelper.write (out, $ex);
         }
         break;
       }


  // negative how_many indicates backwards retrieval
       case 27:  // DsLogAdmin/Log/retrieve
       {
         long from_time = DsLogAdmin.TimeTHelper.read (in);
         int how_many = in.read_long ();
         DsLogAdmin.IteratorHolder i = new DsLogAdmin.IteratorHolder ();
         DsLogAdmin.LogRecord $result[] = null;
         $result = this.retrieve (from_time, how_many, i);
         out = $rh.createReply();
         DsLogAdmin.RecordListHelper.write (out, $result);
         DsLogAdmin.IteratorHelper.write (out, i.value);
         break;
       }


  // returns number of records matching constraint
       case 28:  // DsLogAdmin/Log/match
       {
         try {
           String grammar = in.read_string ();
           String c = DsLogAdmin.ConstraintHelper.read (in);
           int $result = (int)0;
           $result = this.match (grammar, c);
           out = $rh.createReply();
           out.write_ulong ($result);
         } catch (DsLogAdmin.InvalidGrammar $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidGrammarHelper.write (out, $ex);
         } catch (DsLogAdmin.InvalidConstraint $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidConstraintHelper.write (out, $ex);
         }
         break;
       }


  // returns number of records deleted
       case 29:  // DsLogAdmin/Log/delete_records
       {
         try {
           String grammar = in.read_string ();
           String c = DsLogAdmin.ConstraintHelper.read (in);
           int $result = (int)0;
           $result = this.delete_records (grammar, c);
           out = $rh.createReply();
           out.write_ulong ($result);
         } catch (DsLogAdmin.InvalidGrammar $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidGrammarHelper.write (out, $ex);
         } catch (DsLogAdmin.InvalidConstraint $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidConstraintHelper.write (out, $ex);
         }
         break;
       }

       case 30:  // DsLogAdmin/Log/delete_records_by_id
       {
         long ids[] = DsLogAdmin.RecordIdListHelper.read (in);
         int $result = (int)0;
         $result = this.delete_records_by_id (ids);
         out = $rh.createReply();
         out.write_ulong ($result);
         break;
       }

       case 31:  // DsLogAdmin/Log/write_records
       {
         try {
           org.omg.CORBA.Any records[] = DsLogAdmin.AnysHelper.read (in);
           this.write_records (records);
           out = $rh.createReply();
         } catch (DsLogAdmin.LogFull $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.LogFullHelper.write (out, $ex);
         } catch (DsLogAdmin.LogOffDuty $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.LogOffDutyHelper.write (out, $ex);
         } catch (DsLogAdmin.LogLocked $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.LogLockedHelper.write (out, $ex);
         } catch (DsLogAdmin.LogDisabled $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.LogDisabledHelper.write (out, $ex);
         }
         break;
       }


  // set single record attributes
       case 32:  // DsLogAdmin/Log/set_record_attribute
       {
         try {
           long id = DsLogAdmin.RecordIdHelper.read (in);
           DsLogAdmin.NVPair attr_list[] = DsLogAdmin.NVListHelper.read (in);
           this.set_record_attribute (id, attr_list);
           out = $rh.createReply();
         } catch (DsLogAdmin.InvalidRecordId $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidRecordIdHelper.write (out, $ex);
         } catch (DsLogAdmin.InvalidAttribute $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidAttributeHelper.write (out, $ex);
         }
         break;
       }


  // returns number of records whose attributes have been set
       case 33:  // DsLogAdmin/Log/set_records_attribute
       {
         try {
           String grammar = in.read_string ();
           String c = DsLogAdmin.ConstraintHelper.read (in);
           DsLogAdmin.NVPair attr_list[] = DsLogAdmin.NVListHelper.read (in);
           int $result = (int)0;
           $result = this.set_records_attribute (grammar, c, attr_list);
           out = $rh.createReply();
           out.write_ulong ($result);
         } catch (DsLogAdmin.InvalidGrammar $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidGrammarHelper.write (out, $ex);
         } catch (DsLogAdmin.InvalidConstraint $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidConstraintHelper.write (out, $ex);
         } catch (DsLogAdmin.InvalidAttribute $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidAttributeHelper.write (out, $ex);
         }
         break;
       }


  // get record attributes
       case 34:  // DsLogAdmin/Log/get_record_attribute
       {
         try {
           long id = DsLogAdmin.RecordIdHelper.read (in);
           DsLogAdmin.NVPair $result[] = null;
           $result = this.get_record_attribute (id);
           out = $rh.createReply();
           DsLogAdmin.NVListHelper.write (out, $result);
         } catch (DsLogAdmin.InvalidRecordId $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.InvalidRecordIdHelper.write (out, $ex);
         }
         break;
       }

       case 35:  // DsLogAdmin/Log/copy
       {
         org.omg.CORBA.IntHolder id = new org.omg.CORBA.IntHolder ();
         DsLogAdmin.Log $result = null;
         $result = this.copy (id);
         out = $rh.createReply();
         DsLogAdmin.LogHelper.write (out, $result);
         DsLogAdmin.LogIdHelper.write (out, id.value);
         break;
       }

       case 36:  // DsLogAdmin/Log/copy_with_id
       {
         try {
           int id = DsLogAdmin.LogIdHelper.read (in);
           DsLogAdmin.Log $result = null;
           $result = this.copy_with_id (id);
           out = $rh.createReply();
           DsLogAdmin.LogHelper.write (out, $result);
         } catch (DsLogAdmin.LogIdAlreadyExists $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.LogIdAlreadyExistsHelper.write (out, $ex);
         }
         break;
       }

       case 37:  // DsLogAdmin/Log/flush
       {
         try {
           this.flush ();
           out = $rh.createReply();
         } catch (DsLogAdmin.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           DsLogAdmin.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Gets an object reference to the administration object
         * for event consumers.
         * @returns The <code>ConsumerAdmin</code> object reference.
         */
       case 38:  // CosEventChannelAdmin/EventChannel/for_consumers
       {
         CosEventChannelAdmin.ConsumerAdmin $result = null;
         $result = this.for_consumers ();
         out = $rh.createReply();
         CosEventChannelAdmin.ConsumerAdminHelper.write (out, $result);
         break;
       }


  /**
         * Gets an object reference to the administration object
         * for event suppliers.
         * @returns The <code>SupplierAdmin</code> object reference.
         */
       case 39:  // CosEventChannelAdmin/EventChannel/for_suppliers
       {
         CosEventChannelAdmin.SupplierAdmin $result = null;
         $result = this.for_suppliers ();
         out = $rh.createReply();
         CosEventChannelAdmin.SupplierAdminHelper.write (out, $result);
         break;
       }


  /**
         * Destroys this event channel and released any storage used.
         */
       case 40:  // CosEventChannelAdmin/EventChannel/destroy
       {
         this.destroy ();
         out = $rh.createReply();
         break;
       }


  /**
         * The factory object that created this event channel object.
         */
       case 41:  // CosNotifyChannelAdmin/EventChannel/_get_MyFactory
       {
         CosNotifyChannelAdmin.EventChannelFactory $result = null;
         $result = this.MyFactory ();
         out = $rh.createReply();
         CosNotifyChannelAdmin.EventChannelFactoryHelper.write (out, $result);
         break;
       }


  /**
         * The default consumer administration object. This object has the 
         * unique identification number zero.
         */
       case 42:  // CosNotifyChannelAdmin/EventChannel/_get_default_consumer_admin
       {
         CosNotifyChannelAdmin.ConsumerAdmin $result = null;
         $result = this.default_consumer_admin ();
         out = $rh.createReply();
         CosNotifyChannelAdmin.ConsumerAdminHelper.write (out, $result);
         break;
       }


  /**
         * The default supplier administration object. This object has the 
         * unique identification number zero.
         */
       case 43:  // CosNotifyChannelAdmin/EventChannel/_get_default_supplier_admin
       {
         CosNotifyChannelAdmin.SupplierAdmin $result = null;
         $result = this.default_supplier_admin ();
         out = $rh.createReply();
         CosNotifyChannelAdmin.SupplierAdminHelper.write (out, $result);
         break;
       }


  /**
         * The default filter factory object for this event channel.
         */
       case 44:  // CosNotifyChannelAdmin/EventChannel/_get_default_filter_factory
       {
         CosNotifyFilter.FilterFactory $result = null;
         $result = this.default_filter_factory ();
         out = $rh.createReply();
         CosNotifyFilter.FilterFactoryHelper.write (out, $result);
         break;
       }


  /**
         * Creates an administration object for event consumers.
         * @parm <code>op</code> - Indicates whether the newly created
         * administration object should use AND or OR semantics when combining
         * administration object filters and proxy filters.
         * @parm <code>id</code> - The unique identifier for the administration
         * object.
         * @returns A <code>ConsumerAdmin</code> object reference.
         */
       case 45:  // CosNotifyChannelAdmin/EventChannel/new_for_consumers
       {
         CosNotifyChannelAdmin.InterFilterGroupOperator op = CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.read (in);
         org.omg.CORBA.IntHolder id = new org.omg.CORBA.IntHolder ();
         CosNotifyChannelAdmin.ConsumerAdmin $result = null;
         $result = this.new_for_consumers (op, id);
         out = $rh.createReply();
         CosNotifyChannelAdmin.ConsumerAdminHelper.write (out, $result);
         CosNotifyChannelAdmin.AdminIDHelper.write (out, id.value);
         break;
       }


  /**
         * Creates an administration object for event suppliers.
         * @parm <code>op</code> - Indicates whether the newly created
         * administration object should use AND or OR semantics when combining
         * administration object filters and proxy filters.
         * @parm <code>id</code> - The unique identifier for the administration
         * object.
         * @returns A <code>SupplierAdmin</code> object reference.
         */
       case 46:  // CosNotifyChannelAdmin/EventChannel/new_for_suppliers
       {
         CosNotifyChannelAdmin.InterFilterGroupOperator op = CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.read (in);
         org.omg.CORBA.IntHolder id = new org.omg.CORBA.IntHolder ();
         CosNotifyChannelAdmin.SupplierAdmin $result = null;
         $result = this.new_for_suppliers (op, id);
         out = $rh.createReply();
         CosNotifyChannelAdmin.SupplierAdminHelper.write (out, $result);
         CosNotifyChannelAdmin.AdminIDHelper.write (out, id.value);
         break;
       }


  /**
         * Get an administration object from its ID.
         * @parm <code>id</code> - A unique identifier for the administration
         * object.
         * @returns A <code>ConsumerAdmin</code> object reference.
         * @raises AdminNotFound If no administration object with that ID
         * could be found.
         */
       case 47:  // CosNotifyChannelAdmin/EventChannel/get_consumeradmin
       {
         try {
           int id = CosNotifyChannelAdmin.AdminIDHelper.read (in);
           CosNotifyChannelAdmin.ConsumerAdmin $result = null;
           $result = this.get_consumeradmin (id);
           out = $rh.createReply();
           CosNotifyChannelAdmin.ConsumerAdminHelper.write (out, $result);
         } catch (CosNotifyChannelAdmin.AdminNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyChannelAdmin.AdminNotFoundHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Get an administration object from its ID.
         * @parm <code>id</code> - A unique identifier for the administration
         * object.
         * @returns A <code>SupplierAdmin</code> object reference.
         * @raises AdminNotFound If no administration object with that ID
         * could be found.
         */
       case 48:  // CosNotifyChannelAdmin/EventChannel/get_supplieradmin
       {
         try {
           int id = CosNotifyChannelAdmin.AdminIDHelper.read (in);
           CosNotifyChannelAdmin.SupplierAdmin $result = null;
           $result = this.get_supplieradmin (id);
           out = $rh.createReply();
           CosNotifyChannelAdmin.SupplierAdminHelper.write (out, $result);
         } catch (CosNotifyChannelAdmin.AdminNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyChannelAdmin.AdminNotFoundHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Get all consumer administration objects.
         * @returns A sequence of administration object unique identifiers.
         */
       case 49:  // CosNotifyChannelAdmin/EventChannel/get_all_consumeradmins
       {
         int $result[] = null;
         $result = this.get_all_consumeradmins ();
         out = $rh.createReply();
         CosNotifyChannelAdmin.AdminIDSeqHelper.write (out, $result);
         break;
       }


  /**
         * Get all supplier administration objects.
         * @returns A sequence of administration object unique identifiers.
         */
       case 50:  // CosNotifyChannelAdmin/EventChannel/get_all_supplieradmins
       {
         int $result[] = null;
         $result = this.get_all_supplieradmins ();
         out = $rh.createReply();
         CosNotifyChannelAdmin.AdminIDSeqHelper.write (out, $result);
         break;
       }


  /**
         * Returns the current quality of service settings for this object.
         * @returns A sequence of name-value pairs defining the quality of 
         * service settings.
         */
       case 51:  // CosNotification/QoSAdmin/get_qos
       {
         CosNotification.Property $result[] = null;
         $result = this.get_qos ();
         out = $rh.createReply();
         CosNotification.PropertySeqHelper.write (out, $result);
         break;
       }


  /**
         * Sets the quality of service settings for this object.
         * @parm <code>qos</code> - A sequence of name-value pairs defining
         * the desired quality of service settings.
         * @raises UnsupportedQoS If the requested settings are not supported.
         */
       case 52:  // CosNotification/QoSAdmin/set_qos
       {
         try {
           CosNotification.Property qos[] = CosNotification.QoSPropertiesHelper.read (in);
           this.set_qos (qos);
           out = $rh.createReply();
         } catch (CosNotification.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           CosNotification.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Validates a set of quality of service requirements.
         * @parm <code>qos</code> -  A sequence of name-value pairs defining
         * quality of service settings that are to be validated.
         * @parm <code>available_qos</code> - A sequence of all additional
         * quality of service setting supported by this object.
         * @raises UnsupportedQoS If any of the setting in the input argument
         * are not supported.
         */
       case 53:  // CosNotification/QoSAdmin/validate_qos
       {
         try {
           CosNotification.Property required_qos[] = CosNotification.QoSPropertiesHelper.read (in);
           CosNotification.NamedPropertyRangeSeqHolder available_qos = new CosNotification.NamedPropertyRangeSeqHolder ();
           this.validate_qos (required_qos, available_qos);
           out = $rh.createReply();
           CosNotification.NamedPropertyRangeSeqHelper.write (out, available_qos.value);
         } catch (CosNotification.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           CosNotification.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Returns the current administrative settings for this object.
         * @returns A sequence of name-value pairs defining the administrative 
         * settings.
         */
       case 54:  // CosNotification/AdminPropertiesAdmin/get_admin
       {
         CosNotification.Property $result[] = null;
         $result = this.get_admin ();
         out = $rh.createReply();
         CosNotification.PropertySeqHelper.write (out, $result);
         break;
       }


  /**
         * Sets the administrative settings for this object.
         * @parm <code>admin</code> - A sequence of desired name-value pairs
         * defining the administrative settings.
         * @raises UnsupportedAdmin If any of the desired setting are not
         * available.
         */
       case 55:  // CosNotification/AdminPropertiesAdmin/set_admin
       {
         try {
           CosNotification.Property admin[] = CosNotification.AdminPropertiesHelper.read (in);
           this.set_admin (admin);
           out = $rh.createReply();
         } catch (CosNotification.UnsupportedAdmin $ex) {
           out = $rh.createExceptionReply ();
           CosNotification.UnsupportedAdminHelper.write (out, $ex);
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
    "IDL:omg.org/DsNotifyLogAdmin/NotifyLog:1.0", 
    "IDL:omg.org/DsEventLogAdmin/EventLog:1.0", 
    "IDL:omg.org/DsLogAdmin/Log:1.0", 
    "IDL:omg.org/CosEventChannelAdmin/EventChannel:1.0", 
    "IDL:omg.org/CosNotifyChannelAdmin/EventChannel:1.0", 
    "IDL:omg.org/CosNotification/QoSAdmin:1.0", 
    "IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public NotifyLog _this() 
  {
    return NotifyLogHelper.narrow(
    super._this_object());
  }

  public NotifyLog _this(org.omg.CORBA.ORB orb) 
  {
    return NotifyLogHelper.narrow(
    super._this_object(orb));
  }


} // class NotifyLogPOA
