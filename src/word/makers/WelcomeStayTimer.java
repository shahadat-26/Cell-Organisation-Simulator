/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.makers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

/**
 *
 * @author Asus
 */
public class WelcomeStayTimer {

   
    static int  count;

    WelcomeStayTimer() throws InterruptedException {
       

       
        
       
        
        
        

      

        
       
        Timer timer;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                if (count > 0) {
                    int min = count / 60;
                    int sec = count % 60;
                    int zero = -1;
                    
                } else if (count == 0) {
                    
                    
                //    new timeUp(name, points - res.length(), res, frm);
                } else {
                    ((Timer) (e.getSource())).stop();

                }
            }
        });
        timer.setInitialDelay(0);
       
        timer.start();
        
        

       
       

    }

}
