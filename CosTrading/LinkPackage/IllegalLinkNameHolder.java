package CosTrading.LinkPackage;

/**
* CosTrading/LinkPackage/IllegalLinkNameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:15 PM BDT
*/

public final class IllegalLinkNameHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.LinkPackage.IllegalLinkName value = null;

  public IllegalLinkNameHolder ()
  {
  }

  public IllegalLinkNameHolder (CosTrading.LinkPackage.IllegalLinkName initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.LinkPackage.IllegalLinkNameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.LinkPackage.IllegalLinkNameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.LinkPackage.IllegalLinkNameHelper.type ();
  }

}