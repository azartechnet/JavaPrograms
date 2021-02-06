import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

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
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(10, 22, 403, 279);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAdminlogin = new JLabel("AdminLogin");
		lblAdminlogin.setBounds(169, 11, 75, 14);
		panel.add(lblAdminlogin);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(30, 59, 64, 14);
		panel.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(133, 56, 130, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(31, 124, 46, 14);
		panel.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(133, 121, 130, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String uname=textField.getText();
					String pass=textField_1.getText();
					
					String str="select * from adminpage where adminname='"+uname+"'and adminpass='"+pass+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/vjava","sa","");
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(str);
					rs.next();
					String admin1=rs.getString(1);
					String pass1=rs.getString(2);
					if(uname.equals(admin1)&&pass.equals(pass1))
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginSucess");
						
						new AdminHomePage().setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginFail!!");
					}
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnLogin.setBounds(68, 202, 89, 23);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(226, 202, 89, 23);
		panel.add(btnReset);
	}
}
