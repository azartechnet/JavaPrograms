import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
		setBounds(100, 100, 470, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegisterform = new JButton("RegisterForm");
		btnRegisterform.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				new RegForm().setVisible(true);
			}
		});
		btnRegisterform.setBounds(154, 61, 124, 38);
		contentPane.add(btnRegisterform);
		
		JButton btnNewButton = new JButton("LoginForm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				new LoginPage().setVisible(true);
			}
		});
		btnNewButton.setBounds(154, 148, 124, 38);
		contentPane.add(btnNewButton);
	}
}
