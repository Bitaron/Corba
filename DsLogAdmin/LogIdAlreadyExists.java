package DsLogAdmin;


/**
* DsLogAdmin/LogIdAlreadyExists.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/DsLogAdmin.idl
* Thursday, February 1, 2018 2:55:16 PM BDT
*/

public final class LogIdAlreadyExists extends org.omg.CORBA.UserException
{

  public LogIdAlreadyExists ()
  {
    super(LogIdAlreadyExistsHelper.id());
  } // ctor


  public LogIdAlreadyExists (String $reason)
  {
    super(LogIdAlreadyExistsHelper.id() + "  " + $reason);
  } // ctor

} // class LogIdAlreadyExists
