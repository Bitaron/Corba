package CosNotification;

/**
* CosNotification/QoSError_codeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotification.idl
* Thursday, February 1, 2018 2:55:08 PM BDT
*/


/**
    * An enumeration of quality of service error codes.
    */
public final class QoSError_codeHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.QoSError_code value = null;

  public QoSError_codeHolder ()
  {
  }

  public QoSError_codeHolder (CosNotification.QoSError_code initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.QoSError_codeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.QoSError_codeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.QoSError_codeHelper.type ();
  }

}