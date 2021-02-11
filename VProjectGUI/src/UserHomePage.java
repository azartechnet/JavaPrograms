import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserHomePage frame = new UserHomePage();
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
	public UserHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserhomepage = new JLabel("UserHomePage");
		lblUserhomepage.setBounds(176, 25, 78, 14);
		contentPane.add(lblUserhomepage);
		
		JButton btnAddprofile = new JButton("AddProfile");
		btnAddprofile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				new AddProfilePage().setVisible(true);
			}
		});
		btnAddprofile.setBounds(165, 109, 89, 23);
		contentPane.add(btnAddprofile);
	}
}
