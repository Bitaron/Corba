package CosNotification;


/**
* CosNotification/EventHeader.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotification.idl
* Thursday, February 1, 2018 2:55:08 PM BDT
*/

public final class EventHeader implements org.omg.CORBA.portable.IDLEntity
{
  public CosNotification.FixedEventHeader fixed_header = null;
  public CosNotification.Property variable_header[] = null;

  public EventHeader ()
  {
  } // ctor

  public EventHeader (CosNotification.FixedEventHeader _fixed_header, CosNotification.Property[] _variable_header)
  {
    fixed_header = _fixed_header;
    variable_header = _variable_header;
  } // ctor

} // class EventHeader
