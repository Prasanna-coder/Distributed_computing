import java.rmi.*;
public interface Temperature extends Remote
{
	public float tempconv(float c)throws RemoteException;

}