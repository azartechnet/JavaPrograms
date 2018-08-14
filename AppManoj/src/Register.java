import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setBounds(170, 21, 46, 14);
		contentPane.add(lblRegister);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(38, 79, 46, 14);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(130, 76, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMobileno = new JLabel("MobileNo");
		lblMobileno.setBounds(38, 146, 46, 14);
		contentPane.add(lblMobileno);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 143, 143, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(38, 227, 46, 14);
		contentPane.add(lblGender);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 224, 143, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(38, 294, 81, 14);
		contentPane.add(lblDepartment);
		
		JCheckBox chckbxUg = new JCheckBox("UG");
		chckbxUg.setBounds(138, 290, 97, 23);
		contentPane.add(chckbxUg);
		
		JCheckBox chckbxPg = new JCheckBox("PG");
		chckbxPg.setBounds(252, 290, 97, 23);
		contentPane.add(chckbxPg);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setBounds(166, 370, 89, 23);
		contentPane.add(btnRegister);
	}
}
