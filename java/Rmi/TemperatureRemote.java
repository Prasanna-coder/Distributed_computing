import java.rmi.*;
import java.rmi.server.*;
public class TemperatureRemote extends UnicastRemoteObject implements Temperature
{
	TemperatureRemote()throws RemoteException
	{
		super();
	}
	public float tempconv(float c)
	{
		System.out.println("Inside tempconv method.." + c);
		return(c*1.8f+32.0f);
	}
}
