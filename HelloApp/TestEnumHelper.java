package HelloApp;


/**
* HelloApp/TestEnumHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* Monday, January 29, 2018 11:48:31 AM BDT
*/

abstract public class TestEnumHelper
{
  private static String  _id = "IDL:HelloApp/TestEnum:1.0";

  public static void insert (org.omg.CORBA.Any a, HelloApp.TestEnum that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static HelloApp.TestEnum extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (HelloApp.TestEnumHelper.id (), "TestEnum", new String[] { "ONE", "TWO"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static HelloApp.TestEnum read (org.omg.CORBA.portable.InputStream istream)
  {
    return HelloApp.TestEnum.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, HelloApp.TestEnum value)
  {
    ostream.write_long (value.value ());
  }

}
