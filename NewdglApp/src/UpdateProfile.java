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

public class UpdateProfile extends JFrame {

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
					UpdateProfile frame = new UpdateProfile();
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
	public UpdateProfile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUpdateprofile = new JLabel("UpdateProfile");
		lblUpdateprofile.setBounds(116, 11, 100, 22);
		contentPane.add(lblUpdateprofile);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(23, 76, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(112, 73, 175, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 169, 170, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(23, 169, 46, 14);
		contentPane.add(lblPass);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(23, 257, 46, 14);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 254, 171, 30);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String u=textField.getText();
					
					String str="select * from ureg where uname='"+u+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/project","sa","");
					Statement stm=conn.createStatement();
					ResultSet rs=stm.executeQuery(str);
					rs.next();
					String pass=rs.getString(2);
					String email=rs.getString(3);
					textField_1.setText(pass);
					textField_2.setText(email);
					JOptionPane.showMessageDialog(btnSearch, "Search..");
					
					
					
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnSearch.setBounds(38, 368, 89, 23);
		contentPane.add(btnSearch);
		
		final JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String u=textField.getText();
					
					String str="delete  from ureg where uname='"+u+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/project","sa","");
					Statement stm=conn.createStatement();
					stm.executeUpdate(str);
					JOptionPane.showMessageDialog(btnDelete, "Delete");
					
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnDelete.setBounds(171, 368, 89, 23);
		contentPane.add(btnDelete);
		
		final JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String u=textField.getText();
					String p=textField_1.getText();
					String e1=textField_2.getText();
					
					String str="update ureg set pass='"+p+"',email='"+e1+"' where uname='"+u+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/project","sa","");
					Statement stm=conn.createStatement();
					stm.executeUpdate(str);
					JOptionPane.showMessageDialog(btnUpdate, "Update");
					
					
					
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnUpdate.setBounds(317, 368, 89, 23);
		contentPane.add(btnUpdate);
	}
}
