package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/ObtainInfoMode.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:09 PM BDT
*/


/**
    * Enumeration of modes for obtaining subscription or offered types.
    */
public class ObtainInfoMode implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 4;
  private static CosNotifyChannelAdmin.ObtainInfoMode[] __array = new CosNotifyChannelAdmin.ObtainInfoMode [__size];

  public static final int _ALL_NOW_UPDATES_OFF = 0;
  public static final CosNotifyChannelAdmin.ObtainInfoMode ALL_NOW_UPDATES_OFF = new CosNotifyChannelAdmin.ObtainInfoMode(_ALL_NOW_UPDATES_OFF);
  public static final int _ALL_NOW_UPDATES_ON = 1;
  public static final CosNotifyChannelAdmin.ObtainInfoMode ALL_NOW_UPDATES_ON = new CosNotifyChannelAdmin.ObtainInfoMode(_ALL_NOW_UPDATES_ON);
  public static final int _NONE_NOW_UPDATES_OFF = 2;
  public static final CosNotifyChannelAdmin.ObtainInfoMode NONE_NOW_UPDATES_OFF = new CosNotifyChannelAdmin.ObtainInfoMode(_NONE_NOW_UPDATES_OFF);
  public static final int _NONE_NOW_UPDATES_ON = 3;
  public static final CosNotifyChannelAdmin.ObtainInfoMode NONE_NOW_UPDATES_ON = new CosNotifyChannelAdmin.ObtainInfoMode(_NONE_NOW_UPDATES_ON);

  public int value ()
  {
    return __value;
  }

  public static CosNotifyChannelAdmin.ObtainInfoMode from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ObtainInfoMode (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ObtainInfoMode
