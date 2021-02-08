import java.rmi.*;
import java.rmi.registry.*;
public class MyServer
{
	public static void main(String[] args)
	{
		try
		{
			Temperature stub= new TemperatureRemote();
			Naming.rebind("rmi://localhost:5002/bbhc",stub);
			System.out.println("Server started...");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}