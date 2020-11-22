import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AdminPage extends JFrame {

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
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(22, 11, 383, 280);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAdminlogin = new JLabel("AdminLogin");
		lblAdminlogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdminlogin.setBounds(149, 27, 98, 22);
		panel.add(lblAdminlogin);
		
		JLabel lblAdminname = new JLabel("AdminName");
		lblAdminname.setBounds(44, 83, 68, 14);
		panel.add(lblAdminname);
		
		textField = new JTextField();
		textField.setBounds(174, 80, 115, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblAdminpassword = new JLabel("AdminPassword");
		lblAdminpassword.setBounds(46, 147, 85, 14);
		panel.add(lblAdminpassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 144, 115, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u1=textField.getText();
					String p1=textField_1.getText();
					String str1="select adminname,adminpass from admin";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/karurjava","sa","");
					Statement stmt=conn.createStatement();
					
					ResultSet rs=stmt.executeQuery(str1);
					
					rs.next();
					
					String username=rs.getString(1);
					String password=rs.getString(2);
					
					if(u1.equals(username)&&p1.equals(password))
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginSucess");
						new AdminHomePaage().setVisible(true);
						
					}
					else
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginFail");
					}
				}
					catch(Exception t)
					{
						System.out.println(t);
					}
			}
		});
		btnLogin.setBounds(79, 222, 89, 23);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(200, 222, 89, 23);
		panel.add(btnReset);
	}

}

