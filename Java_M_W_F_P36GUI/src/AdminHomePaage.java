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

public class AdminHomePaage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomePaage frame = new AdminHomePaage();
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
	public AdminHomePaage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminhomepage = new JLabel("AdminHomePage");
		lblAdminhomepage.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdminhomepage.setBounds(160, 26, 102, 21);
		contentPane.add(lblAdminhomepage);
		
		JButton btnAddproduct = new JButton("AddProduct");
		btnAddproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				new AddProduct().setVisible(true);
			}
		});
		btnAddproduct.setBounds(160, 140, 102, 31);
		contentPane.add(btnAddproduct);
	}

}
