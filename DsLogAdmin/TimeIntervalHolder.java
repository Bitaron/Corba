package DsLogAdmin;

/**
* DsLogAdmin/TimeIntervalHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/DsLogAdmin.idl
* Thursday, February 1, 2018 2:55:16 PM BDT
*/

public final class TimeIntervalHolder implements org.omg.CORBA.portable.Streamable
{
  public DsLogAdmin.TimeInterval value = null;

  public TimeIntervalHolder ()
  {
  }

  public TimeIntervalHolder (DsLogAdmin.TimeInterval initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DsLogAdmin.TimeIntervalHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DsLogAdmin.TimeIntervalHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DsLogAdmin.TimeIntervalHelper.type ();
  }

}