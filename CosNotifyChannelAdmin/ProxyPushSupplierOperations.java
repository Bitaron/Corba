package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/ProxyPushSupplierOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:09 PM BDT
*/


/**
    * An interface for proxy push suppliers.
    */
public interface ProxyPushSupplierOperations  extends CosNotifyChannelAdmin.ProxySupplierOperations, CosNotifyComm.PushSupplierOperations
{

  /**
         * Connect an any type push consumer to this proxy.
         * @parm <code>push_consumer</code> - The <code>PushConsumer</code>
         * object reference.
         * @raises AlreadyConnected If this consumer is already connected.
         * @raises TypeError Illegal consumer type.
         */
  void connect_any_push_consumer (CosEventComm.PushConsumer push_consumer) throws CosEventChannelAdmin.AlreadyConnected, CosEventChannelAdmin.TypeError;

  /**
         * Causes this proxy to stop sending events to its consumer. Note
         * that events will still be queued while the connection is suspended.
         * @raises ConnectionAlreadyInactive Proxy already stopped.
         * @raises NotConnected Proxy not connected.
         */
  void suspend_connection () throws CosNotifyChannelAdmin.ConnectionAlreadyInactive, CosNotifyChannelAdmin.NotConnected;

  /**
         * Causes this proxy to start sending events to its consumer.
         * All queued events will be forwarded to the consumers.
         * @raises ConnectionAlreadyActive Proxy already started.
         * @raises NotConnected Proxy not connected.
         */
  void resume_connection () throws CosNotifyChannelAdmin.ConnectionAlreadyActive, CosNotifyChannelAdmin.NotConnected;
} // interface ProxyPushSupplierOperations