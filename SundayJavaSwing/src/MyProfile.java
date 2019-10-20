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

public class MyProfile extends JFrame {

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
					MyProfile frame = new MyProfile();
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
	public MyProfile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMyprofile = new JLabel("MyProfile");
		lblMyprofile.setBounds(166, 37, 46, 14);
		contentPane.add(lblMyprofile);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(22, 99, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(105, 96, 196, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(105, 182, 196, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(22, 189, 46, 14);
		contentPane.add(lblPass);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(22, 268, 46, 14);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(105, 265, 196, 29);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
				String u1=textField.getText();
				
				String str="select uname,pass,email from userreg where uname='"+u1+"'";
				
				Class.forName("org.h2.Driver");  
				Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sundaybatch","sa","");  
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(str);
				rs.next();
				textField_1.setText(rs.getString(2));
				textField_2.setText(rs.getString(3));
				
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnView.setBounds(32, 368, 89, 23);
		contentPane.add(btnView);
		
		final JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String u1=textField.getText();
					String p1=textField_1.getText();
					String e1=textField_2.getText();
					String str1="update userreg set email='"+e1+"',pass='"+p1+"' where uname='"+u1+"'";
					
					Class.forName("org.h2.Driver");  
					Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sundaybatch","sa","");  
					Statement stmt=con.createStatement();
					stmt.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnUpdate, "Updated..");
					
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnUpdate.setBounds(190, 368, 89, 23);
		contentPane.add(btnUpdate);
		
		final JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u1=textField.getText();
					
					String str1="delete from userreg where uname='"+u1+"'";
					
					Class.forName("org.h2.Driver");  
					Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sundaybatch","sa","");  
					Statement stmt=con.createStatement();
					
					stmt.executeUpdate(str1);
					
					JOptionPane.showMessageDialog(btnDelete, "deleted...");
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnDelete.setBounds(335, 368, 89, 23);
		contentPane.add(btnDelete);
	}

}
