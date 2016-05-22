import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.security.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class DodawanieMeczy implements ActionListener
{
	
	private JTextField pole1, pole2, pole3, pole4;
	private JLabel etyk1, etyk2, etyk3, etyk4;
	private JPanel panel1; 
	private JButton czysc, dodaj;
	private Connection c;
	
	public DodawanieMeczy()
	{		
		JFrame frame = new JFrame("Dodawanie");
		JPanel contentPane = (JPanel) frame.getContentPane();
		frame.setSize(400,150);
		frame.setLocation(50,300);
		frame.setResizable(false);
		contentPane.setLayout(new GridLayout(3,2));
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(0));
		
		pole1 = new JTextField(10);
		pole1.setEditable(true);
		pole1.setMaximumSize(pole1.getPreferredSize());
		etyk2 = new JLabel("Przeciwnik");
		etyk2.setMaximumSize(etyk2.getPreferredSize());
		contentPane.add(pole1);
		contentPane.add(etyk2);
		
		pole2 = new JTextField(10);
		pole2.setEditable(true);
		pole2.setMaximumSize(pole2.getPreferredSize());
		etyk1 = new JLabel("Wynik");
		etyk1.setMaximumSize(etyk1.getPreferredSize());
		contentPane.add(pole2);
		contentPane.add(etyk1);
		
		dodaj = new JButton("Dodaj");
		dodaj.setActionCommand("Dodaj");
		dodaj.addActionListener(this);
		czysc = new JButton("Czysc");
		contentPane.add(dodaj);
		contentPane.add(czysc);

		
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public void polaczenie() 
	{
		 
        try{ 
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("# - Driver Loaded");
			
			
			String server = "localhost\\sqlexpress";
			int port = 4443; //1064
			String user = "sa"; // Sql server username
			String password = "qwerty";
			String database = "Menadzer1";

            String jdbcUrl = "jdbc:sqlserver://"+server+":"+port+";user="+user+";password="+password+";databaseName="+database+"";
			
			Connection c = DriverManager.getConnection(jdbcUrl);
			System.out.println("# - Connection Obtained");
			
			Statement stmt = c.createStatement();
			System.out.println("# - Statement Created");  
            }catch(Exception ek){ 
            System.out.println("Brak polaczenia."); 
            } 
	}
	 public void actionPerformed(ActionEvent e)
	 {
		 try{ 
	        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				System.out.println("# - Driver Loaded");
				
				
				String server = "localhost\\sqlexpress";
				int port = 4443; //1064
				String user = "sa"; // Sql server username
				String password = "qwerty";
				String database = "Menadzer1";

	            String jdbcUrl = "jdbc:sqlserver://"+server+":"+port+";user="+user+";password="+password+";databaseName="+database+"";
				
				Connection c = DriverManager.getConnection(jdbcUrl);
				System.out.println("# - Connection Obtained");
				
				Statement stmt = c.createStatement();
				try {
					   String s1 = pole1.getText().trim();
					   String s2 = pole2.getText().trim();
					   
					   stmt.executeUpdate("INSERT into Mecze ( Przeciwnik, Wynik) VALUES ('"+s1+"' , '"+s2+"')");
					  System.out.println("Rekord zosta³ utworzony");
					  } catch (SQLException ek) {
					   System.out.println("Uwaga! Rekord ju¿ istnieje");
					  }
				
				
				System.out.println("# - Statement Created");  
	            }catch(Exception ek){ 
	            System.out.println("Brak polaczenia."); 
	            }  
	 }
		 
}
		 
		 
	 
