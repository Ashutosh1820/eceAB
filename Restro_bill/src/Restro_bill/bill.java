package Restro_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.setBackground(new Color(128, 0, 255));
		frame.setBounds(100, 100, 779, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ITEMS:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(64, 115, 84, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("QNTY");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(64, 197, 84, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MENU");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(282, 35, 204, 47);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CHAT -20rs", "SAMOSA -15rs", "SHAWARMA -100rs"}));
		c1.setBounds(250, 125, 112, 22);
		frame.getContentPane().add(c1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("CHAT -20rs"))
				{ 
					bill=q*20;
					JOptionPane.showMessageDialog(btnNewButton, "thank you !!!!! \n selected item:"+item+"\n Qnty: "+q+"\n your bill:"+bill+"\nservice charge=100000000000000000000");
				}
				else if(item.equals("SAMOSA -15rs"))
				{
					bill=q*15;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n selected item:"+item+"\n Qnty: "+q+"\n your bill:"+bill);
				}
				else if(item.equals("SHAWARMA -100rs"))
				{
					bill=q*100;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n selected item:"+item+"\n Qnty: "+q+"\n your bill:"+bill);
				}
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(328, 302, 112, 39);
		frame.getContentPane().add(btnNewButton);
		
		t1 = new JTextField();
		t1.setBounds(248, 208, 144, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
	}
}
