package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/ProxyPullSupplierHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:09 PM BDT
*/


/**
    * An interface for proxy pull suppliers.
    */
abstract public class ProxyPullSupplierHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyChannelAdmin/ProxyPullSupplier:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyChannelAdmin.ProxyPullSupplier that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyChannelAdmin.ProxyPullSupplier extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotifyChannelAdmin.ProxyPullSupplierHelper.id (), "ProxyPullSupplier");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyChannelAdmin.ProxyPullSupplier read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ProxyPullSupplierStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyChannelAdmin.ProxyPullSupplier value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotifyChannelAdmin.ProxyPullSupplier narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyChannelAdmin.ProxyPullSupplier)
      return (CosNotifyChannelAdmin.ProxyPullSupplier)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyChannelAdmin._ProxyPullSupplierStub stub = new CosNotifyChannelAdmin._ProxyPullSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotifyChannelAdmin.ProxyPullSupplier unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyChannelAdmin.ProxyPullSupplier)
      return (CosNotifyChannelAdmin.ProxyPullSupplier)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyChannelAdmin._ProxyPullSupplierStub stub = new CosNotifyChannelAdmin._ProxyPullSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
