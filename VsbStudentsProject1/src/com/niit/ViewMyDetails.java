package com.niit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ViewMyDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMyDetails frame = new ViewMyDetails();
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
	public ViewMyDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblViewmydetails = new JLabel("ViewMyDetails");
		lblViewmydetails.setBounds(174, 11, 90, 14);
		contentPane.add(lblViewmydetails);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(10, 52, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(80, 49, 153, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnViewmydetails = new JButton("ViewMyDetails");
		btnViewmydetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					 String uname=textField.getText();
    				//String str="select * from ureg where uname='"+uname+"'";
				       String str="select * from ureg  where uname='"+uname+"'";
						Class.forName("org.h2.Driver");
						  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/vsbjava","sa","");
						Statement stm=con.createStatement();
						ResultSet rs=stm.executeQuery(str);
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
						//table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception t)
				{
					System.out.println("***"+t);
				}
			}
		});
		btnViewmydetails.setBounds(282, 48, 111, 23);
		contentPane.add(btnViewmydetails);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 77, 404, 292);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Important code for view tables
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 11, 384, 270);
				panel.add(scrollPane);
		
				table = new JTable();
				scrollPane.setViewportView(table);
	}
}
