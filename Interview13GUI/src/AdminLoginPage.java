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

public class AdminLoginPage extends JFrame {

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
					AdminLoginPage frame = new AdminLoginPage();
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
	public AdminLoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 393, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAdminname = new JLabel("AdminName");
		lblAdminname.setBounds(27, 36, 99, 24);
		panel.add(lblAdminname);
		
		textField = new JTextField();
		textField.setBounds(156, 38, 133, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 102, 133, 24);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAdminpass = new JLabel("AdminPass");
		lblAdminpass.setBounds(27, 107, 83, 19);
		panel.add(lblAdminpass);
		
		final JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u=textField.getText();
					String p=textField_1.getText();
					String str="select * from adminloginpage where nadmin='"+u+"' and apass='"+p+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/evebatch","sa","");
					Statement stm=conn.createStatement();
					ResultSet rs=stm.executeQuery(str);
					rs.next();
					String uname=rs.getString(1);
					String pass=rs.getString(2);
					
					if(u.equals(uname)&&p.equals(pass))
					{
					  new AdminHomePage().setVisible(true);
					  JOptionPane.showMessageDialog(btnLogin,"LoginSucess");
					}
					
					
				}
				catch(Exception r)
				{
					  JOptionPane.showMessageDialog(btnLogin,"LoginFail");
				}
			}
		});
		btnLogin.setBounds(70, 174, 89, 23);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(189, 174, 89, 23);
		panel.add(btnReset);
	}
}
