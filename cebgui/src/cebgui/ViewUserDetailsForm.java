package cebgui;

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
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ViewUserDetailsForm extends JFrame {

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
					ViewUserDetailsForm frame = new ViewUserDetailsForm();
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
	public ViewUserDetailsForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 11, 368, 411);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(33, 40, 46, 14);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(100, 37, 143, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(33, 108, 46, 14);
		panel.add(lblAge);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 105, 143, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(33, 180, 46, 14);
		panel.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(105, 177, 138, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u=textField.getText();
					
					String str="select age,email from regpage where name='"+u+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/cebdb","sa","");
					Statement stm=conn.createStatement();
					
					ResultSet rs=stm.executeQuery(str);
					
					rs.next();
					
					textField_1.setText(rs.getString(1));
					textField_2.setText(rs.getString(2));
					
					JOptionPane.showMessageDialog(btnSearch, "Search!!!");
					
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnSearch.setBounds(49, 276, 89, 23);
		panel.add(btnSearch);
		
		final JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String n=textField.getText();
					String age=textField_1.getText();
					String str1="update regpage set age='"+age+"' where name='"+n+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/cebdb","sa","");
					Statement stm=conn.createStatement();
					stm.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnUpdate, "Updated");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
				
			}
		});
		btnUpdate.setBounds(166, 276, 89, 23);
		panel.add(btnUpdate);
		
		final JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u1=textField.getText();
					
					String str1="delete  from regpage where name='"+u1+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/cebdb","sa","");
					Statement stm=conn.createStatement();
					
					stm.executeUpdate(str1);
					
					JOptionPane.showMessageDialog(btnDelete, "Userdeleted");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnDelete.setBounds(118, 334, 89, 23);
		panel.add(btnDelete);
	}
}
