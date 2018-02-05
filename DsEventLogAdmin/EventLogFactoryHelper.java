package DsEventLogAdmin;


/**
* DsEventLogAdmin/EventLogFactoryHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/DsEventLogAdmin.idl
* Thursday, February 1, 2018 2:55:15 PM BDT
*/

abstract public class EventLogFactoryHelper
{
  private static String  _id = "IDL:omg.org/DsEventLogAdmin/EventLogFactory:1.0";

  public static void insert (org.omg.CORBA.Any a, DsEventLogAdmin.EventLogFactory that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DsEventLogAdmin.EventLogFactory extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (DsEventLogAdmin.EventLogFactoryHelper.id (), "EventLogFactory");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DsEventLogAdmin.EventLogFactory read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_EventLogFactoryStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DsEventLogAdmin.EventLogFactory value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static DsEventLogAdmin.EventLogFactory narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DsEventLogAdmin.EventLogFactory)
      return (DsEventLogAdmin.EventLogFactory)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      DsEventLogAdmin._EventLogFactoryStub stub = new DsEventLogAdmin._EventLogFactoryStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static DsEventLogAdmin.EventLogFactory unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DsEventLogAdmin.EventLogFactory)
      return (DsEventLogAdmin.EventLogFactory)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      DsEventLogAdmin._EventLogFactoryStub stub = new DsEventLogAdmin._EventLogFactoryStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
