package CosTrading;

/**
* CosTrading/IllegalConstraintHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:13 PM BDT
*/

public final class IllegalConstraintHolder implements org.omg.CORBA.portable.Streamable
{
  public CosTrading.IllegalConstraint value = null;

  public IllegalConstraintHolder ()
  {
  }

  public IllegalConstraintHolder (CosTrading.IllegalConstraint initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosTrading.IllegalConstraintHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosTrading.IllegalConstraintHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosTrading.IllegalConstraintHelper.type ();
  }

}
