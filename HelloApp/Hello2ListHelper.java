package HelloApp;


/**
* HelloApp/Hello2ListHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* Monday, February 5, 2018 2:06:40 PM BDT
*/

abstract public class Hello2ListHelper
{
  private static String  _id = "IDL:HelloApp/Hello2List:1.0";

  public static void insert (org.omg.CORBA.Any a, HelloApp2.Hello2[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static HelloApp2.Hello2[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = HelloApp2.Hello2Helper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (HelloApp.Hello2ListHelper.id (), "Hello2List", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static HelloApp2.Hello2[] read (org.omg.CORBA.portable.InputStream istream)
  {
    HelloApp2.Hello2 value[] = null;
    int _len0 = istream.read_long ();
    value = new HelloApp2.Hello2[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = HelloApp2.Hello2Helper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, HelloApp2.Hello2[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      HelloApp2.Hello2Helper.write (ostream, value[_i0]);
  }

}
