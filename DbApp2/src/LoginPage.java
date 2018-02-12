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

public class LoginPage extends JFrame {

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
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(32, 11, 380, 301);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUserlogin = new JLabel("UserLogin");
		lblUserlogin.setBounds(153, 11, 87, 20);
		panel.add(lblUserlogin);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(10, 62, 46, 14);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(100, 59, 140, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(10, 133, 46, 14);
		panel.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 130, 134, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				
				if(evt.getSource()==btnLogin)
				{
					try
					{
					String u=textField.getText();
					String p=textField_1.getText();
					
					String str="select * from register where uname='"+u+"' OR pass='"+p+"'";
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
						       new RegisterPage().setVisible(true);
						       
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
		btnLogin.setBounds(72, 212, 89, 23);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(199, 212, 89, 23);
		panel.add(btnReset);
	}
}
