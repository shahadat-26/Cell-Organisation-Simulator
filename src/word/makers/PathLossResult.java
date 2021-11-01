package word.makers;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PathLossResult{
	
	PathLossResult(double result, JFrame frm)
	{
		JPanel pn = new JPanel();
        pn.setBackground(new Color(0, 0, 51));
        pn.setLayout(null);
        
        JLabel lb1= new JLabel();
        JLabel lb2= new JLabel();
        
        lb1.setText("  Predicted Path Loss is       ");
        lb2.setText(""+String.format("%.2f", result)+"dB");
		
        lb1.setFont(new Font(Font.SERIF, Font.PLAIN, 80)); 
        lb2.setFont(new Font(Font.SERIF, Font.PLAIN, 200)); 
        
        lb1.setForeground(Color.WHITE);
        lb2.setForeground(Color.WHITE);
        
        lb1.setBounds(350,100,1500,150);
        lb2.setBounds(380,300,1500,200);
        
        JButton btn1 = new JButton("Back");
        
        btn1.setFont(new Font("Courier New Bold", Font.ITALIC, 50));
       
        btn1.setBounds(620, 600, 300, 80);
    
        btn1.setBorder(new LineBorder(Color.black, 8, true));
        
        
        pn.add(lb1);
        pn.add(lb2);
        pn.add(btn1);
        frm.add(pn);
        frm.setVisible(true);
        
        btn1.addActionListener((e) -> {
             frm.remove(pn);
             new Options(frm);

        });
        
        
       
       
		
	}

}

