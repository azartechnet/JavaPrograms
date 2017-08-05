import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;

public class RegisterPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(30, 11, 350, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(112, 35, 89, 23);
		panel.add(btnLogin);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setBounds(112, 102, 89, 23);
		panel.add(btnRegister);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setBounds(112, 179, 89, 23);
		panel.add(btnSearch);
	}
}
