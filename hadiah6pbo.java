package hadiahpratikum;

import javax.swing.*;
import java.awt.event.*;

   public abstract class Hadiahpratikum implements ActionListener{
       private static void createAndShowGUI() {
           JFrame frame = new JFrame("Start"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setBounds(20,30,600,300);
           frame.getContentPane().setLayout(null);
           
           JButton butt = new JButton("Munculkan Nama");
           JButton butt2 = new JButton("Munculkan Nim");
           JButton butt3 = new JButton("Munculkan Alamat");
           frame.getContentPane().add(butt);
           frame.getContentPane().add(butt2);
           frame.getContentPane().add(butt3);
           
           butt.setBounds(50,20,200,20);
           Hadiahpratikum app = new Hadiahpratikum() {};
           app.lebel = new JLabel();
           app.lebel.setBounds(300,20,200,20);
           frame.getContentPane().add(app.lebel);
           butt.addActionListener(app);
           frame.setVisible(true);
           
           butt2.setBounds(50,60,200,20);
           app.lebel2 = new JLabel();
           app.lebel2.setBounds(300,60,200,20);
           frame.getContentPane().add(app.lebel2);
           butt2.addActionListener(app);
           frame.setVisible(true);
           
           
           butt3.setBounds(50,100,200,20);
           app.lebel3 = new JLabel();
           app.lebel3.setBounds(300,100,200,20);
           frame.getContentPane().add(app.lebel3);
           butt3.addActionListener(app);
           frame.setVisible(true);
       }
       
      public void actionPerformed(ActionEvent e)
      {
          lebel.setText("Yelina Wijaya");
          lebel2.setText("51017021");
          lebel3.setText("STMIK Kharisma");
      }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
        });
    } 
    JLabel lebel,lebel2,lebel3;
   }
