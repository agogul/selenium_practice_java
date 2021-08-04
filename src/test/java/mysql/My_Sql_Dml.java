package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class My_Sql_Dml {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_store","root","Ashagan.123");
        Statement state = con.createStatement();

        state.execute("update customers3 set first_name='gokul1' where customer_id = 10");

        state.execute("insert into customers3 values(default,'gokula','krishna','1991-01-01','890590380','12b voc nagar','vdm','TN',3000)");

        state.close();
    }
}
