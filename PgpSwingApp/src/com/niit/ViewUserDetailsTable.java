package com.niit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

public class ViewUserDetailsTable extends JFrame {

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
					ViewUserDetailsTable frame = new ViewUserDetailsTable();
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
	public ViewUserDetailsTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(47, 30, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(121, 27, 149, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		final JButton btnViewmydetails = new JButton("ViewMyDetails");
		btnViewmydetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{try
			{
				String u=textField.getText();
				String qstr1="select*from ureg where uname='"+u+"'";
				Class.forName("org.h2.Driver");
				Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/pgpproject","sa","");
				Statement stm=conn.createStatement();
				ResultSet rs=stm.executeQuery(qstr1);
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
				
				
				
				JOptionPane.showMessageDialog(btnViewmydetails,"SearchSucess!!");
			}
			catch(Exception t)
			{
				
			}
			}
		});
		btnViewmydetails.setBounds(310, 26, 114, 23);
		contentPane.add(btnViewmydetails);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 68, 351, 169);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//important code
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 57, 385, 193);
				contentPane.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
				
	}
}
