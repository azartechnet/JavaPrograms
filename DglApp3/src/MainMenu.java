import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(31, 26, 374, 267);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAdminlogin = new JButton("ADMINLOGIN");
		btnAdminlogin.setBounds(127, 39, 124, 29);
		panel.add(btnAdminlogin);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setBounds(127, 109, 124, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VIEWDETAILS");
		btnNewButton_1.setBounds(127, 191, 124, 29);
		panel.add(btnNewButton_1);
	}
}
