package ocp11book.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDerby {
//    public static void main(String[] args) {
    // getConnection, prepareStatement, executeUpdate methods throw checked SQLException
    // they must be declared or handled
    public static void main(String[] args) throws SQLException {
        var sql = "UPDATE food SELECT amount = amount + 1";

        try (
                var conn = DriverManager.getConnection("jdbc:derby:zoo");
                var ps = conn.prepareStatement(sql)) {

            var result = ps.executeUpdate();
            System.out.println(result);
        }
    }
}
