import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class bill extends JFrame implements ActionListener
{
	public static int total=0;
	public static String orders1="";
	JLabel l1,c;
	JTextArea t1;
	JButton b1,b2;
	Font f,f1;
	bill()
	{
		ImageIcon i=new ImageIcon("ordersummary.jpg");
		c=new JLabel(i);
		t1=new JTextArea(orders1);
		l1=new JLabel("ORDER SUMMARY");
		l1.setForeground(Color.white);
		t1.setOpaque(false);
		t1.setEditable(false);
		t1.setForeground(Color.white);
		b1=new JButton("Add more items");
		b2=new JButton("Finalise Bill");
		f=new Font("Verdana",Font.BOLD,15);
		f1=new Font("Serif",Font.ITALIC,35);
		t1.setBounds(250,180,500,700);
		t1.setFont(f);
		l1.setFont(f1);
		c.setBounds(0,0,1000,960);
		b1.setBounds(300,750,150,50);
		b2.setBounds(600,750,100,50);
		l1.setBounds(300,50,500,100);
		add(c);
		c.add(b1);
		c.add(b2);
		c.add(l1);
		c.add(t1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		this.setLayout(null);
        this.setSize(1000,1000);   
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Add more items"))
		{
			this.setVisible(false);
			order o1=new order();
		}
		if(e.getActionCommand().equals("Finalise Bill"))
		{
			this.setVisible(false);
			Thankyou t = new Thankyou();
		}
	}
}
class Thankyou extends JFrame
{
	JLabel t,c;
	 Thankyou()
	 {
		 t=new JLabel("Amount to be paid is Rs "+bill.total);
		 t.setForeground(Color.white);
		 Font f=new Font("Verdana",Font.BOLD,22);
		 t.setFont(f);
		 ImageIcon i=new ImageIcon("thankyou.jpg");		
		 c=new JLabel(i);
		 t.setBounds(500,700,500,50);
		 c.setBounds(0,0,1000,1000);
		 add(c);
		 c.add(t);
		 this.setLayout(null);
         this.setSize(1000,1000);   
		 this.setVisible(true);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
}
class Desserts extends JFrame implements ActionListener
{
	JLabel d,m1,p1,q1,m2,p2,q2,c;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20;;
	JButton b1;
	Desserts()
	{
		d=new JLabel("DESSERTS");
		m1=new JLabel("Menu");
		q1=new JLabel("Qty");
		m2=new JLabel("Menu");
		q2=new JLabel("Qty");
		ImageIcon i=new ImageIcon("desserts-2.jpg");		
		c=new JLabel(i);
		b1=new JButton("PREVIOUS");
		b1.addActionListener(this);
		Font f=new Font("Verdana",Font.BOLD,25);
		d.setFont(f);
		c1=new JCheckBox("Strawberry Tart                  Rs299");
		c2=new JCheckBox("Chocolate Passion             Rs239");
		c3=new JCheckBox("Hot Fudge Sundae            Rs249");
		c4=new JCheckBox("Brownie                             Rs179");
		c5=new JCheckBox("Paan Ice Cream                 Rs149");
		c6=new JCheckBox("Rasmalai Milk Cake          Rs149");
		c7=new JCheckBox("Biscoff Cheesecake           Rs239");
		c8=new JCheckBox("Pull-Me-Up Cake              Rs249");
		c9=new JCheckBox("Belgian Pastry                   Rs239");
		c10=new JCheckBox("Chocolate Cake                Rs99");
		c11=new JCheckBox("Cinnamon Buns                Rs199");
		c12=new JCheckBox("Berry Crepe Cake              Rs149");
		c13=new JCheckBox("Royal Falooda                   Rs199");
		c14=new JCheckBox("Chocolate Croissant         Rs199");
		c15=new JCheckBox("Assorted Macroons          Rs149");
		c16=new JCheckBox("Cold Cocoa                       Rs99");
		c17=new JCheckBox("Gulab Jamun                    Rs99");
		c18=new JCheckBox("Rasgulla                            Rs149");
		c19=new JCheckBox("Mango Cream                   Rs149");
		c20=new JCheckBox("Caramel Custard              Rs149");
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c.setBounds(0,0,1000,1000);
		c1.setBounds(125,200,300,30);
		cb1.setBounds(430,200,40,30);
		c2.setBounds(125,250,300,30);
		cb2.setBounds(430,250,40,30);
		c3.setBounds(125,300,300,30);
		cb3.setBounds(430,300,40,30);
		c4.setBounds(125,350,300,30);
		cb4.setBounds(430,350,40,30);
		c5.setBounds(125,400,300,30);
		cb5.setBounds(430,400,40,30);
		c6.setBounds(125,450,300,30);
		cb6.setBounds(430,450,40,30);
		c7.setBounds(125,500,300,30);
		cb7.setBounds(430,500,40,30);
		c8.setBounds(125,550,300,30);
		cb8.setBounds(430,550,40,30);
		c9.setBounds(125,600,300,30);
		cb9.setBounds(430,600,40,30);
		c10.setBounds(125,650,300,30);
		cb10.setBounds(430,650,40,30);
		c11.setBounds(490,200,300,30);
		cb11.setBounds(820,200,40,30);
		c12.setBounds(490,250,300,30);
		cb12.setBounds(820,250,40,30);
		c13.setBounds(490,300,300,30);
		cb13.setBounds(820,300,40,30);
		c14.setBounds(490,350,300,30);
		cb14.setBounds(820,350,40,30);
		c15.setBounds(490,400,300,30);
		cb15.setBounds(820,400,40,30);
		c16.setBounds(490,450,300,30);
		cb16.setBounds(820,450,40,30);
		c17.setBounds(490,500,300,30);
		cb17.setBounds(820,500,40,30);
		c18.setBounds(490,550,300,30);
		cb18.setBounds(820,550,40,30);
		c19.setBounds(490,600,300,30);
		cb19.setBounds(820,600,40,30);
		c20.setBounds(490,650,300,30);
		cb20.setBounds(820,650,40,30);
		m1.setBounds(140,160,100,30);
		q1.setBounds(440,160,100,30);
		m2.setBounds(520,160,100,30);
		q2.setBounds(820,160,100,30);
		d.setBounds(400,100,500,30);
		b1.setBounds(500,750,100,30);
		add(c);
		c.add(d);
		c.add(m1);
		c.add(q1);
		c.add(m2);
		c.add(q2);
		c.add(c1);
		c.add(cb1);
		c.add(c2);
		c.add(cb2);
		c.add(c3);
		c.add(cb3);
		c.add(c4);
		c.add(cb4);
		c.add(c5);
		c.add(cb5);
		c.add(c6);
		c.add(cb6);
		c.add(c7);
		c.add(cb7);
		c.add(c8);
		c.add(cb8);
		c.add(c9);
		c.add(cb9);
		c.add(c10);
		c.add(cb10);
		c.add(c11);
		c.add(cb11);
		c.add(c12);
		c.add(cb12);
		c.add(c13);
		c.add(cb13);
		c.add(c14);
		c.add(cb14);
		c.add(c15);
		c.add(cb15);
		c.add(c16);
		c.add(cb16);
		c.add(c17);
		c.add(cb17);
		c.add(c18);
		c.add(cb18);
		c.add(c19);
		c.add(cb19);
		c.add(c20);
		c.add(cb20);
		c.add(b1);	
        this.setSize(1000,960);
	    this.setLayout(null);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}	
	public void actionPerformed(ActionEvent e)
	{
		int total=0;
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+299*x;
			bill.orders1+=s;
			bill.orders1+=" Strawberry Tart                  Rs299   ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+239*x;
			bill.orders1+=s;
			bill.orders1+=" Chocolate Passion             Rs239   ";
			bill.orders1+="\n";
			
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Hot Fudge Sundae            Rs249   ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+179*x;
			bill.orders1+=s;
			bill.orders1+=" Brownie                             Rs179  ";
			bill.orders1+=s+"\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+149*x;
			bill.orders1+=s;
			bill.orders1+=" Paan Ice Cream                 Rs149   ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+149*x;
			bill.orders1+=s;
			bill.orders1+=" Rasmalai Milk Cake          Rs149   ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+239*x;
			bill.orders1+=s;
			bill.orders1+=" Biscoff Cheesecake           Rs239   ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Pull-Me-Up Cake              Rs249    ";
			bill.orders1+="\n";
		}
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+239*x;
			bill.orders1+=s;
			bill.orders1+=" Belgian Pastry                   Rs239    ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+99*x;
			bill.orders1+=s;
			bill.orders1+=" Chocolate Cake                Rs99     ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+199*x;
			bill.orders1+=s;
			bill.orders1+=" Cinnamon Buns                Rs199   ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+149*x;
			bill.orders1+=s;
			bill.orders1+=" Berry Crepe Cake              Rs149    ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+199*x;
			bill.orders1+=s;
			bill.orders1+=" Royal Falooda                   Rs199   ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+199*x;
			bill.orders1+=s;
			bill.orders1+=" Chocolate Croissant         Rs199    ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+149*x;
			bill.orders1+=s;
			bill.orders1+=" Assorted Macroons          Rs149    ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+99*x; 
			bill.orders1+=s;
			bill.orders1+=" Cold Cocoa                       Rs99    ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+99*x;
			bill.orders1+=s;
			bill.orders1+=" Gulab Jamun                    Rs99    ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+149*x;
			bill.orders1+=s;
			bill.orders1+=" Rasgulla                            Rs149    ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+149*x;
			bill.orders1+=s;
			bill.orders1+=" Mango Cream                   Rs149   ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+149*x;
			bill.orders1+=s;
			bill.orders1+=" Caramel Custard              Rs149   ";
			bill.orders1+="\n";
			System.out.println(bill.orders1);
		}
		this.setVisible(false);
		order d=new order();
	}
}
class Drinks extends JFrame implements ActionListener
{
	JLabel d,m1,p1,q1,m2,p2,q2,c;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20;;
	JButton b1;
	Drinks()
	{
		ImageIcon i=new ImageIcon("drinks.jpg");
		c=new JLabel(i); 
		d=new JLabel("DRINKS");
		m1=new JLabel("Menu");
		q1=new JLabel("Qty");
		m2=new JLabel("Menu");
		q2=new JLabel("Qty");
		c.setBounds(0,0,1000,1000);
		b1=new JButton("PREVIOUS");
		b1.addActionListener(this);		
		Font f=new Font("Verdana",Font.BOLD,25);
		d.setFont(f);
		c1=new JCheckBox("Melon Cooler                      Rs210");
		c2=new JCheckBox("Orange Punch                    Rs210");
		c3=new JCheckBox("Guava Delight                    Rs210");
		c4=new JCheckBox("Pacific Blue                        Rs210");
		c5=new JCheckBox("Blue Lagoon                       Rs210");
		c6=new JCheckBox("Boba Tea                            Rs210");
		c7=new JCheckBox("Soda Shikanji                     Rs210");
		c8=new JCheckBox("Purple Rain                        Rs210");
		c9=new JCheckBox("Stawberry Daiquiry            Rs249");
		c10=new JCheckBox("Black Current Shake         Rs199");
		c11=new JCheckBox("Butter Scotch Shake          Rs249");
		c12=new JCheckBox("Choco Loaded Shake        Rs249");
		c13=new JCheckBox("Kitkat Shake                     Rs249");
		c14=new JCheckBox("Oreo Shake                       Rs249");
		c15=new JCheckBox("Mango Shake                    Rs249");
		c16=new JCheckBox("Cafe Mocha                      Rs199");
		c17=new JCheckBox("Espresso                            Rs269");
		c18=new JCheckBox("Cappuccino                      Rs199");
		c19=new JCheckBox("Hazelnut Latte                 Rs249");
		c20=new JCheckBox("Americano                       Rs299");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c1.setBounds(50,250,300,30);
		cb1.setBounds(380,250,40,30);
		c2.setBounds(50,300,300,30);
		cb2.setBounds(380,300,40,30);
		c3.setBounds(50,350,300,30);
		cb3.setBounds(380,350,40,30);
		c4.setBounds(50,400,300,30);
		cb4.setBounds(380,400,40,30);
		c5.setBounds(50,450,300,30);
		cb5.setBounds(380,450,40,30);
		c6.setBounds(50,500,300,30);
		cb6.setBounds(380,500,40,30);
		c7.setBounds(50,550,300,30);
		cb7.setBounds(380,550,40,30);
		c8.setBounds(50,600,300,30);
		cb8.setBounds(380,600,40,30);
		c9.setBounds(50,650,300,30);
		cb9.setBounds(380,650,40,30);
		c10.setBounds(50,700,300,30);
		cb10.setBounds(380,700,40,30);
		c11.setBounds(450,250,300,30);
		cb11.setBounds(780,250,40,30);
		c12.setBounds(450,300,300,30);
		cb12.setBounds(780,300,40,30);
		c13.setBounds(450,700,300,30);
		cb13.setBounds(780,700,40,30);
		c14.setBounds(450,350,300,30);
		cb14.setBounds(780,350,40,30);
		c15.setBounds(450,400,300,30);
		cb15.setBounds(780,400,40,30);
		c16.setBounds(450,450,300,30);
		cb16.setBounds(780,450,40,30);
		c17.setBounds(450,500,300,30);
		cb17.setBounds(780,500,40,30);
		c18.setBounds(450,550,300,30);
		cb18.setBounds(780,550,40,30);
		c19.setBounds(450,600,300,30);
		cb19.setBounds(780,600,40,30);
		c20.setBounds(450,650,300,30);
		cb20.setBounds(780,650,40,30);
		m1.setBounds(80,200,100,30);
		q1.setBounds(380,200,100,30);
		m2.setBounds(480,200,100,30);
		q2.setBounds(780,200,100,30);
		d.setBounds(400,50,500,30);
		b1.setBounds(500,750,100,30);		
		add(c);		
		c.add(d);
		c.add(m1);
		c.add(q1);
		c.add(m2);
		c.add(q2);
		c.add(c1);
		c.add(cb1);
		c.add(c2);
		c.add(cb2);
		c.add(c3);
		c.add(cb3);
		c.add(c4);
		c.add(cb4);
		c.add(c5);
		c.add(cb5);
		c.add(c6);
		c.add(cb6);
		c.add(c7);
		c.add(cb7);
		c.add(c8);
		c.add(cb8);
		c.add(c9);
		c.add(cb9);
		c.add(c10);
		c.add(cb10);
		c.add(c11);
		c.add(cb11);
		c.add(c12);
		c.add(cb12);
		c.add(c13);
		c.add(cb13);
		c.add(c14);
		c.add(cb14);
		c.add(c15);
		c.add(cb15);
		c.add(c16);
		c.add(cb16);
		c.add(c17);
		c.add(cb17);
		c.add(c18);
		c.add(cb18);
		c.add(c19);
		c.add(cb19);
		c.add(c20);
		c.add(cb20);
		c.add(b1);
		this.setSize(1000,960);
	    this.setLayout(null);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public void actionPerformed(ActionEvent e)
	{
		int total=0;
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Melon Cooler                      Rs210   ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Orange Punch                    Rs210   ";
			bill.orders1+="\n";
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Guava Delight                    Rs210   ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Pacific Blue                        Rs210   ";
			bill.orders1+="\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Blue Lagoon                       Rs210    ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Boba Tea                            Rs210    ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Soda Shikanji                     Rs210   ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Purple Rain                        Rs210   ";
			bill.orders1+="\n";
		}
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Stawberry Daiquiry            Rs249    ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+199*x;
			bill.orders1+=s;
			bill.orders1+=" Black Current Shake         Rs199   ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Butter Scotch Shake          Rs249    ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Choco Loaded Shake        Rs249    ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Kitkat Shake                     Rs249    ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Oreo Shake                       Rs249    ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Mango Shake                    Rs249    ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+199*x;
			bill.orders1+=s;
			bill.orders1+=" Cafe Mocha                      Rs199   ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+269*x;
			bill.orders1+=s;
			bill.orders1+=" Espresso                            Rs269    ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+199*x;
			bill.orders1+=s;
			bill.orders1+=" Cappuccino                      Rs199    ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+249*x;
			bill.orders1+=s;
			bill.orders1+=" Hazelnut Latte                 Rs249    ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+299*x;
			bill.orders1+=s;
			bill.orders1+=" Americano                       Rs299     ";
			bill.orders1+="\n";
		}
		System.out.println(bill.total);
		this.setVisible(false);
			order d=new order();
	}
}
class italy_veg extends JFrame implements ActionListener
{
	JLabel l1,c,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	italy_veg()
	{
		l1=new JLabel("      Menu                                                                  QTY");
		l2=new JLabel("      Menu                                                                  QTY");
		ImageIcon i=new ImageIcon("italian.jpg");
		b1=new JButton("PREVIOUS");
		c=new JLabel(i); 
		c1=new JCheckBox("Stuffed Shells                     Rs250");
		c2=new JCheckBox("Pesto Pasta                        Rs270");
		c3=new JCheckBox("Herby Pasta                       Rs290");
		c4=new JCheckBox("Spaghetti al Limone          Rs260");
		c5=new JCheckBox("White Pasta                       Rs280");
		c6=new JCheckBox("Grilled Zucchini                Rs300");
		c7=new JCheckBox("Spinach Pie Parm              Rs270");
		c8=new JCheckBox("Italian Cheese Loaf           Rs290");
		c9=new JCheckBox("Artichoke Pizza                 Rs310");
	   	c10=new JCheckBox("Italian Mushrooms          Rs280");
	   	c11=new JCheckBox("Cheese Ravioli                  Rs300");
	   	c12=new JCheckBox("Linguine                           Rs320");
	   	c13=new JCheckBox("Spring Green Risotto       Rs260");
	   	c14=new JCheckBox("Farm Pizza                       Rs270");
	   	c15=new JCheckBox("Arborio Rice                     Rs280");
	   	c16=new JCheckBox("Grilled Veggie Pizza         Rs280");
	   	c17=new JCheckBox("Cheese Focaccia                Rs300");
	   	c18=new JCheckBox("Arugula Sandwiches         Rs260");
	   	c19=new JCheckBox("Pasta with Asparagus       Rs290");
	   	c20=new JCheckBox("Veggie Lasagna                Rs310");
		c21=new JCheckBox("Garlic Bread                      Rs350");
		c22=new JCheckBox("Ziti Bake                           Rs360");
	   	c23=new JCheckBox("Mixed Olive Crostini        Rs390");
	   	c24=new JCheckBox("Alfredo Pasta                   Rs280");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		cb21=new JComboBox(qty);
		cb22=new JComboBox(qty);
		cb23=new JComboBox(qty);
		cb24=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c21.setContentAreaFilled(false);
		c22.setContentAreaFilled(false);
		c23.setContentAreaFilled(false);
		c24.setContentAreaFilled(false);
		c.setBounds(0,0,1000,1000);
        c1.setBounds(210,150,250,30);
		cb1.setBounds(470,150,50,20);
		c2.setBounds(210,200,250,30);
		cb2.setBounds(470,200,50,20);
		c3.setBounds(210,250,250,30);
		cb3.setBounds(470,250,50,20);
		c4.setBounds(210,300,250,30);
		cb4.setBounds(470,300,50,20);
		c5.setBounds(210,350,250,30);
		cb5.setBounds(470,350,50,20);
		c6.setBounds(210,400,250,30);
		cb6.setBounds(470,400,50,20);
		c7.setBounds(210,450,250,30);
		cb7.setBounds(470,450,50,20);
		c8.setBounds(210,500,250,30);
		cb8.setBounds(470,500,50,20);
		c9.setBounds(210,550,250,30);
		cb9.setBounds(470,550,50,20);
		c10.setBounds(210,600,250,30);
		cb10.setBounds(470,600,50,20);
		c11.setBounds(210,650,250,30);
		cb11.setBounds(470,650,50,20);
		c12.setBounds(210,700,250,30);
		cb12.setBounds(470,700,50,20);
		c13.setBounds(560,150,250,30);
		cb13.setBounds(820,150,50,20);
		c14.setBounds(560,200,250,30);
		cb14.setBounds(820,200,50,20);
		c15.setBounds(560,250,250,30);
		cb15.setBounds(820,250,50,20);
		c16.setBounds(560,300,250,30);
		cb16.setBounds(820,300,50,20);
		c17.setBounds(560,350,250,30);
		cb17.setBounds(820,350,50,20);
		c18.setBounds(560,400,250,30);
		cb18.setBounds(820,400,50,20);
		c19.setBounds(560,450,250,30);
		cb19.setBounds(820,450,50,20);
		c20.setBounds(560,500,250,30);
		cb20.setBounds(820,500,50,20);
		c21.setBounds(560,550,250,30);
		cb21.setBounds(820,550,50,20);
		c22.setBounds(560,600,250,30);
		cb22.setBounds(820,600,50,20);
		c23.setBounds(560,650,250,30);
		cb23.setBounds(820,650,50,20);
		c24.setBounds(560,700,250,30);
		cb24.setBounds(820,700,50,20);
		l1.setBounds(200,100,310,30);
		l2.setBounds(550,100,310,30);
		b1.setBounds(500,750,100,30);
		b1.addActionListener(this);
		add(c);
		c.add(l1);
		c.add(l2);
		c.add(b1);
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		c.add(c6);
		c.add(c7);
		c.add(c8);
		c.add(c9);
		c.add(c10);
		c.add(c11);
		c.add(c12);
		c.add(c13);
		c.add(c14);
		c.add(c15);
		c.add(c16);
		c.add(c17);
		c.add(c18);
		c.add(c19);
		c.add(c20);
		c.add(c21);
		c.add(c22);
		c.add(c23);
		c.add(c24); 
		c.add(cb1);
		c.add(cb2);
		c.add(cb3);
		c.add(cb4);
		c.add(cb5);
		c.add(cb6);
		c.add(cb7);
		c.add(cb8);
		c.add(cb9);
		c.add(cb10);
		c.add(cb11);
		c.add(cb12);
		c.add(cb13);
		c.add(cb14);
		c.add(cb15);
		c.add(cb16);
		c.add(cb17);
		c.add(cb18);
		c.add(cb19);
		c.add(cb20);
		c.add(cb21);
		c.add(cb22);
		c.add(cb23);
		c.add(cb24);
		this.setSize(1000,960);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		total=0;
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+250*x;
			bill.orders1+=s;
			bill.orders1+=" Stuffed Shells                     Rs250   ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+270*x;
			bill.orders1+=s;
			bill.orders1+=" Pesto Pasta                        Rs270    ";
			bill.orders1+="\n";
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Herby Pasta                       Rs290   ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+260*x;
			bill.orders1+=s;
			bill.orders1+=" Spaghetti al Limone          Rs260    ";
			bill.orders1+="\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" White Pasta                       Rs280    ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Grilled Zucchini                Rs300    ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+270*x;
			bill.orders1+=s;
			bill.orders1+=" Spinach Pie Parm              Rs270    ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Italian Cheese Loaf           Rs290   ";
			bill.orders1+="\n";
		}//
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Artichoke Pizza                 Rs310    ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Italian Mushrooms          Rs280   ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Cheese Ravioli                  Rs300   ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+320*x;
			bill.orders1+=s;
			bill.orders1+=" Linguine                           Rs320   ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+260*x;
			bill.orders1+=s;
			bill.orders1+=" Spring Green Risotto       Rs260     ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+270*x;
			bill.orders1+=s;
			bill.orders1+=" Farm Pizza                       Rs270     ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Arborio Rice                     Rs280    ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Grilled Veggie Pizza         Rs280    ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Cheese Focaccia                Rs300    ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+260*x;
			bill.orders1+=s;
			bill.orders1+=" Arugula Sandwiches         Rs260     ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Pasta with Asparagus       Rs290     ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Veggie Lasagna                Rs310     ";
			bill.orders1+="\n";
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Garlic Bread                      Rs350      ";
			bill.orders1+="\n";
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Ziti Bake                           Rs360     ";
			bill.orders1+="\n";
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Mixed Olive Crostini        Rs390     ";
			bill.orders1+="\n";
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Alfredo Pasta                   Rs280      ";
			bill.orders1+="\n";
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery d=new delivery();
		}
	}
}
class italy_nonveg extends JFrame implements ActionListener
{
	JLabel l1,c,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	italy_nonveg()
	{
		l1=new JLabel("      Menu                                                                  QTY");
		l2=new JLabel("      Menu                                                                  QTY");
	    ImageIcon i=new ImageIcon("italian.jpg");
		b1=new JButton("PREVIOUS");
		c=new JLabel(i); 
		c1=new JCheckBox("Lemon Chicken                  Rs300");
		c2=new JCheckBox("Spaghetti with Chicken     Rs330");
		c3=new JCheckBox("Chicken Overload Pizza     Rs350");
		c4=new JCheckBox("Chicken Osso Buco            Rs370");
		c5=new JCheckBox("Parmesan Chicken Skillet   Rs400");
		c6=new JCheckBox("Chicken Fettuccine             Rs450");
		c7=new JCheckBox("Chicken Florentine Pasta    Rs430");
		c8=new JCheckBox("Caprese Chicken                 Rs360");
		c9=new JCheckBox("Chicken Piccata Pasta        Rs350");
	   	c10=new JCheckBox("Chicken Stuffed Shells      Rs390");
	   	c11=new JCheckBox("Grilled Chicken Risotto      Rs410");
	   	c12=new JCheckBox("Pasta and Grilled Chicken Rs420");
	   	c13=new JCheckBox("Mozzarella Chicken            Rs360");
	   	c14=new JCheckBox("Chicken Marsala                 Rs430");
	   	c15=new JCheckBox("Tuscan Chicken Skillet       Rs380");
	   	c16=new JCheckBox("Lemon Chicken Piccata      Rs400");
	   	c17=new JCheckBox("Tuscan Garlic Chicken        Rs390");
	   	c18=new JCheckBox("Balsamic Chicken                Rs385");
	   	c19=new JCheckBox("Asiago Chicken Pasta          Rs300");
	   	c20=new JCheckBox("White Pasta Chicken          Rs420");
	   	c21=new JCheckBox("Spaghetti Bolognese            Rs430");
	   	c22=new JCheckBox("Panzenella                           Rs420");
	   	c23=new JCheckBox("Bruschetta                           Rs400");
	   	c24=new JCheckBox("Pasta Carbonara                  Rs360");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		cb21=new JComboBox(qty);
		cb22=new JComboBox(qty);
		cb23=new JComboBox(qty);
		cb24=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c21.setContentAreaFilled(false);
		c22.setContentAreaFilled(false);
		c23.setContentAreaFilled(false);
		c24.setContentAreaFilled(false);
		c.setBounds(0,0,1000,1000);
		c1.setBounds(250,150,250,30);
		cb1.setBounds(510,150,50,20);
		c2.setBounds(250,200,250,30);
		cb2.setBounds(510,200,50,20);
		c3.setBounds(250,250,250,30);
		cb3.setBounds(510,250,50,20);
		c4.setBounds(250,300,250,30);
		cb4.setBounds(510,300,50,20);
		c5.setBounds(250,350,250,30);
		cb5.setBounds(510,350,50,20);
		c6.setBounds(250,400,250,30);
		cb6.setBounds(510,400,50,20);
		c7.setBounds(250,450,250,30);
		cb7.setBounds(510,450,50,20);
		c8.setBounds(250,500,250,30);
		cb8.setBounds(510,500,50,20);
		c9.setBounds(250,550,250,30);
		cb9.setBounds(510,550,50,20);
		c10.setBounds(250,600,250,30);
		cb10.setBounds(510,600,50,20);
		c11.setBounds(250,650,250,30);
		cb11.setBounds(510,650,50,20);
		c12.setBounds(250,700,250,30);
		cb12.setBounds(510,700,50,20);
		c13.setBounds(600,150,250,30);
		cb13.setBounds(860,150,50,20);
		c14.setBounds(600,200,250,30);
		cb14.setBounds(860,200,50,20);
		c15.setBounds(600,250,250,30);
		cb15.setBounds(860,250,50,20);
		c16.setBounds(600,300,250,30);
		cb16.setBounds(860,300,50,20);
		c17.setBounds(600,350,250,30);
		cb17.setBounds(860,350,50,20);
		c18.setBounds(600,400,250,30);
		cb18.setBounds(860,400,50,20);
		c19.setBounds(600,450,250,30);
		cb19.setBounds(860,450,50,20);
		c20.setBounds(600,500,250,30);
		cb20.setBounds(860,500,50,20);
		c21.setBounds(600,550,250,30);
		cb21.setBounds(860,550,50,20);
		c22.setBounds(600,600,250,30);
		cb22.setBounds(860,600,50,20);
		c23.setBounds(600,650,250,30);
		cb23.setBounds(860,650,50,20);
		c24.setBounds(600,700,250,30);
		cb24.setBounds(860,700,50,20);
		l1.setBounds(250,100,310,30);
		l2.setBounds(600,100,310,30);
		b1.setBounds(500,750,100,30);
		b1.addActionListener(this);
		add(c);
		c.add(l1);
		c.add(l2);
		c.add(b1);
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		c.add(c6);
		c.add(c7);
		c.add(c8);
		c.add(c9);
		c.add(c10);
		c.add(c11);
		c.add(c12); 
		c.add(c13);
		c.add(c14);
		c.add(c15);
		c.add(c16);
		c.add(c17);
		c.add(c18);
		c.add(c19);
		c.add(c20);
		c.add(c21);
		c.add(c22);
		c.add(c23);
		c.add(c24); 
		c.add(cb1);
		c.add(cb2);
		c.add(cb3);
		c.add(cb4);
		c.add(cb5);
		c.add(cb6);
		c.add(cb7);
		c.add(cb8);
		c.add(cb9);
		c.add(cb10);
		c.add(cb11);
		c.add(cb12);
		c.add(cb13);
		c.add(cb14);
		c.add(cb15);
		c.add(cb16);
		c.add(cb17);
		c.add(cb18);
		c.add(cb19);
		c.add(cb20);
		c.add(cb21);
		c.add(cb22);
		c.add(cb23);
		c.add(cb24);
		this.setSize(1000,960);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		total=0;
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Lemon Chicken                  Rs300      ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+330*x;
			bill.orders1+=s;
			bill.orders1+=" Spaghetti with Chicken     Rs330     ";
			bill.orders1+="\n";
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Overload Pizza     Rs350     ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+370*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Osso Buco            Rs370      ";
			bill.orders1+="\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Parmesan Chicken Skillet   Rs400     ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+450*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Fettuccine             Rs450     ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+430*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Florentine Pasta    Rs430     ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Caprese Chicken                 Rs360     ";
			bill.orders1+="\n";
		}//
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Piccata Pasta        Rs350    ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Stuffed Shells      Rs390  ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+410*x;
			bill.orders1+=s;
			bill.orders1+=" Grilled Chicken Risotto      Rs410     ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+420*x;
			bill.orders1+=s;
			bill.orders1+=" Pasta and Grilled Chicken Rs420     ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Mozzarella Chicken            Rs360      ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+430*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Marsala                 Rs430     ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+380*x;
			bill.orders1+=s;
			bill.orders1+=" Tuscan Chicken Skillet       Rs380      ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Lemon Chicken Piccata      Rs400     ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Tuscan Garlic Chicken        Rs390     ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+385*x;
			bill.orders1+=s;
			bill.orders1+=" Balsamic Chicken                Rs385     ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Asiago Chicken Pasta          Rs300     ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+420*x;
			bill.orders1+=s;
			bill.orders1+=" White Pasta Chicken          Rs420     ";
			bill.orders1+="\n";
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+430*x;
			bill.orders1+=s;
			bill.orders1+=" Spaghetti Bolognese            Rs430     ";
			bill.orders1+="\n";
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+420*x;
			bill.orders1+=s;
			bill.orders1+=" Panzenella                           Rs420        ";
			bill.orders1+="\n";
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Bruschetta                           Rs400       ";
			bill.orders1+="\n";
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Pasta Carbonara                  Rs360      ";
			bill.orders1+="\n";
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery1 d=new delivery1();
		}
	}
}

class Indianveg extends JFrame implements ActionListener
{
	JLabel l1,c,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	int total;
	delivery v;
	Indianveg()
	{
		l1=new JLabel("      Menu                                                                  QTY");
		l2=new JLabel("      Menu                                                                  QTY");
		ImageIcon i=new ImageIcon("indian.jpg");
		b1=new JButton("PREVIOUS");
		c=new JLabel(i);
		c1=new JCheckBox("Garlic Mushroom              Rs190");
		c2=new JCheckBox("Malai Kofta                       Rs170");
		c3=new JCheckBox("Kathi Rolls                        Rs230");
		c4=new JCheckBox("Litti Choka                       Rs220");
		c5=new JCheckBox("Paneer Sathe                    Rs130");
		c6=new JCheckBox("Paneer Chilli                    Rs150");
		c7=new JCheckBox("Paneer Tikka                    Rs150");
		c8=new JCheckBox("Paneer Roll                       Rs110");
		c9=new JCheckBox("Spring Roll                       Rs130");
	   	c10=new JCheckBox("Gobi Manchurian           Rs175");
	   	c11=new JCheckBox("Veg Crispy                       Rs160");
	   	c12=new JCheckBox("Manchow Soup               Rs130");
	   	c13=new JCheckBox("Dal Fry                            Rs180");
	   	c14=new JCheckBox("Stuffed Mushrooms        Rs170");
	   	c15=new JCheckBox("Paneer Butter Masala      Rs210");
	   	c16=new JCheckBox("Rajma Masala                  Rs200");
	   	c17=new JCheckBox("Kadai Paneer                   Rs220");
	   	c18=new JCheckBox("Dal Khichdi                     Rs200");
	   	c19=new JCheckBox("Dal Makhani                   Rs190");
	   	c20=new JCheckBox("Veg Kurma                     Rs250");
	   	c21=new JCheckBox("Aloo Gobi                        Rs230");
	   	c22=new JCheckBox("Roti                                 Rs70");
	   	c23=new JCheckBox("Naan                               Rs90");
	   	c24=new JCheckBox("Jeera Rice                        Rs80");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		cb21=new JComboBox(qty);
		cb22=new JComboBox(qty);
		cb23=new JComboBox(qty);
		cb24=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c21.setContentAreaFilled(false);
		c22.setContentAreaFilled(false);
		c23.setContentAreaFilled(false);
		c24.setContentAreaFilled(false);
		c.setBounds(0,0,1000,1000);
		c1.setBounds(250,150,250,30);
		cb1.setBounds(510,150,50,20);
		c2.setBounds(250,200,250,30);
		cb2.setBounds(510,200,50,20);
		c3.setBounds(250,250,250,30);
		cb3.setBounds(510,250,50,20);
		c4.setBounds(250,300,250,30);
		cb4.setBounds(510,300,50,20);
		c5.setBounds(250,350,250,30);
		cb5.setBounds(510,350,50,20);
		c6.setBounds(250,400,250,30);
		cb6.setBounds(510,400,50,20);
		c7.setBounds(250,450,250,30);
		cb7.setBounds(510,450,50,20);
		c8.setBounds(250,500,250,30);
		cb8.setBounds(510,500,50,20);
		c9.setBounds(250,550,250,30);
		cb9.setBounds(510,550,50,20);
		c10.setBounds(250,600,250,30);
		cb10.setBounds(510,600,50,20);
		c11.setBounds(250,650,250,30);
		cb11.setBounds(510,650,50,20);
		c12.setBounds(250,700,250,30);
		cb12.setBounds(510,700,50,20);
		c13.setBounds(600,150,250,30);
		cb13.setBounds(860,150,50,20);
		c14.setBounds(600,200,250,30);
		cb14.setBounds(860,200,50,20);
		c15.setBounds(600,250,250,30);
		cb15.setBounds(860,250,50,20);
		c16.setBounds(600,300,250,30);
		cb16.setBounds(860,300,50,20);
		c17.setBounds(600,350,250,30);
		cb17.setBounds(860,350,50,20);
		c18.setBounds(600,400,250,30);
		cb18.setBounds(860,400,50,20);
		c19.setBounds(600,450,250,30);
		cb19.setBounds(860,450,50,20);
		c20.setBounds(600,500,250,30);
		cb20.setBounds(860,500,50,20);
		c21.setBounds(600,550,250,30);
		cb21.setBounds(860,550,50,20);
		c22.setBounds(600,600,250,30);
		cb22.setBounds(860,600,50,20);
		c23.setBounds(600,650,250,30);
		cb23.setBounds(860,650,50,20);
		c24.setBounds(600,700,250,30);
		cb24.setBounds(860,700,50,20);
		l1.setBounds(250,100,310,30);
		l2.setBounds(600,100,310,30);
		b1.setBounds(500,750,100,30);
		b1.addActionListener(this);
		add(c);
		c.add(l1);
		c.add(l2);
		c.add(b1);
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		c.add(c6);
		c.add(c7);
		c.add(c8);
		c.add(c9);
		c.add(c10);
		c.add(c11);
		c.add(c12); 
		c.add(c13);
		c.add(c14);
		c.add(c15);
		c.add(c16);
		c.add(c17);
		c.add(c18);
		c.add(c19);
		c.add(c20);
		c.add(c21);
		c.add(c22);
		c.add(c23);
		c.add(c24); 
		c.add(cb1);
		c.add(cb2);
		c.add(cb3);
		c.add(cb4);
		c.add(cb5);
		c.add(cb6);
		c.add(cb7);
		c.add(cb8);
		c.add(cb9);
		c.add(cb10);
		c.add(cb11);
		c.add(cb12);
		c.add(cb13);
		c.add(cb14);
		c.add(cb15);
		c.add(cb16);
		c.add(cb17);
		c.add(cb18);
		c.add(cb19);
		c.add(cb20);
		c.add(cb21);
		c.add(cb22);
		c.add(cb23);
		c.add(cb24);
		this.setSize(1000,960);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		total=0;
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+190*x;
			bill.orders1+=s;
			bill.orders1+=" Garlic Mushroom              Rs190  ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+170*x;
			bill.orders1+=s;
			bill.orders1+=" Malai Kofta                       Rs170  ";
			bill.orders1+="\n";
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+230*x;
			bill.orders1+=s;
			bill.orders1+=" Kathi Rolls                        Rs230  ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+220*x;
			bill.orders1+=s;
			bill.orders1+=" Litti Choka                       Rs220  ";
			bill.orders1+="\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+130*x;
			bill.orders1+=s;
			bill.orders1+=" Paneer Sathe                    Rs130  ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+150*x;
			bill.orders1+=s;
			bill.orders1+=" Paneer Chilli                    Rs150  ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+150*x;
			bill.orders1+=s;
			bill.orders1+=" Paneer Tikka                    Rs150  ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+110*x;
			bill.orders1+=s;
			bill.orders1+=" Paneer Roll                       Rs110  ";
			bill.orders1+="\n";
		}
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+130*x;
			bill.orders1+=s;
			bill.orders1+=" Spring Roll                       Rs130  ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+175*x;
			bill.orders1+=s;
			bill.orders1+=" Gobi Manchurian           Rs175  ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+160*x;
			bill.orders1+=s;
			bill.orders1+=" Veg Crispy                       Rs160  ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+130*x;
			bill.orders1+=s;
			bill.orders1+=" Manchow Soup               Rs130  ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+180*x;
			bill.orders1+=s;
			bill.orders1+=" Dal Fry                            Rs180  ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+170*x;
			bill.orders1+=s;
			bill.orders1+=" Stuffed Mushrooms        Rs170  ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+210*x;
			bill.orders1+=s;
			bill.orders1+=" Paneer Butter Masala      Rs210  ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+200*x;
			bill.orders1+=s;
			bill.orders1+=" Rajma Masala                  Rs200  ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+220*x;
			bill.orders1+=s;
			bill.orders1+=" Kadai Paneer                   Rs220  ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+200*x;
			bill.orders1+=s;
			bill.orders1+=" Dal Khichdi                     Rs200  ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+190*x;
			bill.orders1+=s;
			bill.orders1+=" Dal Makhani                   Rs190  ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+250*x;
			bill.orders1+=s;
			bill.orders1+=" Veg Kurma                     Rs250  ";
			bill.orders1+="\n";
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+230*x;
			bill.orders1+=s;
			bill.orders1+=" Aloo Gobi                        Rs230  ";
			bill.orders1+="\n";
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+70*x;
			bill.orders1+=s;
			bill.orders1+=" Roti                                 Rs70  ";
			bill.orders1+="\n";
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+90*x;
			bill.orders1+=s;
			bill.orders1+=" Naan                               Rs90  ";
			bill.orders1+="\n";
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+80*x;
			bill.orders1+=s;
			bill.orders1+=" Jeera Rice                        Rs80  ";
			bill.orders1+="\n";
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery d=new delivery();
		}
	}
}
class Indiannonveg extends JFrame implements ActionListener
{
	JLabel l1,c,s,lamount,l2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;
	JButton b1;
	delivery1 r;
	Indiannonveg()
	{
		this.setSize(1000,960);
		this.setLayout(null);
		l1=new JLabel("      Menu                                                                  QTY");
		l2=new JLabel("      Menu                                                                  QTY");
		ImageIcon i=new ImageIcon("indian.jpg");
		b1=new JButton("PREVIOUS");
		c=new JLabel(i); 
		c1=new JCheckBox("Macher Jhol                        Rs300");
		c2=new JCheckBox("Machcha Besarou              Rs310");
		c3=new JCheckBox("Parsi Fish Curry                 Rs320");
		c4=new JCheckBox("Hilsa Fish Curry                 Rs330");
		c5=new JCheckBox("Assamese Fish Curry         Rs340");
		c6=new JCheckBox("Chicken Angara                 Rs350");
		c7=new JCheckBox("Meen Curry                        Rs360");
		c8=new JCheckBox("Goan Fish Head Curry       Rs370");
		c9=new JCheckBox("Bihari Fish Curry                Rs380");
	   	c10=new JCheckBox("Malabari Prawn Curry      Rs390");
	   	c11=new JCheckBox("Andhra Crab Masala         Rs400");
	   	c12=new JCheckBox("Rogan Josh                        Rs370");
	   	c13=new JCheckBox("Gongura Mamsam            Rs400");
	   	c14=new JCheckBox("Nihari Mutton                  Rs360");
	   	c15=new JCheckBox("Mutton Curry                   Rs270");
	   	c16=new JCheckBox("Mutton Kofte                   Rs280");
	   	c17=new JCheckBox("Laal Maas                         Rs290");
	   	c18=new JCheckBox("Chicken Vindaloo            Rs350");
	   	c19=new JCheckBox("Chicken Kolhapuri           Rs290");
	   	c20=new JCheckBox("Chicken Korma                Rs310");
	   	c21=new JCheckBox("Chicken Tikka                  Rs350");
	   	c22=new JCheckBox("Chicken Handi                 Rs360");
	   	c23=new JCheckBox("Chicken Platter                Rs390");
	   	c24=new JCheckBox("Butter Chicken                 Rs280");
		String qty[]={" ","1","2","3","4","5"};
		cb1=new JComboBox(qty);
		cb2=new JComboBox(qty);
		cb3=new JComboBox(qty);
		cb4=new JComboBox(qty);
		cb5=new JComboBox(qty);
		cb6=new JComboBox(qty);
		cb7=new JComboBox(qty);
		cb8=new JComboBox(qty);
		cb9=new JComboBox(qty);
		cb10=new JComboBox(qty);
		cb11=new JComboBox(qty);
		cb12=new JComboBox(qty);
		cb13=new JComboBox(qty);
		cb14=new JComboBox(qty);
		cb15=new JComboBox(qty);
		cb16=new JComboBox(qty);
		cb17=new JComboBox(qty);
		cb18=new JComboBox(qty);
		cb19=new JComboBox(qty);
		cb20=new JComboBox(qty);
		cb21=new JComboBox(qty);
		cb22=new JComboBox(qty);
		cb23=new JComboBox(qty);
		cb24=new JComboBox(qty);
		c1.setContentAreaFilled(false);
		c2.setContentAreaFilled(false);
		c3.setContentAreaFilled(false);
		c4.setContentAreaFilled(false);
		c5.setContentAreaFilled(false);
		c6.setContentAreaFilled(false);
		c7.setContentAreaFilled(false);
		c8.setContentAreaFilled(false);
		c9.setContentAreaFilled(false);
		c10.setContentAreaFilled(false);
		c11.setContentAreaFilled(false);
		c12.setContentAreaFilled(false);
		c13.setContentAreaFilled(false);
		c14.setContentAreaFilled(false);
		c15.setContentAreaFilled(false);
		c16.setContentAreaFilled(false);
		c17.setContentAreaFilled(false);
		c18.setContentAreaFilled(false);
		c19.setContentAreaFilled(false);
		c20.setContentAreaFilled(false);
		c21.setContentAreaFilled(false);
		c22.setContentAreaFilled(false);
		c23.setContentAreaFilled(false);
		c24.setContentAreaFilled(false);
		c.setBounds(0,0,1000,1000);
		c1.setBounds(250,150,250,30);
		cb1.setBounds(510,150,50,20);
		c2.setBounds(250,200,250,30);
		cb2.setBounds(510,200,50,20);
		c3.setBounds(250,250,250,30);
		cb3.setBounds(510,250,50,20);
		c4.setBounds(250,300,250,30);
		cb4.setBounds(510,300,50,20);
		c5.setBounds(250,350,250,30);
		cb5.setBounds(510,350,50,20);
		c6.setBounds(250,400,250,30);
		cb6.setBounds(510,400,50,20);
		c7.setBounds(250,450,250,30);
		cb7.setBounds(510,450,50,20);
		c8.setBounds(250,500,250,30);
		cb8.setBounds(510,500,50,20);
		c9.setBounds(250,550,250,30);
		cb9.setBounds(510,550,50,20);
		c10.setBounds(250,600,250,30);
		cb10.setBounds(510,600,50,20);
		c11.setBounds(250,650,250,30);
		cb11.setBounds(510,650,50,20);
		c12.setBounds(250,700,250,30);
		cb12.setBounds(510,700,50,20);
		c13.setBounds(600,150,250,30);
		cb13.setBounds(860,150,50,20);
		c14.setBounds(600,200,250,30);
		cb14.setBounds(860,200,50,20);
		c15.setBounds(600,250,250,30);
		cb15.setBounds(860,250,50,20);
		c16.setBounds(600,300,250,30);
		cb16.setBounds(860,300,50,20);
		c17.setBounds(600,350,250,30);
		cb17.setBounds(860,350,50,20);
		c18.setBounds(600,400,250,30);
		cb18.setBounds(860,400,50,20);
		c19.setBounds(600,450,250,30);
		cb19.setBounds(860,450,50,20);
		c20.setBounds(600,500,250,30);
		cb20.setBounds(860,500,50,20);
		c21.setBounds(600,550,250,30);
		cb21.setBounds(860,550,50,20);
		c22.setBounds(600,600,250,30);
		cb22.setBounds(860,600,50,20);
		c23.setBounds(600,650,250,30);
		cb23.setBounds(860,650,50,20);
		c24.setBounds(600,700,250,30);
		cb24.setBounds(860,700,50,20);
		l1.setBounds(250,100,310,30);
		l2.setBounds(600,100,310,30);
		b1.setBounds(500,750,100,30);
		b1.addActionListener(this);
		add(c);
		c.add(l1);
		c.add(l2);
		c.add(b1);
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		c.add(c6);
		c.add(c7);
		c.add(c8);
		c.add(c9);
		c.add(c10);
		c.add(c11);
		c.add(c12); 
		c.add(c13);
		c.add(c14);
		c.add(c15);
		c.add(c16);
		c.add(c17);
		c.add(c18);
		c.add(c19);
		c.add(c20);
		c.add(c21);
		c.add(c22);
		c.add(c23);
		c.add(c24); 
		c.add(cb1);
		c.add(cb2);
		c.add(cb3);
		c.add(cb4);
		c.add(cb5);
		c.add(cb6);
		c.add(cb7);
		c.add(cb8);
		c.add(cb9);
		c.add(cb10);
		c.add(cb11);
		c.add(cb12);
		c.add(cb13);
		c.add(cb14);
		c.add(cb15);
		c.add(cb16);
		c.add(cb17);
		c.add(cb18);
		c.add(cb19);
		c.add(cb20);
		c.add(cb21);
		c.add(cb22);
		c.add(cb23);
		c.add(cb24);
		this.setSize(1000,960);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s;
		int x;
		if(c1.isSelected())
		{
			s=cb1.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+300*x;
			bill.orders1+=s;
			bill.orders1+=" Macher Jhol                        Rs300  ";
			bill.orders1+="\n";
		}
		if(c2.isSelected())
		{
			s=cb2.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Machcha Besarou              Rs310  ";
			bill.orders1+="\n";
		}
		if(c3.isSelected())
		{
			s=cb3.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+320*x;
			bill.orders1+=s;
			bill.orders1+=" Parsi Fish Curry                 Rs320  ";
			bill.orders1+="\n";
		}
		if(c4.isSelected())
		{
			s=cb4.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+330*x;
			bill.orders1+=s;
			bill.orders1+=" Hilsa Fish Curry                 Rs330  ";
			bill.orders1+="\n";
		}
		if(c5.isSelected())
		{
			s=cb5.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+340*x;
			bill.orders1+=s;
			bill.orders1+=" Assamese Fish Curry         Rs340  ";
			bill.orders1+="\n";
		}
		if(c6.isSelected())
		{
			s=cb6.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Angara                 Rs350  ";
			bill.orders1+="\n";
		}
		if(c7.isSelected())
		{
			s=cb7.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Meen Curry                        Rs360  ";
			bill.orders1+="\n";
		}
		if(c8.isSelected())
		{
			s=cb8.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+370*x;
			bill.orders1+=s;
			bill.orders1+=" Goan Fish Head Curry       Rs370  ";
			bill.orders1+="\n";
		}
		if(c9.isSelected())
		{
			s=cb9.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+380*x;
			bill.orders1+=s;
			bill.orders1+=" Bihari Fish Curry                Rs380  ";
			bill.orders1+="\n";
		}
		if(c10.isSelected())
		{
			s=cb10.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Malabari Prawn Curry      Rs390  ";
			bill.orders1+="\n";
		}
		if(c11.isSelected())
		{
			s=cb11.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Andhra Crab Masala         Rs400  ";
			bill.orders1+="\n";
		}
		if(c12.isSelected())
		{
			s=cb12.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+370*x;
			bill.orders1+=s;
			bill.orders1+=" Rogan Josh                        Rs370  ";
			bill.orders1+="\n";
		}
		if(c13.isSelected())
		{
			s=cb13.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+400*x;
			bill.orders1+=s;
			bill.orders1+=" Gongura Mamsam            Rs400  ";
			bill.orders1+="\n";
		}
		if(c14.isSelected())
		{
			s=cb14.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Nihari Mutton                  Rs360  ";
			bill.orders1+="\n";
		}
		if(c15.isSelected())
		{
			s=cb15.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+270*x;
			bill.orders1+=s;
			bill.orders1+=" Mutton Curry                   Rs270  ";
			bill.orders1+="\n";
		}
		if(c16.isSelected())
		{
			s=cb16.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Mutton Kofte                   Rs280  ";
			bill.orders1+="\n";
		}
		if(c17.isSelected())
		{
			s=cb17.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Laal Maas                         Rs290  ";
			bill.orders1+="\n";
		}
		if(c18.isSelected())
		{
			s=cb18.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Vindaloo            Rs350  ";
			bill.orders1+="\n";
		}
		if(c19.isSelected())
		{
			s=cb19.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+290*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Kolhapuri           Rs290  ";
			bill.orders1+="\n";
		}
		if(c20.isSelected())
		{
			s=cb20.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+310*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Korma                Rs310  ";
			bill.orders1+="\n";
		}
		if(c21.isSelected())
		{
			s=cb21.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+350*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Tikka                  Rs350  ";
			bill.orders1+="\n";
		}
		if(c22.isSelected())
		{
			s=cb22.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+360*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Handi                 Rs360  ";
			bill.orders1+="\n";
		}
		if(c23.isSelected())
		{
			s=cb23.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+390*x;
			bill.orders1+=s;
			bill.orders1+=" Chicken Platter                Rs390  ";
			bill.orders1+="\n";
		}
		if(c24.isSelected())
		{
			s=cb24.getSelectedItem().toString();
			if(s.equals(" "))
				x=0;
			else
			x=Integer.parseInt(s);
			bill.total=bill.total+280*x;
			bill.orders1+=s;
			bill.orders1+=" Butter Chicken                 Rs280  ";
			bill.orders1+="\n";
		}
		if(e.getActionCommand().equals("PREVIOUS"))
		{
			this.setVisible(false);
			delivery d=new delivery();
		}
	}
}
class delivery1 extends JFrame implements ActionListener
{
	JButton t1,t2,t3;
	JLabel c;
	order previous;
	delivery1()
	{
		ImageIcon i=new ImageIcon("cuisine.jpg");
		c=new JLabel(i); 
		t1=new JButton("Indian");
		t2=new JButton("Italian");
		t3=new JButton("PREVIOUS");
		t1.setBounds(400,200,200,50);
		t2.setBounds(400,300,200,50);
		t3.setBounds(450,480,100,30);
		c.setBounds(0,0,1000,1000);
		add(c);
		c.add(t1);
		c.add(t2);
		c.add(t3);
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		this.setSize(1000,960);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("PREVIOUS"))
				{
					this.setVisible(false);
					order o =new order();
				}
		if(e.getActionCommand().equals("Indian"))
		{
			this.setVisible(false);
			Indiannonveg s=new Indiannonveg();
		}
		if(e.getActionCommand().equals("Italian"))
		{
			this.setVisible(false);
			italy_nonveg in=new italy_nonveg();
		}
	}
}
class delivery extends JFrame implements ActionListener
{
	JButton t1,t2,t3;
	JLabel c;
	order previous;
	delivery()
	{
		ImageIcon i=new ImageIcon("cuisine.jpg");
		c=new JLabel(i); 
		t1=new JButton("Indian");
		t2=new JButton("Italian");
		t3=new JButton("PREVIOUS");
		t1.setBounds(400,200,200,50);
		t2.setBounds(400,300,200,50);
		t3.setBounds(450,480,100,30);
		c.setBounds(0,0,1000,960);
		add(c);
		c.add(t1);
		c.add(t2);
		c.add(t3);
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		this.setLayout(null);
        this.setSize(1000,1000);   
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("PREVIOUS"))
				{
					this.setVisible(false);
					order o=new order();	
				}
		if(e.getActionCommand().equals("Indian"))
		{
			this.setVisible(false);
			Indianveg z=new Indianveg();
		}
		if(e.getActionCommand().equals("Italian"))
		{
			this.setVisible(false);
		    italy_veg iv=new italy_veg();
		}
	}
}
class order extends JFrame implements ActionListener
{
	JButton d1,d2,d3,d4,d5,d6;
	JLabel c;
	order()
	{
		ImageIcon i=new ImageIcon("menu.jpg");
		c=new JLabel(i); 
		d1=new JButton("VEG");
		d2=new JButton("NON-VEG");
		d3=new JButton("DESSERTS");
		d4=new JButton("DRINKS");
		d5=new JButton("PREVIOUS");
		d6=new JButton("Generate Bill");
		d1.setBounds(400,200,200,50);
		d2.setBounds(400,300,200,50);
		d3.setBounds(400,400,200,50);
		d4.setBounds(400,500,200,50);
		d5.setBounds(200,600,100,30);
		d6.setBounds(720,600,150,30);
		c.setBounds(0,0,1000,1000);
		add(c);
		c.add(d1);
		c.add(d2);
		c.add(d3);
		c.add(d4);
		c.add(d5);
		c.add(d6);
	    d1.addActionListener(this);
		d5.addActionListener(this);
		d2.addActionListener(this);
		d3.addActionListener(this);
		d4.addActionListener(this);
		d6.addActionListener(this);
		this.setLayout(null);
        this.setSize(1000,1000);   
		 this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("VEG"))
		{
			this.setVisible(false);
		   delivery d=new delivery();
		}
		if(e.getActionCommand().equals("NON-VEG"))
		{
			this.setVisible(false);
		    delivery1 d=new delivery1();
		}
		
		if(e.getActionCommand().equals("DESSERTS"))
		{
			this.setVisible(false);
			Desserts d=new Desserts();
		}
		if(e.getActionCommand().equals("DRINKS"))
		{
			 this.setVisible(false);
			 Drinks dr=new Drinks();
		}
		if(e.getActionCommand().equals("Generate Bill"))
		{
			 this.setVisible(false);
			 bill b=new bill();
		}		
	}
}

class javampr2 extends JFrame implements ActionListener
{
	JLabel u1,p1,c;
	JTextField f1;
	JButton b1;
	JPasswordField pass;
	javampr2()
	{
		ImageIcon i=new ImageIcon("login.jpg");
		c=new JLabel(i); 
		u1=new JLabel("USERNAME");
		p1=new JLabel("PASSWORD");
		f1=new JTextField();
		b1=new JButton("Login");
		pass=new JPasswordField();
		u1.setForeground(Color.white);
		p1.setForeground(Color.white);
		c.setBounds(0,0,1000,1000);
		f1.setBounds(450,300,200,30);
		u1.setBounds(300,300,150,30);
		p1.setBounds(300,350,150,30);
		pass.setBounds(450,350,200,30);
		b1.setBounds(400,450,100,30);
		c.add(pass);
		c.add(p1);
		c.add(u1);
		c.add(f1);
		c.add(b1);
        b1.addActionListener(this);
		add(c);
		this.setLayout(null);
        this.setSize(1000,1000);   
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			String username=f1.getText();
			String passw=pass.getText();
			if(username.equals("yash")&&passw.equals("javampr"))
			{
				if(e.getActionCommand().equals("Login"))
					{
						this.setVisible(false);
						order o=new order();
					}
			}
			else if(username.equals("rittika")&&passw.equals("javampr"))
			{
				if(e.getActionCommand().equals("Login"))
					{
						this.setVisible(false);
						order o=new order();          
					}
			}
			else
			{
				if(e.getActionCommand().equals("Login"))
				{
					throw new wrongpass();          
				}
			}			
		}
		catch(wrongpass wp)
		{
			JOptionPane.showMessageDialog(this,"Incorrect Username or Password");
		}
	}
	public static void main(String args[])
	{
		javampr2 obj = new javampr2();
	}
}
class wrongpass extends Exception
{

}
