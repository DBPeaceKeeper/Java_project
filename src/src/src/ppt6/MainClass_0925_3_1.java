package src.ppt6;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainClass_0925_3_1 {
	   private JFrame frame;
	   
	   public MainClass_0925_3_1() {
	      
	      frame = new JFrame("JFame 생성");
	      //MainClass_0925_3_2 listener = new MainClass_0925_3_2();
	      
	      /* BorderLayout Button
	      String[] buttonText = {
	            BorderLayout.NORTH,
	            BorderLayout.SOUTH,
	            BorderLayout.EAST,
	            BorderLayout.WEST,
	            BorderLayout.CENTER
	      };
	      JButton[] btn = new JButton[buttonText.length];
	      for (int i = 0; i < btn.length; i++) {
	         btn[i] = new JButton(buttonText[i]);
	         frame.add(btn[i], buttonText[i]);
	      }
	      */
	      
	      Random rand = new Random();
	      int target = rand.nextInt(9) + 1;
	      
	      /* GridLayout */
	      for (int i = 1; i <= 9; i++) {
	         JButton btn = new JButton("Button" + i);
	         btn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               String actionCommand = e.getActionCommand();
	               int clickedButtonNumber = Integer.parseInt(actionCommand.substring(6));
	               
	               if (clickedButtonNumber == target) {
	                  JOptionPane.showMessageDialog(null, "Success");
	               } else {
	                  JOptionPane.showMessageDialog(null, "Fail");
	               }
	            }
	         });
	         frame.add(btn);
	      }
	      
	      frame.setSize(600, 500);
	      frame.setLocation(100, 200);
	      frame.setResizable(false);
	      frame.setLocationRelativeTo(null);
	      frame.setLayout(new GridLayout(3, 3));
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setVisible(true);
	   }
	   
	   public static void main(String[] args) {
	      new MainClass_0925_3_1();
	   }
	}
