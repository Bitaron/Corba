package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/AdminLimitExceededHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:10 PM BDT
*/

public final class AdminLimitExceededHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.AdminLimitExceeded value = null;

  public AdminLimitExceededHolder ()
  {
  }

  public AdminLimitExceededHolder (CosNotifyChannelAdmin.AdminLimitExceeded initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.AdminLimitExceededHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.AdminLimitExceededHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.AdminLimitExceededHelper.type ();
  }

}
