package CosEventComm;


/**
* CosEventComm/Disconnected.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosEventComm.idl
* Thursday, February 1, 2018 2:55:06 PM BDT
*/

public final class Disconnected extends org.omg.CORBA.UserException
{

  public Disconnected ()
  {
    super(DisconnectedHelper.id());
  } // ctor


  public Disconnected (String $reason)
  {
    super(DisconnectedHelper.id() + "  " + $reason);
  } // ctor

} // class Disconnected