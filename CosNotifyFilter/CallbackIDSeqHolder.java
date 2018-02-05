package CosNotifyFilter;


/**
* CosNotifyFilter/CallbackIDSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyFilter.idl
* Thursday, February 1, 2018 2:55:12 PM BDT
*/


/**
    * A sequence of <code>CallbackID</code>.
    */
public final class CallbackIDSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[] = null;

  public CallbackIDSeqHolder ()
  {
  }

  public CallbackIDSeqHolder (int[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.CallbackIDSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.CallbackIDSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.CallbackIDSeqHelper.type ();
  }

}
