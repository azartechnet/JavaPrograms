import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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
		setBounds(100, 100, 488, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookingsystem = new JLabel("BOOKINGSYSTEM");
		lblBookingsystem.setBounds(168, 22, 139, 22);
		contentPane.add(lblBookingsystem);
		
		JButton btnLoginpage = new JButton("LoginPage");
		btnLoginpage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				new LoginPage().setVisible(true);
			}
		});
		btnLoginpage.setBounds(161, 100, 89, 23);
		contentPane.add(btnLoginpage);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(161, 177, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(161, 271, 89, 23);
		contentPane.add(btnSearch);
	}
}
