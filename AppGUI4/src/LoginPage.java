import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
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
	public void close()
    {
        WindowEvent win=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHrsystem = new JLabel("HRSYSTEM");
		lblHrsystem.setBounds(153, 11, 46, 14);
		panel.add(lblHrsystem);
		
		JLabel lblUname = new JLabel("UNAME");
		lblUname.setBounds(35, 45, 46, 14);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(123, 42, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("PASS");
		lblPass.setBounds(35, 102, 46, 14);
		panel.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 99, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					if(evt.getSource()==btnLogin)
					{
						String u=textField.getText();
						String p=textField_1.getText();
						String str="select * from ulogin";
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						Connection conn=DriverManager.getConnection("jdbc:odbc:sample");
						Statement stm=conn.createStatement();
						ResultSet rs=stm.executeQuery(str);
						rs.next();
						String uname=rs.getString(1);
						String pass=rs.getString(2);
						if(uname.equals(u)&&pass.equals(p))
						{
							JOptionPane.showMessageDialog(btnLogin, "LoginSucess!!");
							close();
							new RegisterPage().setVisible(true);
						}
						else
						{
							JOptionPane.showMessageDialog(btnLogin, "loginFail!!");	
						}
						
					}
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnLogin.setBounds(63, 175, 89, 23);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(205, 175, 89, 23);
		panel.add(btnReset);
	}
}
