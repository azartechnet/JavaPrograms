package com.niit;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;
   public void close()
   {
	    
	    WindowEvent win=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
	        
	Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
	    
	}

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
	
	/**
	 * Create the frame.
	 */
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setForeground(Color.MAGENTA);
		panel.setBounds(33, 40, 358, 307);
		contentPane.add(panel);
		panel.setLayout(null);
		
		final JButton btnLoginpage = new JButton("LoginPage");
		btnLoginpage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnLoginpage)
				{
					//JOptionPane.showMessageDialog(btnLoginpage, "LoginSuces..");
					
					new LoginPage().setVisible(true);
					//close();
					
				}
			}
		});
		btnLoginpage.setBounds(25, 70, 115, 31);
		panel.add(btnLoginpage);
		
		final JButton btnRegisterpage = new JButton("RegisterPage");
		btnRegisterpage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==btnRegisterpage)
				{
					new RegisterPage().setVisible(true);
					
					
				}
			}
		});
		btnRegisterpage.setBounds(169, 70, 115, 31);
		panel.add(btnRegisterpage);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.setBounds(25, 143, 115, 31);
		panel.add(btnNewButton);
	}
}
