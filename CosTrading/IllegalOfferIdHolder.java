package CosTrading;

/**
* CosTrading/IllegalOfferIdHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:13 PM BDT
*/

public final class IllegalOfferIdHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.IllegalOfferId value = null;

  public IllegalOfferIdHolder ()
  {
  }

  public IllegalOfferIdHolder (CosTrading.IllegalOfferId initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.IllegalOfferIdHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.IllegalOfferIdHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.IllegalOfferIdHelper.type ();
  }

}