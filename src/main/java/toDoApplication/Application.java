package toDoApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	// db connection
	public void getConnection() throws SQLException {
		String url;
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			url = "jdbc:mysql://localhost:3306/mySQL";
			String user = "root";
			String password = "root";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection created");
			con.close();
			System.out.println("Connection closed");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// get tasks of the list
	public ArrayList<String> getTasks(Integer listid) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mySQL");
		ArrayList<String> taskName = new ArrayList<String>();
		try {
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM task WHERE listid = '" + listid + "';");
			while (rs.next()) {
				taskName.add(rs.getString(2) + " , ");
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return taskName;
	}

	
	// get lists of the user
	public ArrayList<String> getLists(Integer userid) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mySQL");
		ArrayList<String> listName = new ArrayList<String>();
		try {
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM mylist WHERE userid = '" + userid + "';");
			while (rs.next()) {
				listName.add(rs.getString(2) + " , ");
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listName;
	}
	
	
	public static void main(String[] args) throws SQLException {
		SpringApplication.run(Application.class, args);

		Application app = new Application();
		app.getConnection();
		app.getLists(1);
		app.getTasks(2);
	}

}
