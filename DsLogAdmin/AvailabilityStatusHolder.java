package DsLogAdmin;

/**
* DsLogAdmin/AvailabilityStatusHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/DsLogAdmin.idl
* Thursday, February 1, 2018 2:55:16 PM BDT
*/

public final class AvailabilityStatusHolder implements org.omg.CORBA.portable.Streamable
{
  public DsLogAdmin.AvailabilityStatus value = null;

  public AvailabilityStatusHolder ()
  {
  }

  public AvailabilityStatusHolder (DsLogAdmin.AvailabilityStatus initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DsLogAdmin.AvailabilityStatusHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DsLogAdmin.AvailabilityStatusHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DsLogAdmin.AvailabilityStatusHelper.type ();
  }

}
