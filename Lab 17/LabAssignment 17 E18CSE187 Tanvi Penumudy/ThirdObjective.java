package lab17;
import java.util.Scanner;

import com.mysql.cj.jdbc.PreparedStatementWrapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ThirdObjective {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Scanner input=new Scanner(System.in);
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // forced loading of the jdbc database driver

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviedb","root","Mv@12345");
			//Specify the Database URL where the DNS will be and the user and password 
			//here toy is the name of the database, root is user-name and password is as given  
			Statement stmt=con.createStatement();  
			System.out.println("enter the movie rating ");
			String rating=input.nextLine();
			System.out.println("Connected");
			String query="select * from movie where movie_RATING=?";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, rating);
			ResultSet rs=stmt.executeQuery("select * from movie where movie_RATING="+rating);
			//ResultSet will hold the data retrieved useful when we use select * operation
			while(rs.next())  
			System.out.println(rs.getString("movieNAME")+"  "+rs.getString("movieID")+" "+rs.getString("movie_RATING"));  
			con.close();  
			}
			 catch(SQLException e) {System.out.println("sql exception");}
			 catch(ClassNotFoundException e) {System.out.println("class not found exception");}
			 catch(Exception e) {System.out.println("general exception");}
			 
			 
	}

}
