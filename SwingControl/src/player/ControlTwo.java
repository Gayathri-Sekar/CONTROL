package player;
import java.text.DateFormat;
//import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
public class ControlTwo extends JFrame {
	private String sa,sb,sfrom,sto,mdate;
	private String date[];
	private String pname[];
	private String aadnum;
    private String gender[];                 
    private JTextArea ma;
    private JDateChooser dateChooser;
    private JRadioButton m ;
    private JRadioButton f; 
    private JButton p ;
    private int conve[], age[];
    private float sum=0;
    private float[] cost;
    private int num,i=0,age2;
    private String[] odate;
    private String[] adate;
    //private JLabel ma=null;
	public void ControlTwo1(String s1,String s2,String s3,String s4,String date1) throws HeadlessException {
		//super();
		this.sa=s1;      //seat class
		this.sb=s2;
		this.sfrom=s3;                                             
		this.sto=s4;
		this.mdate=date1;
		String[] adate=this.mdate.split("-");
		age2=Integer.parseInt(adate[0]);       ////ageeeeee///current date
	}
    public void ControlTwo2() {
    	
		num=Integer.parseInt(sb);
		//for(int i=0;i<num;i++)
		{
			 pname[i]=n.getText();
			 aadnum=an.getText();
			DateFormat df=new SimpleDateFormat("yyyy-mm-dd");
			date[i]=df.format(dateChooser.getDate());
			String sub=date[i];
			String[] odate=sub.split("-");
			//for(int i=0;i<num;i++)
			{
				conve[i]=Integer.parseInt(odate[0]);         ////conve[0]///birth day
			}
			if(m.isSelected())
			{
				gender[i]="M";
			}
			else
			{
				gender[i]="F";
			}
			
			
		}
    }
	private JPanel contentPane;
	private JTextField n;
	private JTextField an;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlTwo frame = new ControlTwo();
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
	public ControlTwo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 867, 788);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("NAME");
		label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label.setBounds(142, 148, 53, 14);
		contentPane.add(label);
		
		n = new JTextField();
		n.setColumns(10);
		n.setBounds(289, 146, 112, 20);
		contentPane.add(n);
		
		JLabel label_1 = new JLabel("AADHAR NUM");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1.setBounds(138, 191, 118, 14);
		contentPane.add(label_1);
		
		an = new JTextField();
		an.setColumns(10);
		an.setBounds(289, 189, 112, 20);
		contentPane.add(an);
		
		JLabel label_2 = new JLabel("DOB");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_2.setBounds(138, 236, 46, 14);
		contentPane.add(label_2);
		
		 dateChooser = new JDateChooser();
		dateChooser.setBounds(291, 230, 110, 20);
		contentPane.add(dateChooser);
		
		JLabel label_3 = new JLabel("GENDER");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_3.setBounds(138, 275, 64, 14);
		contentPane.add(label_3);
		
		m = new JRadioButton("Male");
		buttonGroup_1.add(m);
		m.setBounds(290, 272, 53, 23);
		contentPane.add(m);
		
		f = new JRadioButton("Female");
		buttonGroup_1.add(f);
		f.setBounds(350, 272, 64, 23);
		contentPane.add(f);
		
		
		
		JButton ap = new JButton("ADD PASSENGER");
		ap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControlTwo2();
				//int i;
				//for(int i=0;i<num;i++)
				
					n.setText("");
					an.setText("");
					dateChooser.setCalendar(null);
					m.setSelected(false);
					f.setSelected(false);
					n.setFocusable(true);
					
				
				i++;
				//ma.setText(ma.getText()+pname);
			     if(i>=num)
			     {
			    	 ap.setEnabled(false);
			    	 p.setEnabled(true);
			     }
			     
			     }
				
			
		});
		ap.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ap.setBackground(SystemColor.textHighlight);
		ap.setBounds(183, 318, 142, 23);
		contentPane.add(ap);
		
	     p = new JButton("PRINT BILL");
		p.setEnabled(false);
		p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//cost=Float.parseFloat(ma.getText());
				ma.setText("\t\t  "+"BOOKING DETAILS"+"\t"+"\n\n"
				       +    
						"NAME"+"\t"+"AGE WITH GENDER"+"\t"+"CLASS"+"\t"+"SEAT NO"+"\t"+"COST OF TICKET INCLUDING TAX"+"\n\n"
					);
				
				//cost=Float.parseFloat(ma.getText());
				String s="360.00";
				
				for(int j=0;j<num;j++)
				{
					cost[j]=Float.parseFloat(s);
					age[j]=(conve[j]-age2);
					ma.setText(ma.getText()+"\n\n"+pname[j]+"\t     "+(-age[j])+" "+gender[j]+"\t\t"+sa+"\t"+"   S"+(j+1)+"\t        "+s);
				}
				
				//ma.setText();
				
				
				
			}
		});
		p.setFont(new Font("Times New Roman", Font.BOLD, 13));
		p.setBackground(SystemColor.textHighlight);
		p.setBounds(203, 361, 103, 23);
		contentPane.add(p);
		
		JLabel label_4 = new JLabel("PASSENGER DETAILS");
		label_4.setForeground(SystemColor.inactiveCaptionBorder);
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		label_4.setBounds(171, 72, 185, 14);
		contentPane.add(label_4);
		
		table = new JTable();
		table.setBackground(Color.GRAY);
		table.setBounds(103, 38, 329, 374);
		contentPane.add(table);
		
		 ma = new JTextArea();
		ma.setBounds(37, 423, 704, 206);
		contentPane.add(ma);
		
		JButton print = new JButton("PRINT");
		print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<num;i++)
				{
				sum=sum+cost[i];
				}
				ma.setText(ma.getText()+"\n\n\t\t\t\t\t"+"TOTAL Cost   "+sum);
			}
		});
		print.setFont(new Font("Tahoma", Font.BOLD, 11));
		print.setBounds(322, 653, 89, 23);
		contentPane.add(print);
		 pname=new String[100];
		 date=new String[100];
		 gender=new String[100];
		 conve=new int[100];
		 adate=new String[100];
		 odate=new String[100];
		 age=new int[100];
		 cost=new float[100];
		//sb=new String[100];
		
	}
}
