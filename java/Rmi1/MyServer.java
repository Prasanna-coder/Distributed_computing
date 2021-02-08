import java.rmi.*;
import java.rmi.registry.*;
public class MyServer
{
	public static void main(String[] args)
	{
		try
		{
			Simpleinterest stub= new SimpleRemote();
			Naming.rebind("rmi://localhost:5001/bbhc",stub);
			System.out.println("Server started...");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}