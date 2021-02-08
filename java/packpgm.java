import pack1.convert;
import pack2.simple;
import java.io.*;
import java.lang.*;
class packpgm
{
	public static void main(String[] args) throws IOException
	{
		Double temp,p,t,r;
		int ch;
		DataInputStream in= new DataInputStream(System.in);
		do {
			System.out.println("***MENU***");
			System.out.println("1.Temperature convertion");
			System.out.println("2.Simple interest");
			System.out.println("Enter your choice");
			ch=Integer.parseInt(in.readLine());
			switch(ch){
				case 1:
					System.out.println("Enter temperature in degree celcius");
					temp=Double.parseDouble(in.readLine());
					convert obj=new convert();
					System.out.println("Temp in `F is"+obj.ctof(temp));
					break;
				case 2:
					System.out.println("enter the value for p,t,r");
					p= Double.parseDouble(in.readLine());
					t= Double.parseDouble(in.readLine());
					r= Double.parseDouble(in.readLine());
					simple obj1 = new simple();
					System.out.println("simple interest is"+obj1.si(p,t,r));
					}
				}
				while(ch>=1 && ch<=2);
		}
}