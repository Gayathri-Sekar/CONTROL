package player;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class AppWIn {

	private JFrame frame;
	private JTextField from;
	private JTextField to;
	private JTable table;
	private String a;
	private String b,date1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWIn window = new AppWIn();
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
	public AppWIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 864);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("BOOK YOUR TRAIN TICKET");
		label.setForeground(SystemColor.inactiveCaptionBorder);
		label.setFont(new Font("Times New Roman", Font.BOLD, 17));
		label.setBounds(84, 28, 226, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("FROM");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1.setBounds(57, 82, 59, 14);
		panel.add(label_1);
		
		from = new JTextField();
		from.setColumns(10);
		from.setBounds(219, 80, 112, 20);
		panel.add(from);
		
		JLabel label_2 = new JLabel("TO");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_2.setBounds(56, 131, 46, 14);
		panel.add(label_2);
		
		to = new JTextField();
		to.setColumns(10);
		to.setBounds(219, 129, 112, 20);
		panel.add(to);
		
		JLabel label_3 = new JLabel("DATE");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_3.setBounds(57, 172, 46, 14);
		panel.add(label_3);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(219, 166, 112, 20);
		panel.add(dateChooser);
		
		JLabel label_4 = new JLabel("CLASS");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_4.setBounds(57, 211, 59, 14);
		panel.add(label_4);
		
		JComboBox cla = new JComboBox();
		cla.addItem("Sleeper");
		cla.addItem("Seater");
		cla.addItem("Semi-Sleeper");
		cla.setSelectedItem(null);
		cla.setEditable(true);
		cla.setBounds(219, 208, 112, 22);
		panel.add(cla);
		
		JLabel label_5 = new JLabel("NO. OF PASSENGER");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_5.setBounds(57, 253, 159, 14);
		panel.add(label_5);
		
		JComboBox nop = new JComboBox();
		nop.addItem("1");
		nop.addItem("2");
		nop.addItem("3");
		nop.addItem("4");
		nop.addItem("5");
		nop.setSelectedItem(null);
		nop.setEditable(true);
		nop.setBounds(219, 250, 112, 22);
		panel.add(nop);
		
		JButton n = new JButton("NEXT");
		n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 a=from.getText();
				b=to.getText();
				String c;
				c=(String)cla.getSelectedItem();
				String n;
				n=(String)nop.getSelectedItem();
				DateFormat df=new SimpleDateFormat("yyyy-mm-dd");
				date1=df.format(dateChooser.getDate());
				ControlTwo ct=new ControlTwo();
				ct.ControlTwo1(c,n,a,b,date1);
				ct.setVisible(true);
				frame.dispose();
			}
		});
		n.setFont(new Font("Times New Roman", Font.BOLD, 13));
		n.setBounds(149, 302, 89, 23);
		panel.add(n);
		
		table = new JTable();
		table.setBackground(Color.GRAY);
		table.setBounds(37, 11, 335, 351);
		panel.add(table);
	}
}
