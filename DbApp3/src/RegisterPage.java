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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
		setBounds(100, 100, 450, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(22, 11, 387, 314);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLoginpage = new JLabel("Register");
		lblLoginpage.setBounds(167, 11, 77, 20);
		panel.add(lblLoginpage);
		
		textField = new JTextField();
		textField.setBounds(120, 42, 157, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(10, 45, 46, 14);
		panel.add(lblUname);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(10, 103, 46, 14);
		panel.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 100, 157, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 159, 46, 14);
		panel.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 156, 157, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(10, 212, 46, 14);
		panel.add(lblPhone);
		
		textField_3 = new JTextField();
		textField_3.setBounds(122, 209, 155, 20);
		panel.add(textField_3);
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
					  String str="insert into registeruser values(?,?,?,?)";
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
		btnRegister.setBounds(144, 265, 89, 23);
		panel.add(btnRegister);
	}
}
