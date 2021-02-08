import java.rmi.*;
public class Myclient
{
	public static void main(String[] args)
	{
		try
		{
			Temperature stub=(Temperature) Naming.lookup("rmi://localhost:5002/bbhc");
			System.out.println("with client started..");
			System.out.println(stub.tempconv(Float.parseFloat(args[0])));
		}
		catch(Exception e){
		System.out.println(e);
		}
	}
}