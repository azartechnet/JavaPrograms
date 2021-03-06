import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(165, 22, 89, 23);
		contentPane.add(label);
		
		JLabel lblRegisterform = new JLabel("RegisterForm");
		lblRegisterform.setBounds(165, 22, 46, 14);
		contentPane.add(lblRegisterform);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(26, 75, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(84, 72, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(26, 129, 46, 14);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(84, 125, 109, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(210, 125, 109, 23);
		contentPane.add(rdbtnFemale);
		
		ButtonGroup bg=new ButtonGroup();
		
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(26, 184, 46, 14);
		contentPane.add(lblCourse);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MCA", "MBA"}));
		comboBox.setBounds(98, 181, 81, 20);
		contentPane.add(comboBox);
		
		JLabel lblDepart = new JLabel("Depart");
		lblDepart.setBounds(26, 240, 46, 14);
		contentPane.add(lblDepart);
		
		JCheckBox chckbxUg = new JCheckBox("UG");
		chckbxUg.setBounds(96, 236, 97, 23);
		contentPane.add(chckbxUg);
		
		JCheckBox chckbxPg = new JCheckBox("PG");
		chckbxPg.setBounds(195, 236, 97, 23);
		contentPane.add(chckbxPg);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(104, 303, 89, 23);
		contentPane.add(btnSubmit);
	}
}
