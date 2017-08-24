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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUname = new JLabel("uname");
		lblUname.setBounds(34, 33, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(135, 30, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("gender");
		lblGender.setBounds(34, 86, 46, 14);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("male");
		rdbtnMale.setBounds(112, 82, 109, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setBounds(245, 82, 109, 23);
		contentPane.add(rdbtnFemale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		JLabel lblCheckbox = new JLabel("checkbox");
		lblCheckbox.setBounds(34, 150, 46, 14);
		contentPane.add(lblCheckbox);
		
		JCheckBox chckbxUg = new JCheckBox("ug");
		chckbxUg.setBounds(113, 146, 97, 23);
		contentPane.add(chckbxUg);
		
		JCheckBox chckbxPg = new JCheckBox("pg");
		chckbxPg.setBounds(212, 146, 97, 23);
		contentPane.add(chckbxPg);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"mca", "be", "mba"}));
		comboBox.setBounds(135, 192, 86, 20);
		contentPane.add(comboBox);
	}
}
