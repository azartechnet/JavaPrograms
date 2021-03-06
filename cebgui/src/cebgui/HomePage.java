package cebgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
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
		
		JLabel lblFirstpage = new JLabel("HRSYSTEM");
		lblFirstpage.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblFirstpage.setBounds(166, 23, 111, 14);
		contentPane.add(lblFirstpage);
		
		JButton btnRegisterpage = new JButton("RegisterPage");
		btnRegisterpage.setBounds(149, 71, 128, 23);
		contentPane.add(btnRegisterpage);
		
		final JButton btnNewButton = new JButton("LoginPage");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton)
				{
					new LoginHomePage().setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(149, 128, 128, 23);
		contentPane.add(btnNewButton);
	}
}
