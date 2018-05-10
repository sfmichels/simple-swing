import javax.swing.*;  
public class Simple {  
  JFrame frame;  
  Simple() {  
    frame = new JFrame(); //creating instance of JFrame  
          
    JButton button = new JButton("click");  //creating instance of JButton  
    button.setBounds(130,100,100, 40);  
          
    frame.add(button);  //adding button in JFrame  
          
    frame.setSize(400,500);  //400 width and 500 height  
    frame.setLayout(null);   //using no layout managers  
    frame.setVisible(true);  //making the frame visible  
  }  
  
  public static void main(String[] args) {  
    new Simple();  
  }  
}  
