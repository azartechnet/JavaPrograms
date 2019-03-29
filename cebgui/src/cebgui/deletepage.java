package cebgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class deletepage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deletepage frame = new deletepage();
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
	public deletepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEmail = new JButton("email");
		btnEmail.setBounds(45, 69, 89, 23);
		contentPane.add(btnEmail);
		
		textField = new JTextField();
		textField.setBounds(244, 70, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.setBounds(151, 172, 89, 23);
		contentPane.add(btnDelete);
	}

}
