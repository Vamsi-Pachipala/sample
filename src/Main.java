import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.*;
public class Main
{
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/casestudy";
        String username = "root";
        String password = "Vamsi@243";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM passengers";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String column1Value = resultSet.getString("name");
                System.out.println(column1Value);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}