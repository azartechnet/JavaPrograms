package krrafternoonswing;

import java.awt.BorderLayout;

import java.sql.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		setBounds(100, 100, 450, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegisterPage = new JLabel("Register page");
		lblRegisterPage.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblRegisterPage.setBounds(140, 28, 134, 27);
		contentPane.add(lblRegisterPage);
		
		textField = new JTextField();
		textField.setBounds(118, 83, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 132, 160, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(28, 177, 44, 38);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(118, 188, 160, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPhoneno = new JLabel("Phone ");
		lblPhoneno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhoneno.setBounds(28, 226, 73, 34);
		contentPane.add(lblPhoneno);
		
		textField_3 = new JTextField();
		textField_3.setBounds(118, 235, 160, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		final JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String t1=textField.getText();
					
					String t2=textField_1.getText();
					
					String t3=textField_2.getText();
					
					String t4=textField_3.getText();
					
					
					String str1="insert into user values('"+t1+"','"+t2+"','"+t3+"','"+t4+"')";
					
					Class.forName("org.h2.Driver");
					
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
					
					Statement stm=conn.createStatement();
					
					stm.executeUpdate(str1);
					
					JOptionPane.showMessageDialog(btnDone, "Inserted");
				}
				catch(Exception n)
				{
					
				}
			}
			
		});
		btnDone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDone.setBounds(140, 313, 89, 23);
		contentPane.add(btnDone);
		
		JLabel lblNewLabel = new JLabel("Name\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(26, 83, 44, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblRollno = new JLabel("RollNo");
		lblRollno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRollno.setBounds(26, 133, 46, 14);
		contentPane.add(lblRollno);
	}
}
