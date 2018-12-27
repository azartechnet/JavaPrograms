import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

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
		lblLoginpage.setBounds(152, 26, 109, 26);
		contentPane.add(lblLoginpage);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(24, 77, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(24, 137, 46, 14);
		contentPane.add(lblPass);
		
		textField = new JTextField();
		textField.setBounds(83, 74, 178, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 134, 175, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(124, 193, 89, 23);
		contentPane.add(btnSubmit);
	}
}
