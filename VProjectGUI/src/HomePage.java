import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
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
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHrmappingSystem = new JLabel("HRMAPPING SYSTEM");
		lblHrmappingSystem.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHrmappingSystem.setBounds(141, 33, 165, 14);
		contentPane.add(lblHrmappingSystem);
		
		JButton btnAdminlogin = new JButton("AdminLogin");
		btnAdminlogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAdminlogin.setBounds(161, 93, 105, 23);
		contentPane.add(btnAdminlogin);
		
		JButton btnUserlogin = new JButton("UserLogin");
		btnUserlogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUserlogin.setBounds(161, 164, 105, 23);
		contentPane.add(btnUserlogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegister.setBounds(161, 254, 105, 23);
		contentPane.add(btnRegister);
	}
}
