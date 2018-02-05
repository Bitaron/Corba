package DsLogAdmin;


/**
* DsLogAdmin/LogFull.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/DsLogAdmin.idl
* Thursday, February 1, 2018 2:55:16 PM BDT
*/

public final class LogFull extends org.omg.CORBA.UserException
{
  public short n_records_written = (short)0;

  public LogFull ()
  {
    super(LogFullHelper.id());
  } // ctor

  public LogFull (short _n_records_written)
  {
    super(LogFullHelper.id());
    n_records_written = _n_records_written;
  } // ctor


  public LogFull (String $reason, short _n_records_written)
  {
    super(LogFullHelper.id() + "  " + $reason);
    n_records_written = _n_records_written;
  } // ctor

} // class LogFull