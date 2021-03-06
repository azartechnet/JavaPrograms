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

public class MainPage extends JFrame {

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
					MainPage frame = new MainPage();
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
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPid = new JLabel("PID");
		lblPid.setBounds(38, 44, 46, 14);
		contentPane.add(lblPid);
		
		textField = new JTextField();
		textField.setBounds(108, 41, 163, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPname = new JLabel("PNAME");
		lblPname.setBounds(38, 127, 46, 14);
		contentPane.add(lblPname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 124, 163, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPrices = new JLabel("PRICES");
		lblPrices.setBounds(38, 210, 46, 14);
		contentPane.add(lblPrices);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 207, 163, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblQuantity = new JLabel("QUANTITY");
		lblQuantity.setBounds(27, 281, 74, 14);
		contentPane.add(lblQuantity);
		
		textField_3 = new JTextField();
		textField_3.setBounds(116, 278, 155, 20);
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
					String pcost=textField_2.getText();
					String qun=textField_3.getText();
					
					String str="insert into addproduct values('"+pid+"','"+pname+"','"+pcost+"','"+qun+"')";
					
					Class.forName("org.h2.Driver");
					
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dgl","sa","");
					
					Statement stm=conn.createStatement();
					
					stm.executeUpdate(str);
					
					JOptionPane.showMessageDialog(btnAddproduct, "LoginSuces..");
					
					
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnAddproduct.setBounds(311, 44, 113, 23);
		contentPane.add(btnAddproduct);
		
		final JButton btnViewProduct = new JButton("VIEW PRODUCT");
		btnViewProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String pid=textField.getText();
					
					String str="select * from addproduct where pid='"+pid+"'";
	                 Class.forName("org.h2.Driver");
					
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/dgl","sa","");
					
					Statement stm=conn.createStatement();
					
					ResultSet rs=stm.executeQuery(str);
					
					rs.next();
					
					String pn=rs.getString(2);
					
					String pp=rs.getString(3);
					
					String qn=rs.getString(4);
					
					
					textField_1.setText(pn);
					
					textField_2.setText(pp);
					
					textField_3.setText(qn);
					
					
					JOptionPane.showMessageDialog(btnViewProduct, "Search...");
					
					
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnViewProduct.setBounds(311, 123, 113, 23);
		contentPane.add(btnViewProduct);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(311, 194, 113, 23);
		contentPane.add(btnUpdate);
		
		JButton btnNewButton = new JButton("VIEWTABLE");
		btnNewButton.setBounds(311, 264, 113, 23);
		contentPane.add(btnNewButton);
	}
}
