import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UserReg extends JFrame {

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
					UserReg frame = new UserReg();
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
	public UserReg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserregisterpage = new JLabel("UserRegisterPage");
		lblUserregisterpage.setBounds(151, 11, 126, 20);
		contentPane.add(lblUserregisterpage);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(10, 59, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(91, 56, 158, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(10, 115, 46, 14);
		contentPane.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 112, 158, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 170, 46, 14);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(92, 167, 157, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
				String uname=textField.getText();
				String upass=textField_1.getText();
				String uemail=textField_2.getText();
				
				
				
				
				String str1="insert into userreg values('"+uname+"','"+upass+"','"+uemail+"')";
				
				Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/evebatch","sa","");
				Statement stm=conn.createStatement();
			 	stm.executeUpdate(str1);
			 	JOptionPane.showMessageDialog(btnAdd, "Insertd..");
				
				
				}
				catch(SQLException r)
				{
					
				}
			}
			
		});
		btnAdd.setBounds(91, 227, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(216, 227, 89, 23);
		contentPane.add(btnReset);
	}
}
