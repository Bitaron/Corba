package CosNotifyFilter;


/**
* CosNotifyFilter/FilterFactoryHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyFilter.idl
* Thursday, February 1, 2018 2:55:13 PM BDT
*/


/**
    * Interface for a filter factory.
    */
abstract public class FilterFactoryHelper
{
  private static String  _id = "IDL:omg.org/CosNotifyFilter/FilterFactory:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotifyFilter.FilterFactory that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotifyFilter.FilterFactory extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotifyFilter.FilterFactoryHelper.id (), "FilterFactory");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotifyFilter.FilterFactory read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_FilterFactoryStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotifyFilter.FilterFactory value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotifyFilter.FilterFactory narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyFilter.FilterFactory)
      return (CosNotifyFilter.FilterFactory)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyFilter._FilterFactoryStub stub = new CosNotifyFilter._FilterFactoryStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotifyFilter.FilterFactory unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotifyFilter.FilterFactory)
      return (CosNotifyFilter.FilterFactory)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotifyFilter._FilterFactoryStub stub = new CosNotifyFilter._FilterFactoryStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
