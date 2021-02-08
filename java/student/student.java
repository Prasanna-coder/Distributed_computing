import java.io.*;
import java.lang.*;
import java.sql.*;
class student
{
	public static void main(String[] args) throws IOException {
	DataInputStream in= new DataInputStream(System.in);
	Connection con;
	Statement stm;
	ResultSet res;
	PreparedStatement ps;
	int sno,m1,m2,ch;
	String sname,cls,s;
	try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:stud","","");
		do
		{
			System.out.println("\n***MENU***");
			System.out.println("\1.insert");
			System.out.println("2.delete");
			System.out.println("3.Display");
			System.out.println("Enter your choice:\n");
			ch=Integer.parseInt(in.readLine());
			switch(ch)
			{
				case 1: System.out.println("Enter the student number");
					sno=Integer.parseInt(in.readLine());
					s="select * from student where sno="+sno+"";
					stm=con.createStatement();
					res=stm.executeQuery(s);
					if(res.next())
					{
						System.out.println("record already exist");
					}
					else
					{
						System.out.println("Enter name,class,mark1 and mark2");
						sname=in.readLine();
						cls=in.readLine();
						m1=Integer.parseInt(in.readLine());
						m1=Integer.parseInt(in.readLine());
						ps=con.prepareStatement("insert into student(sno,sname,cls,m1,m2)values("+sno+",'"+sname+"','"+cls+"',"+m1+","+m2+");
						ps.executeUpdate();
						System.out.println("Record inserted");
					}
					con.close();
					con=DriverManager.getConnection("jdbc:odbc:stud","","");
					break;
					case 2: System.out.println("enter the student number to delete");
						sno=Integer.parseInt(in.readLine());
						s="select * from student where sno="+sno+"";
						stm=con.createStatement();
						res=stm.executeQuery(s);
						if(res.next())
					{
						ps=con.prepareStatement("delete from student where sno="+sno+"");

						ps.executeUpdate();
						System.out.println("Record deleted");
					}
					else
					{
						System.out.println("no such records");
					}
					con.close();
					con=DriverManager.getConnection("jdbc:odbc:stud","","");
					break;
					case 3: System.out.println("enter the student number to display");
						sno=Integer.parseInt(in.readLine());
						s="select * from student where sno="+sno+"";
						stm=con.createStatement();
						res=stm.executeQuery(s);
						if(res.next())
					{
						System.out.println("number \t name \t class \t m1 \t m2");
						System.out.println(res.getInt(2)+"\t");
						System.out.println(res.getInt(3)+"\t");
						System.out.println(res.getInt(4)+"\t");
						System.out.println(res.getInt(5)+"\t");
						System.out.println(res.getInt(6)+"\t");
					}
					else
					{
						System.out.println("no such record");
					}
					break;
				}
			}while(ch>=1 && ch<=3);
			con.close();
	
		}	
		catch(Exception e){}
	}
}