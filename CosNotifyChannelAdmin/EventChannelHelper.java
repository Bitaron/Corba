package CosNotifyChannelAdmin;


/**
* CosNotifyChannelAdmin/EventChannelHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:10 PM BDT
*/


/**
    * An interface for the event channel.
    */
abstract public class EventChannelHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyChannelAdmin/EventChannel:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyChannelAdmin.EventChannel that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyChannelAdmin.EventChannel extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotifyChannelAdmin.EventChannelHelper.id (), "EventChannel");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyChannelAdmin.EventChannel read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_EventChannelStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyChannelAdmin.EventChannel value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotifyChannelAdmin.EventChannel narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyChannelAdmin.EventChannel)
      return (CosNotifyChannelAdmin.EventChannel)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyChannelAdmin._EventChannelStub stub = new CosNotifyChannelAdmin._EventChannelStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotifyChannelAdmin.EventChannel unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyChannelAdmin.EventChannel)
      return (CosNotifyChannelAdmin.EventChannel)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyChannelAdmin._EventChannelStub stub = new CosNotifyChannelAdmin._EventChannelStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
