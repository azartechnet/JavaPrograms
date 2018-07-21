package a;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 450, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(26, 26, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(128, 23, 145, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(26, 97, 46, 14);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(128, 93, 52, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(202, 93, 59, 23);
		contentPane.add(rdbtnFemale);
		
		
		ButtonGroup bg=new ButtonGroup();
		
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		JLabel lblPayment = new JLabel("PayMent");
		lblPayment.setBounds(26, 175, 46, 14);
		contentPane.add(lblPayment);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"COD", "CC", "DC"}));
		comboBox.setBounds(128, 172, 114, 20);
		contentPane.add(comboBox);
		
		JLabel lblTiming = new JLabel("Timing");
		lblTiming.setBounds(26, 244, 46, 14);
		contentPane.add(lblTiming);
		
		JCheckBox chckbxamToam = new JCheckBox("10.00AM to 12.00AM");
		chckbxamToam.setBounds(128, 240, 145, 23);
		contentPane.add(chckbxamToam);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("1.00PM to 11.00PM");
		chckbxNewCheckBox.setBounds(130, 284, 131, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
			}
		});
		btnAdd.setBounds(153, 338, 89, 23);
		contentPane.add(btnAdd);
	}
}
