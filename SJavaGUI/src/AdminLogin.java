import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class AdminLogin extends JFrame {

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
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminlogin = new JLabel("AdminLogin");
		lblAdminlogin.setBounds(192, 27, 83, 20);
		contentPane.add(lblAdminlogin);
		
		JLabel lblAdminname = new JLabel("AdminName");
		lblAdminname.setBounds(45, 76, 83, 20);
		contentPane.add(lblAdminname);
		
		textField = new JTextField();
		textField.setBounds(185, 76, 112, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAdminpassword = new JLabel("AdminPassword");
		lblAdminpassword.setBounds(45, 126, 103, 14);
		contentPane.add(lblAdminpassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(185, 126, 112, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(120, 195, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(250, 195, 89, 23);
		contentPane.add(btnReset);
	}
}
