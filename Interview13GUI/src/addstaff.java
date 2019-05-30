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

public class addstaff extends JFrame {

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
					addstaff frame = new addstaff();
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
	public addstaff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddstaffDetails = new JLabel("ADDSTAFF DETAILS");
		lblAddstaffDetails.setBounds(146, 11, 111, 20);
		contentPane.add(lblAddstaffDetails);
		
		JLabel lblStaffname = new JLabel("STAFFNAME");
		lblStaffname.setBounds(34, 58, 99, 20);
		contentPane.add(lblStaffname);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setBounds(34, 104, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setBounds(34, 148, 46, 14);
		contentPane.add(lblAge);
		
		textField = new JTextField();
		textField.setBounds(118, 58, 197, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 101, 197, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 148, 195, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
				String sname=textField.getText();
				String semail=textField_1.getText();
				
				String sage=textField_2.getText();
				
				
				String str1="insert into staffpage values('"+sname+"','"+semail+"','"+sage+"')";
				
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
		btnAdd.setBounds(84, 207, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				
			}
		});
		btnReset.setBounds(226, 207, 89, 23);
		contentPane.add(btnReset);
	}
}
