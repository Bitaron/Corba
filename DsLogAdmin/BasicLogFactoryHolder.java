package DsLogAdmin;

/**
* DsLogAdmin/BasicLogFactoryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/DsLogAdmin.idl
* Thursday, February 1, 2018 2:55:17 PM BDT
*/

public final class BasicLogFactoryHolder implements org.omg.CORBA.portable.Streamable
{
  public DsLogAdmin.BasicLogFactory value = null;

  public BasicLogFactoryHolder ()
  {
  }

  public BasicLogFactoryHolder (DsLogAdmin.BasicLogFactory initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DsLogAdmin.BasicLogFactoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DsLogAdmin.BasicLogFactoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DsLogAdmin.BasicLogFactoryHelper.type ();
  }

}
