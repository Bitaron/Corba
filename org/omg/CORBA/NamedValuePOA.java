package org.omg.CORBA;


/**
* org/omg/CORBA/NamedValuePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/orb.idl
* Thursday, February 1, 2018 2:55:18 PM BDT
*/

public abstract class NamedValuePOA extends org.omg.PortableServer.Servant
 implements org.omg.CORBA.NamedValueOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CORBA/NamedValue:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public NamedValue _this() 
  {
    return NamedValueHelper.narrow(
    super._this_object());
  }

  public NamedValue _this(org.omg.CORBA.ORB orb) 
  {
    return NamedValueHelper.narrow(
    super._this_object(orb));
  }


} // class NamedValuePOA