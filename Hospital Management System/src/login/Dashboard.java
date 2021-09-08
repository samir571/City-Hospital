package login;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Dashboard implements ActionListener {
	JFrame frame;
	JLabel lbl_background,lbl_admin,lbl_receptionist,lbl_doctor,lbl_title,hospital_logo,login;
	JButton btn_admin,btn_rec,btn_doctor;
	
	public Dashboard() {
		frame = new JFrame("City Hospital Dashboard");
		// Background image
		ImageIcon bg = new ImageIcon(this.getClass().getResource("/hospital_building.jpg"));
		lbl_background = new JLabel("",bg,JLabel.CENTER);
		lbl_background.setBounds(0,0,1052,700);
		Color color = new Color(0, 204, 210, 90);
		Color color1 = new Color(0,204,204,90);
		frame.add(lbl_background);
		
		// title panel
		JPanel head = new JPanel();
		head.setBounds(0,30,1052,70);
		head.setBackground(color);
		lbl_title = new JLabel("CITY HOSPITAL");
		lbl_title.setForeground(color.red);
		head.add(lbl_title, BorderLayout.CENTER);
		lbl_title.setFont(new Font("TimesRoman", Font.BOLD,60));
		ImageIcon logo = new ImageIcon(this.getClass().getResource("/hospital1.png"));
		hospital_logo = new JLabel("");
		hospital_logo.setIcon(logo);
		hospital_logo.setBounds(640,30,60,60);
		head.add(hospital_logo);
		lbl_background.add(head);
		
		// login panel
		JPanel pnl_login = new JPanel();
		pnl_login.setBounds(30,200,200,60);
		pnl_login.setBackground(color1);
		login = new JLabel("Login as:");
		login.setForeground(color.red);
		login.setFont(new Font("TimesRoman", Font.BOLD,40));
		pnl_login.add(login, BorderLayout.CENTER);
		lbl_background.add(pnl_login);
		// admin logo
		ImageIcon admin = new ImageIcon(this.getClass().getResource("/admin.png"));
		lbl_admin = new JLabel("");
		lbl_admin.setIcon(admin);
		lbl_admin.setBounds(180,250,200,200);
		lbl_background.add(lbl_admin);
		// admin button
		btn_admin = new JButton("Admin");
		btn_admin.setFont(new Font("Arial", Font.PLAIN, 20));
		btn_admin.setBounds(195,440,100,50);
		lbl_background.add(btn_admin);
		btn_admin.addActionListener(this);
		
		// Receptionist logo
		ImageIcon rec = new ImageIcon(this.getClass().getResource("/receptionist.png"));
		lbl_receptionist = new JLabel("");
		lbl_receptionist.setIcon(rec);
		lbl_receptionist.setBounds(450,250,200,200);
		lbl_background.add(lbl_receptionist);
		// receptionist button
		btn_rec = new JButton("Receptionist");
		btn_rec.setFont(new Font("Arial", Font.PLAIN, 20));
		btn_rec.setBounds(430,440,160,50);
		lbl_background.add(btn_rec);
		
		// Doctor logo
		ImageIcon doc = new ImageIcon(this.getClass().getResource("/doctor.png"));
		lbl_doctor = new JLabel("");
		lbl_doctor.setIcon(doc);
		lbl_doctor.setBounds(700,250,200,200);
		lbl_background.add(lbl_doctor);
		// Docotor button
		btn_doctor = new JButton("Doctor");
		btn_doctor.setFont(new Font("Arial", Font.PLAIN, 20));
		btn_doctor.setBounds(680,440,160,50);
		lbl_background.add(btn_doctor);
		
		frame.setSize(1052,700);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	public static void main(String args[]) {
		new Dashboard();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_admin);
		new Login();
		frame.dispose();
		
	}

}
