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
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ViewProduct extends JFrame {

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
					ViewProduct frame = new ViewProduct();
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
	public ViewProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblViewproduct = new JLabel("ViewProduct");
		lblViewproduct.setBounds(127, 11, 80, 21);
		contentPane.add(lblViewproduct);
		
		JLabel lblPid = new JLabel("Pid");
		lblPid.setBounds(25, 75, 46, 14);
		contentPane.add(lblPid);
		
		textField = new JTextField();
		textField.setBounds(121, 72, 183, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPname = new JLabel("Pname");
		lblPname.setBounds(25, 165, 46, 14);
		contentPane.add(lblPname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 158, 183, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPrices = new JLabel("Prices");
		lblPrices.setBounds(25, 239, 46, 14);
		contentPane.add(lblPrices);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 236, 183, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(25, 303, 46, 14);
		contentPane.add(lblQuantity);
		
		textField_3 = new JTextField();
		textField_3.setBounds(121, 300, 183, 28);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		final JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
                
				try
				{
				String pid=textField.getText();
				
				String str2="select * from addproduct where pid='"+pid+"'";
				
				Class.forName("org.h2.Driver");
				
				Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
				
				Statement stm=conn.createStatement();
				
				
				ResultSet rs=stm.executeQuery(str2);
				
				rs.next();
				
				String y1=rs.getString(2);
				
				String y2=rs.getString(3);
				
				String y3=rs.getString(4);
				
				textField_1.setText(y1);
				
				textField_2.setText(y2);
				
				
				textField_3.setText(y3);
				
				
				JOptionPane.showMessageDialog(btnView, "Search");
				
				
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnView.setBounds(62, 380, 89, 23);
		contentPane.add(btnView);
		
		JButton btnUpdated = new JButton("Updated");
		btnUpdated.setBounds(199, 380, 89, 23);
		contentPane.add(btnUpdated);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(315, 380, 89, 23);
		contentPane.add(btnDelete);
	}
}
