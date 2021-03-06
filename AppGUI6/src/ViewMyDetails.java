import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ViewMyDetails extends JFrame {

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
		setBounds(100, 100, 450, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 30, 414, 371);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(26, 34, 46, 14);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(88, 31, 162, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(26, 115, 46, 14);
		panel.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 112, 162, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(26, 210, 46, 14);
		panel.add(lblMobile);
		
		textField_2 = new JTextField();
		textField_2.setBounds(88, 207, 162, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnViewdata = new JButton("ViewData");
		btnViewdata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String uname=textField.getText();
					String str="select pass,mobile from ureg where uname='"+uname+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dgl","sa","");
					Statement stm=conn.createStatement();
					ResultSet rs=stm.executeQuery(str);
					rs.next();
					textField_1.setText(rs.getString(1).trim());
					textField_2.setText(rs.getString(2).trim());
					//textField_3.setText(rs.getString(3).trim());
					JOptionPane.showMessageDialog(btnViewdata, "Searching...");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnViewdata.setBounds(53, 294, 89, 23);
		panel.add(btnViewdata);
		
		final JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String uname=textField.getText();
					
					String mobile=textField_2.getText();
					String str="update ureg set mobile='"+mobile+"' where uname='"+uname+"'";
					Class.forName("org.h2.Driver");
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dgl","sa","");
					  Statement stm=con.createStatement();
					  stm.executeUpdate(str);
					  JOptionPane.showMessageDialog(btnUpdate, "UpdateSucess!!!");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnUpdate.setBounds(189, 294, 89, 23);
		panel.add(btnUpdate);
		
		final JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String uname=textField.getText();
					String str="delete from ureg where uname='"+uname+"'";
					Class.forName("org.h2.Driver");
					  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dgl","sa","");
					  Statement stm=con.createStatement();
					  stm.executeUpdate(str);
					  JOptionPane.showMessageDialog(btnDelete, "deleted..");
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnDelete.setBounds(315, 294, 89, 23);
		panel.add(btnDelete);
	}

}
