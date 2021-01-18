import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UserLogin extends JFrame {

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
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserloginpage = new JLabel("UserLoginPage");
		lblUserloginpage.setBounds(172, 23, 83, 20);
		contentPane.add(lblUserloginpage);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(51, 71, 76, 20);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(172, 71, 126, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(51, 129, 46, 14);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 126, 126, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String name=textField.getText();
					
					String pass=textField_1.getText();
					
					String str="select * from userreg";
					
					Class.forName("org.h2.Driver");
					
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sjava","sa","");
					
					Statement stmt=conn.createStatement();
					
					ResultSet rs=stmt.executeQuery(str);
					
					rs.next();
					
					String uname=rs.getString(1);
					
					String pass1=rs.getString(2);
					
					if(name.equals(uname)&&pass.equals(pass1))
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginSuces");
						new UserHomePage().setVisible(true);
						
					}
					else
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginFail");
					}
					
					
					
					
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
			
		});
		btnLogin.setBounds(187, 196, 89, 23);
		contentPane.add(btnLogin);
	}
}
