package CosTrading;

/**
* CosTrading/UnknownOfferIdHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:14 PM BDT
*/

public final class UnknownOfferIdHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.UnknownOfferId value = null;

  public UnknownOfferIdHolder ()
  {
  }

  public UnknownOfferIdHolder (CosTrading.UnknownOfferId initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.UnknownOfferIdHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.UnknownOfferIdHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.UnknownOfferIdHelper.type ();
  }

}
