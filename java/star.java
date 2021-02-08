import java.io.*;
public class star
{
	public static void main(String[] args) throws IOException
	{
		int k,l;
		String ch;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter the character"); 
		ch =in.readLine();
		System.out.println("enter number of levels");
		l=Integer.parseInt(in.readLine());
		for(int i=1;i<l;i++)
		{
			for(int j=0;j<l-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<i;k++)
			{
			System.out.print(ch+" ");
			}				
			System.out.println(" ");
		}
	}
}
	