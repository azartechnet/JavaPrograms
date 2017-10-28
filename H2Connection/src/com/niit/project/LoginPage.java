package com.niit.project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setTitle("LOGINPAGE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(10, 11, 409, 273);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLoginpage = new JLabel("LOGINPAGE");
		lblLoginpage.setBounds(197, 15, 102, 24);
		panel.add(lblLoginpage);
		
		textField = new JTextField();
		textField.setBounds(116, 70, 183, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblUname = new JLabel("UNAME");
		lblUname.setBounds(10, 79, 46, 14);
		panel.add(lblUname);
		
		JLabel lblPass = new JLabel("PASS");
		lblPass.setBounds(10, 153, 46, 14);
		panel.add(lblPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(116, 146, 183, 24);
		panel.add(passwordField);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(120, 214, 89, 23);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(253, 214, 89, 23);
		panel.add(btnReset);
	}
}
