package ris;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BookingClasses2 {

	private JFrame frame;
	 JTextField txtPrice2;
	 boolean pay = false;
	JCheckBox chckbxSeat20 = new JCheckBox("20");
	JCheckBox chckbxSeat19 = new JCheckBox("19");
	JCheckBox chckbxSeat18 = new JCheckBox("18");
	JCheckBox chckbxSeat17 = new JCheckBox("17");
	JCheckBox chckbxSeat16 = new JCheckBox("16");
	JCheckBox chckbxSeat15 = new JCheckBox("15");
	JCheckBox chckbxSeat14 = new JCheckBox("14");
	JCheckBox chckbxSeat13 = new JCheckBox("13");
	JCheckBox chckbxSeat12 = new JCheckBox("12");
	JCheckBox chckbxSeat11 = new JCheckBox("11");
	JCheckBox chckbxSeat10 = new JCheckBox("10");
	JCheckBox chckbxSeat9 = new JCheckBox("9");
	JCheckBox chckbxSeat8 = new JCheckBox("8");
	JCheckBox chckbxSeat7 = new JCheckBox("7");
	JCheckBox chckbxSeat6 = new JCheckBox("6");
	JCheckBox chckbxSeat5 = new JCheckBox("5");
	JCheckBox chckbxSeat4 = new JCheckBox("4");
	JCheckBox chckbxSeat3 = new JCheckBox("3");
	JCheckBox chckbxSeat2 = new JCheckBox("2");
	JCheckBox chckbxSeat1 = new JCheckBox("1");
	JCheckBox chckbxSeat30 = new JCheckBox("30");
	JCheckBox chckbxSeat29 = new JCheckBox("29");
	JCheckBox chckbxSeat28 = new JCheckBox("28");
	JCheckBox chckbxSeat27 = new JCheckBox("27");
	JCheckBox chckbxSeat26 = new JCheckBox("26");
	JCheckBox chckbxSeat25 = new JCheckBox("25");
	JCheckBox chckbxSeat24 = new JCheckBox("24");
	JCheckBox chckbxSeat23 = new JCheckBox("23");
	JCheckBox chckbxSeat22 = new JCheckBox("22");
	JCheckBox chckbxSeat21 = new JCheckBox("21");
	boolean silver = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingClasses2 window = new BookingClasses2();
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
	public BookingClasses2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 676, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Seat");
		lblNewLabel.setForeground(new Color(0, 0, 51));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		lblNewLabel.setBounds(76, 50, 218, 65);
		frame.getContentPane().add(lblNewLabel);
		
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
		btnNewButton.setBounds(414, 39, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		
		chckbxSeat20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat20);	
				}
				else
				setValues(chckbxSeat20);
			}
		});
		chckbxSeat20.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat20.setBounds(6, 222, 51, 43);
		frame.getContentPane().add(chckbxSeat20);
		
		
		chckbxSeat19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat19);	
				}
				else
				setValues(chckbxSeat19);
			}
		});
		chckbxSeat19.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat19.setBounds(74, 222, 51, 43);
		frame.getContentPane().add(chckbxSeat19);
		
	
		chckbxSeat18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat18);	
				}
				else
				setValues(chckbxSeat17);
			}
		});
		chckbxSeat18.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat18.setBounds(135, 222, 51, 43);
		frame.getContentPane().add(chckbxSeat18);
		
	
		chckbxSeat17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat17);	
				}
				else
				setValues(chckbxSeat17);
			}
			
		});
		chckbxSeat17.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat17.setBounds(195, 222, 51, 43);
		frame.getContentPane().add(chckbxSeat17);
		
		
		chckbxSeat16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat16);	
				}
				else
				setValues(chckbxSeat16);
			}
		});
		chckbxSeat16.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat16.setBounds(264, 222, 51, 43);
		frame.getContentPane().add(chckbxSeat16);
		
	
		chckbxSeat15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat15);	
				}
				else
				setValues(chckbxSeat15);
			}
		});
		chckbxSeat15.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat15.setBounds(334, 222, 51, 43);
		frame.getContentPane().add(chckbxSeat15);
		
		chckbxSeat14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat14);	
				}
				else
				setValues(chckbxSeat14);;
			}
		});
		chckbxSeat14.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat14.setBounds(402, 222, 51, 43);
		frame.getContentPane().add(chckbxSeat14);
		
		
		chckbxSeat13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat13);	
				}
				else
				setValues(chckbxSeat13);
			}
		});
		chckbxSeat13.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat13.setBounds(463, 222, 51, 43);
		frame.getContentPane().add(chckbxSeat13);
		
		
		chckbxSeat12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat12);	
				}
				else
				setValues(chckbxSeat12);
			}
		});
		chckbxSeat12.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat12.setBounds(527, 222, 51, 43);
		frame.getContentPane().add(chckbxSeat12);
	
		chckbxSeat11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat11);	
				}
				else
				setValues(chckbxSeat11);
			}
		});
		chckbxSeat11.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat11.setBounds(591, 222, 51, 43);
		frame.getContentPane().add(chckbxSeat11);
		
		
		chckbxSeat10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat10);	
				}
				else
				setValues(chckbxSeat10);
			}
		});
		chckbxSeat10.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat10.setBounds(591, 322, 51, 43);
		frame.getContentPane().add(chckbxSeat10);
		
		
		chckbxSeat9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat9);	
				}
				else
				setValues(chckbxSeat9);
			}
		});
		chckbxSeat9.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat9.setBounds(527, 322, 51, 43);
		frame.getContentPane().add(chckbxSeat9);
		
		
		chckbxSeat8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat8);	
				}
				else
				setValues(chckbxSeat8);
			}
		});
		chckbxSeat8.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat8.setBounds(463, 322, 51, 43);
		frame.getContentPane().add(chckbxSeat8);
		
	
		chckbxSeat7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat7);	
				}
				else
				setValues(chckbxSeat7);
			}
		});
		chckbxSeat7.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat7.setBounds(402, 322, 51, 43);
		frame.getContentPane().add(chckbxSeat7);
		
		
		chckbxSeat6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat6);	
				}
				else
				setValues(chckbxSeat6);
			}
		});
		chckbxSeat6.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat6.setBounds(334, 322, 51, 43);
		frame.getContentPane().add(chckbxSeat6);
		
		
		chckbxSeat5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat5);	
				}
				else
				setValues(chckbxSeat5);
			}
		});
		chckbxSeat5.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat5.setBounds(264, 322, 51, 43);
		frame.getContentPane().add(chckbxSeat5);
		
		
		chckbxSeat4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat4);	
				}
				else
				setValues(chckbxSeat4);
			}
		});
		chckbxSeat4.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat4.setBounds(195, 322, 51, 43);
		frame.getContentPane().add(chckbxSeat4);
		
		chckbxSeat3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat3);	
				}
				else
				setValues(chckbxSeat3);
			}
		});
		chckbxSeat3.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat3.setBounds(135, 322, 51, 43);
		frame.getContentPane().add(chckbxSeat3);
		
	
		chckbxSeat2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat2);	
				}
				else
				setValues(chckbxSeat2);
			}
		});
		chckbxSeat2.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat2.setBounds(74, 322, 51, 43);
		frame.getContentPane().add(chckbxSeat2);
		
		chckbxSeat1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat1);	
				}
				else
				setValues(chckbxSeat1);
			}
		});
		chckbxSeat1.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat1.setBounds(6, 322, 51, 43);
		frame.getContentPane().add(chckbxSeat1);
		
		
		chckbxSeat21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat21);	
				}
				else
				setValues(chckbxSeat21);
				
			}
		});
		chckbxSeat21.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat21.setBounds(6, 141, 51, 43);
		frame.getContentPane().add(chckbxSeat21);

		chckbxSeat22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat22);	
				}
				else
				setValues(chckbxSeat22);
			}
		});
		chckbxSeat22.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat22.setBounds(74, 141, 51, 43);
		frame.getContentPane().add(chckbxSeat22);
		
		
		chckbxSeat23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat23);	
				}
				else
				setValues(chckbxSeat23);
			}
		});
		chckbxSeat23.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat23.setBounds(135, 141, 51, 43);
		frame.getContentPane().add(chckbxSeat23);
		
	
		chckbxSeat24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat24);	
				}
				else
				setValues(chckbxSeat24);
			}
		});
		chckbxSeat24.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat24.setBounds(195, 141, 51, 43);
		frame.getContentPane().add(chckbxSeat24);
	
		chckbxSeat25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat25);	
				}
				else
				setValues(chckbxSeat25);
			}
		});
		chckbxSeat25.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat25.setBounds(264, 141, 51, 43);
		frame.getContentPane().add(chckbxSeat25);
		
	
		chckbxSeat26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat26);	
				}
				else
				setValues(chckbxSeat26);
			}
		});
		chckbxSeat26.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat26.setBounds(334, 141, 51, 43);
		frame.getContentPane().add(chckbxSeat26);
		
		chckbxSeat27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat27);	
				}
				else
				setValues(chckbxSeat27);
			}
		});
		chckbxSeat27.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat27.setBounds(402, 141, 51, 43);
		frame.getContentPane().add(chckbxSeat27);
	
		chckbxSeat28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat28);	
				}
				else
				setValues(chckbxSeat28);
			}
		});
		chckbxSeat28.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat28.setBounds(463, 141, 51, 43);
		frame.getContentPane().add(chckbxSeat28);
		
		
		chckbxSeat29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat29);	
				}
				else
				setValues(chckbxSeat29);
			}
		});
		chckbxSeat29.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat29.setBounds(527, 141, 51, 43);
		frame.getContentPane().add(chckbxSeat29);
		

		chckbxSeat30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(silver) {
					setValuess(chckbxSeat30);	
				}
				else
				setValues(chckbxSeat30);
			}
		});
		chckbxSeat30.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxSeat30.setBounds(591, 141, 51, 43);
		frame.getContentPane().add(chckbxSeat30);
		
		txtPrice2 = new JTextField();
		txtPrice2.setColumns(10);
		txtPrice2.setBounds(27, 413, 391, 53);
		frame.getContentPane().add(txtPrice2);
		
		JButton btnNewButton_1 = new JButton("Book\r\n");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Payment pc1 = new Payment();
				pc1.tVisible();
				frame.setVisible(false);
				pay = true; 
				pc1.ifelse = true;
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(503, 406, 85, 60);
		frame.getContentPane().add(btnNewButton_1);
	}
	public void tVisible() {
		frame.setVisible(true);
	
	}
	
	public void fVisible() {
	    frame.setVisible(false);	
	}
	
public void setValues(JCheckBox chckbx) {
		
		int price;
		 if (!chckbx.isSelected()  ) {
			 
			price = Integer.parseInt(txtPrice2.getText()) - 350;
			String sPrice = ((Integer)price).toString();
			txtPrice2.setText(sPrice);
		
			}
		else if(txtPrice2.getText().length() >2) {
			
			
				price = Integer.parseInt(txtPrice2.getText()) + 350;
			String sPrice = ((Integer)price).toString();
			txtPrice2.setText(sPrice);
			
			}
			
		else {
			txtPrice2.setText("350");
		}
	
	}

public void setValuess(JCheckBox chckbx) {
	
	int price;
	 if (!chckbx.isSelected()  ) {
		 
		price = Integer.parseInt(txtPrice2.getText()) - 200;
		String sPrice = ((Integer)price).toString();
		txtPrice2.setText(sPrice);
	
		}
	else if(txtPrice2.getText().length() >2) {
		
		
			price = Integer.parseInt(txtPrice2.getText()) + 200;
		String sPrice = ((Integer)price).toString();
		txtPrice2.setText(sPrice);
		
		}
		
	else {
		txtPrice2.setText("200");
	}

}
	public String value() {
		String value = txtPrice2.getText();
		return value;
	}
}
