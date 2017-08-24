import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(25, 11, 399, 227);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHrsystem = new JLabel("HRSYSTEM");
		lblHrsystem.setBounds(128, 11, 81, 25);
		panel.add(lblHrsystem);
		
		final JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				if(evt.getSource()==btnLogin)
				{
					new LoginPage().setVisible(true);
				}
			}
		});
		btnLogin.setBounds(120, 67, 89, 23);
		panel.add(btnLogin);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setBounds(120, 124, 89, 23);
		panel.add(btnRegister);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setBounds(120, 193, 89, 23);
		panel.add(btnSearch);
	}
}
