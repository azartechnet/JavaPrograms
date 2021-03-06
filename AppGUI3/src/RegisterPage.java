import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

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
		setBounds(100, 100, 450, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 11, 414, 423);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblUname.setBounds(10, 50, 46, 14);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(78, 47, 136, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblGender.setBounds(10, 111, 46, 14);
		panel.add(lblGender);
		
		final JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rdbtnMale.setBounds(77, 107, 109, 23);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rdbtnFemale.setBounds(226, 102, 109, 23);
		panel.add(rdbtnFemale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		
		JLabel lblCourse = new JLabel("Product");
		lblCourse.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCourse.setBounds(10, 190, 46, 14);
		panel.add(lblCourse);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SOAP", "BISCUT", "DRINKS"}));
		comboBox.setBounds(83, 187, 103, 20);
		panel.add(comboBox);
		
		JLabel lblDepart = new JLabel("Paid");
		lblDepart.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDepart.setBounds(10, 274, 46, 14);
		panel.add(lblDepart);
		
		final JCheckBox chckbxUg = new JCheckBox("CARD");
		chckbxUg.setFont(new Font("Times New Roman", Font.BOLD, 11));
		chckbxUg.setBounds(77, 270, 78, 23);
		panel.add(chckbxUg);
		
		final JCheckBox chckbxPg = new JCheckBox("CASH");
		chckbxPg.setFont(new Font("Times New Roman", Font.BOLD, 11));
		chckbxPg.setBounds(207, 270, 97, 23);
		panel.add(chckbxPg);
		
		final JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				
				try
				{
					String u=textField.getText();
					String gen="";
					String course=(String) comboBox.getSelectedItem();
					String ug="";
					String pg="";
					if(rdbtnMale.isSelected())
					{
						gen="MALE";
					}
					else
					{
						gen="FEMALE";
					}
					if(chckbxUg.isSelected()&&chckbxPg.isSelected())
					{
						ug="UG";
						pg="PG";
					}
					else if(chckbxUg.isSelected())
					{
						ug="UG";
						pg="NULL";
					}
					else
					{
						ug="NULL";
						pg="PG";
					}
					String str="insert into reg values(?,?,?,?,?)";
					//String str="insert into reg values('"+u+"','"+gen+"','"+course+"','"+ug+"','"+pg+"')";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:reg1");
					/*Statement stm=con.createStatement();
					stm.executeUpdate(str);
					
*/					PreparedStatement pt=con.prepareStatement(str);
                    pt.setString(1,u);
                    pt.setString(2,gen);
                    pt.setString(3, course);
                    pt.setString(4, ug);
                    pt.setString(5, pg);
                    pt.executeUpdate();
					JOptionPane.showMessageDialog(btnRegister,"Inserted!!!");
					
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnRegister.setBounds(63, 343, 123, 23);
		panel.add(btnRegister);
		
		JLabel lblCustomerdetails = new JLabel("CUSTOMERDETAILS");
		lblCustomerdetails.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCustomerdetails.setBounds(112, 11, 137, 25);
		panel.add(lblCustomerdetails);
		
		final JButton btnNewButton = new JButton("Add Products");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnNewButton)
				{
					new ViewDetailsPage().setVisible(true);;
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(207, 343, 116, 23);
		panel.add(btnNewButton);
	}
}
