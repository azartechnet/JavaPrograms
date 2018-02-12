import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ViewAlluserdetails extends JFrame {

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
					ViewAlluserdetails frame = new ViewAlluserdetails();
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
	public ViewAlluserdetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(26, 32, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(99, 29, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnViewall = new JButton("ViewAll");
		btnViewall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					 String uname=textField.getText();
    				//String str="select * from registeruser where uname='"+uname+"'";
				String str="select * from registeruser";
						Class.forName("org.h2.Driver");
						  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javadb","sa","");
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
		btnViewall.setBounds(293, 28, 89, 23);
		contentPane.add(btnViewall);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(26, 74, 398, 332);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Important code for view tables
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 381, 310);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
