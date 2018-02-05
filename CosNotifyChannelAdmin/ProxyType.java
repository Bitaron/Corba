package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/ProxyType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:09 PM BDT
*/


/**
    * Enumeration of proxy types supported by notification service.
    */
public class ProxyType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 8;
  private static CosNotifyChannelAdmin.ProxyType[] __array = new CosNotifyChannelAdmin.ProxyType [__size];

  public static final int _PUSH_ANY = 0;
  public static final CosNotifyChannelAdmin.ProxyType PUSH_ANY = new CosNotifyChannelAdmin.ProxyType(_PUSH_ANY);
  public static final int _PULL_ANY = 1;
  public static final CosNotifyChannelAdmin.ProxyType PULL_ANY = new CosNotifyChannelAdmin.ProxyType(_PULL_ANY);
  public static final int _PUSH_STRUCTURED = 2;
  public static final CosNotifyChannelAdmin.ProxyType PUSH_STRUCTURED = new CosNotifyChannelAdmin.ProxyType(_PUSH_STRUCTURED);
  public static final int _PULL_STRUCTURED = 3;
  public static final CosNotifyChannelAdmin.ProxyType PULL_STRUCTURED = new CosNotifyChannelAdmin.ProxyType(_PULL_STRUCTURED);
  public static final int _PUSH_SEQUENCE = 4;
  public static final CosNotifyChannelAdmin.ProxyType PUSH_SEQUENCE = new CosNotifyChannelAdmin.ProxyType(_PUSH_SEQUENCE);
  public static final int _PULL_SEQUENCE = 5;
  public static final CosNotifyChannelAdmin.ProxyType PULL_SEQUENCE = new CosNotifyChannelAdmin.ProxyType(_PULL_SEQUENCE);
  public static final int _PUSH_TYPED = 6;
  public static final CosNotifyChannelAdmin.ProxyType PUSH_TYPED = new CosNotifyChannelAdmin.ProxyType(_PUSH_TYPED);
  public static final int _PULL_TYPED = 7;
  public static final CosNotifyChannelAdmin.ProxyType PULL_TYPED = new CosNotifyChannelAdmin.ProxyType(_PULL_TYPED);

  public int value ()
  {
    return __value;
  }

  public static CosNotifyChannelAdmin.ProxyType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ProxyType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ProxyType
