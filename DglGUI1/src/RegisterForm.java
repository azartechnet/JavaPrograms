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
		setBounds(100, 100, 450, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 21, 381, 299);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(22, 35, 46, 14);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(138, 32, 139, 17);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(22, 96, 46, 14);
		panel.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(115, 92, 68, 23);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(182, 92, 109, 23);
		panel.add(rdbtnFemale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(22, 155, 46, 14);
		panel.add(lblCourse);
		
		JCheckBox chckbxUg = new JCheckBox("ug");
		chckbxUg.setBounds(126, 151, 59, 23);
		panel.add(chckbxUg);
		
		JCheckBox chckbxPg = new JCheckBox("pg");
		chckbxPg.setBounds(194, 151, 97, 23);
		panel.add(chckbxPg);
		
		JLabel lblDepart = new JLabel("depart");
		lblDepart.setBounds(22, 208, 46, 14);
		panel.add(lblDepart);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"mca", "mba", "be"}));
		comboBox.setBounds(127, 205, 97, 20);
		panel.add(comboBox);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(62, 252, 89, 23);
		panel.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(188, 252, 89, 23);
		panel.add(btnReset);
	}
}
