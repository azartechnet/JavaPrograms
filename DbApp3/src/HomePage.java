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
		setBounds(100, 100, 450, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 332);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHomepage = new JLabel("HomePage");
		lblHomepage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHomepage.setBounds(165, 11, 88, 21);
		panel.add(lblHomepage);
		
		final JButton btnUserlogin = new JButton("UserLogin");
		btnUserlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnUserlogin)
				{
					new UserLogin().setVisible(true);
				}
			}
		});
		btnUserlogin.setBounds(164, 64, 89, 23);
		panel.add(btnUserlogin);
		
		final JButton btnRegisterform = new JButton("RegisterForm");
		btnRegisterform.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				if(evt.getSource()==btnRegisterform)
				{
					new RegisterPage().setVisible(true);
				}
			}
		});
		btnRegisterform.setBounds(164, 133, 89, 23);
		panel.add(btnRegisterform);
		
		JButton btnViewdetails = new JButton("ViewDetails");
		btnViewdetails.setBounds(164, 215, 89, 23);
		panel.add(btnViewdetails);
	}
}
