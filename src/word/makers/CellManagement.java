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

public class CellManagement {
	
	CellManagement(JFrame frm){
		
	    
		
		
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
        
        
        
        lb1.setText("Area Size To Cover            : ");
        lb2.setText("Radius of Each Cell           : ");
        lb3.setText("Total Traffic Channel         : ");
        lb4.setText("Frequency Reuse Factor N : ");
        lb5.setText("Cell Type                           :");
      
        lb7.setText("Enter the Values Below");
        
        lb7.setFont(new Font(Font.SERIF, Font.PLAIN, 50));
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
        
        
        
      
           
        JCheckBox macro = new JCheckBox("Macrocell", false);
        JCheckBox micro = new JCheckBox("Microcell", false);
		
        
       
        
        macro.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        micro.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
        
        
        
        lb7.setBounds(200,20,700,100);
        lb1.setBounds(300,150,700,50); 
        tf1.setBounds(800, 150, 500,50 );
        lb2.setBounds(300,250,700,50);
        tf2.setBounds(800, 250, 500,50 );
        lb3.setBounds(300,350,700,50);
        tf3.setBounds(800, 350, 500,50 );
        lb4.setBounds(300,450,700,50);
        tf4.setBounds(800, 450, 500,50 );
        lb5.setBounds(300,550,700,50);
        macro.setBounds(800, 550, 250, 50);
        micro.setBounds(1050, 550, 250, 50);
        
        
        
        btn1.setBounds(600, 680, 400, 80);
        
        
        
        
        
        
        
        pn.add(lb1);
        pn.add(lb2);
        pn.add(lb3);
        pn.add(lb4);
        pn.add(lb5);
        pn.add(lb7);
        
        pn.add(tf1);
        pn.add(tf2);
        pn.add(tf3);
        pn.add(tf4);
        
        
        pn.add(macro);
        pn.add(micro);
       
        
        pn.add(btn1);
        
        frm.add(pn);
        frm.setVisible(true);
        
        
        
        
        btn1.addActionListener((e) -> {
        
        double  area_size = Double.parseDouble(tf1.getText());
        double  cell_radius = Double.parseDouble(tf2.getText());
        double  traffic_channel =Double.parseDouble(tf3.getText());
        double  reuse_factor = Double.parseDouble(tf4.getText());
        
        
        
        double	hexa_area = 1.5 * Math.sqrt(3.00) * cell_radius * cell_radius ;
        double	exact_number_of_cells_required = area_size / hexa_area ;
        int 	number_of_cells_required = (int) (exact_number_of_cells_required + .5) ;
        
        double exact_number_of_channels_per_cell = traffic_channel/reuse_factor ;
        int    number_of_channels_per_cell = (int)(exact_number_of_channels_per_cell + .5) ;
        
        int total_channel_capacity= number_of_cells_required*number_of_channels_per_cell ;
        
        
        String cell_type ="";
        if(macro.isSelected())cell_type="Macrocell";
        else if (micro.isSelected())cell_type="Microcell";
        
        
        
        int total_number_of_possible_concurrent_calls=total_channel_capacity;
        
        
        
        
        
            
           
            
            	
            	
            	
                frm.remove(pn);
                new CellManagementResult(cell_type,number_of_cells_required,number_of_channels_per_cell,total_channel_capacity,total_number_of_possible_concurrent_calls,frm);
               
       });  
            
        
       
}
	
}
