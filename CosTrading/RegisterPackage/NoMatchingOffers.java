package CosTrading.RegisterPackage;


/**
* CosTrading/RegisterPackage/NoMatchingOffers.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:14 PM BDT
*/

public final class NoMatchingOffers extends org.omg.CORBA.UserException
{
  public String constr = null;

  public NoMatchingOffers ()
  {
    super(NoMatchingOffersHelper.id());
  } // ctor

  public NoMatchingOffers (String _constr)
  {
    super(NoMatchingOffersHelper.id());
    constr = _constr;
  } // ctor


  public NoMatchingOffers (String $reason, String _constr)
  {
    super(NoMatchingOffersHelper.id() + "  " + $reason);
    constr = _constr;
  } // ctor

} // class NoMatchingOffers