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
		setBounds(100, 100, 450, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginpage = new JLabel("LoginPage");
		lblLoginpage.setBounds(173, 11, 78, 14);
		contentPane.add(lblLoginpage);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(26, 68, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(103, 65, 148, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(26, 152, 46, 14);
		contentPane.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 149, 148, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				if(e.getSource()==btnLogin)
				{
					try
					{
					String u=textField.getText();
					String p=textField_1.getText();
					
					String str="select * from registeruser where uname='"+u+"' OR pass='"+p+"'";
					Class.forName("org.h2.Driver");
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
					  Statement stm=con.createStatement();
					  ResultSet rs=stm.executeQuery(str);
					  rs.next();
					  String uname=rs.getString(1);
					  String pass=rs.getString(2);
					  
					  if(u.equals(uname)&&p.equals(pass))
					   {
						       JOptionPane.showMessageDialog(btnLogin, "LoginSucess!!");
						       //close();
						       new ViewDetails().setVisible(true);
						       
					   }
					  else
					  {
						  JOptionPane.showMessageDialog(btnLogin, "LoginFail!!");  
					  }
					  
					}
					catch(Exception t)
					{
					System.out.println(t);	
					}
					
					
					
					
				}
			}
		});
		btnLogin.setBounds(117, 230, 89, 23);
		contentPane.add(btnLogin);
	}

}
