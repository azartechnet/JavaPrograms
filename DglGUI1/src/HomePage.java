import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoginpage = new JButton("LoginPage");
		btnLoginpage.setBounds(145, 44, 118, 31);
		contentPane.add(btnLoginpage);
		
		JButton btnRegisterpage = new JButton("RegisterPage");
		btnRegisterpage.setBounds(145, 119, 118, 31);
		contentPane.add(btnRegisterpage);
		
		JButton btnNewButton = new JButton("AdminLogin");
		btnNewButton.setBounds(145, 209, 118, 31);
		contentPane.add(btnNewButton);
	}
}
