package CosNaming;

/**
* CosNaming/BindingHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNaming.idl
* Thursday, February 1, 2018 2:55:06 PM BDT
*/

public final class BindingHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.Binding value = null;

  public BindingHolder ()
  {
  }

  public BindingHolder (CosNaming.Binding initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.BindingHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.BindingHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.BindingHelper.type ();
  }

}