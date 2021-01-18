import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddProduct extends JFrame {

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
					AddProduct frame = new AddProduct();
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
	public AddProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddproduct = new JLabel("AddProduct");
		lblAddproduct.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddproduct.setBounds(174, 33, 95, 21);
		contentPane.add(lblAddproduct);
		
		JLabel lblProductid = new JLabel("ProductId");
		lblProductid.setBounds(48, 87, 72, 14);
		contentPane.add(lblProductid);
		
		textField = new JTextField();
		textField.setBounds(174, 84, 107, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblProductname = new JLabel("ProductName");
		lblProductname.setBounds(51, 146, 69, 14);
		contentPane.add(lblProductname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 143, 107, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(48, 205, 46, 14);
		contentPane.add(lblPrice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(174, 202, 107, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAddproduct = new JButton("AddProduct");
		btnAddproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
				    int pid=Integer.parseInt(textField.getText());
				    String pname=textField_1.getText();
				    int pprice=Integer.parseInt(textField_2.getText());
				    
				    String str="insert into addproduct values('"+pid+"','"+pname+"','"+pprice+"')";
                     Class.forName("org.h2.Driver");
					
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sjava","sa","");
					
					Statement stmt=conn.createStatement();
					
					stmt.executeUpdate(str);
					
					JOptionPane.showMessageDialog(btnAddproduct,"Inserted..");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnAddproduct.setBounds(96, 290, 89, 23);
		contentPane.add(btnAddproduct);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnReset.setBounds(246, 290, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					int pid=Integer.parseInt(textField.getText());
					
					String str1="select * from addproduct where pid='"+pid+"'";
                       
					Class.forName("org.h2.Driver");
					
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sjava","sa","");
					
					Statement stmt=conn.createStatement();
					
					ResultSet rs=stmt.executeQuery(str1);
					
					rs.next();
					
					String pname=rs.getString(2);
					String pprice=rs.getString(3);
					
					textField_1.setText(pname);
					
					textField_2.setText(pprice);
					
					JOptionPane.showMessageDialog(btnSearch, "Searching..");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnSearch.setBounds(319, 201, 89, 23);
		contentPane.add(btnSearch);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					int pid=Integer.parseInt(textField.getText());
					String pname=textField_1.getText();
					int pprice=Integer.parseInt(textField_2.getText());
					String str1="update addproduct set pname='"+pname+"',pprice='"+pprice+"' where pid='"+pid+"'";
					
					Class.forName("org.h2.Driver");
					
                    Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sjava","sa","");
					
					Statement stmt=conn.createStatement();
					
					stmt.executeUpdate(str1);
					
					JOptionPane.showMessageDialog(btnUpdate,"updated....");
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			}
		});
		btnUpdate.setBounds(319, 131, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					int pid=Integer.parseInt(textField.getText());
					
					String str1="delete  from addproduct where pid='"+pid+"'";
					
                     Class.forName("org.h2.Driver");
					
                    Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sjava","sa","");
					
					Statement stmt=conn.createStatement();
					
					stmt.executeUpdate(str1);
					
					JOptionPane.showMessageDialog(btnDelete,"Deleted......");
					
					
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnDelete.setBounds(319, 72, 89, 23);
		contentPane.add(btnDelete);
	}

}
