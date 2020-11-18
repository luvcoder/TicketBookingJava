import db.PostgresManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class PostgreSQLJDBC {
    public static void main(String args[]) {
        Connection c = null;
        try {
            c = PostgresManager.getConnection();
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Shivaji@16");
            Statement statement = c.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Passenger");
            while (resultSet.next()) {
                System.out.println("idCard: " + resultSet.getLong("idCard"));
                System.out.println("name: " + resultSet.getString("name"));
                System.out.println("contact: " + resultSet.getInt("contact"));
                System.out.println("==========================");
            }
        }
        catch(Exception e){
                e.printStackTrace();
            }
        }
    }
