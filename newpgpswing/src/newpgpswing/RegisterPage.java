package newpgpswing;

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
import java.sql.Statement;
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
		setBounds(100, 100, 471, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 11, 396, 405);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(34, 62, 46, 14);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(138, 59, 162, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(34, 156, 46, 14);
		panel.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 149, 162, 28);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(34, 237, 46, 14);
		panel.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(143, 230, 157, 28);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(34, 323, 46, 14);
		panel.add(lblPhone);
		
		textField_3 = new JTextField();
		textField_3.setBounds(138, 316, 162, 28);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		final JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String uname=textField.getText();
					String pass=textField_1.getText();
					String email=textField_2.getText();
					String phone=textField_3.getText();
					
					String str="insert into userreg values('"+uname+"','"+pass+"','"+email+"','"+phone+"')";
					
				   Class.forName("org.h2.Driver");
				   Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/newpgpkrr","sa","");
				   Statement stm=conn.createStatement();
				   
				   stm.executeUpdate(str);
				   
				   JOptionPane.showMessageDialog(btnRegister, "Inserted");
				   
				   
					
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnRegister.setBounds(151, 371, 116, 23);
		panel.add(btnRegister);
	}
}
