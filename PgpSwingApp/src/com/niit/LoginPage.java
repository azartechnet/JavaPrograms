package com.niit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(32, 11, 356, 222);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHrsystem = new JLabel("HRSystem");
		lblHrsystem.setBounds(131, 11, 88, 14);
		panel.add(lblHrsystem);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(22, 43, 46, 14);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(94, 40, 139, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(22, 102, 46, 14);
		panel.add(lblPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(94, 96, 139, 27);
		panel.add(passwordField);
		
		final JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u=textField.getText();
					String p=passwordField.getText();
							String str="select * from adminlogin where auname='"+u+"'";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection conn=DriverManager.getConnection("jdbc:odbc:alogin","","");
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(str);
					rs.next();
					String auname=rs.getString(1);
					String pass=rs.getString(2);
					if(u.equals(auname)&&p.equals(pass))
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginSucss");;
						new AdminHomePage().setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginFaile");
					}
					
				}
				catch(Exception t)
				{
					JOptionPane.showMessageDialog(btnLogin, "LoginFail");
				}
			}
		});
		btnLogin.setBounds(74, 160, 89, 23);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(197, 160, 89, 23);
		panel.add(btnReset);
	}
}
