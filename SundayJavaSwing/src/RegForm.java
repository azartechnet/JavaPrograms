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
import java.awt.event.ActionEvent;
import java.sql.*;
public class RegForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegForm frame = new RegForm();
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
	public RegForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 23, 469, 426);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRegisterform = new JLabel("RegisterForm");
		lblRegisterform.setBounds(195, 24, 77, 28);
		panel.add(lblRegisterform);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(29, 90, 88, 22);
		panel.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(166, 91, 154, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(29, 164, 46, 14);
		panel.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 157, 155, 28);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("EmailId");
		lblNewLabel.setBounds(29, 234, 46, 14);
		panel.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(166, 227, 154, 28);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(29, 312, 46, 14);
		panel.add(lblGender);
		
		textField_3 = new JTextField();
		textField_3.setBounds(167, 305, 153, 28);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(29, 367, 46, 14);
		panel.add(lblMobile);
		
		textField_4 = new JTextField();
		textField_4.setBounds(169, 364, 151, 28);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		final JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u=textField.getText();
					String p=textField_1.getText();
					String em=textField_2.getText();
					String gen=textField_3.getText();
					String ph=textField_4.getText();
					
					String str1="insert into userreg values('"+u+"','"+p+"','"+em+"','"+gen+"','"+ph+"')";
					
					Class.forName("org.h2.Driver");  
					Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sundaybatch","sa","");  
					Statement stmt=con.createStatement();  
					stmt.executeUpdate(str1);  
					JOptionPane.showMessageDialog(btnRegister, "Inserted..");
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnRegister.setBounds(357, 143, 89, 23);
		panel.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(357, 230, 89, 23);
		panel.add(btnReset);
	}
}
