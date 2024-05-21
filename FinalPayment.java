package ris;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class FinalPayment {

	private JFrame frame;
	JLabel lblNewLabel = new JLabel("Payment Successfull\r\n");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalPayment window = new FinalPayment();
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
	public FinalPayment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.getContentPane().setForeground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 676, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblNewLabel.setBackground(new Color(0, 51, 153));
		lblNewLabel.setBounds(103, 179, 419, 121);
		frame.getContentPane().add(lblNewLabel);
	}
	public void tVisible() {
		frame.setVisible(true);
	
	}
	
	public void fVisible() {
	    frame.setVisible(false);	
	}



}
