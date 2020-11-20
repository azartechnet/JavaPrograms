import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
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
	private JTextField textField_1;

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
		setBounds(100, 100, 450, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(25, 31, 372, 289);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogipage = new JLabel("LoginPage");
		lblLogipage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLogipage.setBounds(153, 11, 97, 17);
		panel.add(lblLogipage);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(27, 64, 73, 14);
		panel.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(149, 61, 130, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(30, 130, 46, 14);
		panel.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 127, 130, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u1=textField.getText();
					String p1=textField_1.getText();
					String str1="select username,password from userreg";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/karurjava","sa","");
					Statement stmt=conn.createStatement();
					
					ResultSet rs=stmt.executeQuery(str1);
					
					rs.next();
					
					String username=rs.getString(1);
					String password=rs.getString(2);
					
					if(u1.equals(username)&&p1.equals(password))
					{
						JOptionPane.showMessageDialog(btnSubmit, "LoginSucess");
						new UserHomePage().setVisible(true);
						
					}
					else
					{
						JOptionPane.showMessageDialog(btnSubmit, "LoginFail");
					}
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnSubmit.setBounds(73, 225, 89, 23);
		panel.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(223, 225, 89, 23);
		panel.add(btnReset);
	}
}
