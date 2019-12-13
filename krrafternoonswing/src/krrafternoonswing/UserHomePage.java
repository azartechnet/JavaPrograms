package krrafternoonswing;

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
		setBounds(100, 100, 450, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserhomepage = new JLabel("UserHomePage");
		lblUserhomepage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUserhomepage.setBounds(164, 11, 109, 33);
		contentPane.add(lblUserhomepage);
		
		JButton btnAddproduct = new JButton("AddProduct");
		btnAddproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddproduct.setBounds(170, 81, 103, 23);
		contentPane.add(btnAddproduct);
		
		JButton btnAddcategory = new JButton("AddCategory");
		btnAddcategory.setBounds(170, 170, 103, 23);
		contentPane.add(btnAddcategory);
		
		JButton btnNewButton = new JButton("ViewProduct");
		btnNewButton.setBounds(170, 272, 103, 23);
		contentPane.add(btnNewButton);
	}

}
