package CosNotifyChannelAdmin;

/**
* CosNotifyChannelAdmin/StructuredProxyPullConsumerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyChannelAdmin.idl
* Thursday, February 1, 2018 2:55:09 PM BDT
*/


/**
    * An interface for structured proxy pull consumers.
    */
public final class StructuredProxyPullConsumerHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyChannelAdmin.StructuredProxyPullConsumer value = null;

  public StructuredProxyPullConsumerHolder ()
  {
  }

  public StructuredProxyPullConsumerHolder (CosNotifyChannelAdmin.StructuredProxyPullConsumer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyChannelAdmin.StructuredProxyPullConsumerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyChannelAdmin.StructuredProxyPullConsumerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyChannelAdmin.StructuredProxyPullConsumerHelper.type ();
  }

}
