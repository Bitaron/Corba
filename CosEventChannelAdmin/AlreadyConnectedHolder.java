package CosEventChannelAdmin;

/**
* CosEventChannelAdmin/AlreadyConnectedHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosEventChannelAdmin.idl
* Thursday, February 1, 2018 2:55:04 PM BDT
*/

public final class AlreadyConnectedHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventChannelAdmin.AlreadyConnected value = null;

  public AlreadyConnectedHolder ()
  {
  }

  public AlreadyConnectedHolder (CosEventChannelAdmin.AlreadyConnected initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventChannelAdmin.AlreadyConnectedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventChannelAdmin.AlreadyConnectedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventChannelAdmin.AlreadyConnectedHelper.type ();
  }

}