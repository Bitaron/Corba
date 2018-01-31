package HelloApp;


/**
* HelloApp/TestStructHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* Monday, January 29, 2018 11:48:31 AM BDT
*/

abstract public class TestStructHelper
{
  private static String  _id = "IDL:HelloApp/TestStruct:1.0";

  public static void insert (org.omg.CORBA.Any a, HelloApp.TestStruct that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static HelloApp.TestStruct extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "intValue",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (HelloApp.TestStructHelper.id (), "TestStruct", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static HelloApp.TestStruct read (org.omg.CORBA.portable.InputStream istream)
  {
    HelloApp.TestStruct value = new HelloApp.TestStruct ();
    value.intValue = istream.read_long ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, HelloApp.TestStruct value)
  {
    ostream.write_long (value.intValue);
  }

}
