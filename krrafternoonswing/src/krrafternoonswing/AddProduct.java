package krrafternoonswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddProduct extends JFrame {

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
		setBounds(100, 100, 450, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddproduct = new JLabel("AddProduct");
		lblAddproduct.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAddproduct.setBounds(191, 11, 82, 25);
		contentPane.add(lblAddproduct);
		
		JLabel lblProductid = new JLabel("ProductId");
		lblProductid.setBounds(27, 67, 82, 25);
		contentPane.add(lblProductid);
		
		textField = new JTextField();
		textField.setBounds(173, 68, 116, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPname = new JLabel("Pname");
		lblPname.setBounds(27, 129, 46, 14);
		contentPane.add(lblPname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(173, 125, 121, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPprice = new JLabel("PPrice");
		lblPprice.setBounds(27, 194, 46, 14);
		contentPane.add(lblPprice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(173, 189, 121, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPquantity = new JLabel("PQuantity");
		lblPquantity.setBounds(27, 254, 46, 14);
		contentPane.add(lblPquantity);
		
		textField_3 = new JTextField();
		textField_3.setBounds(174, 251, 115, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		final JButton btnAddproduct = new JButton("AddProduct");
		btnAddproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
                    String t1=textField.getText();
					
					String t2=textField_1.getText();
					
					String t3=textField_2.getText();
					
					String t4=textField_3.getText();
					
					
					String str1="insert into addproduct values('"+t1+"','"+t2+"','"+t3+"','"+t4+"')";
					
					Class.forName("org.h2.Driver");
					
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
					
					Statement stm=conn.createStatement();
					
					stm.executeUpdate(str1);
					
					JOptionPane.showMessageDialog(btnAddproduct, "Inserted");
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnAddproduct.setBounds(83, 312, 89, 23);
		contentPane.add(btnAddproduct);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnReset.setBounds(238, 312, 89, 23);
		contentPane.add(btnReset);
	}

}
