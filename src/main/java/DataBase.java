import java.sql.*;
import java.util.Scanner;

public class DataBase {

    public static void addStuff(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название товара и цену через запятую и пробел");
        String stuff = scanner.nextLine();
        String[] parameters = stuff.split(", ");
        String stuffName = parameters[0];
        double stuffPrice = Double.parseDouble(parameters[1]);
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO shop (name, price) VALUES (?, ?)")) {
            preparedStatement.setString(1, stuffName);
            preparedStatement.setDouble(2, stuffPrice);

            preparedStatement.executeUpdate();
        }
    }

    public static void getStuffById(Connection connection, int id) throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM shop WHERE shop.id = ?")) {
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.print(resultSet.getInt(1) + " ");
                System.out.print(resultSet.getString(2) + " ");
                System.out.println(resultSet.getDouble(3) + " ");
            }
        }
    }

    public static void getStuff(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM shop");

            while (resultSet.next()) {
                System.out.print(resultSet.getInt(1) + " ");
                System.out.print(resultSet.getString(2) + " ");
                System.out.println(resultSet.getDouble(3) + " ");
            }
        }
    }
}
