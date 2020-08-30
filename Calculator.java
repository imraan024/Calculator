import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener
{
	private JLabel display;
	private Color backColor;
	private JButton off,ac,mPos,mNeg;
	private JButton mC,mR,one,two,three,four;
	private JButton five,six,seven,eight,nine;
	private JButton zero,backSpace,div,mul,sub;
	private JButton add,point,equal;	
	private JPanel panel;
	
	double num,ans;
	int calculation;

	public Calculator()
	{
		super("Calculator");
		this.setSize(360,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
	
		
		display = new JLabel();
		display.setBounds(30,30,300,50);
		backColor = new Color(200,250,130);
		display.setBackground(backColor);
		display.setOpaque(true);
		panel.add(display);
		
		off = new JButton("OFF");
		off.setBounds(30,100,90,40);
		off.setBackground(Color.RED);
		off.setForeground(Color.WHITE);
		off.addActionListener(this);
		panel.add(off);
		
		ac = new JButton("AC");
		ac.setBounds(130,100,110,40);
		ac.setBackground(Color.CYAN);
		ac.addActionListener(this);
		panel.add(ac);
		
		backSpace = new JButton("<");
		backSpace.setBounds(250,100,80,40);
		backSpace.addActionListener(this); 
		panel.add(backSpace);
		
		mPos = new JButton("M+");
		mPos.setBounds(30,150,58,40);
		mPos.setBackground(Color.BLUE);
		mPos.setForeground(Color.WHITE);
		panel.add(mPos);

		seven = new JButton("7");
		seven.setBounds(100,150,50,40);
		seven.addActionListener(this);
		panel.add(seven);
		
		eight = new JButton("8");
		eight.setBounds(160,150,50,40);
		eight.addActionListener(this);
		panel.add(eight);
		
		nine = new JButton("9");
		nine.setBounds(220,150,50,40);
		nine.addActionListener(this);
		panel.add(nine);

		div = new JButton("/");
		div.setBounds(280,150,50,40);
		div.setBackground(Color.GREEN);
		div.addActionListener(this);
		panel.add(div);
		
		mNeg = new JButton("M-");
		mNeg.setBounds(30,200,58,40);
		mNeg.setBackground(Color.BLUE);
		mNeg.setForeground(Color.WHITE);
		panel.add(mNeg);

		four = new JButton("4");
		four.setBounds(100,200,50,40);
		four.addActionListener(this);
		panel.add(four);
		
		five = new JButton("5");
		five.setBounds(160,200,50,40);
		five.addActionListener(this);
		panel.add(five);
		
		six = new JButton("6");
		six.setBounds(220,200,50,40);
		six.addActionListener(this);
		panel.add(six);

		mul = new JButton("*");
		mul.setBounds(280,200,50,40);
		mul.setBackground(Color.GREEN);
		mul.addActionListener(this);
		panel.add(mul);
		
		mC = new JButton("MC");
		mC.setBounds(30,250,58,40);
		mC.setBackground(Color.BLUE);
		mC.setForeground(Color.WHITE);
		panel.add(mC);

		one = new JButton("1");
		one.setBounds(100,250,50,40);
		one.addActionListener(this);
		panel.add(one);
		
		two = new JButton("2");
		two.setBounds(160,250,50,40);
		two.addActionListener(this);
		panel.add(two);
		
		three = new JButton("3");
		three.setBounds(220,250,50,40);
		three.addActionListener(this);
		panel.add(three);

		sub = new JButton("-");
		sub.setBounds(280,250,50,40);
		sub.setBackground(Color.GREEN);
		sub.addActionListener(this);
		panel.add(sub);
			
		mR = new JButton("MR");
		mR.setBounds(30,300,58,40);
		mR.setBackground(Color.BLUE);
		mR.setForeground(Color.WHITE);
		panel.add(mR);
		
		zero = new JButton("0");
		zero.setBounds(100,300,50,40);
		zero.addActionListener(this);
		panel.add(zero);
		
		add = new JButton("+");
		add.setBounds(280,300,50,40);
		add.setBackground(Color.GREEN);
		add.addActionListener(this);
		panel.add(add);
		
		point = new JButton(".");
		point.setBounds(160,300,50,40);
		point.addActionListener(this);
		panel.add(point);
		
		equal = new JButton("=");
		equal.setBounds(220,300,50,40);
		equal.addActionListener(this);
		panel.add(equal);
		
		
		this.add(panel);
		
	}

	public void arrithmaticOperation()
	{
		switch(calculation)
		{
			case 1:
			ans = num + Double.parseDouble(display.getText());
			display.setText(Double.toString(ans));
			break;

			case 2:
			ans = num - Double.parseDouble(display.getText());
			display.setText(Double.toString(ans));
			break;

			case 3:
			ans = num * Double.parseDouble(display.getText());
			display.setText(Double.toString(ans));
			break;

			case 4:
			ans = num / Double.parseDouble(display.getText());
			display.setText(Double.toString(ans));
			break;
		}
	}

	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		if(command.equals(one.getText()))
		{
			display.setText(display.getText()+one.getText());
		}
		else if(command.equals(two.getText()))
		{
			display.setText(display.getText()+two.getText());
		}
		else if(command.equals(three.getText()))
		{
			display.setText(display.getText()+three.getText());
		}
		else if(command.equals(four.getText()))
		{
			display.setText(display.getText()+four.getText());
		}
		else if(command.equals(five.getText()))
		{
			display.setText(display.getText()+five.getText());
		}
		else if(command.equals(six.getText()))
		{
			display.setText(display.getText()+six.getText());
		}
		else if(command.equals(seven.getText()))
		{
			display.setText(display.getText()+seven.getText());
		}
		else if(command.equals(eight.getText()))
		{
			display.setText(display.getText()+eight.getText());
		}
		else if(command.equals(nine.getText()))
		{
			display.setText(display.getText()+nine.getText());
		}
		else if(command.equals(zero.getText()))
		{
			display.setText(display.getText()+zero.getText());
		}
		else if(command.equals(point.getText()))
		{
			display.setText(display.getText()+point.getText());
		}
		else if(command.equals(ac.getText()))
		{
			display.setText("");
		}
		else if(command.equals(add.getText()))
		{	
			num = Double.parseDouble(display.getText());
			calculation = 1;
			display.setText("");
			
	 	}
		else if(command.equals(sub.getText()))
		{	
			num = Double.parseDouble(display.getText());
			calculation = 2;
			display.setText("");
				
		}

		else if(command.equals(mul.getText()))
		{
			num = Double.parseDouble(display.getText());
			calculation = 3;
			display.setText("");
			
		}

		else if(command.equals(div.getText()))
		{
			num = Double.parseDouble(display.getText());
			calculation = 4;
			display.setText("");
		}
		else if(command.equals(equal.getText()))
		{
			arrithmaticOperation();
			
		}

		else if(command.equals(backSpace.getText()))
		{
			int length = display.getText().length();
			int number = display.getText().length()-1;
			String store;

			if(length > 0)
			{
				StringBuilder back = new StringBuilder(display.getText());
				
				back.deleteCharAt(number);
				store = back.toString();
				display.setText(store);
			}

		}

		else if(command.equals(off.getText()))
		{
			System.exit(0);
		}

		else 
		{

		}
	}
	
}