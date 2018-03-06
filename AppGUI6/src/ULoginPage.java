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

public class ULoginPage extends JFrame {

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
					ULoginPage frame = new ULoginPage();
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
	public ULoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 25, 414, 348);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLoginpage = new JLabel("LoginPage");
		lblLoginpage.setBounds(154, 11, 83, 22);
		panel.add(lblLoginpage);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(28, 62, 46, 14);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(109, 59, 215, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(28, 132, 46, 14);
		panel.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 129, 215, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					String u=textField.getText();
					String p=textField_1.getText();
					String str="select * from ureg where uname='"+u+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dgl","sa","");
					Statement stm=conn.createStatement();
					ResultSet rs=stm.executeQuery(str);
					rs.next();
					String uname=rs.getString(1);
					String pass=rs.getString(2);
					if(u.equals(uname)&&p.equals(pass))
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginSucess!!!");
						new ViewMyDetails().setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginFail!!!");
					}
					
					
				}
				catch(Exception t)
				{
					JOptionPane.showMessageDialog(btnLogin, "LoginFail!!!");
					
				}
			}
		});
		btnLogin.setBounds(148, 211, 89, 23);
		panel.add(btnLogin);
	}
}
