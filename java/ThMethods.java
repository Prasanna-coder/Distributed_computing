import java.io.*;
class T1 implements Runnable
{
	int n;
	T1(int p)
	{
		n=p;
	}
	public void run()
	{
		System.out.println("first thread started");
		for(int i=0;i<n;i++)
		{
			System.out.println("Square of"+i+"is"+(i*i));
		}
		System.out.println("First thread ended");
	}
}
class T2 implements Runnable
{
	int n;
	T2(int p)
	{
		n=p;
	}
	public void run()
	{
		System.out.println("second thread started");
		for(int i=0;i<n;i++)
		{
			System.out.println("cube of"+i+"is"+(i*i*i));
		}
		System.out.println("Second thread ended");
	}
}
class T3 implements Runnable
{
	int n;
	T3(int p)
	{
		n=p;
	}
	public void run()
	{
		System.out.println("third thread started");
		for(int i=0;i<n;i++)
		{
			System.out.println("Square root of"+i+"is"+Math.sqrt(i));
		}
		System.out.println("third thread ended");
	}
}
class ThMethods
{
	public static void main(String[] args)throws IOException{
	int n;
	DataInputStream in = new DataInputStream(System.in);
	System.out.println("enter the value for n");
	n=Integer.parseInt(in.readLine());
	T1 obj1=new T1(n);
	T2 obj2=new T2(n);
	T3 obj3=new T3(n);
	Thread obj4 = new Thread(obj1);
	Thread obj5 = new Thread(obj2);
	Thread obj6 = new Thread(obj3);
	obj4.setPriority(3);
	obj6.setPriority(10);
	obj4.start();
	obj5.start();
	obj6.start();
	}
}