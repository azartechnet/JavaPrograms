import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class AdminHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomePage frame = new AdminHomePage();
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
	public AdminHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminhomepage = new JLabel("AdminHomePage");
		lblAdminhomepage.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblAdminhomepage.setBounds(156, 25, 145, 21);
		contentPane.add(lblAdminhomepage);
		
		JButton btnAddstaff = new JButton("AddStaff");
		btnAddstaff.setBounds(169, 73, 89, 23);
		contentPane.add(btnAddstaff);
	}
}
