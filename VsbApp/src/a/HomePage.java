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
		
		final JButton btnUlogin = new JButton("ULogin");
		btnUlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(arg0.getSource()==btnUlogin)
				{
					new ULogin().setVisible(true);
				}
			}
		});
		btnUlogin.setBounds(153, 44, 89, 23);
		contentPane.add(btnUlogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(153, 124, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnAlogin = new JButton("ALogin");
		btnAlogin.setBounds(153, 196, 89, 23);
		contentPane.add(btnAlogin);
	}
}
