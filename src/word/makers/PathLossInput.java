package word.makers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PathLossInput {

	PathLossInput(JFrame frm){
		
	    
		
		
		JPanel pn=new JPanel();
        pn.setBackground(new Color(0, 0,51));
        pn.setLayout(null);
        
        JButton btn1 = new JButton("Show Now");
        btn1.setFont(new Font("Courier New Bold", Font.ITALIC, 40));
        btn1.setBorder(new LineBorder(Color.black, 8, true));
        
        JButton btn2 = new JButton("Value Meanings");
        btn2.setFont(new Font("Courier New Bold", Font.ITALIC, 40));
        btn2.setBorder(new LineBorder(Color.black, 8, true));
		
		
		JLabel lb1 = new JLabel();
        JLabel lb2 = new JLabel();
        JLabel lb3 = new JLabel();
        JLabel lb4 = new JLabel();
        JLabel lb5 = new JLabel();
        JLabel lb6 = new JLabel();
        JLabel lb7 = new JLabel();
        
        
        
        lb1.setText("<html>f<sub>c</sub></html>");
        lb2.setText("<html>h<sub>t</sub></html>");
        lb3.setText("<html>h<sub>r</sub></html>");
        lb4.setText("d");
        lb5.setText("City Size");
        lb6.setText("Area Type");
        lb7.setText("Enter the Values Below");
        
        lb7.setFont(new Font(Font.SERIF, Font.PLAIN, 50));
        lb5.setFont(new Font(Font.SERIF, Font.PLAIN, 50));
        lb6.setFont(new Font(Font.SERIF, Font.PLAIN, 50));
        
        lb1.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        lb2.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        lb3.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        lb4.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        
        
        lb1.setForeground(Color.WHITE);
        lb2.setForeground(Color.WHITE);
        lb3.setForeground(Color.WHITE);
        lb4.setForeground(Color.WHITE);
        lb5.setForeground(Color.WHITE);
        lb6.setForeground(Color.WHITE);
        lb7.setForeground(Color.WHITE);
        
        
        JTextField tf1 = new JTextField(15);
        JTextField tf2= new JTextField(15);
        JTextField tf3 = new JTextField(15);
        JTextField tf4 = new JTextField(15);
        
        
        
        tf1.setText(" ");
        tf2.setText("  ");
        tf3.setText(" ");
        tf4.setText(" ");
        
        tf1.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        tf2.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        tf3.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        tf4.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        
        
        
      
           
        JCheckBox sm = new JCheckBox("Small/Medium", false);
        JCheckBox lrg = new JCheckBox("Large", false);
		
        
        JCheckBox Ur = new JCheckBox("Urban", false);
        JCheckBox Sur = new JCheckBox("Sub-Urban", false);
        JCheckBox Open = new JCheckBox("Open", false);
        
        sm.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        lrg.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        Ur.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        Sur.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        Open.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        
        
        lb7.setBounds(200,0,700,100);
        lb1.setBounds(300,100,100,50); 
        tf1.setBounds(500, 100, 600,50 );
        lb2.setBounds(300,200,100,50);
        tf2.setBounds(500, 200, 600,50 );
        lb3.setBounds(300,300,100,50);
        tf3.setBounds(500, 300, 600,50 );
        lb4.setBounds(300,400,100,50);
        tf4.setBounds(500, 400, 600,50 );
        lb5.setBounds(200,470,300,100);
        sm.setBounds(500, 500, 300, 50);
        lrg.setBounds(800, 500, 300, 50);
        lb6.setBounds(200,550,400,100);
        Ur.setBounds(500, 580, 300, 50);
        Sur.setBounds(800, 580, 300, 50);
        Open.setBounds(1100, 580, 300, 50);
        btn2.setBounds(300, 680, 400, 80);
        btn1.setBounds(900, 680, 400, 80);
        
        
        
        
        
        
        
        pn.add(lb1);
        pn.add(lb2);
        pn.add(lb3);
        pn.add(lb4);
        pn.add(lb5);
        pn.add(lb6);
        pn.add(lb7);
        
        pn.add(tf1);
        pn.add(tf2);
        pn.add(tf3);
        pn.add(tf4);
        
        
        pn.add(sm);
        pn.add(lrg);
        pn.add(Ur);
        pn.add(Sur);
        pn.add(Open);
        
        pn.add(btn1);
        pn.add(btn2);
        
        frm.add(pn);
        frm.setVisible(true);
        
        btn1.addActionListener((e) -> {
        	
        double	fc = Double.parseDouble(tf1.getText());
        double	ht=	 Double.parseDouble(tf2.getText());
        double	hr=  Double.parseDouble(tf3.getText());
        double	d=   Double.parseDouble(tf4.getText());
        double ahr=0;
        
       
         if (lrg.isSelected())
        {
        	if(fc<=300)
        	{
        		ahr = 8.29 * Math.log10(1.54*hr)*Math.log10(1.54*hr)-1.1;
        	}
        	else
        	{
        		ahr= 3.2 * Math.log10(11.75*hr)*Math.log10(11.75*hr)-4.97;
        	}
        }
         
         else
         {
        	 ahr = (1.1*Math.log10(fc)-0.7)*hr-(1.56*Math.log10(fc)-0.8);
        	 
         }
        
        double Lur = 69.55 +26.16*Math.log10(fc)-13.82*Math.log10(ht)-ahr+(44.9-6.55*Math.log10(ht))*Math.log10(d);
        
        
        
        double result =0;
        result=Lur;
        
        
        if(Ur.isSelected())
        {
        	result=Lur;
        }
        else if(Sur.isSelected())
        {
        	double Lsur=Lur - 2* Math.log10(fc/28)* Math.log10(fc/28)-5.4;
        	result=Lsur;
        }
        else if(Open.isSelected())
        {
        	double Lopen= Lur - 4.78*Math.log10(fc)*Math.log10(fc)-18.733*Math.log10(fc)-40.98;
        	result=Lopen;
        }
        
        
        	
        	
        	
            frm.remove(pn);
            new PathLossResult(result,frm);
           
   });  
        
        
        btn2.addActionListener((e) -> {
            frm.remove(pn);
            new ValueMeanings(frm);
           
   });  
        
        
        
        
        
        
		
		
		
		
		
	}
	
	
}
