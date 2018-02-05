package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/ProxyTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:09 PM BDT
*/


/**
    * Enumeration of proxy types supported by notification service.
    */
public final class ProxyTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.ProxyType value = null;

  public ProxyTypeHolder ()
  {
  }

  public ProxyTypeHolder (CosNotifyChannelAdmin.ProxyType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.ProxyTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.ProxyTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.ProxyTypeHelper.type ();
  }

}
