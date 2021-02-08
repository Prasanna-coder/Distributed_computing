import java.io.*;
interface Emp1
{
	final String code="E0001";
	final String ename="Anil";
	final String design="Manager";
	void display();
}
interface Empdetails
{
	final String actno="123456";
	final String doj="28 july 2000";
	final double basic=50000;
	void display1();
}
interface Earns extends Emp1,Empdetails
{
	final double pf=12;
	final double lic=150;
	final double tax=15;
	void calculate();
	void display2();
}
class Employee implements Earns
{
	double tpf,ttax;
	public void display()
	{
		System.out.println("emp code is:"+code);
		System.out.println("emp name is:"+ename);
		System.out.println("emp designation is:"+design);
	}
	public void display1()
	{
		System.out.println("account number is:"+actno);
		System.out.println("date of join is:"+doj);
		System.out.println("basic is:"+basic);
	}
	public void calculate()
	{
		tpf=(basic*pf)/100;
		ttax=(basic*tax)/100;
	}
	public void display2()
	{
		System.out.println("total pf is:"+tpf);
		System.out.println("total tax is:"+ttax);
		System.out.println("lic is:"+lic);
	}
}
class PaySlip
{
	public static void main(String[] args) throws IOException
	{
		Employee obj=new Employee();
		System.out.println("***PAYSLIP***");
		System.out.println("________________________");
		obj.display();
		obj.display1();
		obj.calculate();
		obj.display2();
		System.out.println("_________________________");
	}
}