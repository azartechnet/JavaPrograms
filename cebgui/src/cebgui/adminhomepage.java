package cebgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminhomepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminhomepage frame = new adminhomepage();
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
	public adminhomepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JButton btnViewAllUser = new JButton("view all user details");
		btnViewAllUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnViewAllUser)
				{
					new viewTabledetails().setVisible(true);
				}
			}
		});
		btnViewAllUser.setBounds(118, 41, 158, 23);
		contentPane.add(btnViewAllUser);
		
		JButton btnViewUserDetails = new JButton("view user details");
		btnViewUserDetails.setBounds(118, 99, 158, 23);
		contentPane.add(btnViewUserDetails);
		
		final JButton btnAddEmployee = new JButton("add employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnAddEmployee)
				{
					new RegistrationForm().setVisible(true);
				}
			}
		});
		btnAddEmployee.setBounds(118, 155, 158, 23);
		contentPane.add(btnAddEmployee);
		
		final JButton btnDeleteEmployee = new JButton("delete employee");
		btnDeleteEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnDeleteEmployee)
				{
					new deletepage().setVisible(true);
				}
			}
		});
		btnDeleteEmployee.setBounds(118, 206, 158, 23);
		contentPane.add(btnDeleteEmployee);
	}

}
