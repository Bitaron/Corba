package CosNotification;

/**
* CosNotification/PropertyRangeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotification.idl
* Thursday, February 1, 2018 2:55:08 PM BDT
*/

public final class PropertyRangeHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.PropertyRange value = null;

  public PropertyRangeHolder ()
  {
  }

  public PropertyRangeHolder (CosNotification.PropertyRange initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.PropertyRangeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.PropertyRangeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.PropertyRangeHelper.type ();
  }

}