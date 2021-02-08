import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="appEmp.class" height=300 width=300>
<param name="empno" value="E1001">
<param name="empname" value="virat">
<param name="basic" value="50000">
</applet>*/
public class appEmp extends Applet implements ActionListener
{
	TextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
	Button b1,b2;
	public void init()
	{
		setLayout(new GridLayout(10,2));
		 t1=new TextField(20);
		 t2=new TextField(20);
		 t3=new TextField(20);
		 t4=new TextField(20);
		 t5=new TextField(20);
		 t6=new TextField(20);
		 t7=new TextField(20);
		 t8=new TextField(20);
		 t9=new TextField(20);
	
		l1=new Label("empno");
		l2=new Label("empname");
		l3=new Label("Basic");
		l4=new Label("DA");
		l5=new Label("HRA");
		l6=new Label("PF");
		l7=new Label("PT");
		l8=new Label("Gross");
		l9=new Label("Net");
		b1=new Button("Compute");
		b2=new Button("Clear");

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		add(l6);
		add(t6);
		add(l7);
		add(t7);
		add(l8);
		add(t8);
		add(l9);
		add(t9);
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		double basic,hra,da,pf,pt,gross,net;
		String eno,ename;
		try
		{
			if(e.getSource()==b1)
			{
				eno=getParameter("empno");
				ename=getParameter("empname");		
				basic=Double.parseDouble(getParameter("basic"));
				if(basic<=20000)
				{
					da=0.4*basic;
					hra=0.1*basic;
					pt=100;
				}
				else
				{
					da=0.5*basic;
					hra=0.15*basic;
					pt=150;
				}
				gross=basic+da+hra;
				pf=0.12*gross;
				net=gross-pf-pf;
				t1.setText(eno);
				t2.setText(ename);
				t3.setText(" "+basic);
				t4.setText(" "+da);
				t5.setText(" "+hra);
				t6.setText(" "+pf);
				t7.setText(" "+pt);
				t8.setText(" "+gross);
				t9.setText(" "+net);
			}
			if(e.getSource()==b2)
			{
				t1.setText(" ");
				t2.setText(" ");
				t3.setText(" ");
				t4.setText(" ");
				t5.setText(" ");
				t6.setText(" ");
				t7.setText(" ");
				t8.setText(" ");
				t9.setText(" ");
			}
		}catch(Exception a)
		{
			showStatus("Invalid Entry");
		}
	}
}
					
				
				