package com.chanpreet.appletPrograms;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Loan" width=300 height=300>
</applet>
*/

public class Prog20 extends Applet
implements ActionListener,ItemListener
 {
		double p,r,n,total,i;
		String param1;
		boolean month;
		Label l1,l2,l3,l4;
		TextField t1,t2,t3,t4;
		Button b1,b2;
		CheckboxGroup cbg;
		Checkbox c1,c2;
		String str;
		public void init()
		{
			l1=new Label("Balance Amount",Label.LEFT);
			l2=new Label("Number of Months",Label.LEFT);
			l3=new Label("Interest Rate",Label.LEFT);
			l4=new Label("Total Payment",Label.LEFT);
			t1=new TextField(5);
			t2=new TextField(5);
			t3=new TextField(15);
			t4=new TextField(20);
			b1=new Button("OK");
			b2=new Button("Delete");
			cbg=new CheckboxGroup();
			c1=new Checkbox("Month Rate",cbg,true);
			c2=new Checkbox("Annual Rate",cbg,true);
			t1.addActionListener(this);
			t2.addActionListener(this);
			t3.addActionListener(this);
			t4.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
			c1.addItemListener(this);
			c2.addItemListener(this);
			add(l1);
			add(t1);
			add(l2);
			add(t2);
			add(l3);
			add(t3);
			add(l4);
			add(t4);
			add(c1);
			add(c2);
			add(b1);
			add(b2);
		}
		
		public void itemStateChanged(ItemEvent ie)
		{
		}
		public void actionPerformed(ActionEvent ae)
		{
			str=ae.getActionCommand();
			if(str.equals("OK"))
			{
				p=Double.parseDouble(t1.getText());
				n=Double.parseDouble(t2.getText());
				r=Double.parseDouble(t3.getText());
				if(c2.getState())
				{
					n=n/12;
				}
				i=(p*n*r)/100;
				total=p+i;
				t4.setText(" "+total);
			}
			else if(str.equals("Delete"))
			{
				t1.setText(" ");
				t2.setText(" ");
				t3.setText(" ");
				t4.setText(" ");
			}
		}
	}


