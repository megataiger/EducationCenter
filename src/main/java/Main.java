import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "ilya", "")) {

            DataBase.getStuff(connection);

            System.out.println();

            DataBase.delStuff(connection,6);

            DataBase.getStuff(connection);

        }
    }
}
