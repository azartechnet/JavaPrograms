import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

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
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLoginpage = new JLabel("LoginPage");
		lblLoginpage.setBounds(178, 11, 105, 21);
		panel.add(lblLoginpage);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(24, 56, 46, 14);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(118, 53, 126, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(24, 128, 46, 14);
		panel.add(lblPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(118, 125, 126, 20);
		panel.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(155, 184, 89, 23);
		panel.add(btnLogin);
	}
}
