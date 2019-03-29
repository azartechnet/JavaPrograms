package cebgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class adminlogin extends JFrame {

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
					adminlogin frame = new adminlogin();
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
	public adminlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdminName = new JButton("admin name");
		btnAdminName.setBounds(36, 58, 89, 23);
		contentPane.add(btnAdminName);
		
		JButton btnPassword = new JButton("password");
		btnPassword.setBounds(36, 122, 89, 23);
		contentPane.add(btnPassword);
		
		textField = new JTextField();
		textField.setBounds(195, 59, 138, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(195, 123, 138, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("login");
		btnLogin.setBounds(36, 203, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("reset");
		btnReset.setBounds(192, 203, 89, 23);
		contentPane.add(btnReset);
	}

}
