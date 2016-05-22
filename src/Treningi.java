import javax.swing.*;
import java.sql.*;

import java.awt.event.*;
import java.awt.*;

/* Used by InternalFrameDemo.java. */
public class Treningi {
	private boolean DEBUG = false;
	  public Treningi() {
	    JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

	    Object[][] data = {
	            {"Kathy", "Smith",
	             "Snowboarding", new Integer(5), new Boolean(false)},
	            {"John", "Doe",
	             "Rowing", new Integer(3), new Boolean(true)},
	            {"Sue", "Black",
	             "Knitting", new Integer(2), new Boolean(false)},
	            {"Jane", "White",
	             "Speed reading", new Integer(20), new Boolean(true)},
	            {"Joe", "Brown",
	             "Pool", new Integer(10), new Boolean(false)}
	            };
	    String[] columnNames = {"First Name",
            "Last Name",
            "Sport",
            "# of Years",
            "Vegetarian"};
	    JTable table = new JTable(data, columnNames);
	    
	    if (DEBUG) {
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                printDebugData(table);
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

	    JScrollPane scrollPane = new JScrollPane(table);
	    frame.add(scrollPane, BorderLayout.CENTER);
	    frame.setSize(460, 320);
	    frame.setLocation(900,420);
	    frame.setVisible(true);
	    

	  }
}