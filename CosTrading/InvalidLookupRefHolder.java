package CosTrading;

/**
* CosTrading/InvalidLookupRefHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:13 PM BDT
*/

public final class InvalidLookupRefHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.InvalidLookupRef value = null;

  public InvalidLookupRefHolder ()
  {
  }

  public InvalidLookupRefHolder (CosTrading.InvalidLookupRef initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.InvalidLookupRefHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.InvalidLookupRefHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.InvalidLookupRefHelper.type ();
  }

}