import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class AddCategory extends JFrame {

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
					AddCategory frame = new AddCategory();
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
	public AddCategory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(35, 28, 344, 277);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAddcategory = new JLabel("AddCategory");
		lblAddcategory.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddcategory.setForeground(Color.RED);
		lblAddcategory.setBounds(144, 11, 84, 14);
		panel.add(lblAddcategory);
		
		JLabel lblCategoryid = new JLabel("CategoryId");
		lblCategoryid.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCategoryid.setBounds(33, 71, 68, 14);
		panel.add(lblCategoryid);
		
		textField = new JTextField();
		textField.setBounds(142, 68, 120, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CategoryName");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(36, 142, 84, 14);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(142, 139, 120, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAddcategory = new JButton("AddCategory");
		btnAddcategory.setBounds(90, 221, 120, 23);
		panel.add(btnAddcategory);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(231, 221, 89, 23);
		panel.add(btnReset);
	}
}
