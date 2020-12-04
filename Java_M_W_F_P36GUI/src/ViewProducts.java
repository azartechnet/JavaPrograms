import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ViewProducts extends JFrame {

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
					ViewProducts frame = new ViewProducts();
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
	public ViewProducts() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 23, 402, 313);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblViewproducts = new JLabel("ViewProducts");
		lblViewproducts.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblViewproducts.setBounds(145, 23, 140, 26);
		panel.add(lblViewproducts);
		
		JLabel lblProductid = new JLabel("ProductId");
		lblProductid.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProductid.setBounds(35, 80, 86, 26);
		panel.add(lblProductid);
		
		textField = new JTextField();
		textField.setBounds(147, 84, 138, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblProductname = new JLabel("ProductName");
		lblProductname.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProductname.setBounds(35, 163, 86, 20);
		panel.add(lblProductname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 164, 140, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSearching = new JButton("Searching");
		btnSearching.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSearching.setBounds(92, 253, 107, 23);
		panel.add(btnSearching);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBounds(231, 254, 89, 23);
		panel.add(btnReset);
	}
}
