package CosTrading.LinkPackage;


/**
* CosTrading/LinkPackage/DefaultFollowTooPermissive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:15 PM BDT
*/

public final class DefaultFollowTooPermissive extends org.omg.CORBA.UserException
{
  public CosTrading.FollowOption def_pass_on_follow_rule = null;
  public CosTrading.FollowOption limiting_follow_rule = null;

  public DefaultFollowTooPermissive ()
  {
    super(DefaultFollowTooPermissiveHelper.id());
  } // ctor

  public DefaultFollowTooPermissive (CosTrading.FollowOption _def_pass_on_follow_rule, CosTrading.FollowOption _limiting_follow_rule)
  {
    super(DefaultFollowTooPermissiveHelper.id());
    def_pass_on_follow_rule = _def_pass_on_follow_rule;
    limiting_follow_rule = _limiting_follow_rule;
  } // ctor


  public DefaultFollowTooPermissive (String $reason, CosTrading.FollowOption _def_pass_on_follow_rule, CosTrading.FollowOption _limiting_follow_rule)
  {
    super(DefaultFollowTooPermissiveHelper.id() + "  " + $reason);
    def_pass_on_follow_rule = _def_pass_on_follow_rule;
    limiting_follow_rule = _limiting_follow_rule;
  } // ctor

} // class DefaultFollowTooPermissive
