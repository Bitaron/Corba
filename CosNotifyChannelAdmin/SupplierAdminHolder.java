package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/SupplierAdminHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:10 PM BDT
*/


/**
    * An interface for supplier administration objects.
    */
public final class SupplierAdminHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.SupplierAdmin value = null;

  public SupplierAdminHolder ()
  {
  }

  public SupplierAdminHolder (CosNotifyChannelAdmin.SupplierAdmin initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.SupplierAdminHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.SupplierAdminHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.SupplierAdminHelper.type ();
  }

}
