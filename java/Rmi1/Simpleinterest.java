import java.rmi.*;
public interface Simpleinterest extends Remote
{
	public float siconv(int p,int t,float r)throws RemoteException;

}