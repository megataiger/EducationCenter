import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataBase.addStuff();
        DataBase.addStuff();
        DataBase.addStuff();

        DataBase.getStuff();

        System.out.println();

        DataBase.getStuffById(1);
    }
}
