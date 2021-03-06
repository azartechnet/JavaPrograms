import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class friends extends JFrame {

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
					friends frame = new friends();
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
	public friends() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("name");
		lblName.setForeground(Color.RED);
		lblName.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		lblName.setBounds(157, 94, 60, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(270, 92, 170, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("age");
		lblAge.setFont(new Font("Sitka Heading", Font.PLAIN, 18));
		lblAge.setForeground(Color.RED);
		lblAge.setBounds(157, 143, 46, 20);
		contentPane.add(lblAge);
		
		textField_1 = new JTextField();
		textField_1.setBounds(270, 144, 170, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setForeground(Color.RED);
		lblEmail.setFont(new Font("Sitka Heading", Font.PLAIN, 18));
		lblEmail.setBounds(157, 211, 46, 14);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(270, 209, 170, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("course");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Sitka Heading", Font.PLAIN, 17));
		lblNewLabel.setBounds(157, 256, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(270, 256, 170, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.CYAN);
		lblLogin.setFont(new Font("Showcard Gothic", Font.PLAIN, 25));
		lblLogin.setBounds(270, 26, 96, 31);
		contentPane.add(lblLogin);
		
		final JButton btnAdd = new JButton("add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					if(e.getSource()==btnAdd)
					{
						  String name=textField.getText();
						  String age=textField_1.getText();
						  String email=textField_2.getText();
						  String course=textField_3.getText();
						  
						  
						  
						
						  Class.forName("org.h2.Driver");
						  String str="insert into reg values('"+name+"','"+age+"','"+email+"','"+course+"')";
						  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
						  Statement stm=con.createStatement();
						  stm.executeUpdate(str);
						  JOptionPane.showMessageDialog(btnAdd,"success");					  
					}
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			
			}
			
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAdd.setBounds(62, 320, 89, 23);
		contentPane.add(btnAdd);
		
		final JButton btnView = new JButton("view");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u=textField.getText();
					
					String str1="select * from reg where name='"+u+"'";
					  Class.forName("org.h2.Driver");
					  
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
					
					  Statement stm=con.createStatement();
					  
					  ResultSet rs=stm.executeQuery(str1);
					  
					  rs.next();
					  
					  String age=rs.getString(2);
					  
					  String email=rs.getString(3);
					  
					  String course=rs.getString(4);
					
					  textField_1.setText(age);
					  
					  textField_2.setText(email);
					  
					  textField_3.setText(course);
					  
					  JOptionPane.showMessageDialog(btnView, "Search..");
					  
					  
				}  
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnView.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnView.setBounds(196, 323, 89, 23);
		contentPane.add(btnView);
		
		final JButton btnDelete = new JButton("delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
				String name=textField.getText();
				
				String str4="delete from reg where name='"+name+"'";
				
				 Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
					
				  Statement stm=con.createStatement();
				  
				  stm.executeUpdate(str4);
				  
				  JOptionPane.showMessageDialog(btnDelete, "Deleted..");
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDelete.setBounds(315, 323, 89, 23);
		contentPane.add(btnDelete);
		
		final JButton btnUpdate = new JButton("update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String name=textField.getText();
					
					String email=textField_2.getText();
					
					String course=textField_3.getText();
					
					String str2="update reg set email='"+email+"',course='"+course+"' where name='"+name+"'";
					 Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
						
					  Statement stm=con.createStatement();
					  
					  stm.executeUpdate(str2);
					  
					  JOptionPane.showMessageDialog(btnUpdate, "Updated..");
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnUpdate.setBounds(444, 323, 89, 23);
		contentPane.add(btnUpdate);
	}
}
