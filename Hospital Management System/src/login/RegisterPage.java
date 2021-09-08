package login;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class RegisterPage {
JFrame frame;
JLabel lbl_username,lbl_fullname,lbl_password,lbl_heading;
JTextField txt_fname,txt_username;
JPasswordField txt_pw;
JButton btn_register;
Font fon1,fon2;

public RegisterPage() {
	frame = new JFrame("User Registration Page");
	frame.getContentPane().setBackground(Color.cyan);
	fon1 = new Font("arial", Font.BOLD,22);
	fon2 = new Font("arial",Font.BOLD,19);
	lbl_heading = new JLabel("User Registration");
	lbl_heading.setFont(fon1);
	lbl_heading.setBounds(120,30,200,30);
	
	lbl_fullname = new JLabel("Fullname:");
	lbl_fullname.setFont(fon2);
	lbl_fullname.setBounds(40,80,120,30);
	frame.add(lbl_fullname);
	
	lbl_username = new JLabel("Username:");
	lbl_username.setFont(fon2);
	lbl_username.setBounds(40,140,120,30);
	frame.add(lbl_username);
	
	lbl_password = new JLabel("Password:");
	lbl_password.setFont(fon2);
	lbl_password.setBounds(40,200,120,30);
	frame.add(lbl_password);
	
	txt_fname = new JTextField();
	txt_fname.setBounds(160,80,120,30);
	frame.add(txt_fname);
	
	txt_username = new JTextField();
	txt_username.setBounds(160,140,120,30);
	frame.add(txt_username);
	
	txt_pw = new JPasswordField();
	txt_pw.setBounds(160,200,120,30);
	frame.add(txt_pw);
	
	btn_register = new JButton("Register");
	btn_register.setBounds(170,250,100,40);
	frame.add(btn_register);
	
	frame.setSize(400,400);
	frame.add(lbl_heading);
	frame.setLayout(null);
	frame.setVisible(true);
}


public static void main(String args[])
{
	new RegisterPage();
	
}
}

