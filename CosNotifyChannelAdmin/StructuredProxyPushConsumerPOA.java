package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/StructuredProxyPushConsumerPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:09 PM BDT
*/


/**
    * An interface for structured proxy push consumers.
    */
public abstract class StructuredProxyPushConsumerPOA extends org.omg.PortableServer.Servant
 implements CosNotifyChannelAdmin.StructuredProxyPushConsumerOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("connect_structured_push_supplier", new java.lang.Integer (0));
    _methods.put ("_get_MyType", new java.lang.Integer (1));
    _methods.put ("_get_MyAdmin", new java.lang.Integer (2));
    _methods.put ("obtain_subscription_types", new java.lang.Integer (3));
    _methods.put ("validate_event_qos", new java.lang.Integer (4));
    _methods.put ("get_qos", new java.lang.Integer (5));
    _methods.put ("set_qos", new java.lang.Integer (6));
    _methods.put ("validate_qos", new java.lang.Integer (7));
    _methods.put ("add_filter", new java.lang.Integer (8));
    _methods.put ("remove_filter", new java.lang.Integer (9));
    _methods.put ("get_filter", new java.lang.Integer (10));
    _methods.put ("get_all_filters", new java.lang.Integer (11));
    _methods.put ("remove_all_filters", new java.lang.Integer (12));
    _methods.put ("push_structured_event", new java.lang.Integer (13));
    _methods.put ("disconnect_structured_push_consumer", new java.lang.Integer (14));
    _methods.put ("offer_change", new java.lang.Integer (15));
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
         * Connect a structured type push supplier to this proxy.
         * @parm <code>push_supplier</code> - The <code>PushSupplier</code>
         * object reference.
         * @raises AlreadyConnected If this supplier is already connected.
         */
       case 0:  // CosNotifyChannelAdmin/StructuredProxyPushConsumer/connect_structured_push_supplier
       {
         try {
           CosNotifyComm.StructuredPushSupplier push_supplier = CosNotifyComm.StructuredPushSupplierHelper.read (in);
           this.connect_structured_push_supplier (push_supplier);
           out = $rh.createReply();
         } catch (CosEventChannelAdmin.AlreadyConnected $ex) {
           out = $rh.createExceptionReply ();
           CosEventChannelAdmin.AlreadyConnectedHelper.write (out, $ex);
         }
         break;
       }


  /**
         * The type of this proxy.
         */
       case 1:  // CosNotifyChannelAdmin/ProxyConsumer/_get_MyType
       {
         CosNotifyChannelAdmin.ProxyType $result = null;
         $result = this.MyType ();
         out = $rh.createReply();
         CosNotifyChannelAdmin.ProxyTypeHelper.write (out, $result);
         break;
       }


  /**
         * The administration object that created this proxy.
         */
       case 2:  // CosNotifyChannelAdmin/ProxyConsumer/_get_MyAdmin
       {
         CosNotifyChannelAdmin.SupplierAdmin $result = null;
         $result = this.MyAdmin ();
         out = $rh.createReply();
         CosNotifyChannelAdmin.SupplierAdminHelper.write (out, $result);
         break;
       }


  /**
         * Get a list of event type names which represent the event types that
         * consumers connected to this channel are interested in receiving.
         * @parm <code>mode</code> - The mode of type retrieval.
         * @returns A sequence of event type names.
         */
       case 3:  // CosNotifyChannelAdmin/ProxyConsumer/obtain_subscription_types
       {
         CosNotifyChannelAdmin.ObtainInfoMode mode = CosNotifyChannelAdmin.ObtainInfoModeHelper.read (in);
         CosNotification.EventType $result[] = null;
         $result = this.obtain_subscription_types (mode);
         out = $rh.createReply();
         CosNotification.EventTypeSeqHelper.write (out, $result);
         break;
       }


  /**
         * Validate whether or not this proxy can honour the specified 
         * quality of service requirements.
         * @parm <code>required_qos</code> - Quality of service name-value
         * pairs which a client is interested in validating.
         * @parm <code>available_qos</code> - Quality of service settings that
         * this proxy can support in addition to the ones in the input sequence.
         * @raises UnsupportedQoS If any of the quality of service settings
         * in the input sequence could not be honoured.
         */
       case 4:  // CosNotifyChannelAdmin/ProxyConsumer/validate_event_qos
       {
         try {
           CosNotification.Property required_qos[] = CosNotification.QoSPropertiesHelper.read (in);
           CosNotification.NamedPropertyRangeSeqHolder available_qos = new CosNotification.NamedPropertyRangeSeqHolder ();
           this.validate_event_qos (required_qos, available_qos);
           out = $rh.createReply();
           CosNotification.NamedPropertyRangeSeqHelper.write (out, available_qos.value);
         } catch (CosNotification.UnsupportedQoS $ex) {
           out = $rh.createExceptionReply ();
           CosNotification.UnsupportedQoSHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Returns the current quality of service settings for this object.
         * @returns A sequence of name-value pairs defining the quality of 
         * service settings.
         */
       case 5:  // CosNotification/QoSAdmin/get_qos
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
       case 6:  // CosNotification/QoSAdmin/set_qos
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
       case 7:  // CosNotification/QoSAdmin/validate_qos
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
         * Add a filter to this object's list of filters. All these filters
         * are tried upon reception of an event.
         * @parm <code>new_filter</code> - The filter to add.
         * @returns An unique ID that identifies the added filter.
         */
       case 8:  // CosNotifyFilter/FilterAdmin/add_filter
       {
         CosNotifyFilter.Filter new_filter = CosNotifyFilter.FilterHelper.read (in);
         int $result = (int)0;
         $result = this.add_filter (new_filter);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }


  /**
         * Remove a filter from this object's list of filters.
         * @parm <code>filter</code> - The filter ID.
         * @raises FilterNotFound If the ID does not correspond to any
         * filter that has been added to this object.
         */
       case 9:  // CosNotifyFilter/FilterAdmin/remove_filter
       {
         try {
           int filter = CosNotifyFilter.FilterIDHelper.read (in);
           this.remove_filter (filter);
           out = $rh.createReply();
         } catch (CosNotifyFilter.FilterNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.FilterNotFoundHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Get a filter from the filter ID.
         * @parm <code>filter</code> - The filter ID.
         * @raises FilterNotFound If the ID does not correspond to any
         * filter that has been added to this object.
         */
       case 10:  // CosNotifyFilter/FilterAdmin/get_filter
       {
         try {
           int filter = CosNotifyFilter.FilterIDHelper.read (in);
           CosNotifyFilter.Filter $result = null;
           $result = this.get_filter (filter);
           out = $rh.createReply();
           CosNotifyFilter.FilterHelper.write (out, $result);
         } catch (CosNotifyFilter.FilterNotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyFilter.FilterNotFoundHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Get all filters added to this administration object.
         * @returns A sequence of filter IDs.
         */
       case 11:  // CosNotifyFilter/FilterAdmin/get_all_filters
       {
         int $result[] = null;
         $result = this.get_all_filters ();
         out = $rh.createReply();
         CosNotifyFilter.FilterIDSeqHelper.write (out, $result);
         break;
       }


  /**
         * Remove all filters added to this administration object.
         */
       case 12:  // CosNotifyFilter/FilterAdmin/remove_all_filters
       {
         this.remove_all_filters ();
         out = $rh.createReply();
         break;
       }


  /**
         * Push a structured event onto this consumer.
         * @parm <code>notification</code> - The structured event.
         * @raises Disconnected If this consumer is disconnected.
         */
       case 13:  // CosNotifyComm/StructuredPushConsumer/push_structured_event
       {
         try {
           CosNotification.StructuredEvent notification = CosNotification.StructuredEventHelper.read (in);
           this.push_structured_event (notification);
           out = $rh.createReply();
         } catch (CosEventComm.Disconnected $ex) {
           out = $rh.createExceptionReply ();
           CosEventComm.DisconnectedHelper.write (out, $ex);
         }
         break;
       }


  /**
         * Disconnect this structured push consumer.
         */
       case 14:  // CosNotifyComm/StructuredPushConsumer/disconnect_structured_push_consumer
       {
         this.disconnect_structured_push_consumer ();
         out = $rh.createReply();
         break;
       }


  /**
         * Indicates that a supplier is changing the names of the types of
         * events it is publishing.
         * @parm <code>added</code> - The event types added.
         * @parm <code>removed</code> - The event types removed.
         * @raises InvalidEventType If any of the event type names in either 
         * the of the input sequences are invalid.
         */
       case 15:  // CosNotifyComm/NotifyPublish/offer_change
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

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyChannelAdmin/StructuredProxyPushConsumer:1.0", 
    "IDL:omg.org/CosNotifyChannelAdmin/ProxyConsumer:1.0", 
    "IDL:omg.org/CosNotification/QoSAdmin:1.0", 
    "IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0", 
    "IDL:omg.org/CosNotifyComm/StructuredPushConsumer:1.0", 
    "IDL:omg.org/CosNotifyComm/NotifyPublish:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public StructuredProxyPushConsumer _this() 
  {
    return StructuredProxyPushConsumerHelper.narrow(
    super._this_object());
  }

  public StructuredProxyPushConsumer _this(org.omg.CORBA.ORB orb) 
  {
    return StructuredProxyPushConsumerHelper.narrow(
    super._this_object(orb));
  }


} // class StructuredProxyPushConsumerPOA
