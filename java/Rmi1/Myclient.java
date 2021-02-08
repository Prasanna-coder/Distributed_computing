import java.rmi.*;
public class Myclient
{
	public static void main(String[] args)
	{
		try
		{
			Simpleinterest stub=(Simpleinterest) Naming.lookup("rmi://localhost:5001/bbhc");
			System.out.println("with client started..");
			System.out.println(stub.siconv(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Float.parseFloat(args[2])));
		}
		catch(Exception e){
		System.out.println(e);
		}
	}
}