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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginpage = new JLabel("LoginPage");
		lblLoginpage.setBounds(156, 11, 92, 26);
		contentPane.add(lblLoginpage);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(34, 71, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(116, 62, 164, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(34, 159, 46, 14);
		contentPane.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 150, 164, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				
				try
				{
					String em=textField.getText();
					String p=textField_1.getText();
					String str="select * from ulogin";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/project1","sa","");
					Statement stm=conn.createStatement();
					ResultSet rs=stm.executeQuery(str);
					rs.next();
					String u=rs.getString(1);
					String pass=rs.getString(2);
					if(em.equals(u)&&p.equals(pass))
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginSucess!!!");
						new AddProduct().setVisible(true);
					}
					
					
					
				}
				catch(Exception t)
				{
					//System.out.println(t);
					JOptionPane.showMessageDialog(btnLogin, "LoginFail!!!");
				}
				
			}
			
		});
		btnLogin.setBounds(159, 214, 89, 23);
		contentPane.add(btnLogin);
	}
}
