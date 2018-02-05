package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/EventChannelOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:10 PM BDT
*/


/**
    * An interface for the event channel.
    */
public interface EventChannelOperations  extends CosNotification.QoSAdminOperations, CosNotification.AdminPropertiesAdminOperations, CosEventChannelAdmin.EventChannelOperations
{

  /**
         * The factory object that created this event channel object.
         */
  CosNotifyChannelAdmin.EventChannelFactory MyFactory ();

  /**
         * The default consumer administration object. This object has the 
         * unique identification number zero.
         */
  CosNotifyChannelAdmin.ConsumerAdmin default_consumer_admin ();

  /**
         * The default supplier administration object. This object has the 
         * unique identification number zero.
         */
  CosNotifyChannelAdmin.SupplierAdmin default_supplier_admin ();

  /**
         * The default filter factory object for this event channel.
         */
  CosNotifyFilter.FilterFactory default_filter_factory ();

  /**
         * Creates an administration object for event consumers.
         * @parm <code>op</code> - Indicates whether the newly created
         * administration object should use AND or OR semantics when combining
         * administration object filters and proxy filters.
         * @parm <code>id</code> - The unique identifier for the administration
         * object.
         * @returns A <code>ConsumerAdmin</code> object reference.
         */
  CosNotifyChannelAdmin.ConsumerAdmin new_for_consumers (CosNotifyChannelAdmin.InterFilterGroupOperator op, org.omg.CORBA.IntHolder id);

  /**
         * Creates an administration object for event suppliers.
         * @parm <code>op</code> - Indicates whether the newly created
         * administration object should use AND or OR semantics when combining
         * administration object filters and proxy filters.
         * @parm <code>id</code> - The unique identifier for the administration
         * object.
         * @returns A <code>SupplierAdmin</code> object reference.
         */
  CosNotifyChannelAdmin.SupplierAdmin new_for_suppliers (CosNotifyChannelAdmin.InterFilterGroupOperator op, org.omg.CORBA.IntHolder id);

  /**
         * Get an administration object from its ID.
         * @parm <code>id</code> - A unique identifier for the administration
         * object.
         * @returns A <code>ConsumerAdmin</code> object reference.
         * @raises AdminNotFound If no administration object with that ID
         * could be found.
         */
  CosNotifyChannelAdmin.ConsumerAdmin get_consumeradmin (int id) throws CosNotifyChannelAdmin.AdminNotFound;

  /**
         * Get an administration object from its ID.
         * @parm <code>id</code> - A unique identifier for the administration
         * object.
         * @returns A <code>SupplierAdmin</code> object reference.
         * @raises AdminNotFound If no administration object with that ID
         * could be found.
         */
  CosNotifyChannelAdmin.SupplierAdmin get_supplieradmin (int id) throws CosNotifyChannelAdmin.AdminNotFound;

  /**
         * Get all consumer administration objects.
         * @returns A sequence of administration object unique identifiers.
         */
  int[] get_all_consumeradmins ();

  /**
         * Get all supplier administration objects.
         * @returns A sequence of administration object unique identifiers.
         */
  int[] get_all_supplieradmins ();
} // interface EventChannelOperations
