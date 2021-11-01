package word.makers;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class CellManagementResult {
	
	
	CellManagementResult(String cell_type ,int number_of_cells_required,int number_of_channels_per_cell,int total_channel_capacity,int total_number_of_possible_concurrent_calls, JFrame frm){
	

	JPanel pn=new JPanel();
    pn.setBackground(new Color(0, 0,51));
    pn.setLayout(null);
    
    JButton btn1 = new JButton("Back");
    btn1.setFont(new Font("Courier New Bold", Font.ITALIC, 40));
    btn1.setBorder(new LineBorder(Color.black, 8, true));
    
    
	
	
	JLabel lb1 = new JLabel();
    JLabel lb2 = new JLabel();
    JLabel lb3 = new JLabel();
    JLabel lb4 = new JLabel();
    JLabel lb5 = new JLabel();
   
    
    
    
    lb1.setText("Number of Cells Required                           :    "+number_of_cells_required);
    lb2.setText("Number of Channels Per Cell                      :    "+number_of_channels_per_cell);
    lb3.setText("Total Channel Capacity                               :    "+total_channel_capacity);
    lb4.setText("Total Number of Possible Concurrent Calls :    "+total_number_of_possible_concurrent_calls);
    lb5.setText("Cell Type                                                    :    "+cell_type);
  
    
    
   
    lb5.setFont(new Font(Font.SERIF, Font.PLAIN, 40));
    
    
    lb1.setFont(new Font(Font.SERIF, Font.PLAIN, 40));
    lb2.setFont(new Font(Font.SERIF, Font.PLAIN, 40));
    lb3.setFont(new Font(Font.SERIF, Font.PLAIN, 40));
    lb4.setFont(new Font(Font.SERIF, Font.PLAIN, 40));
    
    
    lb1.setForeground(Color.WHITE);
    lb2.setForeground(Color.WHITE);
    lb3.setForeground(Color.WHITE);
    lb4.setForeground(Color.WHITE);
    lb5.setForeground(Color.WHITE);
    
    
    
    
    
    
    
    
   
    
    
    
  
       
    
	
    
   
    
   
    
    
    
    lb1.setBounds(300,150,1500,50); 
    
    lb2.setBounds(300,250,1500,50);
  
    lb3.setBounds(300,350,1500,50);
    
    lb4.setBounds(300,550,1500,50);
    
    lb5.setBounds(300,450,1500,50);
    
    
    
    
    btn1.setBounds(600, 680, 400, 80);
    
    
    
    
    
    
    
    pn.add(lb1);
    pn.add(lb2);
    pn.add(lb3);
    pn.add(lb4);
    pn.add(lb5);
    
    
    
    
   
   
    
    pn.add(btn1);
    
    frm.add(pn);
    frm.setVisible(true);
	
    btn1.addActionListener((e) -> {
        frm.remove(pn);
        new Options(frm);
       
});  
	
	
}
}
