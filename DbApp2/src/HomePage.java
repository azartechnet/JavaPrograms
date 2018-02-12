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
		setBounds(100, 100, 450, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 22, 378, 297);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHrsystem = new JLabel("HRSYSTEM");
		lblHrsystem.setBounds(151, 11, 94, 21);
		panel.add(lblHrsystem);
		
		final JButton btnUlogin = new JButton("ULOGIN");
		btnUlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				if(evt.getSource()==btnUlogin)
				{
				   new LoginPage().setVisible(true);	
				}
			}
		});
		btnUlogin.setBounds(132, 43, 89, 23);
		panel.add(btnUlogin);
		
		JButton btnAdminlogin = new JButton("ADMINLOGIN");
		btnAdminlogin.setBounds(132, 95, 89, 23);
		panel.add(btnAdminlogin);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setBounds(132, 155, 89, 23);
		panel.add(btnRegister);
	}
}
