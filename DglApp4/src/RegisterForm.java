import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class RegisterForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
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
	public RegisterForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 21, 377, 333);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(22, 36, 46, 14);
		panel.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(103, 33, 173, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(22, 108, 46, 14);
		panel.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(103, 104, 66, 23);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(197, 104, 74, 23);
		panel.add(rdbtnFemale);
		
		JLabel lblDept = new JLabel("Course");
		lblDept.setBounds(22, 175, 46, 14);
		panel.add(lblDept);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MSC", "MBA", "BE"}));
		comboBox.setBounds(103, 166, 173, 32);
		panel.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Dept");
		lblNewLabel.setBounds(22, 242, 46, 14);
		panel.add(lblNewLabel);
		
		JCheckBox chckbxUg = new JCheckBox("UG");
		chckbxUg.setBounds(106, 238, 74, 23);
		panel.add(chckbxUg);
		
		JCheckBox chckbxPg = new JCheckBox("PG");
		chckbxPg.setBounds(198, 238, 97, 23);
		panel.add(chckbxPg);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(123, 286, 89, 23);
		panel.add(btnRegister);
	}
}
