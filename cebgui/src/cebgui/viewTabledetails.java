package cebgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class viewTabledetails extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JButton btnDeleteuser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewTabledetails frame = new viewTabledetails();
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
	public viewTabledetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//important code
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 81, 414, 238);
				contentPane.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
				
				JButton btnViewdetails = new JButton("ViewDetails");
				btnViewdetails.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							String u=textField.getText();
							
							String str="select * from regpage where name='"+u+"'";
							
							Class.forName("org.h2.Driver");
							Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/cebdb","sa","");
							Statement stm=conn.createStatement();
							ResultSet rs=stm.executeQuery(str);
							table.setModel(DbUtils.resultSetToTableModel(rs));
							
						}
						catch(Exception t)
						{
							System.out.println(t);
						}
					}
				});
				btnViewdetails.setBounds(209, 11, 89, 23);
				contentPane.add(btnViewdetails);
				
				textField = new JTextField();
				textField.setBounds(35, 33, 135, 20);
				contentPane.add(textField);
				textField.setColumns(10);
				
				btnDeleteuser = new JButton("DeleteUser");
				btnDeleteuser.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						try
						{
							String u1=textField.getText();
							
							String str1="delete  from regpage where name='"+u1+"'";
							
							Class.forName("org.h2.Driver");
							Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/cebdb","sa","");
							Statement stm=conn.createStatement();
							
							stm.executeUpdate(str1);
							
							JOptionPane.showMessageDialog(btnDeleteuser, "Userdeleted");
						}
						catch(Exception t)
						{
							System.out.println(t);
						}
					}
				});
				btnDeleteuser.setBounds(209, 47, 89, 23);
				contentPane.add(btnDeleteuser);
	}
}
