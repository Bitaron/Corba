package DsLogAdmin;


/**
* DsLogAdmin/InvalidTime.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/DsLogAdmin.idl
* Thursday, February 1, 2018 2:55:16 PM BDT
*/

public final class InvalidTime extends org.omg.CORBA.UserException
{

  public InvalidTime ()
  {
    super(InvalidTimeHelper.id());
  } // ctor


  public InvalidTime (String $reason)
  {
    super(InvalidTimeHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidTime