package org.omg.CORBA;


/**
* org/omg/CORBA/NamedValueHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/orb.idl
* Thursday, February 1, 2018 2:55:18 PM BDT
*/

abstract public class NamedValueHelper
{
  private static String  _id = "IDL:CORBA/NamedValue:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CORBA.NamedValue that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CORBA.NamedValue extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.omg.CORBA.NamedValueHelper.id (), "NamedValue");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CORBA.NamedValue read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_NamedValueStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CORBA.NamedValue value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static org.omg.CORBA.NamedValue narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.CORBA.NamedValue)
      return (org.omg.CORBA.NamedValue)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.omg.CORBA._NamedValueStub stub = new org.omg.CORBA._NamedValueStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static org.omg.CORBA.NamedValue unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.CORBA.NamedValue)
      return (org.omg.CORBA.NamedValue)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.omg.CORBA._NamedValueStub stub = new org.omg.CORBA._NamedValueStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}