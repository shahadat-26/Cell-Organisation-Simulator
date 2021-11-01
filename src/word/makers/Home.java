/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.makers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import static word.makers.WelcomeStayTimer.count;

/**
 *
 * @author Asus
 */
public class Home {
    int kint;
    Home() throws InterruptedException
    {
        JFrame frm = new JFrame();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(1900, 1000);
        JPanel pn = new JPanel();
        pn.setLayout(null);
        
        
        JLabel W= new JLabel("W");
        JLabel e= new JLabel("e");
        JLabel l= new JLabel("l");
        JLabel c= new JLabel("c");
        JLabel o= new JLabel("o");
        JLabel m= new JLabel("m");
        JLabel e1= new JLabel("e");
        
        
        
        
        W.setForeground(new Color(0, 102, 204));
        e.setForeground(Color.ORANGE);
        l.setForeground(Color.YELLOW);
        c.setForeground(new Color(224,224,224));
        o.setForeground(Color.MAGENTA);
        m.setForeground(Color.PINK);
        e1.setForeground(Color.green);
        pn.setBackground(new Color(0,0,51));
      
        
        
        W.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        e.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        l.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        c.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        o.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        m.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        e1.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
       
        
        
        W.setBounds(500,250,150,200);
        e.setBounds(600,250,150,200);
        l.setBounds(660,250,150,200);
        c.setBounds(700,250,150,200);
        o.setBounds(760,250,150,200);
        m.setBounds(830,250,150,200);
        e1.setBounds(930,250,150,200);
       
       
        pn.add(W);
        pn.add(e);
        pn.add(l);
        pn.add(c);
        
        pn.add(o);
        pn.add(m);
        pn.add(e1);
        
        frm.add(pn);
        frm.setVisible(true);
        kint=4;
       Timer timer;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 kint--;
                if (kint== 0) {
                    
                    frm.remove(pn);
                    new Options(frm);
                  } 
            }
        });
        timer.setInitialDelay(0);
       
        timer.start();
       
    }
}
