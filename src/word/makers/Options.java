/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.makers;

// import com.sun.java.swing.plaf.windows.WindowsBorders;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.basic.BasicBorders;

/**
 *
 * @author Asus
 */
public class Options {
    Options(JFrame frm)
    {
        
        

      
        frm.setTitle("Network Engineer");
        JLabel lb1 = new JLabel();
        JLabel lb2 = new JLabel();
        
        lb1.setText("Hi !! I am a Network Engineer.");
        lb2.setText("How can I Help You ?");
        lb1.setForeground(Color.WHITE);
        lb2.setForeground(Color.WHITE);
        lb1.setFont(new Font(Font.SERIF, Font.PLAIN, 80));
        lb2.setFont(new Font(Font.SERIF, Font.PLAIN, 80));
        
       
  
        JPanel pn=new JPanel();
         pn.setBackground(new Color(0, 0,51));
                                                                                                                          
        JButton btn1 = new JButton("Cell Management");
        JButton btn2 = new JButton("Path loss Prediction");
      
        pn.setLayout(null);
        btn1.setFont(new Font("Courier New Bold", Font.ITALIC, 40));
        btn2.setFont(new Font("Courier New Bold", Font.ITALIC, 40));
        
        lb1.setBounds(300,100,1900,100);
        lb2.setBounds(400,250,1900,100);
        btn1.setBounds(100,600,600,80);
        btn2.setBounds(750, 600, 600, 80);
     
        btn1.setBorder(new LineBorder(Color.black, 8, true));
        btn2.setBorder(new LineBorder(Color.black, 8, true));
       
        pn.add(btn1);
        pn.add(btn2);
        pn.add(lb1);
        pn.add(lb2);
      
       
        frm.add(pn);
        frm.setVisible(true);
         btn1.addActionListener((e) -> {
       
                  
     
                   
                 
                
              frm.remove(pn);
            
              new CellManagement(frm);
            
               
       });      
          btn2.addActionListener((e) -> {
                frm.remove(pn);
                new PathLossInput(frm);
               
       });      
    
}
}