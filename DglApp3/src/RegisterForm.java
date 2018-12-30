import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
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
		setBounds(100, 100, 450, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 11, 396, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRegisterForm = new JLabel("REGISTER FORM");
		lblRegisterForm.setBounds(130, 11, 115, 29);
		panel.add(lblRegisterForm);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setBounds(29, 58, 85, 23);
		panel.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(150, 55, 166, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setBounds(29, 134, 46, 14);
		panel.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("MALE");
		rdbtnMale.setBounds(122, 130, 76, 23);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("FEMALE");
		rdbtnFemale.setBounds(237, 130, 109, 23);
		panel.add(rdbtnFemale);
		
		ButtonGroup bg=new ButtonGroup();
		
		bg.add(rdbtnMale);
		
		bg.add(rdbtnFemale);
		
		JLabel lblCourse = new JLabel("COURSE");
		lblCourse.setBounds(29, 202, 46, 14);
		panel.add(lblCourse);
		
		JCheckBox chckbxUg = new JCheckBox("UG");
		chckbxUg.setBounds(125, 198, 97, 23);
		panel.add(chckbxUg);
		
		JCheckBox chckbxPg = new JCheckBox("PG");
		chckbxPg.setBounds(234, 198, 97, 23);
		panel.add(chckbxPg);
		
		JLabel lblDepart = new JLabel("DEPART");
		lblDepart.setBounds(29, 268, 46, 14);
		panel.add(lblDepart);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MCA", "MBA", "BE", "BSC"}));
		comboBox.setBounds(130, 265, 150, 29);
		panel.add(comboBox);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.setBounds(67, 315, 89, 23);
		panel.add(btnInsert);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(201, 315, 89, 23);
		panel.add(btnReset);
	}
}
