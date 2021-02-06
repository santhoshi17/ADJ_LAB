package exp4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCprogram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
			// Create query
			System.out.println("Creating a table");
			String query="CREATE TABLE students.stud ("
					+ "studno INT NOT NULL,"
					+ "name VARCHAR(45) NOT NULL,"
					+ "fee INT NOT NULL,"
					+ "dept VARCHAR(45) NOT NULL)";
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			
			System.out.println("Table Created\n");
			// output: Table Created
			
			System.out.println("Inserting Values");
			String query1 = "INSERT INTO stud " + "VALUES (0501, 'Sowmya', 55000, 'CSE')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO stud " + "VALUES (1202, 'Jhansi', 62000, 'IT')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO stud " + "VALUES (0203, 'Bhanu', 65000, 'EEE')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO stud " + "VALUES (0306, 'Damini', 49000, 'MECH')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO stud " + "VALUES (0419, 'Shruthi', 70000, 'ECE')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO stud " + "VALUES (0136, 'Bhavitha', 50000, 'CIVIL')";
			stmt.executeUpdate(query1);
			
			System.out.println("Displaying Values\n");
			ResultSet rs = stmt.executeQuery("SELECT * FROM stud");
	         System.out.println("studno\tname\tfee\tdept");
	         
	         while (rs.next()) {
	            int studno = rs.getInt("studno");
	            String name = rs.getString("name");
	            String sal = rs.getString("fee");
	            String dept = rs.getString("dept");
	            System.out.println(studno + "\t" + name + "\t" + sal + "\t" + dept);
	         }
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
