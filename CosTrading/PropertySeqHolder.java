package CosTrading;


/**
* CosTrading/PropertySeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:13 PM BDT
*/

public final class PropertySeqHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.Property value[] = null;

  public PropertySeqHolder ()
  {
  }

  public PropertySeqHolder (CosTrading.Property[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.PropertySeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.PropertySeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.PropertySeqHelper.type ();
  }

}