package newpgpswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UserLogin extends JFrame {

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
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 23, 398, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUserlogin = new JLabel("UserLogin");
		lblUserlogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUserlogin.setBounds(141, 26, 74, 20);
		panel.add(lblUserlogin);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(24, 84, 46, 14);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(107, 81, 178, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(24, 180, 46, 14);
		panel.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 170, 178, 29);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String u1=textField.getText();
					String p1=textField_1.getText();
					
					String str="select * from userreg where uname='"+u1+"' and pass='"+p1+"'";
					 Class.forName("org.h2.Driver");
					   Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/newpgpkrr","sa","");
					   Statement stm=conn.createStatement();
					   ResultSet rs=stm.executeQuery(str);
					   rs.next();
					   String uname=rs.getString(1);
					   String pass=rs.getString(2);
					   
					   if(u1.equals(uname)&&p1.equals(pass))
					   {
						   JOptionPane.showMessageDialog(btnSubmit, "LoginSucess");
						   new UserHomePage().setVisible(true);
						
					   }
					   
					   
					   
					   
					   
					   
					   
					   
					   
					   
				}
				catch(Exception r)
				{
					JOptionPane.showMessageDialog(btnSubmit, "Nodata");
				}
			}
		});
		btnSubmit.setBounds(91, 252, 89, 23);
		panel.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(223, 252, 89, 23);
		panel.add(btnReset);
	}
}
