package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/ProxyPullSupplierHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:09 PM BDT
*/


/**
    * An interface for proxy pull suppliers.
    */
public final class ProxyPullSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.ProxyPullSupplier value = null;

  public ProxyPullSupplierHolder ()
  {
  }

  public ProxyPullSupplierHolder (CosNotifyChannelAdmin.ProxyPullSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.ProxyPullSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.ProxyPullSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.ProxyPullSupplierHelper.type ();
  }

}
