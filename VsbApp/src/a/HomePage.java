package a;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				new RegisterPage().setVisible(true);
			}
		});
		btnRegister.setBounds(159, 24, 89, 23);
		panel.add(btnRegister);
		
		JButton btnUlogin = new JButton("Ulogin");
		btnUlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				new LoginPage().setVisible(true);
			}
		});
		btnUlogin.setBounds(159, 90, 89, 23);
		panel.add(btnUlogin);
		
		JButton btnViewdetails = new JButton("ViewDetails");
		btnViewdetails.setBounds(159, 163, 89, 23);
		panel.add(btnViewdetails);
	}
}
