package ris;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Ticket {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
      public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(204, 255, 204));
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 962, 748);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Morning Show");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					EveningShow ms = new EveningShow();
					ms.tVisible();
					ms.setValues("Dhoom 3");
					frame.setVisible(false);
				
			}
		});
		lblNewLabel.setBackground(new Color(0, 255, 102));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 35));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(52, 342, 237, 78);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Afternoon Show");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EveningShow as = new EveningShow();
				as.tVisible();
				as.setValues("Krish 3");
				
				frame.setVisible(false);
			}
		});
		lblNewLabel_1.setBackground(new Color(0, 255, 0));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(531, 342, 263, 78);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Evening Show");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EveningShow es = new EveningShow();
				es.tVisible();
				
				es.setValues("Adi Purush");
				
				frame.setVisible(false);
			}
		});
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 35));
		lblNewLabel_2.setBounds(70, 645, 242, 78);
		
		
		
		
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Night Show");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EveningShow ns = new EveningShow();
				ns.tVisible();
				ns.setValues("Kashmir Files");
				
				frame.setVisible(false);
			}
		});
		lblNewLabel_3.setBackground(new Color(102, 0, 204));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 35));
		lblNewLabel_3.setBounds(563, 645, 202, 78);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("WELCOME TO ONLINE MOVIE TICKET BOOKING\r\n ");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 51));
		btnNewButton.setBounds(41, 37, 859, 53);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("9-12AM\r\n");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(288, 357, 129, 47);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("3-6PM\r\n");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(811, 359, 95, 43);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("6-9PM\r\n");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(310, 658, 107, 43);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("9-12PM\r\n\r\n");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_3.setBounds(794, 658, 106, 43);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_4.setBackground(new Color(51, 204, 255));
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\OIP.jfif"));
		lblNewLabel_4.setBounds(41, 100, 338, 255);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\OIP (3).jfif"));
		lblNewLabel_5.setBounds(539, 105, 290, 244);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\OIP (4).jfif"));
		lblNewLabel_6.setBounds(41, 454, 364, 181);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\download.jfif"));
		lblNewLabel_7.setBounds(553, 449, 300, 191);
		frame.getContentPane().add(lblNewLabel_7);
		
	}
	
	public void tVisible() {
		frame.setVisible(true);
	}
	
	public void fVisible() {
		frame.setVisible(false);
	}
}
