package CosTrading;


/**
* CosTrading/IllegalServiceType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:13 PM BDT
*/

public final class IllegalServiceType extends org.omg.CORBA.UserException
{
  public String type = null;

  public IllegalServiceType ()
  {
    super(IllegalServiceTypeHelper.id());
  } // ctor

  public IllegalServiceType (String _type)
  {
    super(IllegalServiceTypeHelper.id());
    type = _type;
  } // ctor


  public IllegalServiceType (String $reason, String _type)
  {
    super(IllegalServiceTypeHelper.id() + "  " + $reason);
    type = _type;
  } // ctor

} // class IllegalServiceType