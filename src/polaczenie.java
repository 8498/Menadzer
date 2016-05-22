import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class polaczenie {
	private PrintStream c;
	
	public polaczenie()
	{
	try {
		
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.println("# - Driver Loaded");
		
		
		String server = "localhost\\sqlexpress";
		int port = 4443; //1064
		String user = "sa"; // Sql server username
		String password = "qwerty";
		String database = "Menadzer";

		String jdbcUrl = "jdbc:sqlserver://"+server+":"+port+";user="+user+";password="+password+";databaseName="+database+"";
		
		Connection c = DriverManager.getConnection(jdbcUrl);
		System.out.println("# - Connection Obtained");
		
		Statement stmt = c.createStatement();
		System.out.println("# - Statement Created");
}catch (Exception e) {System.out.println("B³¹d przy pobieraniu danych"); }
	if (c != null) { try { c.close(); System.out.println("Po³¹czenie z baz¹ danych zamkniête"); }
    catch (Exception e) { System.out.println("B³¹d przy zamykaniu bazy danych");
    }}}}
