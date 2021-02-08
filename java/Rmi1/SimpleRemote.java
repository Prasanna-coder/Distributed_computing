import java.rmi.*;
import java.rmi.server.*;
public class SimpleRemote extends UnicastRemoteObject implements Simpleinterest
{
	SimpleRemote()throws RemoteException
	{
		super();
	}
	public float siconv(int p,int t,float r)
	{
		System.out.println("Inside siconv method.." + p + t + r );
		return(p*t*r/100f);
	}
}
