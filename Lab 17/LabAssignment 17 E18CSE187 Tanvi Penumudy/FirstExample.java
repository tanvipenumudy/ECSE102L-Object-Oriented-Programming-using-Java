package lab17;
import java.sql.*;  
class FirstExample{  
	/*Connection - This represents the connection to a specific database. This is used to establish the
	connection with the database drive.
	Statement - This is used to execute the SQL statement.
	ResultSet - This holds the table of the data that is generated from a sql statement. For statements other
	than select, this is not necessary used since the statement would not return a table. Then instantiate your
	connection variables
	Connection con;
	Statement stmt;
	ResultSet rs;
*/

public static void main(String args[]){  
try{  
Class.forName("com.mysql.cj.jdbc.Driver"); // forced loading of the jdbc database driver

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/toy","root","Mv@12345");
//Specify the Database URL where the DNS will be and the user and password 
//here toy is the name of the database, root is user-name and password is as given  
Statement stmt=con.createStatement();  
System.out.println("Connected");
ResultSet rs=stmt.executeQuery("select * from humans");
//ResultSet will hold the data retrieved useful when we use select * operation
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));  
con.close();  
}
 catch(SQLException e) {System.out.println("sql exception");}
 catch(ClassNotFoundException e) {System.out.println("class not found exception");}
 catch(Exception e) {System.out.println("general exception");}
 
 
 }
}
  