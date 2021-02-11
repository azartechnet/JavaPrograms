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

public class AddProductPage extends JFrame {

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
					AddProductPage frame = new AddProductPage();
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
	public AddProductPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddproductpage = new JLabel("AddProductPage");
		lblAddproductpage.setBounds(181, 34, 85, 14);
		contentPane.add(lblAddproductpage);
		
		JLabel lblPid = new JLabel("PID");
		lblPid.setBounds(42, 81, 46, 14);
		contentPane.add(lblPid);
		
		textField = new JTextField();
		textField.setBounds(139, 78, 127, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPname = new JLabel("PNAME");
		lblPname.setBounds(42, 155, 46, 14);
		contentPane.add(lblPname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(139, 152, 127, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setBounds(42, 235, 46, 14);
		contentPane.add(lblPrice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(139, 232, 127, 20);
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
					int price=Integer.parseInt(textField_2.getText());
					
					String str1="insert into addproduct values('"+pid+"','"+pname+"','"+price+"')";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/vjava","sa","");
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
		btnAddproduct.setBounds(56, 327, 89, 23);
		contentPane.add(btnAddproduct);
		
		JButton btnSearchproduct = new JButton("SearchProduct");
		btnSearchproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					int pid=Integer.parseInt(textField.getText());
					
					String str1="select * from addproduct where pid='"+pid+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/vjava","sa","");
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(str1);
					rs.next();
					String pname=rs.getString(2);
					String price=rs.getString(3);
					
					textField_1.setText(pname);
					textField_2.setText(price);
					
					JOptionPane.showMessageDialog(btnSearchproduct, "Searching..");
					
					
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnSearchproduct.setBounds(181, 327, 103, 23);
		contentPane.add(btnSearchproduct);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{

				try
				{
					int pid=Integer.parseInt(textField.getText());
					String pname=textField_1.getText();
					int price=Integer.parseInt(textField_2.getText());
					
					String str1="update addproduct set pname='"+pname+"',price='"+price+"' where pid='"+pid+"'";
					
					
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/vjava","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnUpdate, "Updated....");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnUpdate.setBounds(322, 327, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					int pid=Integer.parseInt(textField.getText());
					
					String str1="delete from addproduct where pid='"+pid+"'";
					
					
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/vjava","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnDelete, "Deleted....");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnDelete.setBounds(322, 231, 89, 23);
		contentPane.add(btnDelete);
	}
}
