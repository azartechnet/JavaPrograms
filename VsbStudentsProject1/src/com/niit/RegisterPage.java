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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setBounds(100, 100, 450, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegisterpage = new JLabel("RegisterPage");
		lblRegisterpage.setBounds(173, 21, 93, 19);
		contentPane.add(lblRegisterpage);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(10, 67, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(82, 64, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(10, 144, 46, 14);
		contentPane.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(82, 141, 143, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 229, 46, 14);
		contentPane.add(lblAddress);
		
		textField_2 = new JTextField();
		textField_2.setBounds(82, 226, 143, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 298, 46, 14);
		contentPane.add(lblGender);
		
		final JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(82, 294, 64, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(159, 294, 72, 23);
		contentPane.add(rdbtnFemale);
		
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		
		final JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					String u=textField.getText();
					String p=textField_1.getText();
					String addr=textField_2.getText();
					String gen="";
					
					if(rdbtnMale.isSelected())
					{
						gen="MALE";
					}
					else
					{
						gen="FEMALE";
					}
					
					String str="insert into ureg values(?,?,?,?)";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/vsbjava","sa","");
					PreparedStatement pt=conn.prepareStatement(str);
					pt.setString(1,u);
					pt.setString(2, p);
					pt.setString(3, addr);
					pt.setString(4, gen);
					pt.executeUpdate();
					JOptionPane.showMessageDialog(btnRegister, "RegisterAddSucess!!");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnRegister.setBounds(82, 348, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnViewmydetails = new JButton("ViewMyDetails");
		btnViewmydetails.setBounds(197, 348, 116, 23);
		contentPane.add(btnViewmydetails);
	}
}
