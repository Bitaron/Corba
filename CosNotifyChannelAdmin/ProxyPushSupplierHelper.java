package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/ProxyPushSupplierHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:09 PM BDT
*/


/**
    * An interface for proxy push suppliers.
    */
abstract public class ProxyPushSupplierHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyChannelAdmin/ProxyPushSupplier:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyChannelAdmin.ProxyPushSupplier that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyChannelAdmin.ProxyPushSupplier extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotifyChannelAdmin.ProxyPushSupplierHelper.id (), "ProxyPushSupplier");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyChannelAdmin.ProxyPushSupplier read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ProxyPushSupplierStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyChannelAdmin.ProxyPushSupplier value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotifyChannelAdmin.ProxyPushSupplier narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyChannelAdmin.ProxyPushSupplier)
      return (CosNotifyChannelAdmin.ProxyPushSupplier)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyChannelAdmin._ProxyPushSupplierStub stub = new CosNotifyChannelAdmin._ProxyPushSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotifyChannelAdmin.ProxyPushSupplier unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyChannelAdmin.ProxyPushSupplier)
      return (CosNotifyChannelAdmin.ProxyPushSupplier)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyChannelAdmin._ProxyPushSupplierStub stub = new CosNotifyChannelAdmin._ProxyPushSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
