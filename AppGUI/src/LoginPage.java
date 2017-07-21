import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	 public void close()
	    {
	        WindowEvent win=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
	        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
	    }
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHrsystem = new JLabel("HRSYSTEM");
		lblHrsystem.setBounds(175, 21, 86, 14);
		contentPane.add(lblHrsystem);
		
		JLabel lblUname = new JLabel("UNAME");
		lblUname.setBounds(46, 60, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(132, 57, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(46, 112, 69, 14);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 109, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String u=textField.getText();
					String p=textField_1.getText();
					String str="select * from ulogin";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection conn=DriverManager.getConnection("jdbc:odbc:demo");
					Statement stm=conn.createStatement();
					ResultSet rs=stm.executeQuery(str);
					rs.next();
					String uname=rs.getString(1);
					String pass=rs.getString(2);
					if(u.equals(uname)&&p.equals(pass))
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginSucess!!!");
						new RegisterForm().setVisible(true);
						close();
					}
					else
					{
						JOptionPane.showMessageDialog(btnLogin, "LoginFail!!!");
					}
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnLogin.setBounds(46, 171, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(189, 171, 89, 23);
		contentPane.add(btnReset);
	}
}
