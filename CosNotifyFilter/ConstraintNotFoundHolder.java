package CosNotifyFilter;

/**
* CosNotifyFilter/ConstraintNotFoundHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyFilter.idl
* Thursday, February 1, 2018 2:55:12 PM BDT
*/

public final class ConstraintNotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.ConstraintNotFound value = null;

  public ConstraintNotFoundHolder ()
  {
  }

  public ConstraintNotFoundHolder (CosNotifyFilter.ConstraintNotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.ConstraintNotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.ConstraintNotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.ConstraintNotFoundHelper.type ();
  }

}
