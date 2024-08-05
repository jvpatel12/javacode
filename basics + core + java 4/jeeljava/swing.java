import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;

public  class swing{
    public static void main(String[] args) {
     Abc obj=new Abc();
    }
}



    class Abc extends JFrame   implements ActionListener{
         
        JTextField l,ll;
        JButton b;
        JLabel c;
        public Abc(){
            
           // JLabel l=new JLabel("jeel");
             //JLabel ll=new JLabel("patel");
              l=new JTextField(20);
             ll=new JTextField(20);
              b=new JButton("ok");
              c=new JLabel("result");
             
             
             add(l);
             add(ll);
             add(b);
             add(c);
   
              b.addActionListener(this);
              b.addActionListener(this);
              b.addActionListener(this);

             setLayout(new FlowLayout());
            setVisible(true);  
            setSize(200,200);
            setBackground(Color.BLACK);
            setForeground(Color.BLUE);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setDefaultCloseOperation(JFrame.MAXIMIZED_BOTH);
        }

        
        public void actionPerformed(ActionEvent ae) {
           
         int num1=Integer.parseInt(l.getText());
         int num2=Integer.parseInt(ll.getText());

         int value =num1 + num2;
 
         c.setText(value + " ");


         

        }       
    }

