import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

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
		btnAddproduct.setBounds(56, 327, 89, 23);
		contentPane.add(btnAddproduct);
		
		JButton btnSearchproduct = new JButton("SearchProduct");
		btnSearchproduct.setBounds(181, 327, 103, 23);
		contentPane.add(btnSearchproduct);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(322, 327, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnViewproduct = new JButton("Delete");
		btnViewproduct.setBounds(322, 231, 89, 23);
		contentPane.add(btnViewproduct);
	}
}
