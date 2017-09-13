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
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
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
		
		final JRadioButton rdbtnMale = new JRadioButton("male");
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
		
		final JCheckBox chckbxUg = new JCheckBox("ug");
		chckbxUg.setBounds(113, 146, 97, 23);
		contentPane.add(chckbxUg);
		
		final JCheckBox chckbxPg = new JCheckBox("pg");
		chckbxPg.setBounds(212, 146, 97, 23);
		contentPane.add(chckbxPg);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"mca", "be", "mba"}));
		comboBox.setBounds(135, 192, 86, 20);
		contentPane.add(comboBox);
		
		final JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				if(evt.getSource()==btnInsert)
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
						//String str="insert into utable values(?,?,?,?,?)";
						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
						Connection conn=DriverManager.getConnection("jdbc:odbc:demo1");
						Statement stm=conn.createStatement();
						//PreparedStatement pt=conn.prepareStatement(str);
						stm.executeUpdate(str);
					}
					catch(Exception g)
					{
						System.out.println(g);
					}
				}
			}
		});
		btnInsert.setBounds(112, 223, 89, 23);
		contentPane.add(btnInsert);
	}
}
