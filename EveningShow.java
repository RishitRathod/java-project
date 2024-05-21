package ris;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageProducer;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class EveningShow {

	private JFrame frame;
	JLabel lblShow = new JLabel("Patan\r\n");
	JLabel lblpic = new JLabel("C:\\Users\\user\\Downloads\\OIP (3).jfif");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EveningShow window = new EveningShow();
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
	public EveningShow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 624, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		lblShow.setBackground(new Color(102, 204, 51));
		lblShow.setForeground(new Color(255, 255, 255));
		lblShow.setFont(new Font("Arial", Font.PLAIN, 77));
		lblShow.setBounds(65, 189, 496, 113);
		frame.getContentPane().add(lblShow);
		
		JButton btnNewButton = new JButton("Platinium\r\n");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BookingClasses pc = new BookingClasses();
				pc.tVisible();
				
				frame.setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(51, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 24));
		btnNewButton.setForeground(new Color(255, 51, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(30, 410, 145, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnGolden = new JButton("Golden\r\n");
		btnGolden.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BookingClasses2 gc = new BookingClasses2();
				gc.tVisible();
				frame.setVisible(false);
			}
		});
		btnGolden.setForeground(new Color(255, 0, 102));
		btnGolden.setFont(new Font("Arial", Font.PLAIN, 24));
		btnGolden.setBackground(new Color(51, 255, 255));
		btnGolden.setBounds(245, 411, 120, 48);
		frame.getContentPane().add(btnGolden);
		
		JButton btnSilver = new JButton("Silver\r\n");
		btnSilver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BookingClasses2 gc = new BookingClasses2();
				gc.silver = true;
				gc.tVisible();
				frame.setVisible(false);
			}
		});
		btnSilver.setForeground(new Color(255, 0, 51));
		btnSilver.setFont(new Font("Arial", Font.PLAIN, 24));
		btnSilver.setBackground(new Color(51, 255, 255));
		btnSilver.setBounds(435, 410, 106, 48);
		frame.getContentPane().add(btnSilver);
		
		JLabel lblNewLabel_1 = new JLabel("Select the class\r\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(102, 204, 0));
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 31));
		lblNewLabel_1.setBounds(30, 323, 299, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Movie :-\r\n");
		lblNewLabel_2.setForeground(new Color(102, 0, 255));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(65, 110, 127, 50);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnBack = new JButton("Back\r\n");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Ticket t1 = new Ticket();
				t1.tVisible();
			}
		});
		btnBack.setForeground(new Color(153, 0, 255));
		btnBack.setFont(new Font("Arial", Font.PLAIN, 25));
		btnBack.setBounds(414, 53, 127, 39);
		frame.getContentPane().add(btnBack);
	}
	public void tVisible() {
		frame.setVisible(true);

	}
	
	public void fVisible() {
	    frame.setVisible(false);	
	}
	
	public void setValues(String show) {
		lblShow.setText(show);
		
	}
	
	

	
}

