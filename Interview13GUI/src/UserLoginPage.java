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

public class UserLoginPage extends JFrame {

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
					UserLoginPage frame = new UserLoginPage();
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
	public UserLoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserloginpage = new JLabel("UserLoginPage ");
		lblUserloginpage.setBounds(161, 11, 109, 21);
		contentPane.add(lblUserloginpage);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(32, 52, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(109, 49, 145, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUpass = new JLabel("UPass");
		lblUpass.setBounds(32, 129, 46, 14);
		contentPane.add(lblUpass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 126, 145, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnValidated = new JButton("Validated");
		btnValidated.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u=textField.getText();
					String p=textField_1.getText();
					String str="select * from userreg where uname='"+u+"' and upass='"+p+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/evebatch","sa","");
					Statement stm=conn.createStatement();
					ResultSet rs=stm.executeQuery(str);
					rs.next();
					String uname=rs.getString(1);
					String pass=rs.getString(2);
					
					if(u.equals(uname)&&p.equals(pass))
					{
					  new UserHomePage().setVisible(true);
					  JOptionPane.showMessageDialog(btnValidated,"LoginSucess");
					}
					
					
				}
				catch(Exception r)
				{
					  System.out.println(r);
					  //JOptionPane.showMessageDialog(btnValidated,"LoginFail");
				}
			}
		});
		btnValidated.setBounds(76, 203, 89, 23);
		contentPane.add(btnValidated);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(224, 203, 89, 23);
		contentPane.add(btnReset);
	}

}
