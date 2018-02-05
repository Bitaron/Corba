package CosNotifyComm;


/**
* CosNotifyComm/StructuredPushConsumerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyComm.idl
* Thursday, February 1, 2018 2:55:11 PM BDT
*/


/**
    * An interface for structured push consumers.
    */
public interface StructuredPushConsumerOperations  extends CosNotifyComm.NotifyPublishOperations
{

  /**
         * Push a structured event onto this consumer.
         * @parm <code>notification</code> - The structured event.
         * @raises Disconnected If this consumer is disconnected.
         */
  void push_structured_event (CosNotification.StructuredEvent notification) throws CosEventComm.Disconnected;

  /**
         * Disconnect this structured push consumer.
         */
  void disconnect_structured_push_consumer ();
} // interface StructuredPushConsumerOperations