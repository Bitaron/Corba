package CosNotifyFilter;


/**
* CosNotifyFilter/MappingConstraintPairSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyFilter.idl
* Thursday, February 1, 2018 2:55:12 PM BDT
*/


/**
    * A sequence of <code>MappingConstraintPair</code> structures.
    */
public final class MappingConstraintPairSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.MappingConstraintPair value[] = null;

  public MappingConstraintPairSeqHolder ()
  {
  }

  public MappingConstraintPairSeqHolder (CosNotifyFilter.MappingConstraintPair[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.MappingConstraintPairSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.MappingConstraintPairSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.MappingConstraintPairSeqHelper.type ();
  }

}
