import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setBounds(100, 100, 450, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 328);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRegisterpage = new JLabel("RegisterPage");
		lblRegisterpage.setBounds(172, 25, 82, 22);
		panel.add(lblRegisterpage);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(32, 78, 67, 14);
		panel.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(154, 75, 121, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(32, 141, 46, 14);
		panel.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(154, 138, 121, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(32, 204, 46, 14);
		panel.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(154, 201, 121, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "others"}));
		comboBox.setBounds(154, 253, 121, 20);
		panel.add(comboBox);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(32, 256, 46, 14);
		panel.add(lblGender);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String uname=textField.getText();
					String pass=textField_1.getText();
					String email=textField_2.getText();
					
					String gender=(String)comboBox.getSelectedItem();
					
					String str1="insert into userreg values('"+uname+"','"+pass+"','"+email+"','"+gender+"')";
							
				
					 Class.forName("org.h2.Driver");
						
						Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sjava","sa","");
						
						Statement stmt=conn.createStatement();
						
						stmt.executeUpdate(str1);
						
						JOptionPane.showMessageDialog(btnRegister,"Inserted..");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnRegister.setBackground(new Color(135, 206, 250));
		btnRegister.setForeground(new Color(0, 0, 255));
		btnRegister.setToolTipText("New register");
		btnRegister.setBounds(91, 295, 89, 22);
		panel.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(0, 0, 205));
		btnReset.setBackground(new Color(173, 216, 230));
		btnReset.setBounds(222, 294, 89, 23);
		panel.add(btnReset);
	}
}
