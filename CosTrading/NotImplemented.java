package CosTrading;


/**
* CosTrading/NotImplemented.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:14 PM BDT
*/

public final class NotImplemented extends org.omg.CORBA.UserException
{

  public NotImplemented ()
  {
    super(NotImplementedHelper.id());
  } // ctor


  public NotImplemented (String $reason)
  {
    super(NotImplementedHelper.id() + "  " + $reason);
  } // ctor

} // class NotImplemented
