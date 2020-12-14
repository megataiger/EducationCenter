import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "ilya", "")) {
            DataBase.addStuff(connection);
            DataBase.addStuff(connection);
            DataBase.addStuff(connection);

            DataBase.getStuff(connection);

            System.out.println();

            DataBase.getStuffById(connection,1);
        }
    }
}
