import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 450, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 414, 297);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRegisterform = new JLabel("RegisterForm");
		lblRegisterform.setBounds(175, 6, 64, 14);
		panel.add(lblRegisterform);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(36, 50, 64, 14);
		panel.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(136, 47, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		final JRadioButton rdbtnMale = new JRadioButton("male");
		rdbtnMale.setBounds(143, 100, 79, 23);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(232, 100, 79, 23);
		panel.add(rdbtnFemale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		final JCheckBox chckbxUg = new JCheckBox("UG");
		chckbxUg.setBounds(142, 155, 79, 23);
		panel.add(chckbxUg);
		
		final JCheckBox chckbxPg = new JCheckBox("PG");
		chckbxPg.setBounds(234, 155, 70, 23);
		panel.add(chckbxPg);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MCA", "BE", "BTECH"}));
		comboBox.setBounds(143, 202, 79, 20);
		panel.add(comboBox);
		
		final JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
				String u=textField.getText();
				String gen="";
				String check1="";
				String check2="";
				String dept=(String) comboBox.getSelectedItem();
				
				if(rdbtnMale.isSelected())
				{
					gen="Male";
				}
				else
				{
					gen="female";
				}
				if(chckbxUg.isSelected())
				{
					check1="UG";
					check2="null";
				}
				else if(chckbxPg.isSelected())
				{
					check1="null";
					check2="PG";
				}
				else
				{
					check1="UG";
					check2="PG";
				}
				String str="insert into utable values('"+u+"','"+gen+"','"+check1+"','"+check2+"','"+dept+"')";
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection conn=DriverManager.getConnection("jdbc:odbc:demo1");
				Statement stm=conn.createStatement();
				stm.executeUpdate(str);
				JOptionPane.showMessageDialog(btnRegister, "Inserted!!!");
			}
			
			catch(Exception g)
			{
				System.out.println(g);
			}
			}
		});
		btnRegister.setBounds(133, 245, 89, 23);
		panel.add(btnRegister);
	}
}
