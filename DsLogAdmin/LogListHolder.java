package DsLogAdmin;


/**
* DsLogAdmin/LogListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/DsLogAdmin.idl
* Thursday, February 1, 2018 2:55:17 PM BDT
*/

public final class LogListHolder implements org.omg.CORBA.portable.Streamable
{
  public DsLogAdmin.Log value[] = null;

  public LogListHolder ()
  {
  }

  public LogListHolder (DsLogAdmin.Log[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DsLogAdmin.LogListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DsLogAdmin.LogListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DsLogAdmin.LogListHelper.type ();
  }

}
