import javax.swing.*;
import java.awt.*;
public class SimpleFrameButton
{
    public static void main(String[] args) 
    {
        EventQueue.invokeLater(()->
        {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(300,200); 
            SimplePanel p = new SimplePanel();
            f.add(p);
            f.setVisible(true);
        }); 
    }    
}
class SimplePanel extends JPanel
{
    private JButton b;
    private JTextField t;
    public SimplePanel()
    {
        t = new JTextField("enter your name",8d); 
	b = new JButton("Ok");       
        add(b);
        add(t);        
    }      
}