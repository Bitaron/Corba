package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/AdminLimitExceeded.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:10 PM BDT
*/

public final class AdminLimitExceeded extends org.omg.CORBA.UserException
{
  public CosNotifyChannelAdmin.AdminLimit admin_property_err = null;

  public AdminLimitExceeded ()
  {
    super(AdminLimitExceededHelper.id());
  } // ctor

  public AdminLimitExceeded (CosNotifyChannelAdmin.AdminLimit _admin_property_err)
  {
    super(AdminLimitExceededHelper.id());
    admin_property_err = _admin_property_err;
  } // ctor


  public AdminLimitExceeded (String $reason, CosNotifyChannelAdmin.AdminLimit _admin_property_err)
  {
    super(AdminLimitExceededHelper.id() + "  " + $reason);
    admin_property_err = _admin_property_err;
  } // ctor

} // class AdminLimitExceeded
