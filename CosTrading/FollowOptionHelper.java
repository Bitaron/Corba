package CosTrading;


/**
* CosTrading/FollowOptionHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:13 PM BDT
*/


/** This enum is used to determine the behaviour 
 * of the trader when traders are linked together.
 * <pre>
 * local_only	- Do not use other linked traders.
 * if_no_local	- Use linked traders if a query cannot be resolved locally.
 * always		- Always use linked traders.
 * </pre>
 */
abstract public class FollowOptionHelper
{
  private static String  _id = "IDL:omg.org/CosTrading/FollowOption:1.0";

  public static void insert (org.omg.CORBA.Any a, CosTrading.FollowOption that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosTrading.FollowOption extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (CosTrading.FollowOptionHelper.id (), "FollowOption", new String[] { "local_only", "if_no_local", "always"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosTrading.FollowOption read (org.omg.CORBA.portable.InputStream istream)
  {
    return CosTrading.FollowOption.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosTrading.FollowOption value)
  {
    ostream.write_long (value.value ());
  }

}
