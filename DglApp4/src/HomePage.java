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
		setBounds(100, 100, 450, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUloginpage = new JButton("ULoginPage");
		btnUloginpage.setBounds(126, 68, 114, 28);
		contentPane.add(btnUloginpage);
		
		JButton btnAdminlogin = new JButton("AdminLogin");
		btnAdminlogin.setBounds(126, 141, 114, 28);
		contentPane.add(btnAdminlogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(126, 230, 114, 28);
		contentPane.add(btnRegister);
	}
}
