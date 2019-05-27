import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

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
		
		final JButton btnAdminlogin = new JButton("AdminLogin");
		btnAdminlogin.setForeground(Color.RED);
		btnAdminlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnAdminlogin)
				{
					new AdminLoginPage().setVisible(true);
				}
			}
		});
		btnAdminlogin.setBounds(144, 30, 184, 23);
		panel.add(btnAdminlogin);
		
		JButton btnAddstaff = new JButton("AddStaff");
		btnAddstaff.setBounds(144, 82, 184, 23);
		panel.add(btnAddstaff);
		
		JButton btnStafflogin = new JButton("StaffLogin");
		btnStafflogin.setBounds(144, 142, 184, 23);
		panel.add(btnStafflogin);
		
	
	}
}
