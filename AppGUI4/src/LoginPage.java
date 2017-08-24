import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
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
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(63, 175, 89, 23);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(205, 175, 89, 23);
		panel.add(btnReset);
	}
}
