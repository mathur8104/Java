import java.awt.*;
import java.awt.event.*;

class Frame1 extends Frame
{
	 public Frame1(){
      super("WELCOME PAGE");
      prepareGUI();
   }

   public static void main(String[] args){
      Frame1  f1 = new Frame1();  
      f1.setVisible(true);
   }

   private void prepareGUI(){
      setSize(600,400);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
   }    

   @Override
   public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D)g;
	  
      Font boldFont = new Font("Times New Roman", Font.BOLD, 28);        
      g2.setFont(boldFont);
      g2.drawString("WELCOME TO THE PROJECT", 50, 70); 
      Font boldFont2 = new Font("Times New Roman", Font.BOLD, 40);        
      g2.setFont(boldFont2);
      g2.drawString("BOUTIQUE MANAGEMENT", 50, 200); 
	  
	  Button b = new Button("Next");
	  b.setBounds(150,300,70,30);
	  add(b);
   }
}
