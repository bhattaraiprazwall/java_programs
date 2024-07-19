import javax.swing.*;
import java.awt.*;
public class SimpleFrame
{
    public static void main(String[] args) 
    {
        EventQueue.invokeLater(()->
        {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(700,200);
            f.setVisible(true);
	    
        });
    }    
}