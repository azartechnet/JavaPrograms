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
import java.sql.SQLException;
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(50, 45, 46, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(141, 42, 147, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(50, 98, 46, 14);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(141, 98, 147, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(50, 168, 46, 14);
		contentPane.add(lblMobile);
		
		textField_2 = new JTextField();
		textField_2.setBounds(146, 165, 142, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String n=textField.getText();
				String e1=textField_1.getText();
				String m=textField_2.getText();
				
				try
				{
					
				String str="insert into regc values('"+n+"','"+e1+"','"+m+"')";	
				Class.forName("org.h2.Driver");
				
				Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dbdgl","sa","");
				
				
				Statement stm=conn.createStatement();
				
				stm.executeUpdate(str);
				
				JOptionPane.showMessageDialog(btnAdd,"Inserted");
				
				}
				catch(Exception r)
				{
					
				}
				
				
			}
		});
		btnAdd.setBounds(177, 227, 89, 23);
		contentPane.add(btnAdd);
	}
}
