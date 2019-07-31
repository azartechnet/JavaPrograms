import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RegisterPage extends JFrame {

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
					RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 23, 362, 434);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRegisterform = new JLabel("RegisterForm");
		lblRegisterform.setBounds(145, 11, 93, 14);
		panel.add(lblRegisterform);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(25, 60, 46, 14);
		panel.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(109, 57, 186, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(25, 134, 46, 14);
		panel.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 131, 186, 29);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(25, 214, 46, 14);
		panel.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(109, 211, 186, 29);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(25, 285, 46, 14);
		panel.add(lblPhone);
		
		textField_3 = new JTextField();
		textField_3.setBounds(109, 282, 186, 29);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		final JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					String u=textField.getText();
					String p=textField_1.getText();
					String em=textField_2.getText();
					String ph=textField_3.getText();
					//String gen="";
					//if(rdb`)
					
					
					String str="insert into ureg values('"+u+"','"+p+"','"+em+"','"+ph+"')";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/project","sa","");
					Statement stm=conn.createStatement();
					stm.executeUpdate(str);
					JOptionPane.showMessageDialog(btnRegister,"Inserted...");
					
					
					
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnRegister.setBounds(128, 400, 89, 23);
		panel.add(btnRegister);
		
		final JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnReset)
				{
					textField.setText(" ");
					textField_1.setText(" ");
					textField_2.setText(" ");
					textField_3.setText(" ");
				}
			}
		});
		btnReset.setBounds(246, 400, 89, 23);
		panel.add(btnReset);
		
		ButtonGroup bg=new ButtonGroup();
		
		
		
	}
}
