import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close()
    {
        WindowEvent win=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
    }

	/**
	 * Create the frame.
	 */
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(26, 11, 398, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHrsystem = new JLabel("BILLING SYSTEM");
		lblHrsystem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHrsystem.setBounds(121, 21, 124, 19);
		panel.add(lblHrsystem);
		
		final JButton btnLogin = new JButton("ADMINLOGIN");
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{
				if(evt.getSource()==btnLogin)
				{
					new LoginPage().setVisible(true);
				}
				
			}
		});
		btnLogin.setBounds(121, 93, 124, 23);
		panel.add(btnLogin);
		
		final JButton btnRegister = new JButton("REGISTER");
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt)
			{
				if(evt.getSource()==btnRegister)
				{
					new RegisterPage().setVisible(true);
				}
			}
		});
		btnRegister.setBounds(121, 162, 124, 23);
		panel.add(btnRegister);
	}
}
