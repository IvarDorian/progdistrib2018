// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package equation.rmi.i;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.UnexpectedException;
import javax.rmi.CORBA.Stub;
import javax.rmi.CORBA.Util;
import org.omg.CORBA.ORB;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.RemarshalException;
import org.omg.CORBA.portable.ResponseHandler;
import org.omg.CORBA.portable.ServantObject;


public class _IEquation_Stub extends Stub implements IEquation {
    
    private static final String[] _type_ids = {
        "RMI:equation.rmi.i.IEquation:0000000000000000"
    };
    
        public String[] _ids() { 
            return (String[]) _type_ids.clone();
        }
        
        public long equation(long arg0) throws java.rmi.RemoteException {
            if (!Util.isLocal(this)) {
                try {
                    org.omg.CORBA.portable.InputStream in = null;
                    try {
                        OutputStream out = _request("equation", true);
                        out.write_longlong(arg0);
                        in = _invoke(out);
                        return in.read_longlong();
                    } catch (ApplicationException ex) {
                        in = ex.getInputStream();
                        String $_id = in.read_string();
                        throw new UnexpectedException($_id);
                    } catch (RemarshalException ex) {
                        return equation(arg0);
                    } finally {
                        _releaseReply(in);
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                }
            } else {
                ServantObject so = _servant_preinvoke("equation",IEquation.class);
                if (so == null) {
                    return equation(arg0);
                }
                try {
                    return ((IEquation)so.servant).equation(arg0);
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
    }
