package HelloApp;

/**
* HelloApp/TestEnumHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* Monday, January 29, 2018 11:48:31 AM BDT
*/

public final class TestEnumHolder implements org.omg.CORBA.portable.Streamable
{
  public HelloApp.TestEnum value = null;

  public TestEnumHolder ()
  {
  }

  public TestEnumHolder (HelloApp.TestEnum initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = HelloApp.TestEnumHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    HelloApp.TestEnumHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return HelloApp.TestEnumHelper.type ();
  }

}
