import java.io.*;
public class Revfibo{
	public static void main(String[] args) throws IOException
	{
		int ch;
		DataInputStream in = new DataInputStream(System.in);
		do
		{
			System.out.println("\n***MENU***\n");
			System.out.println("1.Reverse & Digit sum\n");
			System.out.println("2.Fibonocci\n");
			System.out.println("3.Exit\n");
			System.out.println("Enter your choice\n");
			ch=Integer.parseInt(in.readLine());
			switch(ch)
			{
				case 1:int num,rev,rem,dsum;
				rev=0;
				dsum=0;
				System.out.println("Enter the number\n");
				num=Integer.parseInt(in.readLine());
				while(num>0)
				{
					rem=num%10;
					rev=rev*10+rem;
					dsum=dsum+rem;
					num=num/10;
				}
				System.out.println("reverse of a number is="+rev);
				System.out.println("the digit sum="+dsum);
				break;
				case 2:int n1,n2,n3,count;
				n1=0;
				n2=1;
				System.out.println("number of element in the series=");
				count=Integer.parseInt(in.readLine());
				if(count<=0)
					System.out.println("Invalid entry");
				else if(count==1)
					System.out.print("Fibonocci series is="+n1);
				else
				{
					System.out.print("Fibonocci series is="+n1+"\t"+n2);
					for(int i=2;i<count;i++){
					n3=n1+n2;
					System.out.print("\t"+n3);
					n1=n2;
					n2=n3;
				}
			}
				break;
				case 3:return;
				default:System.out.println("please enter valid input");
			}
		}while(ch>0 && ch<4);
	}
}