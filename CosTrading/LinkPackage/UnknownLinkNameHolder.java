package CosTrading.LinkPackage;

/**
* CosTrading/LinkPackage/UnknownLinkNameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:15 PM BDT
*/

public final class UnknownLinkNameHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.LinkPackage.UnknownLinkName value = null;

  public UnknownLinkNameHolder ()
  {
  }

  public UnknownLinkNameHolder (CosTrading.LinkPackage.UnknownLinkName initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.LinkPackage.UnknownLinkNameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.LinkPackage.UnknownLinkNameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.LinkPackage.UnknownLinkNameHelper.type ();
  }

}
