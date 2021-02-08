import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="appcalc.class"height=300 width=300></applet>*/
public class appcalc extends Applet implements ActionListener
{
	TextField txt1;
	Button b1,b2,b3,b4,b5,b6;
	Double op1,op2;
	char ch;
	public void init()
	{
		setLayout(null);
		txt1=new TextField(20);
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		b5=new Button("compute");
		b6=new Button("clear");
		txt1.setBounds(70,50,200,40);
		b1.setBounds(60,100,100,40);
		b2.setBounds(170,100,100,40);
		b3.setBounds(60,150,100,40);
		b4.setBounds(170,150,100,40);
		b5.setBounds(60,200,100,40);
		b6.setBounds(170,200,100,40);
		add(txt1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			if(e.getSource()==b1)
			{
				if(txt1.getText().trim().equals(" "))
				{
					showStatus("plz enter first operand:");
				}
				else
				{
					op1=Double.parseDouble(txt1.getText().trim());
					ch=b1.getLabel().trim().charAt(0);
					txt1.setText(" ");
				 }
			}
			if(e.getSource()==b2)
			{
				if(txt1.getText().trim().equals(" "))
				{
					showStatus("plz enter first operand:");
				}
				else
				{
					op1=Double.parseDouble(txt1.getText().trim());
					ch=b2.getLabel().trim().charAt(0);
					txt1.setText(" ");
				}
			}
			if(e.getSource()==b3)
			{
				if(txt1.getText().trim().equals(" "))
				{
					showStatus("plz enter first operand:");
				}
				else
				{
					op1=Double.parseDouble(txt1.getText().trim());
					ch=b3.getLabel().trim().charAt(0);
					txt1.setText(" ");
				 }
			}
			if(e.getSource()==b4)
			{
				if(txt1.getText().trim().equals(" "))
				{
					showStatus("plz enter first operand:");
				}
				else
				{
					op1=Double.parseDouble(txt1.getText().trim());
					ch=b4.getLabel().trim().charAt(0);
					txt1.setText(" ");
				 }
			}
			if(e.getSource()==b5)
			{
				if(txt1.getText().trim().equals(" "))
				{
					showStatus("plz enter first operand:");
				}
				else
				{
					op2=Double.parseDouble(txt1.getText().trim());
					switch(ch)
					{
						case '+': txt1.setText(" "+(op1+op2));
							break;
						case '-': txt1.setText(" "+(op1-op2));
							break;
						case '*': txt1.setText(" "+(op1*op2));
							break;
						case '/': if(op2==0)
						{
							showStatus("divide by zero error");
							txt1.setText(" ");
						}
						else
						{
							txt1.setText(" "+(op1/op2));
						 }
					}
				}
			}
			if(e.getSource()==b6)
			{
				txt1.setText(" ");
				showStatus(" ");
			}
		}
		catch(Exception a)
		 {
			showStatus("invalid entry");	
		   }
	}
}

