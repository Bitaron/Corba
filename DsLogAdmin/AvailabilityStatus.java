package DsLogAdmin;


/**
* DsLogAdmin/AvailabilityStatus.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/DsLogAdmin.idl
* Thursday, February 1, 2018 2:55:16 PM BDT
*/

public final class AvailabilityStatus implements org.omg.CORBA.portable.IDLEntity
{
  public boolean off_duty = false;
  public boolean log_full = false;

  public AvailabilityStatus ()
  {
  } // ctor

  public AvailabilityStatus (boolean _off_duty, boolean _log_full)
  {
    off_duty = _off_duty;
    log_full = _log_full;
  } // ctor

} // class AvailabilityStatus
