package CosNotification;


/**
* CosNotification/EventTypeSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotification.idl
* Thursday, February 1, 2018 2:55:08 PM BDT
*/


/**
    * A sequence of <code>EventType</code> structures.
    */
public final class EventTypeSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.EventType value[] = null;

  public EventTypeSeqHolder ()
  {
  }

  public EventTypeSeqHolder (CosNotification.EventType[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.EventTypeSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.EventTypeSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.EventTypeSeqHelper.type ();
  }

}
