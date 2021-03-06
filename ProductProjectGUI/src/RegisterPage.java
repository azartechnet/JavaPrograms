import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
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
		setBounds(100, 100, 450, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(59, 29, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(130, 26, 123, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(59, 91, 46, 14);
		contentPane.add(lblGender);
		
		final JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(131, 87, 52, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("female");
		rdbtnNewRadioButton.setBounds(201, 87, 66, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblDegree = new JLabel("Degree");
		lblDegree.setBounds(59, 154, 46, 14);
		contentPane.add(lblDegree);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MCA", "MBA", "BSC"}));
		comboBox.setBounds(130, 151, 123, 20);
		contentPane.add(comboBox);
		
		JLabel lblComplted = new JLabel("Complted");
		lblComplted.setBounds(59, 211, 46, 14);
		contentPane.add(lblComplted);
		
		final JCheckBox chckbxGraduated = new JCheckBox("Graduated");
		chckbxGraduated.setBounds(140, 207, 97, 23);
		contentPane.add(chckbxGraduated);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("NoGraduated");
		chckbxNewCheckBox.setBounds(256, 207, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		final JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String u=textField.getText();
					String gen="";
					String degree=(String)comboBox.getSelectedItem();
					String g="";
					String ng="";
					
					if(rdbtnMale.isSelected())
					{
						gen="male";
					}
					else
					{
						gen="female";
					}
					if(chckbxGraduated.isSelected())
					{
					   	g="G";
					   	ng="Null";
					}
					else if(chckbxNewCheckBox.isSelected())
					{
						g="Null";
					   	ng="NG";
					}
					else
					{
						g="G";
					   	ng="NG";
					}
						
				String str="insert into ureg values('"+u+"','"+gen+"','"+degree+"','"+g+"','"+ng+"')";	
				
			   Class.forName("org.h2.Driver");
			   
			   Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dglproject","sa","");
				
			   Statement stm=con.createStatement();
			   
			   
			   stm.executeUpdate(str);
			   
			   JOptionPane.showMessageDialog(btnRegister,"Inserted");
				}
				catch(Exception r)
				{
					System.out.println(""+r);
				}
			}
		});
		btnRegister.setBounds(148, 276, 89, 23);
		contentPane.add(btnRegister);
	}
}
