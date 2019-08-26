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
import java.io.IOException;
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
		setBounds(100, 100, 450, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddproduct = new JLabel("AddProduct");
		lblAddproduct.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddproduct.setBounds(156, 11, 79, 22);
		contentPane.add(lblAddproduct);
		
		JLabel lblPid = new JLabel("Pid");
		lblPid.setBounds(25, 72, 46, 14);
		contentPane.add(lblPid);
		
		textField = new JTextField();
		textField.setBounds(106, 69, 129, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPname = new JLabel("Pname");
		lblPname.setBounds(25, 134, 46, 14);
		contentPane.add(lblPname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 131, 129, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPrices = new JLabel("Prices");
		lblPrices.setBounds(25, 198, 46, 14);
		contentPane.add(lblPrices);
		
		textField_2 = new JTextField();
		textField_2.setBounds(105, 198, 129, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(25, 256, 46, 14);
		contentPane.add(lblQuantity);
		
		textField_3 = new JTextField();
		textField_3.setBounds(106, 253, 129, 27);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		final JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
				  String pid=textField.getText();
				  String pname=textField_1.getText();
				  String price=textField_2.getText();
				  String qut=textField_3.getText();
				  String str1="insert into addproduct values('"+pid+"','"+pname+"','"+price+"','"+qut+"')";
				    Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/project1","sa","");
					Statement stm=conn.createStatement();
				    stm.executeUpdate(str1);
				    JOptionPane.showMessageDialog(btnInsert, "Inserted..");
				}
				catch(Exception r)
				{
					
				}
			}
		});
		btnInsert.setBounds(284, 154, 89, 23);
		contentPane.add(btnInsert);
		
		JButton btnView = new JButton("View");
		btnView.setBounds(284, 219, 89, 23);
		contentPane.add(btnView);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(284, 285, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(284, 95, 89, 23);
		contentPane.add(btnReset);
	}
}
