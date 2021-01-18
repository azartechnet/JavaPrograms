import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 450, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminhomepage = new JLabel("AdminHomePage");
		lblAdminhomepage.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdminhomepage.setBounds(143, 24, 110, 22);
		contentPane.add(lblAdminhomepage);
		
		JButton btnAddproduct = new JButton("AddProduct");
		btnAddproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				new AddProduct().setVisible(true);
			}
		});
		btnAddproduct.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddproduct.setBounds(143, 98, 110, 23);
		contentPane.add(btnAddproduct);
		
		JButton btnViewproduct = new JButton("ViewProduct");
		btnViewproduct.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnViewproduct.setBounds(143, 183, 110, 23);
		contentPane.add(btnViewproduct);
		
		JButton btnAddemployee = new JButton("AddEmployee");
		btnAddemployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				new AddEmployee().setVisible(true);
			}
		});
		btnAddemployee.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddemployee.setBounds(143, 259, 110, 23);
		contentPane.add(btnAddemployee);
	}

}
