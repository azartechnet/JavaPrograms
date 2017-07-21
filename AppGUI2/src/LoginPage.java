import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Asar\\Desktop\\images.jpg"));
		lblNewLabel.setBounds(10, 11, 234, 157);
		contentPane.add(lblNewLabel);
		
		JButton btnLoginPage = new JButton("LOGIN PAGE");
		btnLoginPage.setBounds(279, 34, 110, 23);
		contentPane.add(btnLoginPage);
		
		final JButton btnRegisterpage = new JButton("REGISTERPAGE");
		btnRegisterpage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				if(evt.getSource()==btnRegisterpage)
				{
					new RegisterPage().setVisible(true);
				}
				
			}
		});
		btnRegisterpage.setBounds(279, 88, 110, 23);
		contentPane.add(btnRegisterpage);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setBounds(279, 143, 110, 23);
		contentPane.add(btnSearch);
	}

}
