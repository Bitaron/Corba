package TimeBase;

/**
* TimeBase/UtcTHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/TimeBase.idl
* Thursday, February 1, 2018 2:55:19 PM BDT
*/

public final class UtcTHolder implements org.omg.CORBA.portable.Streamable
{
  public TimeBase.UtcT value = null;

  public UtcTHolder ()
  {
  }

  public UtcTHolder (TimeBase.UtcT initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = TimeBase.UtcTHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    TimeBase.UtcTHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return TimeBase.UtcTHelper.type ();
  }

}
