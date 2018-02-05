package DsLogAdmin;


/**
* DsLogAdmin/WeekMaskItemHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/DsLogAdmin.idl
* Thursday, February 1, 2018 2:55:17 PM BDT
*/

abstract public class WeekMaskItemHelper
{
  private static String  _id = "IDL:omg.org/DsLogAdmin/WeekMaskItem:1.0";

  public static void insert (org.omg.CORBA.Any a, DsLogAdmin.WeekMaskItem that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DsLogAdmin.WeekMaskItem extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ushort);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (DsLogAdmin.DaysOfWeekHelper.id (), "DaysOfWeek", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "days",
            _tcOf_members0,
            null);
          _tcOf_members0 = DsLogAdmin.Time24IntervalHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (DsLogAdmin.IntervalsOfDayHelper.id (), "IntervalsOfDay", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "intervals",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (DsLogAdmin.WeekMaskItemHelper.id (), "WeekMaskItem", _members0);
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

  public static DsLogAdmin.WeekMaskItem read (org.omg.CORBA.portable.InputStream istream)
  {
    DsLogAdmin.WeekMaskItem value = new DsLogAdmin.WeekMaskItem ();
    value.days = istream.read_ushort ();
    value.intervals = DsLogAdmin.IntervalsOfDayHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DsLogAdmin.WeekMaskItem value)
  {
    ostream.write_ushort (value.days);
    DsLogAdmin.IntervalsOfDayHelper.write (ostream, value.intervals);
  }

}