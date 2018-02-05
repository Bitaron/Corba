package HelloApp;


/**
* HelloApp/SampleIteratorHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* Monday, February 5, 2018 2:06:40 PM BDT
*/

abstract public class SampleIteratorHelper
{
  private static String  _id = "IDL:HelloApp/SampleIterator:1.0";

  public static void insert (org.omg.CORBA.Any a, HelloApp.SampleIterator that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static HelloApp.SampleIterator extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (HelloApp.SampleIteratorHelper.id (), "SampleIterator");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static HelloApp.SampleIterator read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_SampleIteratorStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, HelloApp.SampleIterator value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static HelloApp.SampleIterator narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof HelloApp.SampleIterator)
      return (HelloApp.SampleIterator)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      HelloApp._SampleIteratorStub stub = new HelloApp._SampleIteratorStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static HelloApp.SampleIterator unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof HelloApp.SampleIterator)
      return (HelloApp.SampleIterator)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      HelloApp._SampleIteratorStub stub = new HelloApp._SampleIteratorStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
