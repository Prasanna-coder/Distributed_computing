import java.io.*;
class bank{
	String name,accno;
	int bal;
	bank(String n,String ano,int b)
	{
		name=n;
		accno=ano;
		bal=b;
	}
	void deposit(int amt)
	{
		bal=bal+amt;
		System.out.println("Amount deposited");
	}
	void withdraw(int amt)
	{
		if((bal-amt)<1000)
		System.out.println("Withdraw denoid");
		else
		{
			bal=bal-amt;
			System.out.println("Withdraw successful");
		}
	}
	void display()
	{
		System.out.println("Account details\n");
		System.out.println("Account holder name:"+name);
		System.out.println("Account number:"+accno);
		System.out.println("Balance amount:"+bal);
	}
}
class BankDeposit
{
	public static void main(String[] args) throws IOException
	{
		String name,ano;
		int bamt,ch;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter the account holder name:");
		name= in.readLine();
		System.out.println("Enter account number:");
		ano=in.readLine();
		System.out.println("Enter initial balance:");
		bamt=Integer.parseInt(in.readLine());
		bank obj=new bank(name,ano,bamt);
		do
		{
			int a,b;
			System.out.println("***MENU***\n");
			System.out.println("1.Deposit\n");
			System.out.println("2.Withdraw\n");
			System.out.println("3.Display\n");
			System.out.println("Enter your choice:\n");
			ch=Integer.parseInt(in.readLine());
			switch(ch)
			{
				case 1:System.out.println("Enter the amount to deposit:");
					a=Integer.parseInt(in.readLine());
					obj.deposit(a);
					break;
				case 2:System.out.println("Enter the amount to withdraw:");
					b=Integer.parseInt(in.readLine());
					obj.withdraw(b);
					break;
				case 3:obj.display();
					break;
			}
		}while(ch>0 && ch<4);
	}
}                                                          