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
		setBounds(100, 100, 513, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginform = new JLabel("LoginForm");
		lblLoginform.setBounds(153, 25, 91, 21);
		contentPane.add(lblLoginform);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(45, 106, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(141, 103, 189, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pass");
		lblNewLabel.setBounds(45, 217, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setBounds(141, 214, 189, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u1=textField.getText();
					String p1=textField_1.getText();
					
					String str="select * from userreg where uname='"+u1+"' and pass='"+p1+"'";
					
					Class.forName("org.h2.Driver");  
					Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sundaybatch","sa","");  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery(str);
					rs.next();
					String uname=rs.getString(1);
					String pass=rs.getString(2);
					if(u1.equals(uname)&&p1.equals(pass))
					{
						JOptionPane.showMessageDialog(btnLogin,"LoginSucess");
						new MyProfile().setVisible(true);
					}
					
					
					
					
				}
				catch(Exception t)
				{
					JOptionPane.showMessageDialog(btnLogin,"LoginFail");
				}
			}
		});
		btnLogin.setBounds(153, 328, 164, 30);
		contentPane.add(btnLogin);
	}
}
