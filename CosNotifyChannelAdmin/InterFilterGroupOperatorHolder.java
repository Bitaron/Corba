package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/InterFilterGroupOperatorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:09 PM BDT
*/


/**
    * Enumeration of filter group operators.
    */
public final class InterFilterGroupOperatorHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.InterFilterGroupOperator value = null;

  public InterFilterGroupOperatorHolder ()
  {
  }

  public InterFilterGroupOperatorHolder (CosNotifyChannelAdmin.InterFilterGroupOperator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.type ();
  }

}
