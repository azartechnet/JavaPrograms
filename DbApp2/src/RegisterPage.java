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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		setBounds(100, 100, 450, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(21, 45, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(119, 42, 132, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(21, 116, 46, 14);
		contentPane.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 113, 132, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUserregister = new JLabel("UserRegister");
		lblUserregister.setBounds(133, 11, 99, 14);
		contentPane.add(lblUserregister);
		
		JLabel lblMailid = new JLabel("Mail-ID");
		lblMailid.setBounds(21, 191, 46, 14);
		contentPane.add(lblMailid);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 188, 130, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPhoneno = new JLabel("PhoneNo");
		lblPhoneno.setBounds(21, 264, 46, 14);
		contentPane.add(lblPhoneno);
		
		textField_3 = new JTextField();
		textField_3.setBounds(119, 261, 132, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		final JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				if(evt.getSource()==btnRegister)
				{
					try
					{
					  String uname=textField.getText();
					  String pass=textField_1.getText();
					  String mailid=textField_2.getText();
					  String phone=textField_3.getText();
					  Class.forName("org.h2.Driver");
					  String str="insert into register values(?,?,?,?)";
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
					  
					  PreparedStatement pt=con.prepareStatement(str);
					  pt.setString(1,uname);
					  pt.setString(2,pass);
					  pt.setString(3,mailid);
					  pt.setString(4,phone);
					  pt.executeUpdate();
					  JOptionPane.showMessageDialog(btnRegister, "RegisterSucess!!");
					}
					catch(Exception t)
					{
						System.out.println(t);
					}
				}
			}
		});
		btnRegister.setBounds(75, 350, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnViewdetails = new JButton("ViewDetails");
		btnViewdetails.setBounds(223, 350, 89, 23);
		contentPane.add(btnViewdetails);
	}

}
