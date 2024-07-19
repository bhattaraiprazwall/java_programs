import javax.swing.*;
import java.awt.*;
public class calculator
{
    public static void main(String[]args)
    {
        JFrame frame=new JFrame("Square Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500, 500);
	SimplePanel panel=new SimplePanel();
	frame.add(panel);
	frame.setVisible(true);
    }
}
class SimplePanel extends JPanel
{
	private JLabel text,text2;
	private JButton b;
	private JTextField t,t1;
	public SimplePanel()
	{
		text=new JLabel("Enter any number:");
		t= new JTextField(8);
		b= new JButton("Calculate Square");
		add(text);
		add(t);
		add(b);
	b.setBounds(100,60,120,30);
	text2=new JLabel("Square of entered number:");
	t1= new JTextField(8);
	add(text2);
	add(t1);
	MyEventListener eventcall=new MyEventListener();
	b.addActionListener(eventcall);
	addMouseListener(eventcall);

	}
	private EventHandling extends mouseAdapter implements actionListener
	{
		public void actionPerformed(actionEvents hello)
			{
				
			}
		int a,c;
		a=Integer.ParseInt(t.getText())
		if(hello.getActionCommand()="Calculate Square")
			c=a*a;
		t1.setText(String.valueOf(c));
	}
	
}




