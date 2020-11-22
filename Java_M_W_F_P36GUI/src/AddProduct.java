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
		setBounds(100, 100, 450, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddproduct = new JLabel("AddProduct");
		lblAddproduct.setBounds(170, 25, 85, 22);
		contentPane.add(lblAddproduct);
		
		JLabel lblProductid = new JLabel("Productid");
		lblProductid.setBounds(28, 75, 46, 14);
		contentPane.add(lblProductid);
		
		textField = new JTextField();
		textField.setBounds(147, 72, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPname = new JLabel("Pname");
		lblPname.setBounds(28, 135, 46, 14);
		contentPane.add(lblPname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 132, 128, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAddproduct = new JButton("AddProduct");
		btnAddproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				try
				{
					String pid=textField.getText();
					String pname=textField_1.getText();
					String price=textField_2.getText();
					
					String str1="insert into product values('"+pid+"','"+pname+"','"+price+"')";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/karurjava","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnAddproduct, "Inserted..");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnAddproduct.setBounds(108, 282, 89, 23);
		contentPane.add(btnAddproduct);
		
		JLabel lblProductprice = new JLabel("ProductPrice");
		lblProductprice.setBounds(28, 196, 75, 14);
		contentPane.add(lblProductprice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(147, 193, 128, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String pid=textField.getText();
					
					String str="select productname,price from product where productid='"+pid+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/karurjava","sa","");
					Statement stmt=conn.createStatement();
					
					ResultSet rs=stmt.executeQuery(str);
					
					rs.next();
					
					String productname=rs.getString(1);
					String price=rs.getString(2);
					
					textField_1.setText(productname);
					textField_2.setText(price);
					
					JOptionPane.showMessageDialog(btnSearch,"SearchSucss..");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnSearch.setBounds(245, 282, 89, 23);
		contentPane.add(btnSearch);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String pid=textField.getText();
					String pname=textField_1.getText();
					
					String str="update product set productname='"+pname+"' where productid='"+pid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/karurjava","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str);
					JOptionPane.showMessageDialog(btnUpdate, "Updated..");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnUpdate.setBounds(314, 212, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String pid=textField.getText();
					
					String str="delete  from product where productid='"+pid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/karurjava","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str);
					JOptionPane.showMessageDialog(btnDelete, "DeletedData..");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnDelete.setBounds(314, 150, 89, 23);
		contentPane.add(btnDelete);
	}
}
