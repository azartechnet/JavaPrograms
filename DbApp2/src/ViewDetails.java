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

public class ViewDetails extends JFrame {

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
					ViewDetails frame = new ViewDetails();
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
	public ViewDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblViewdetails = new JLabel("ViewDetails");
		lblViewdetails.setBounds(183, 11, 98, 24);
		contentPane.add(lblViewdetails);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(10, 70, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(87, 70, 174, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(10, 137, 46, 14);
		contentPane.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(87, 134, 174, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 201, 46, 14);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(87, 198, 174, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{

				try
				{
					String uname=textField.getText();
					String str="select pass,mailid from register where uname='"+uname+"'";
				    	Class.forName("org.h2.Driver");
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
					  Statement stm=con.createStatement();
					  ResultSet rs=stm.executeQuery(str);
					  rs.next();
					  textField_1.setText(rs.getString(1).trim());
					  textField_2.setText(rs.getString(2).trim());
					  JOptionPane.showMessageDialog(btnView, "Views");
				}
				
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnView.setBounds(37, 268, 89, 23);
		contentPane.add(btnView);
		
		final JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String uname=textField.getText();
					String pass=textField_1.getText();
					String mailid=textField_2.getText();
					String str="update register set pass='"+pass+"',mailid='"+mailid+"' where uname='"+uname+"'";
					Class.forName("org.h2.Driver");
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
					  Statement stm=con.createStatement();
					  stm.executeUpdate(str);
					  JOptionPane.showMessageDialog(btnUpdate, "UpdateSucess!!!");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnUpdate.setBounds(169, 268, 89, 23);
		contentPane.add(btnUpdate);
		
		final JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String uname=textField.getText();
					String str="delete from register where uname='"+uname+"'";
					Class.forName("org.h2.Driver");
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
					  Statement stm=con.createStatement();
					  stm.executeUpdate(str);
					  JOptionPane.showMessageDialog(btnDelete, "deleted..");
				}
				catch(Exception t)
				{
					
				}
			}
			
		});
		btnDelete.setBounds(307, 268, 89, 23);
		contentPane.add(btnDelete);
	}

}
