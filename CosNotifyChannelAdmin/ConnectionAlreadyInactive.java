package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/ConnectionAlreadyInactive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:09 PM BDT
*/

public final class ConnectionAlreadyInactive extends org.omg.CORBA.UserException
{

  public ConnectionAlreadyInactive ()
  {
    super(ConnectionAlreadyInactiveHelper.id());
  } // ctor


  public ConnectionAlreadyInactive (String $reason)
  {
    super(ConnectionAlreadyInactiveHelper.id() + "  " + $reason);
  } // ctor

} // class ConnectionAlreadyInactive