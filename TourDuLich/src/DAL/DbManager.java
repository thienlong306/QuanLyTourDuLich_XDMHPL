package DAL;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.jdbc.ResultSet;

public class DbManager {
	private static Connection c = null;
	private static PreparedStatement s =null;
	protected static ResultSet rs = null;
	private static String sql;
	
	public static void connectDB(String host, String port, String dbName, String dbUser, String dbPassword) {
		String dbPath = "jdbc:mysql://" + host + ":" + port + "/" + dbName + "?useUnicode=true&characterEncoding=UTF-8";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = (Connection) DriverManager.getConnection(dbPath, dbUser, dbPassword);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void setSQL(String sql) {
		DbManager.sql=sql;
	}
	public static void query() {
		try {
			
			s = c.prepareStatement(sql);
			rs =(ResultSet) s.executeQuery();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	public static void update() {
		try {
			s.executeUpdate(sql);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	public static void addSort(String sort) {
		DbManager.sql += " " + sort;
	}
	
	
}
