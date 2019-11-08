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
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UserHomePage extends JFrame {

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
					UserHomePage frame = new UserHomePage();
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
	public UserHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUpdatedprofile = new JLabel("UpdatedProfile");
		lblUpdatedprofile.setBounds(124, 35, 101, 23);
		contentPane.add(lblUpdatedprofile);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(34, 95, 46, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(125, 92, 167, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(34, 194, 46, 14);
		contentPane.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 191, 167, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(34, 286, 46, 14);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(124, 283, 168, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String u1=textField.getText();
					
					String str="select pass,email from userreg where uname='"+u1+"'";
					
					  Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/newpgpkrr","sa","");
					   Statement stm=conn.createStatement();
					   ResultSet rs=stm.executeQuery(str);
					   rs.next();
					   String pass=rs.getString(1);
					   String email=rs.getString(2);
					   
					   textField_1.setText(pass);
					   textField_2.setText(email);
					   
					   JOptionPane.showMessageDialog(btnView, "Search");
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnView.setBounds(55, 377, 89, 23);
		contentPane.add(btnView);
		
		final JButton btnUpdated = new JButton("Updated");
		btnUpdated.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u1=textField.getText();
					
					String p1=textField_1.getText();
					
					String str="update userreg set pass='"+p1+"' where uname='"+u1+"'";
					
					   Class.forName("org.h2.Driver");
					   Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/newpgpkrr","sa","");
					   Statement stm=conn.createStatement();
					   
					   stm.executeUpdate(str);
					   
					   JOptionPane.showMessageDialog(btnUpdated, "Updated..");
				}
				catch(Exception r)
				{
					
				}
			}
		});
		btnUpdated.setBounds(200, 377, 89, 23);
		contentPane.add(btnUpdated);
		
		final JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String u1=textField.getText();
					
					String str="delete from userreg where uname='"+u1+"'";
					
					Class.forName("org.h2.Driver");
					   Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/newpgpkrr","sa","");
					   Statement stm=conn.createStatement();
					   
					   stm.executeUpdate(str);
					   
					   JOptionPane.showMessageDialog(btnDelete, "deleted..");
					
				}catch(Exception t)
				{
					
				}
			}
		});
		btnDelete.setBounds(335, 377, 89, 23);
		contentPane.add(btnDelete);
	}
}
