package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/NotConnected.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:09 PM BDT
*/

public final class NotConnected extends org.omg.CORBA.UserException
{

  public NotConnected ()
  {
    super(NotConnectedHelper.id());
  } // ctor


  public NotConnected (String $reason)
  {
    super(NotConnectedHelper.id() + "  " + $reason);
  } // ctor

} // class NotConnected
