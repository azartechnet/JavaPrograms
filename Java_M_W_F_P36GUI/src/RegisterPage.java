import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserregisterpage = new JLabel("UserRegisterPage");
		lblUserregisterpage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUserregisterpage.setBounds(151, 21, 130, 25);
		contentPane.add(lblUserregisterpage);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(41, 78, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(151, 75, 138, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(41, 143, 46, 14);
		contentPane.add(lblPassword);
		
		JLabel lblEmailid = new JLabel("EmailId");
		lblEmailid.setBounds(41, 210, 46, 14);
		contentPane.add(lblEmailid);
		
		textField_2 = new JTextField();
		textField_2.setBounds(151, 207, 138, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String u1=textField.getText();
					String p1=passwordField.getText();
					String e1=textField_2.getText();
					
					String str1="insert into userreg values('"+u1+"','"+p1+"','"+e1+"')";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/karurjava","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnRegister, "Inserted..");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnRegister.setBounds(99, 283, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("");
				passwordField.setText("");
				textField_2.setText("");
			}
		});
		btnReset.setBounds(238, 283, 89, 23);
		contentPane.add(btnReset);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(151, 140, 138, 20);
		contentPane.add(passwordField);
	}
}
