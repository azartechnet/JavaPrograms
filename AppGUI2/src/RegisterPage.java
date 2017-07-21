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
		setBounds(100, 100, 450, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUname = new JLabel("UNAME");
		lblUname.setBounds(35, 51, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(122, 48, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setBounds(35, 115, 46, 14);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("MALE");
		rdbtnMale.setBounds(120, 111, 64, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("FEMALE");
		rdbtnFemale.setBounds(206, 111, 64, 23);
		contentPane.add(rdbtnFemale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		JLabel lblCources = new JLabel("COURCES");
		lblCources.setBounds(35, 184, 46, 14);
		contentPane.add(lblCources);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MCA", "BE", "BTECH"}));
		comboBox.setBounds(122, 181, 86, 20);
		contentPane.add(comboBox);
		
		JLabel lblDepart = new JLabel("DEPART");
		lblDepart.setBounds(35, 242, 46, 14);
		contentPane.add(lblDepart);
		
		JCheckBox chckbxUg = new JCheckBox("UG");
		chckbxUg.setBounds(122, 238, 64, 23);
		contentPane.add(chckbxUg);
		
		JCheckBox chckbxPg = new JCheckBox("PG");
		chckbxPg.setBounds(213, 238, 97, 23);
		contentPane.add(chckbxPg);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setBounds(95, 301, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(242, 301, 89, 23);
		contentPane.add(btnReset);
	}
}
