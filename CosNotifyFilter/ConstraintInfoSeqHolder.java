package CosNotifyFilter;


/**
* CosNotifyFilter/ConstraintInfoSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyFilter.idl
* Thursday, February 1, 2018 2:55:12 PM BDT
*/


/**
    * A sequence of <code>ConstraintInfo</code> structures.
    */
public final class ConstraintInfoSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.ConstraintInfo value[] = null;

  public ConstraintInfoSeqHolder ()
  {
  }

  public ConstraintInfoSeqHolder (CosNotifyFilter.ConstraintInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.ConstraintInfoSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.ConstraintInfoSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.ConstraintInfoSeqHelper.type ();
  }

}
