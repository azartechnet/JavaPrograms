package com.niit.project;

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
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 11, 383, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHomepage = new JLabel("HOMEPAGE");
		lblHomepage.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHomepage.setBounds(143, 11, 85, 20);
		panel.add(lblHomepage);
		
		final JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				if(evt.getSource()==btnLogin)
				{
					new LoginPage().setVisible(true);
				}
			}
		});
		btnLogin.setBounds(139, 66, 89, 23);
		panel.add(btnLogin);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setBounds(139, 126, 89, 23);
		panel.add(btnRegister);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setBounds(139, 184, 89, 23);
		panel.add(btnSearch);
	}
}
