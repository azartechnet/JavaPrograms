import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JLabel lblHrMappingSystem = new JLabel("HR Mapping System");
		lblHrMappingSystem.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHrMappingSystem.setBounds(152, 23, 173, 22);
		contentPane.add(lblHrMappingSystem);
		
		JButton btnUserlogin = new JButton("UserLogin");
		btnUserlogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUserlogin.setBounds(165, 73, 107, 23);
		contentPane.add(btnUserlogin);
		
		JButton btnAdminlogin = new JButton("AdminLogin");
		btnAdminlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				new AdminLogin().setVisible(true);
			}
		});
		btnAdminlogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAdminlogin.setBounds(165, 133, 107, 23);
		contentPane.add(btnAdminlogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				new RegisterPage().setVisible(true);
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegister.setBounds(165, 203, 107, 23);
		contentPane.add(btnRegister);
	}
}
