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

public class ViewDetailsPage extends JFrame {

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
					ViewDetailsPage frame = new ViewDetailsPage();
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
	public ViewDetailsPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPatientid = new JLabel("PatientId");
		lblPatientid.setBounds(21, 39, 46, 14);
		contentPane.add(lblPatientid);
		
		textField = new JTextField();
		textField.setBounds(110, 36, 130, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPname = new JLabel("Pname");
		lblPname.setBounds(21, 105, 46, 14);
		contentPane.add(lblPname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 102, 130, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRoomno = new JLabel("RoomNo");
		lblRoomno.setBounds(21, 182, 46, 14);
		contentPane.add(lblRoomno);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 179, 130, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(21, 236, 46, 14);
		contentPane.add(lblAmount);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110, 233, 130, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		final JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					String pid=textField.getText();
					String str="select pname,room,amount from info where pid='"+pid+"'";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:info1");
					Statement stm=con.createStatement();
					ResultSet rs=stm.executeQuery(str);
					rs.next();
					String pname=rs.getString(1);
					String room=rs.getString(2);
					String amount=rs.getString(3);
					
					textField_1.setText(pname.trim());
					textField_2.setText(room.trim());
					textField_3.setText(amount.trim());
					JOptionPane.showMessageDialog(btnView,"Search!!!");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnView.setBounds(39, 304, 89, 23);
		contentPane.add(btnView);
		
		final JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					String pid=textField.getText();
					String amount=textField_3.getText();
					String str="update info set amount='"+amount+"' where pid='"+pid+"'";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:info1");
					Statement stm=con.createStatement();
					stm.executeUpdate(str);
					JOptionPane.showMessageDialog(btnUpdate, "UpdateSuces!!");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnUpdate.setBounds(181, 304, 89, 23);
		contentPane.add(btnUpdate);
		
		final JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				try
				{
					String pid=textField.getText();
					String pname=textField_1.getText();
					String room=textField_2.getText();
					String amount=textField_3.getText();
					
					String str="insert into info values('"+pid+"','"+pname+"','"+room+"','"+amount+"')";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:info1");
					Statement stm=con.createStatement();
					stm.executeUpdate(str);
					JOptionPane.showMessageDialog(btnAdd,"InsertData!!!");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnAdd.setBounds(314, 304, 89, 23);
		contentPane.add(btnAdd);
		
		final JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String pid=textField.getText();
					
					
					String str="delete from info where pid='"+pid+"'";
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:info1");
					Statement stm=con.createStatement();
					stm.executeUpdate(str);
					JOptionPane.showMessageDialog(btnDelete,"Deleted!!!");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnDelete.setBounds(314, 232, 89, 23);
		contentPane.add(btnDelete);
	}
}
