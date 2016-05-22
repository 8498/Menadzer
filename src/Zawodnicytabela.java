import javax.swing.*;

import java.sql.*;
import java.util.Vector;
import java.awt.event.*;
import java.awt.*;
import java.io.PrintStream;


public class Zawodnicytabela {
	
	private boolean DEBUG = false;
	private PrintStream c;
	  public Zawodnicytabela() {
		  Vector<String> columnNames = new Vector<String>();
	        columnNames.addElement("ID");
	        columnNames.addElement("Imie");
	        columnNames.addElement("Nazwisko");
	        columnNames.addElement("Pozycja");
	        columnNames.addElement("Pensja");

	       
	try {
				
				
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
				
				ResultSet rs = stmt.executeQuery("SELECT ID, Imie, Nazwisko, Pozycja, Pensja FROM Zawodnicy;");
				System.out.println("# - Query Executed");
	      Vector<Vector> wiersz = new Vector<Vector>();
	      while (rs.next()) {

	        String pid=rs.getString("ID");
	        String pim=rs.getString("Imie");
	        String pna=rs.getString("Nazwisko");
	        String pwi=rs.getString("Pozycja");
	        String pwh=rs.getString("Pensja");

	                Vector<String> elementy = new Vector<String>();
	                elementy.removeAllElements();
	                elementy.addElement(pid);
	                elementy.addElement(pim);
	                elementy.addElement(pna);
	                elementy.addElement(pwi);
	                elementy.addElement(pwh);
	                
	                wiersz.add(elementy);

	      } rs.close();
	        JTable tabelka = new JTable(wiersz,columnNames);
	        JFrame frame =new JFrame(); //======================
	        tabelka.getColumnModel().getColumn(0).setMaxWidth(50);
	        tabelka.getColumnModel().getColumn(1).setMaxWidth(100);
	        tabelka.getColumnModel().getColumn(2).setMaxWidth(100);
	        tabelka.getColumnModel().getColumn(3).setMaxWidth(100);
	        tabelka.getColumnModel().getColumn(4).setMaxWidth(50);
	        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	        
	        if (DEBUG) {
	            tabelka.addMouseListener(new MouseAdapter() {
	                public void mouseClicked(MouseEvent e) {
	                    printDebugData(tabelka);
	                }

	  				private void printDebugData(JTable table) {
	  					int numRows = table.getRowCount();
	  			        int numCols = table.getColumnCount();
	  			        javax.swing.table.TableModel model = table.getModel();
	  			 
	  			        System.out.println("Value of data: ");
	  			        for (int i=0; i < numRows; i++) {
	  			            System.out.print("    row " + i + ":");
	  			            for (int j=0; j < numCols; j++) {
	  			                System.out.print("  " + model.getValueAt(i, j));
	  			            }
	  			            System.out.println();
	  			        }
	  			        System.out.println("--------------------------");
	  					
	  				}
	            });
	        }
	        
	        JScrollPane scrollPane = new JScrollPane(tabelka);
		    frame.add(scrollPane, BorderLayout.CENTER);
		    frame.setSize(460, 320);
		    frame.setLocation(900,0);
		    frame.setVisible(true); //==========================
	    }
	    catch (Exception e) {System.out.println("B³¹d przy pobieraniu danych"); }
		if (c != null) { try { c.close(); System.out.println("Po³¹czenie z baz¹ danych zamkniête"); }
	    catch (Exception e) { System.out.println("B³¹d przy zamykaniu bazy danych");
	   }}
	  }
}