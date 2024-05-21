package ris;

import java.awt.EventQueue;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.FileReader;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
public class BookingClasses {

	private JFrame frame;
	 JTextField txtPrice;
	JCheckBox chckbxSeat80 = new JCheckBox("20");
	JCheckBox chckbxSeat79 = new JCheckBox("19");
	JCheckBox chckbxSeat78 = new JCheckBox("18");
	JCheckBox chckbxSeat77 = new JCheckBox("17");
	JCheckBox chckbxSeat76 = new JCheckBox("16");
	JCheckBox chckbxSeat75 = new JCheckBox("15");
	JCheckBox chckbxSeat74 = new JCheckBox("14");
	JCheckBox chckbxSeat73 = new JCheckBox("13");
	JCheckBox chckbxSeat72 = new JCheckBox("12");
	JCheckBox chckbxSeat71 = new JCheckBox("11");
	JCheckBox chckbxSeat61 = new JCheckBox("1");
	JCheckBox chckbxSeat62 = new JCheckBox("2");
	JCheckBox chckbxSeat63 = new JCheckBox("3");
	JCheckBox chckbxSeat64 = new JCheckBox("4");
	JCheckBox chckbxSeat65 = new JCheckBox("5");
	JCheckBox chckbxSeat66 = new JCheckBox("6");
	JCheckBox chckbxSeat67 = new JCheckBox("7");
	JCheckBox chckbxSeat68 = new JCheckBox("8");
	JCheckBox chckbxSeat69 = new JCheckBox("9");
	JCheckBox chckbxSeat70 = new JCheckBox("10");
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingClasses window = new BookingClasses();
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
	public BookingClasses() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
	
		frame.getContentPane().setBackground(new Color(0, 0, 160));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 684, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Seat");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel.setForeground(new Color(0, 0, 51));
		lblNewLabel.setBounds(156, 67, 218, 65);
		frame.getContentPane().add(lblNewLabel);
		
		
		chckbxSeat80.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat80);
				chckbxSeat80.setBackground(Color.green);
				int x=reads();
				if(x==20) {
					Ticket tc = new Ticket();
					tc.tVisible();
					frame.setVisible(false);
				}
				writes(chckbxSeat80);
				
	        
			}});
		chckbxSeat80.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat80.setBounds(28, 145, 51, 43);
		frame.getContentPane().add(chckbxSeat80);
		chckbxSeat79.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat79);
				chckbxSeat79.setBackground(Color.green);
				writes(chckbxSeat79);
				//reads(chckbxSeat79);
			}
		});
		
		chckbxSeat79.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat79.setBounds(96, 145, 51, 43);
		frame.getContentPane().add(chckbxSeat79);
		
		chckbxSeat78.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat78);
			}
		});
		chckbxSeat78.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat78.setBounds(157, 145, 51, 43);
		frame.getContentPane().add(chckbxSeat78);
		chckbxSeat77.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat77);
			}
		});
		
		
		chckbxSeat77.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat77.setBounds(217, 145, 51, 43);
		frame.getContentPane().add(chckbxSeat77);
		chckbxSeat76.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat76);
			}
		});
		
	
		chckbxSeat76.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat76.setBounds(286, 145, 51, 43);
		frame.getContentPane().add(chckbxSeat76);
		chckbxSeat75.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat75);
			}
		});
		
	
		chckbxSeat75.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat75.setBounds(356, 145, 51, 43);
		frame.getContentPane().add(chckbxSeat75);
		chckbxSeat74.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat74);
			}
		});
		
	
		chckbxSeat74.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat74.setBounds(424, 145, 51, 43);
		frame.getContentPane().add(chckbxSeat74);
		chckbxSeat73.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat73);
			}
		});
		
	
		chckbxSeat73.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat73.setBounds(485, 145, 51, 43);
		frame.getContentPane().add(chckbxSeat73);
		chckbxSeat72.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat72);
			}
		});
		
		
		chckbxSeat72.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat72.setBounds(549, 145, 51, 43);
		frame.getContentPane().add(chckbxSeat72);
		chckbxSeat71.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat71);
			}
		});
		
		
		chckbxSeat71.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat71.setBounds(613, 145, 51, 43);
		frame.getContentPane().add(chckbxSeat71);
		chckbxSeat61.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat61);
			}
		});
		

		chckbxSeat61.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat61.setBounds(28, 245, 51, 43);
		frame.getContentPane().add(chckbxSeat61);
		chckbxSeat62.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat62);
			}
		});
		

		chckbxSeat62.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat62.setBounds(96, 245, 51, 43);
		frame.getContentPane().add(chckbxSeat62);
		chckbxSeat63.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat63);
			}
		});
		
		chckbxSeat63.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat63.setBounds(157, 245, 51, 43);
		frame.getContentPane().add(chckbxSeat63);
		chckbxSeat64.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat64);
			}
		});
		
		
		chckbxSeat64.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat64.setBounds(217, 245, 51, 43);
		frame.getContentPane().add(chckbxSeat64);
		chckbxSeat65.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat65);
			}
		});
		
	
		chckbxSeat65.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat65.setBounds(286, 245, 51, 43);
		frame.getContentPane().add(chckbxSeat65);
		chckbxSeat66.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat66);
			}
		});
		

		chckbxSeat66.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat66.setBounds(356, 245, 51, 43);
		frame.getContentPane().add(chckbxSeat66);
		chckbxSeat67.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat67);
			}
		});
		
		
		chckbxSeat67.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat67.setBounds(424, 245, 51, 43);
		frame.getContentPane().add(chckbxSeat67);
		chckbxSeat68.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat68);
			}
		});
		
		
		chckbxSeat68.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat68.setBounds(485, 245, 51, 43);
		frame.getContentPane().add(chckbxSeat68);
		chckbxSeat69.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat69);
			}
		});
		

		chckbxSeat69.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat69.setBounds(549, 245, 51, 43);
		frame.getContentPane().add(chckbxSeat69);
		chckbxSeat70.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setValues(chckbxSeat70);
			}
		});
		
		chckbxSeat70.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat70.setBounds(613, 245, 51, 43);
		frame.getContentPane().add(chckbxSeat70);
		
		JButton btnNewButton = new JButton("Back\r\n");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Ticket ee = new Ticket();
				ee.tVisible();
			}
		});
		btnNewButton.setForeground(new Color(0, 102, 51));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.setBounds(494, 56, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		txtPrice = new JTextField();
		txtPrice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		txtPrice.setBounds(42, 340, 391, 53);
		frame.getContentPane().add(txtPrice);
		txtPrice.setColumns(10);
		
		JButton btnBook = new JButton("Book\r\n");
		btnBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxSeat80.isSelected()  ) {
					
					
				}
				Payment pc = new Payment();
				pc.tVisible();
				frame.setVisible(false);
				
			}
		});
		btnBook.setForeground(new Color(0, 51, 255));
		btnBook.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBook.setBounds(515, 389, 85, 60);
		frame.getContentPane().add(btnBook);
		
		table = new JTable();
		table.setBounds(146, 465, 90, -38);
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(117, 475, 139, -48);
		frame.getContentPane().add(table_1);
		
		table_2 = new JTable();
		table_2.setForeground(new Color(255, 255, 255));
		table_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table_2.setShowHorizontalLines(false);
		table_2.setBounds(128, 445, 59, -18);
		frame.getContentPane().add(table_2);
	}
	public void tVisible() {
		frame.setVisible(true);
	
	}
	
	public void fVisible() {
	    frame.setVisible(false);	
	}
	
	public void writes(JCheckBox chckbx){	try {
		FileWriter writer = new FileWriter("rank_list.txt");
		writer.write(chckbx.getText());
	    writer.write("\n");
	    writer.close();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}

	
	
	public int reads(){
		int x = 0;
		try {
		FileReader reader = new FileReader("rank_list.txt");
		 x=reader.read();
	reader.close();
		
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		return x;
	}
	public void setValues(JCheckBox chckbx) {
		
		int price;
		 if (!chckbx.isSelected()  ) {
			 
			price = Integer.parseInt(txtPrice.getText()) - 500;
			String sPrice = ((Integer)price).toString();
			txtPrice.setText(sPrice);
		
			}
		else if(txtPrice.getText().length() >2) {
			
			
				price = Integer.parseInt(txtPrice.getText()) + 500;
			String sPrice = ((Integer)price).toString();
			txtPrice.setText(sPrice);
			
			}
			
		else {
			txtPrice.setText("500");
		}
	
	}
	public String value() {
		String value = txtPrice.getText();
		return value;
	}
}
