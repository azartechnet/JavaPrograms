package a;

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
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class registerpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registerpage frame = new registerpage();
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
	public registerpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(35, 51, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(137, 48, 152, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(35, 130, 46, 14);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("male");
		rdbtnMale.setBounds(110, 126, 65, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setBounds(242, 126, 109, 23);
		contentPane.add(rdbtnFemale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		JCheckBox chckbxUg = new JCheckBox("UG");
		chckbxUg.setBounds(110, 186, 97, 23);
		contentPane.add(chckbxUg);
		
		JCheckBox chckbxPg = new JCheckBox("PG");
		chckbxPg.setBounds(215, 186, 97, 23);
		contentPane.add(chckbxPg);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MCA", "MBA"}));
		comboBox.setBounds(148, 240, 97, 20);
		contentPane.add(comboBox);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(125, 314, 89, 23);
		contentPane.add(btnRegister);
	}
}
