package login;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Login implements ActionListener {
	JFrame frame;
	JLabel b1,b2,b3,b4,b5,b6;
	JTextField id;
	JPasswordField pw;
	JButton btn_login,btn_signup;
	
	public Login (){
	frame = new JFrame("Login");
	Color color = new Color(0,204,210);
	frame.getContentPane().setBackground(color);

	//Heading Title
	b3 = new JLabel("CITY HOSPITAL");
	b3.setFont(new Font("TimesRoman", Font.BOLD,20));
	b3.setForeground(Color.red);
	b3.setBounds(170, 10, 200, 50);
	b6 = new JLabel("");
	ImageIcon img2 = new ImageIcon(this.getClass().getResource("/hospital1.png"));
	b6.setIcon(img2);
	b6.setBounds(380, 20, 60, 60);
	frame.getContentPane().add(b6);
	
	// login button
	btn_login = new JButton("Login");
	btn_login.setBounds(100, 280, 100, 50);
	btn_login.addActionListener(this);
	
	// register button
	btn_signup = new JButton("Sign up");
	btn_signup.setBounds(240, 280, 100, 50);
	btn_signup.addActionListener(this);

	// User ID part
	b4 = new JLabel("");
	ImageIcon img = new ImageIcon(this.getClass().getResource("/profile1.png"));
	b4.setIcon(img);
	b4.setBounds(75, 70, 40, 40);
	frame.getContentPane().add(b4);
	b1 = new JLabel("User ID:");
	b1.setBounds(100,80,90,20);
	id = new JTextField();
	id.setBounds(100,110,200,40);
	
	// Password part
	b5 = new JLabel("");
	ImageIcon img1 = new ImageIcon(this.getClass().getResource("/lock.png"));
	b5.setIcon(img1);
	b5.setBounds(75, 160, 40, 40);
	frame.getContentPane().add(b5);
	b2 = new JLabel("Password:");
	b2.setBounds(100,170,90,20);
	pw = new JPasswordField();
	pw.setBounds(100,200,200,40);
	
	frame.add(b1);
	frame.add(id);
	frame.add(b2);
	frame.add(b3);
	frame.add(pw);
	frame.add(btn_login);
	frame.add(btn_signup);
	frame.setSize(500,500);
	frame.setLayout(null);
	frame.setVisible(true);
	}
	
public static void main(String args[])
{
	new Login();
	
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == btn_login) {
	String username = id.getText();
    String password = String.valueOf(pw.getPassword());
    
       
       if (username.equals("") && password.equals("")){
       	JOptionPane.showMessageDialog(frame,"Please insert your credentials");
       }
       else if (username.equals("samir") && password.equals("1234")){
           JOptionPane.showMessageDialog(frame,"login successfull");
           id.setText(null);
           pw.setText(null);
       }
       else{
           JOptionPane.showMessageDialog(frame, "User ID or Password incorrect");
           id.setText(null);
           pw.setText(null);
       }
	
   
}
	 if(e.getSource() == btn_signup) {
	    	new RegisterPage();
	    	
	    }
}
}