package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/StructuredProxyPullSupplierOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:09 PM BDT
*/


/**
    * An interface for structured proxy pull suppliers.
    */
public interface StructuredProxyPullSupplierOperations  extends CosNotifyChannelAdmin.ProxySupplierOperations, CosNotifyComm.StructuredPullSupplierOperations
{

  /**
         * Connect a structured type pull consumer to this proxy.
         * @parm <code>pull_consumer</code> - The <code>PullConsumer</code>
         * object reference.
         * @raises AlreadyConnected If this consumer is already connected.
         */
  void connect_structured_pull_consumer (CosNotifyComm.StructuredPullConsumer pull_consumer) throws CosEventChannelAdmin.AlreadyConnected;
} // interface StructuredProxyPullSupplierOperations
