package CosNotifyComm;

/**
* CosNotifyComm/SequencePushSupplierHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyComm.idl
* Thursday, February 1, 2018 2:55:11 PM BDT
*/


/**
    * An interface for sequences push suppliers.
    */
public final class SequencePushSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.SequencePushSupplier value = null;

  public SequencePushSupplierHolder ()
  {
  }

  public SequencePushSupplierHolder (CosNotifyComm.SequencePushSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.SequencePushSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.SequencePushSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.SequencePushSupplierHelper.type ();
  }

}
