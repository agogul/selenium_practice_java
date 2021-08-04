package mysql;

import java.sql.*;

public class My_Sql_Select_Commend {
    public static void main(String[] args) throws SQLException {
        Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_store", "root", "Ashagan.123");
        Statement state = db.createStatement();
        ResultSet data = state.executeQuery("select customer_id,first_name,last_name from customers3");

       while (data.next()){
           int id = data.getInt("customer_id");
           Object fname = data.getString("first_name");
           Object lname = data.getString("last_name");
           System.out.println(id+"  "+fname+"  "+lname);
       }
    }
}
