package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/ProxyNotFoundHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:10 PM BDT
*/

public final class ProxyNotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.ProxyNotFound value = null;

  public ProxyNotFoundHolder ()
  {
  }

  public ProxyNotFoundHolder (CosNotifyChannelAdmin.ProxyNotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.ProxyNotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.ProxyNotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.ProxyNotFoundHelper.type ();
  }

}
