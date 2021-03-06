import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoctersAdd extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctersAdd frame = new DoctersAdd();
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
	public DoctersAdd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 285);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDoctername = new JLabel("DocterName");
		lblDoctername.setBounds(29, 44, 87, 20);
		panel.add(lblDoctername);
		
		textField = new JTextField();
		textField.setBounds(154, 44, 135, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(153, 96, 136, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(29, 99, 46, 14);
		panel.add(lblPassword);
		
		final JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					String u=textField.getText();
					String p=textField_1.getText();
					String str="insert into validate values(?,?)";
					//String str="insert into validate values('"+u+"','"+p+"')";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:validate");
					//Statement stm=con.createStatement();
					PreparedStatement pt=con.prepareStatement(str);
					pt.setString(1,u);
					pt.setString(2,p);
					pt.executeUpdate();
					System.out.println("***"+u+""+p);
					//stm.executeUpdate(str);
					JOptionPane.showMessageDialog(btnAdd, "Inserted!!!");
					new HomePage().setVisible(true);
					
				}
				catch(Exception y)
				{
					System.out.println(y);
				}
			}
		});
		btnAdd.setBounds(154, 153, 89, 23);
		panel.add(btnAdd);
	}
}
