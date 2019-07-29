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

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminname = new JLabel("AdminName");
		lblAdminname.setBounds(37, 57, 74, 23);
		contentPane.add(lblAdminname);
		
		textField = new JTextField();
		textField.setBounds(140, 58, 166, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(42, 146, 46, 14);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 143, 166, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnAdminlogin = new JButton("AdminLogin");
		btnAdminlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				
				String auname=textField.getText();
				String apass=textField_1.getText();
				
				try
				{
				String str="select * from adminlogin where aname='"+auname+"' and apass='"+apass+"'";	
				Class.forName("org.h2.Driver");
				Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/project","sa","");
				Statement stm=conn.createStatement();
				ResultSet rs=stm.executeQuery(str);
				rs.next();
				String u1=rs.getString(1);
				String p1=rs.getString(2);
				
				if(auname.equals(u1)&&apass.equals(p1))
				{
			      JOptionPane.showMessageDialog(btnAdminlogin, "LoginSucess");
				  new AdminHomePage().setVisible(true);
				 
				}
				
				
				}
				catch(Exception r)
				{
					 JOptionPane.showMessageDialog(btnAdminlogin, "LoginFail..");
				}
			}
		});
		btnAdminlogin.setBounds(180, 235, 89, 23);
		contentPane.add(btnAdminlogin);
	}
}
