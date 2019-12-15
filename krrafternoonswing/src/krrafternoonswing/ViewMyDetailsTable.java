package krrafternoonswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ViewMyDetailsTable extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	//Important code
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMyDetailsTable frame = new ViewMyDetailsTable();
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
	public ViewMyDetailsTable() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblViewmydetails = new JLabel("ViewMyDetails");
		lblViewmydetails.setBounds(154, 11, 119, 28);
		contentPane.add(lblViewmydetails);
		
		textField = new JTextField();
		textField.setBounds(70, 62, 129, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("ClickHere");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					 String pname=textField.getText();
    				 String str="select * from addproduct";
				      // String str="select * from addproduct  where pname='"+pname+"'";
						Class.forName("org.h2.Driver");
						  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
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
		btnNewButton.setBounds(250, 60, 89, 28);
		contentPane.add(btnNewButton);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(41, 144, 372, 259);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Remove older code to paste new code
		//Important code for view tables
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 352, 237);
		panel.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
	
	}
}
