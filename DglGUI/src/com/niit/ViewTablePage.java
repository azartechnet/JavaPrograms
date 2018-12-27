package com.niit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ViewTablePage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTablePage frame = new ViewTablePage();
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
	public ViewTablePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnViewfulldetails = new JButton("ViewFullDetails");
		btnViewfulldetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String u=textField.getText();
				
				String str="select * from reg where uname='"+u+"'" ;
				try
				{
				Class.forName("org.h2.Driver");
			     Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dgldb","sa","");
				Statement stm=con.createStatement();
				ResultSet rs=stm.executeQuery(str);
				table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnViewfulldetails.setBounds(274, 27, 123, 30);
		contentPane.add(btnViewfulldetails);
		
		
		//Important code for view tables
		JPanel panel = new JPanel();
		panel.setBounds(20, 77, 404, 319);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 11, 384, 297);
				panel.add(scrollPane);
		
				table = new JTable();
				scrollPane.setViewportView(table);
				
				textField = new JTextField();
				textField.setBounds(65, 27, 157, 30);
				contentPane.add(textField);
				textField.setColumns(10);
		
		
	}
}
