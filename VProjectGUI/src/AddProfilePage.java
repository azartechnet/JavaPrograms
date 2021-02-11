import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddProfilePage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProfilePage frame = new AddProfilePage();
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
	public AddProfilePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddprofilepage = new JLabel("AddProfilePage");
		lblAddprofilepage.setBounds(164, 28, 80, 14);
		contentPane.add(lblAddprofilepage);
		
		JLabel lblYourname = new JLabel("YourName");
		lblYourname.setBounds(39, 81, 70, 14);
		contentPane.add(lblYourname);
		
		textField = new JTextField();
		textField.setBounds(164, 78, 111, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMailid = new JLabel("MailId");
		lblMailid.setBounds(39, 140, 46, 14);
		contentPane.add(lblMailid);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 137, 111, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAdddetails = new JButton("AddDetails");
		btnAdddetails.setBounds(104, 213, 89, 23);
		contentPane.add(btnAdddetails);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(255, 213, 89, 23);
		contentPane.add(btnReset);
	}
}
