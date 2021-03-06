package com.niit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
		setBounds(100, 100, 450, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegisterform = new JLabel("RegisterForm");
		lblRegisterform.setBounds(170, 29, 87, 24);
		contentPane.add(lblRegisterform);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(23, 71, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(92, 64, 152, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(23, 128, 46, 14);
		contentPane.add(lblGender);
		
		final JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(97, 124, 75, 23);
		contentPane.add(rdbtnMale);
		
		final JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(202, 124, 109, 23);
		contentPane.add(rdbtnFemale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		JLabel lblPay = new JLabel("Pay");
		lblPay.setBounds(23, 192, 46, 14);
		contentPane.add(lblPay);
		
		final JCheckBox chckbxCc = new JCheckBox("CC");
		chckbxCc.setBounds(97, 188, 97, 23);
		contentPane.add(chckbxCc);
		
		final JCheckBox chckbxDc = new JCheckBox("DC");
		chckbxDc.setBounds(214, 188, 97, 23);
		contentPane.add(chckbxDc);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(23, 261, 46, 14);
		contentPane.add(lblCity);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Karur", "Dindigul", "Salem"}));
		comboBox.setBounds(97, 258, 97, 20);
		contentPane.add(comboBox);
		
		final JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			
								
				
				
				try
				{
					String uname=textField.getText();
					
					String gen="";
					
					String pay1="";
					
					String pay2="";
					
					String city=(String) comboBox.getSelectedItem();
					
					if(rdbtnMale.isSelected())
					{
						gen="MALE";
					}
					else
					{
						gen="FEMALE";
					}
					
					if(chckbxDc.isSelected()&&chckbxCc.isSelected())
					{
						pay1="DC";
						pay2="CC";
					}
					else if(chckbxDc.isSelected())
					{
						pay1="DC";
						pay2="null";
					}
					else if(chckbxCc.isSelected())
					{
						pay1="null";
						pay2="CC";
					}

					String str="insert into reg values('"+uname+"','"+gen+"','"+pay1+"','"+pay2+"','"+city+"')";
				
					Class.forName("org.h2.Driver");
					
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dgldb","sa","");
					
					Statement stm=conn.createStatement();
					
					stm.executeUpdate(str);
					
					JOptionPane.showMessageDialog(btnInsert, "Inserted...");
					
					
					
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnInsert.setBounds(83, 325, 89, 23);
		contentPane.add(btnInsert);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				textField.setText("");
			
			}
		});
		btnReset.setBounds(232, 325, 89, 23);
		contentPane.add(btnReset);
		
		final JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==btnBack)
				{
					new HomePage().setVisible(true);
										
				}
			}
		});
		btnBack.setBounds(319, 385, 89, 23);
		contentPane.add(btnBack);
	}
}
