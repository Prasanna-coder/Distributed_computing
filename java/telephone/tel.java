import java.io.*;
import java.sql.*;
import java.lang.*;
class tel
{
	public static void main(String args[]) throws IOException
	{
		String ch,s,n,tnam,addr;
		int flag=0;
		DataInputStream in=new DataInputStream(System.in);
		Connection con;
		Statement stm;
		ResultSet res;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:msdtel","","");
			System.out.println("enter the begining letters of telephone holder name");
			ch=in.readLine();
			s="select * from tel where tname like'"+ch+"%'";
			stm=con.createStatement();
			res=stm.executeQuery(s);
			while(res.next())
			{
				flag=1;
				n=res.getString(2);
				tnam=res.getString(3);
				addr=res.getString(4);
				System.out.println("telephone number is" + n);
				System.out.println("telephone holder name is" + tnam);
				System.out.println("address is" + addr);
			}
			if(flag==0)
			{
				System.out.println("no such record");
			}
			res.close();
			stm.close();
			con.close();
		}
		catch(Exception e){}
	}
}
		
