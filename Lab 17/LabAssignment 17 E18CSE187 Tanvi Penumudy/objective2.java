package lab17;

import java.sql.*; // Use classes in java.sql package
public class objective2 {
public static void main(String[] args) {
try (
// Step 1: Allocate a database "Connection" object
Connection conn = DriverManager.getConnection("jdbc:odbc:ebookshopODBC"); // Access/Excel
// Step 2: Allocate a "Statement" object in the Connection
Statement stmt = conn.createStatement();
) {
// Excel connection, by default, is read-only.
// Need to turn it off to issue INSERT, UPDATE, ...
conn.setReadOnly(false);
// Step 3: Execute a SQL SELECT query, the query result
// is returned in a "ResultSet" object.
// Table name is the sheet's name in the form of [sheet-name$]
String strSelect = "select title, price, qty from [books$]";
System.out.println("The SQL query is: " + strSelect); // Echo For debugging
ResultSet rset = stmt.executeQuery(strSelect);
// Step 4: Process the ResultSet by scrolling the cursor forward via next().
// For each row, retrieve the contents of the cells with getXxx(columnName).
System.out.println("The records selected are:");
int rowCount = 0;
while(rset.next()) { // Move the cursor to the next row
String title = rset.getString("title");
double price = rset.getDouble("price");
int qty = rset.getInt("qty");
System.out.println(title + ", " + price + ", " + qty);
++rowCount;
}
System.out.println("Total number of records = " + rowCount);
// Try INSERT
int returnCode = stmt.executeUpdate("insert into [books$] values (1002, 'Java 101', 'Tan Ah Teck', 2.2, 2)");
System.out.println(returnCode + " record(s) inserted.");
// Try UPDATE
returnCode = stmt.executeUpdate(
"update [books$] set qty = qty+1 where id = 1002");
System.out.println(returnCode + " record(s) updated.");
} catch(SQLException ex) {
ex.printStackTrace();
}
// Step 5: Close the resources - Done automatically by try-with-resources
}
}