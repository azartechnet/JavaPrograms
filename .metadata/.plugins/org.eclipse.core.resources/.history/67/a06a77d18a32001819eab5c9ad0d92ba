package a;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
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
		setBounds(100, 100, 450, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 414, 281);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblProjectTitles = new JLabel("Project Titles");
		lblProjectTitles.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProjectTitles.setBounds(129, 11, 164, 25);
		panel.add(lblProjectTitles);
		
		JButton btnUlogin = new JButton("Ulogin");
		btnUlogin.setBounds(143, 69, 89, 23);
		panel.add(btnUlogin);
		
		JButton btnAlogin = new JButton("ALogin");
		btnAlogin.setBounds(143, 139, 89, 23);
		panel.add(btnAlogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(143, 222, 89, 23);
		panel.add(btnRegister);
	}
}
