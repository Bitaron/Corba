package CosTrading;

/**
* CosTrading/DuplicatePropertyNameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:13 PM BDT
*/

public final class DuplicatePropertyNameHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.DuplicatePropertyName value = null;

  public DuplicatePropertyNameHolder ()
  {
  }

  public DuplicatePropertyNameHolder (CosTrading.DuplicatePropertyName initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.DuplicatePropertyNameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.DuplicatePropertyNameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.DuplicatePropertyNameHelper.type ();
  }

}