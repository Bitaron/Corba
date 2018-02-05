package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/_EventChannelStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:10 PM BDT
*/


/**
    * An interface for the event channel.
    */
public class _EventChannelStub extends org.omg.CORBA.portable.ObjectImpl implements CosNotifyChannelAdmin.EventChannel
{


  /**
         * The factory object that created this event channel object.
         */
  public CosNotifyChannelAdmin.EventChannelFactory MyFactory ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_MyFactory", true);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.EventChannelFactory $result = CosNotifyChannelAdmin.EventChannelFactoryHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return MyFactory (        );
            } finally {
                _releaseReply ($in);
            }
  } // MyFactory


  /**
         * The default consumer administration object. This object has the 
         * unique identification number zero.
         */
  public CosNotifyChannelAdmin.ConsumerAdmin default_consumer_admin ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_default_consumer_admin", true);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.ConsumerAdmin $result = CosNotifyChannelAdmin.ConsumerAdminHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return default_consumer_admin (        );
            } finally {
                _releaseReply ($in);
            }
  } // default_consumer_admin


  /**
         * The default supplier administration object. This object has the 
         * unique identification number zero.
         */
  public CosNotifyChannelAdmin.SupplierAdmin default_supplier_admin ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_default_supplier_admin", true);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.SupplierAdmin $result = CosNotifyChannelAdmin.SupplierAdminHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return default_supplier_admin (        );
            } finally {
                _releaseReply ($in);
            }
  } // default_supplier_admin


  /**
         * The default filter factory object for this event channel.
         */
  public CosNotifyFilter.FilterFactory default_filter_factory ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_default_filter_factory", true);
                $in = _invoke ($out);
                CosNotifyFilter.FilterFactory $result = CosNotifyFilter.FilterFactoryHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return default_filter_factory (        );
            } finally {
                _releaseReply ($in);
            }
  } // default_filter_factory


  /**
         * Creates an administration object for event consumers.
         * @parm <code>op</code> - Indicates whether the newly created
         * administration object should use AND or OR semantics when combining
         * administration object filters and proxy filters.
         * @parm <code>id</code> - The unique identifier for the administration
         * object.
         * @returns A <code>ConsumerAdmin</code> object reference.
         */
  public CosNotifyChannelAdmin.ConsumerAdmin new_for_consumers (CosNotifyChannelAdmin.InterFilterGroupOperator op, org.omg.CORBA.IntHolder id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("new_for_consumers", true);
                CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.write ($out, op);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.ConsumerAdmin $result = CosNotifyChannelAdmin.ConsumerAdminHelper.read ($in);
                id.value = CosNotifyChannelAdmin.AdminIDHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return new_for_consumers (op, id        );
            } finally {
                _releaseReply ($in);
            }
  } // new_for_consumers


  /**
         * Creates an administration object for event suppliers.
         * @parm <code>op</code> - Indicates whether the newly created
         * administration object should use AND or OR semantics when combining
         * administration object filters and proxy filters.
         * @parm <code>id</code> - The unique identifier for the administration
         * object.
         * @returns A <code>SupplierAdmin</code> object reference.
         */
  public CosNotifyChannelAdmin.SupplierAdmin new_for_suppliers (CosNotifyChannelAdmin.InterFilterGroupOperator op, org.omg.CORBA.IntHolder id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("new_for_suppliers", true);
                CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.write ($out, op);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.SupplierAdmin $result = CosNotifyChannelAdmin.SupplierAdminHelper.read ($in);
                id.value = CosNotifyChannelAdmin.AdminIDHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return new_for_suppliers (op, id        );
            } finally {
                _releaseReply ($in);
            }
  } // new_for_suppliers


  /**
         * Get an administration object from its ID.
         * @parm <code>id</code> - A unique identifier for the administration
         * object.
         * @returns A <code>ConsumerAdmin</code> object reference.
         * @raises AdminNotFound If no administration object with that ID
         * could be found.
         */
  public CosNotifyChannelAdmin.ConsumerAdmin get_consumeradmin (int id) throws CosNotifyChannelAdmin.AdminNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_consumeradmin", true);
                CosNotifyChannelAdmin.AdminIDHelper.write ($out, id);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.ConsumerAdmin $result = CosNotifyChannelAdmin.ConsumerAdminHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyChannelAdmin/AdminNotFound:1.0"))
                    throw CosNotifyChannelAdmin.AdminNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_consumeradmin (id        );
            } finally {
                _releaseReply ($in);
            }
  } // get_consumeradmin


  /**
         * Get an administration object from its ID.
         * @parm <code>id</code> - A unique identifier for the administration
         * object.
         * @returns A <code>SupplierAdmin</code> object reference.
         * @raises AdminNotFound If no administration object with that ID
         * could be found.
         */
  public CosNotifyChannelAdmin.SupplierAdmin get_supplieradmin (int id) throws CosNotifyChannelAdmin.AdminNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_supplieradmin", true);
                CosNotifyChannelAdmin.AdminIDHelper.write ($out, id);
                $in = _invoke ($out);
                CosNotifyChannelAdmin.SupplierAdmin $result = CosNotifyChannelAdmin.SupplierAdminHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyChannelAdmin/AdminNotFound:1.0"))
                    throw CosNotifyChannelAdmin.AdminNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_supplieradmin (id        );
            } finally {
                _releaseReply ($in);
            }
  } // get_supplieradmin


  /**
         * Get all consumer administration objects.
         * @returns A sequence of administration object unique identifiers.
         */
  public int[] get_all_consumeradmins ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_all_consumeradmins", true);
                $in = _invoke ($out);
                int $result[] = CosNotifyChannelAdmin.AdminIDSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_all_consumeradmins (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_all_consumeradmins


  /**
         * Get all supplier administration objects.
         * @returns A sequence of administration object unique identifiers.
         */
  public int[] get_all_supplieradmins ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_all_supplieradmins", true);
                $in = _invoke ($out);
                int $result[] = CosNotifyChannelAdmin.AdminIDSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_all_supplieradmins (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_all_supplieradmins


  /**
         * Returns the current quality of service settings for this object.
         * @returns A sequence of name-value pairs defining the quality of 
         * service settings.
         */
  public CosNotification.Property[] get_qos ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_qos", true);
                $in = _invoke ($out);
                CosNotification.Property $result[] = CosNotification.QoSPropertiesHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_qos (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_qos


  /**
         * Sets the quality of service settings for this object.
         * @parm <code>qos</code> - A sequence of name-value pairs defining
         * the desired quality of service settings.
         * @raises UnsupportedQoS If the requested settings are not supported.
         */
  public void set_qos (CosNotification.Property[] qos) throws CosNotification.UnsupportedQoS
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_qos", true);
                CosNotification.QoSPropertiesHelper.write ($out, qos);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotification/UnsupportedQoS:1.0"))
                    throw CosNotification.UnsupportedQoSHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_qos (qos        );
            } finally {
                _releaseReply ($in);
            }
  } // set_qos


  /**
         * Validates a set of quality of service requirements.
         * @parm <code>qos</code> -  A sequence of name-value pairs defining
         * quality of service settings that are to be validated.
         * @parm <code>available_qos</code> - A sequence of all additional
         * quality of service setting supported by this object.
         * @raises UnsupportedQoS If any of the setting in the input argument
         * are not supported.
         */
  public void validate_qos (CosNotification.Property[] required_qos, CosNotification.NamedPropertyRangeSeqHolder available_qos) throws CosNotification.UnsupportedQoS
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("validate_qos", true);
                CosNotification.QoSPropertiesHelper.write ($out, required_qos);
                $in = _invoke ($out);
                available_qos.value = CosNotification.NamedPropertyRangeSeqHelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotification/UnsupportedQoS:1.0"))
                    throw CosNotification.UnsupportedQoSHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                validate_qos (required_qos, available_qos        );
            } finally {
                _releaseReply ($in);
            }
  } // validate_qos


  /**
         * Returns the current administrative settings for this object.
         * @returns A sequence of name-value pairs defining the administrative 
         * settings.
         */
  public CosNotification.Property[] get_admin ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_admin", true);
                $in = _invoke ($out);
                CosNotification.Property $result[] = CosNotification.AdminPropertiesHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_admin (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_admin


  /**
         * Sets the administrative settings for this object.
         * @parm <code>admin</code> - A sequence of desired name-value pairs
         * defining the administrative settings.
         * @raises UnsupportedAdmin If any of the desired setting are not
         * available.
         */
  public void set_admin (CosNotification.Property[] admin) throws CosNotification.UnsupportedAdmin
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("set_admin", true);
                CosNotification.AdminPropertiesHelper.write ($out, admin);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotification/UnsupportedAdmin:1.0"))
                    throw CosNotification.UnsupportedAdminHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                set_admin (admin        );
            } finally {
                _releaseReply ($in);
            }
  } // set_admin


  /**
         * Gets an object reference to the administration object
         * for event consumers.
         * @returns The <code>ConsumerAdmin</code> object reference.
         */
  public CosEventChannelAdmin.ConsumerAdmin for_consumers ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("for_consumers", true);
                $in = _invoke ($out);
                CosEventChannelAdmin.ConsumerAdmin $result = CosEventChannelAdmin.ConsumerAdminHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return for_consumers (        );
            } finally {
                _releaseReply ($in);
            }
  } // for_consumers


  /**
         * Gets an object reference to the administration object
         * for event suppliers.
         * @returns The <code>SupplierAdmin</code> object reference.
         */
  public CosEventChannelAdmin.SupplierAdmin for_suppliers ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("for_suppliers", true);
                $in = _invoke ($out);
                CosEventChannelAdmin.SupplierAdmin $result = CosEventChannelAdmin.SupplierAdminHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return for_suppliers (        );
            } finally {
                _releaseReply ($in);
            }
  } // for_suppliers


  /**
         * Destroys this event channel and released any storage used.
         */
  public void destroy ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("destroy", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                destroy (        );
            } finally {
                _releaseReply ($in);
            }
  } // destroy

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyChannelAdmin/EventChannel:1.0", 
    "IDL:omg.org/CosNotification/QoSAdmin:1.0", 
    "IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0", 
    "IDL:omg.org/CosEventChannelAdmin/EventChannel:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _EventChannelStub
