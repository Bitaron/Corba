package HelloApp2;


/**
* HelloApp2/Hello2Helper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello2.idl
* Tuesday, January 30, 2018 12:12:51 AM BDT
*/

abstract public class Hello2Helper
{
  private static String  _id = "IDL:HelloApp2/Hello2:1.0";

  public static void insert (org.omg.CORBA.Any a, HelloApp2.Hello2 that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static HelloApp2.Hello2 extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (HelloApp2.Hello2Helper.id (), "Hello2");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static HelloApp2.Hello2 read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_Hello2Stub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, HelloApp2.Hello2 value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static HelloApp2.Hello2 narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof HelloApp2.Hello2)
      return (HelloApp2.Hello2)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      HelloApp2._Hello2Stub stub = new HelloApp2._Hello2Stub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static HelloApp2.Hello2 unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof HelloApp2.Hello2)
      return (HelloApp2.Hello2)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      HelloApp2._Hello2Stub stub = new HelloApp2._Hello2Stub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}