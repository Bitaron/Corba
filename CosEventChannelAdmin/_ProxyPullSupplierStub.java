package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/_ProxyPullSupplierStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosEventChannelAdmin.idl
* Thursday, February 1, 2018 2:55:05 PM BDT
*/


/**
    * Interface for a proxy pull supplier.
    */
public class _ProxyPullSupplierStub extends org.omg.CORBA.portable.ObjectImpl implements CosEventChannelAdmin.ProxyPullSupplier
{


  /**
         * Connect a pull consumer to this proxy.
         * @parm <code>pull_consumer</code> - The <code>PullConsumer</code>
         * object reference.
         * @raises AlreadyConnected If this consumer is already connected.
         */
  public void connect_pull_consumer (CosEventComm.PullConsumer pull_consumer) throws CosEventChannelAdmin.AlreadyConnected
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("connect_pull_consumer", true);
                CosEventComm.PullConsumerHelper.write ($out, pull_consumer);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosEventChannelAdmin/AlreadyConnected:1.0"))
                    throw CosEventChannelAdmin.AlreadyConnectedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                connect_pull_consumer (pull_consumer        );
            } finally {
                _releaseReply ($in);
            }
  } // connect_pull_consumer


  /**
       * Pull an event from this supplier
       * @returns The event.
       * @raises Disconnected If this supplier is disconnected.
       */
  public org.omg.CORBA.Any pull () throws CosEventComm.Disconnected
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("pull", true);
                $in = _invoke ($out);
                org.omg.CORBA.Any $result = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosEventComm/Disconnected:1.0"))
                    throw CosEventComm.DisconnectedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return pull (        );
            } finally {
                _releaseReply ($in);
            }
  } // pull


  /**
       * Try to pull an event from this supplier.
       * @parm <code>has_event</code> - boolean indicating if supplier
       * has an event.
       * @returns The event if <code>has_event</code> is true.
       * @raises Disconnected If this supplier is disconnected.
       */
  public org.omg.CORBA.Any try_pull (org.omg.CORBA.BooleanHolder has_event) throws CosEventComm.Disconnected
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("try_pull", true);
                $in = _invoke ($out);
                org.omg.CORBA.Any $result = $in.read_any ();
                has_event.value = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosEventComm/Disconnected:1.0"))
                    throw CosEventComm.DisconnectedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return try_pull (has_event        );
            } finally {
                _releaseReply ($in);
            }
  } // try_pull


  /**
       * Disconnect a pull supplier.
       */
  public void disconnect_pull_supplier ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("disconnect_pull_supplier", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                disconnect_pull_supplier (        );
            } finally {
                _releaseReply ($in);
            }
  } // disconnect_pull_supplier

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosEventChannelAdmin/ProxyPullSupplier:1.0", 
    "IDL:omg.org/CosEventComm/PullSupplier:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ProxyPullSupplierStub
