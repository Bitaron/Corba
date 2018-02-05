package DsLogAdmin;


/**
* DsLogAdmin/WeekMaskHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/DsLogAdmin.idl
* Thursday, February 1, 2018 2:55:17 PM BDT
*/

abstract public class WeekMaskHelper
{
  private static String  _id = "IDL:omg.org/DsLogAdmin/WeekMask:1.0";

  public static void insert (org.omg.CORBA.Any a, DsLogAdmin.WeekMaskItem[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DsLogAdmin.WeekMaskItem[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = DsLogAdmin.WeekMaskItemHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (DsLogAdmin.WeekMaskHelper.id (), "WeekMask", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DsLogAdmin.WeekMaskItem[] read (org.omg.CORBA.portable.InputStream istream)
  {
    DsLogAdmin.WeekMaskItem value[] = null;
    int _len0 = istream.read_long ();
    value = new DsLogAdmin.WeekMaskItem[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = DsLogAdmin.WeekMaskItemHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DsLogAdmin.WeekMaskItem[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      DsLogAdmin.WeekMaskItemHelper.write (ostream, value[_i0]);
  }

}
