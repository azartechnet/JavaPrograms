package a;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class HomePage extends JFrame {

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
		panel.setBounds(24, 21, 400, 229);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHrsystem = new JLabel("HRSYSTEM");
		lblHrsystem.setBounds(127, 11, 87, 19);
		panel.add(lblHrsystem);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(32, 51, 46, 14);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(104, 48, 184, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(32, 111, 46, 14);
		panel.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 108, 184, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(125, 167, 89, 23);
		panel.add(btnSubmit);
	}
}
