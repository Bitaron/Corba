package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/ConsumerAdminOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosEventChannelAdmin.idl
* Thursday, February 1, 2018 2:55:05 PM BDT
*/


/**
    * Interface for the consumer administration object.
    */
public interface ConsumerAdminOperations 
{

  /**
         * Obtain a push supplier proxy for this administration object.
         * @returns A <code>ProxyPushSupplier</code> object reference.
         */
  CosEventChannelAdmin.ProxyPushSupplier obtain_push_supplier ();

  /**
         * Obtain a pull supplier proxy for this administration object.
         * @returns A <code>ProxyPullSupplier</code> object reference.
         */
  CosEventChannelAdmin.ProxyPullSupplier obtain_pull_supplier ();
} // interface ConsumerAdminOperations