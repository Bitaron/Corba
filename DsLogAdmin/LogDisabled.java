package DsLogAdmin;


/**
* DsLogAdmin/LogDisabled.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/DsLogAdmin.idl
* Thursday, February 1, 2018 2:55:16 PM BDT
*/

public final class LogDisabled extends org.omg.CORBA.UserException
{

  public LogDisabled ()
  {
    super(LogDisabledHelper.id());
  } // ctor


  public LogDisabled (String $reason)
  {
    super(LogDisabledHelper.id() + "  " + $reason);
  } // ctor

} // class LogDisabled
