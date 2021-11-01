package word.makers;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ValueMeanings {

	 public ValueMeanings(JFrame frm)
	    {
	        JPanel pn = new JPanel();
	        pn.setBackground(new Color(0, 0, 51));
	        pn.setLayout(null);
	        
	        JLabel lb4= new JLabel();
	        JLabel lb= new JLabel();
	        JLabel lb1= new JLabel();
	        JLabel lb2= new JLabel();
	        JLabel lb3= new JLabel();
	        		
	        lb.setText("<html>f<sub>c</sub> :    Carrier frequency in MHz from 150 to 1500 MHz </html ");
	        lb1.setText("<html>h<sub>t</sub> :    Height of transmitting antenna (base station) in m, from 30 to 300 m</html>");
	        lb2.setText("<html>h<sub>r</sub> :    Height of receiving antenna (mobile unit) in m, from 1 to 10 m </html>");
	        lb3.setText("d :  Propagation distance between antennas in km, from 1 to 20 km");
	        lb4.setText("Input Symbols Introduction goes -");
	        
	        lb.setFont(new Font(Font.SERIF, Font.PLAIN, 30)); 
	        lb1.setFont(new Font(Font.SERIF, Font.PLAIN, 30)); 
	        lb2.setFont(new Font(Font.SERIF, Font.PLAIN, 30)); 
	        lb3.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
	        lb4.setFont(new Font(Font.SERIF, Font.PLAIN, 80));
	        
	         
	         lb.setForeground(new Color(255, 255, 204));
	         lb1.setForeground(new Color(255, 255, 204));
	         lb2.setForeground(new Color(255, 255, 204));
	         lb3.setForeground(new Color(255, 255, 204));
	         lb4.setForeground(new Color(255, 255, 204));
	        
	        lb4.setBounds(100,20,1500,200);
	        lb.setBounds(200,150,1500,200);
	        lb1.setBounds(200,250,1500,200);
	        lb2.setBounds(200,350,1500,200);
	        lb3.setBounds(200,450,1500,200);
	        
	        JButton btn1 = new JButton("Back");
	      
	        btn1.setFont(new Font("Courier New Bold", Font.ITALIC, 50));
	       
	        btn1.setBounds(500, 650, 400, 80);
	    
	        btn1.setBorder(new LineBorder(Color.black, 8, true));
	        
	        btn1.addActionListener((e) -> {
	             frm.remove(pn);
	             new PathLossInput(frm);

	        });
	        
	        
	        pn.add(lb);
	        pn.add(lb1);
	        pn.add(lb2);
	        pn.add(lb3);
	        pn.add(lb4);
	        pn.add(btn1);
	        frm.add(pn);
	        frm.setVisible(true);
	        
	    }
}
