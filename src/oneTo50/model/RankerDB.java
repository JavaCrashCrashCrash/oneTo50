package oneTo50.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import oneTo50.model.Ranker;

public class RankerDB {
	Connection conn;
	Statement stmt;

	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rankerlist", "root", "doma6591");
			System.out.println("DB connected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Ranker> getRankerlist() {
		try {
			stmt = conn.createStatement();
			ArrayList<Ranker> rankerList = new ArrayList<>();
			ResultSet srs = stmt.executeQuery("Select * from ranker order by record");
			while (srs.next()) {
				String name = (new String(srs.getString("name")));
				int record = (srs.getInt("record"));
				rankerList.add(new Ranker(name, record));
			}
			return rankerList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void insertRankerDB(String name, int record) {
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate("insert into ranker(name, record) values('" + name + "', " + record + ");");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteRankerDB(String name) {
		String statement = "delete from ranker where name=" + name;
		try {
			stmt = conn.prepareStatement(statement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
