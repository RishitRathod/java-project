package ris;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

public class Payment {

	private JFrame frame;
	boolean ifelse = false ;
	private final JCheckBox chckbxNewCheckBox_1 = new JCheckBox("UPI Payment\r\n");
	private final JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Credit Card\r\n");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment window = new Payment();
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
	public Payment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 676, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				BookingClasses2 boc2 = new BookingClasses2();
				if(ifelse) {
					boc2.tVisible();
					System.out.println("if  "+ifelse);
				}
				else{
					BookingClasses bccm = new BookingClasses();
					bccm.tVisible();
					System.out.println(ifelse);
				}
				}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton.setBounds(469, 424, 128, 47);
		frame.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Net Banking\r\n\r\n");
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxNewCheckBox.setBounds(123, 109, 221, 62);
		frame.getContentPane().add(chckbxNewCheckBox);
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxNewCheckBox_1.setBounds(123, 212, 221, 62);
		
		frame.getContentPane().add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chckbxNewCheckBox_2.setBounds(123, 303, 221, 62);
		
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(82, 10, 315, 76);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Pay\r\n");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FinalPayment fp = new FinalPayment();
				fp.tVisible();
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 31));
		btnNewButton_1.setBounds(120, 422, 116, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Choose the Payment Method\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(82, 37, 458, 49);
		frame.getContentPane().add(lblNewLabel_1);
	}
	
	public void tVisible() {
		frame.setVisible(true);
	
	}
	
	public void fVisible() {
	    frame.setVisible(false);	
	}
}
