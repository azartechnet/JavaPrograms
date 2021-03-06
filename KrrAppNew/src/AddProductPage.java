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
	private JTextField textField_3;

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
		setBounds(100, 100, 450, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddproduct = new JLabel("ADDPRODUCT");
		lblAddproduct.setBounds(150, 11, 114, 24);
		contentPane.add(lblAddproduct);
		
		JLabel lblPid = new JLabel("PID");
		lblPid.setBounds(26, 52, 46, 14);
		contentPane.add(lblPid);
		
		textField = new JTextField();
		textField.setBounds(104, 49, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPname = new JLabel("PNAME");
		lblPname.setBounds(26, 112, 46, 14);
		contentPane.add(lblPname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 109, 160, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPprice = new JLabel("PPRICE");
		lblPprice.setBounds(26, 171, 46, 14);
		contentPane.add(lblPprice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(104, 168, 160, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblQuantity = new JLabel("QUANTITY");
		lblQuantity.setBounds(26, 234, 46, 14);
		contentPane.add(lblQuantity);
		
		textField_3 = new JTextField();
		textField_3.setBounds(104, 231, 160, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		final JButton btnAddproduct = new JButton("ADDPRODUCT");
		btnAddproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String pid=textField.getText();
					String pname=textField_1.getText();
					
					String price=textField_2.getText();
					
					String quantity=textField_3.getText();
					
					String str="insert into addproduct values('"+pid+"','"+pname+"','"+price+"','"+quantity+"')";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/krr","sa","");
					Statement stm=conn.createStatement();
					stm.executeUpdate(str);
					
					JOptionPane.showMessageDialog(btnAddproduct, "Inserted..");
					
				}
				catch(Exception r)
				{
				System.out.println(r);	
				}
			}
		});
		btnAddproduct.setBounds(136, 306, 128, 24);
		contentPane.add(btnAddproduct);
		
		final JButton btnView = new JButton("VIEW");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String pid=textField.getText();
					String str1="select * from addproduct where pid='"+pid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/krr","sa","");
					Statement stm=conn.createStatement();
					ResultSet rs=stm.executeQuery(str1);
					rs.next();
					String pn=rs.getString(2);
					String pp=rs.getString(3);
					String pq=rs.getString(4);
					
					textField_1.setText(pn);
					textField_2.setText(pp);
					textField_3.setText(pq);
					
					JOptionPane.showMessageDialog(btnView, "Searching...");
					
					
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnView.setBounds(325, 306, 99, 24);
		contentPane.add(btnView);
		
		final JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					
					String pid=textField.getText();
					String pn=textField_1.getText();
					
					String str="update addproduct set pname='"+pn+"' where pid='"+pid+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/krr","sa","");
					Statement stm=conn.createStatement();
					stm.executeUpdate(str);
					
					JOptionPane.showMessageDialog(btnUpdate,"Updated..");
					
					
				}catch(Exception t)
				{
					
				}
			}
		});
		btnUpdate.setBounds(315, 230, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(315, 167, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnNewButton.setBounds(10, 307, 89, 23);
		contentPane.add(btnNewButton);
	}
}
