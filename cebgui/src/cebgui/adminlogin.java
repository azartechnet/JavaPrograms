package cebgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class adminlogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminlogin frame = new adminlogin();
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
	public adminlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(195, 59, 138, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(195, 123, 138, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String n=textField.getText();
					String p=textField_1.getText();
					
                     String str1="select * from adminlogin where adminname='"+n+"' and adminpass='"+p+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/cebdb","sa","");
					Statement stm=conn.createStatement();
					ResultSet rs=stm.executeQuery(str1);
					
					rs.next();
					
					String n1=rs.getString(1);
					String p1=rs.getString(2);
					
					if(n.equals(n1)&&p.equals(p1))
					{
						new adminhomepage().setVisible(true);
					}
					
					
				}
				catch(Exception t)
				{
					
					JOptionPane.showMessageDialog(btnLogin, "LoginFail..");
					System.out.println("LoginFaill");
				}
			}
		});
		btnLogin.setBounds(36, 203, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("reset");
		btnReset.setBounds(192, 203, 89, 23);
		contentPane.add(btnReset);
		
		JLabel lblAdminname = new JLabel("AdminName");
		lblAdminname.setBounds(36, 62, 89, 20);
		contentPane.add(lblAdminname);
		
		JLabel lblAdminpass = new JLabel("AdminPass");
		lblAdminpass.setBounds(36, 126, 89, 17);
		contentPane.add(lblAdminpass);
	}
}
