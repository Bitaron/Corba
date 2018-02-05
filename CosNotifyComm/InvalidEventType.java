package CosNotifyComm;


/**
* CosNotifyComm/InvalidEventType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyComm.idl
* Thursday, February 1, 2018 2:55:10 PM BDT
*/

public final class InvalidEventType extends org.omg.CORBA.UserException
{
  public CosNotification.EventType type = null;

  public InvalidEventType ()
  {
    super(InvalidEventTypeHelper.id());
  } // ctor

  public InvalidEventType (CosNotification.EventType _type)
  {
    super(InvalidEventTypeHelper.id());
    type = _type;
  } // ctor


  public InvalidEventType (String $reason, CosNotification.EventType _type)
  {
    super(InvalidEventTypeHelper.id() + "  " + $reason);
    type = _type;
  } // ctor

} // class InvalidEventType
