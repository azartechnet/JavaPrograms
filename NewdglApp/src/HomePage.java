import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
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
		setBounds(100, 100, 624, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHomepage = new JLabel("HomePage");
		lblHomepage.setForeground(Color.ORANGE);
		lblHomepage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHomepage.setBounds(260, 11, 109, 21);
		contentPane.add(lblHomepage);
		
		final JButton btnNewButton = new JButton("LoginPage");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnNewButton)
				{
					new LoginPage().setVisible(true);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.setBounds(251, 69, 118, 30);
		contentPane.add(btnNewButton);
		
		final JButton btnRegisterpage = new JButton("RegisterPage");
		btnRegisterpage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnRegisterpage)
				{
					new RegisterPage().setVisible(true);
				}
			}
		});
		btnRegisterpage.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnRegisterpage.setBounds(251, 144, 118, 30);
		contentPane.add(btnRegisterpage);
	}
}
