package CosEventComm;

/**
* CosEventComm/PushSupplierHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosEventComm.idl
* Thursday, February 1, 2018 2:55:06 PM BDT
*/


/**
    * Interface for a push supplier.
    */
public final class PushSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventComm.PushSupplier value = null;

  public PushSupplierHolder ()
  {
  }

  public PushSupplierHolder (CosEventComm.PushSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventComm.PushSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventComm.PushSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventComm.PushSupplierHelper.type ();
  }

}