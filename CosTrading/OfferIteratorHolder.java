package CosTrading;

/**
* CosTrading/OfferIteratorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:14 PM BDT
*/


/** This interface supports operations to iterate through
 * lists of Offers returned by the CosTrading::Lookup::query
 * operation.
 */
public final class OfferIteratorHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.OfferIterator value = null;

  public OfferIteratorHolder ()
  {
  }

  public OfferIteratorHolder (CosTrading.OfferIterator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.OfferIteratorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.OfferIteratorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.OfferIteratorHelper.type ();
  }

}
