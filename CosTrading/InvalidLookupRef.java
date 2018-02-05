package CosTrading;


/**
* CosTrading/InvalidLookupRef.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:13 PM BDT
*/

public final class InvalidLookupRef extends org.omg.CORBA.UserException
{
  public CosTrading.Lookup target = null;

  public InvalidLookupRef ()
  {
    super(InvalidLookupRefHelper.id());
  } // ctor

  public InvalidLookupRef (CosTrading.Lookup _target)
  {
    super(InvalidLookupRefHelper.id());
    target = _target;
  } // ctor


  public InvalidLookupRef (String $reason, CosTrading.Lookup _target)
  {
    super(InvalidLookupRefHelper.id() + "  " + $reason);
    target = _target;
  } // ctor

} // class InvalidLookupRef
