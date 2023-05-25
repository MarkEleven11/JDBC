package org.example;

import java.sql.*;

public class Application {
    public static void main(String[] args) {

        final String user = "postgres";
        final String password = "AliveLegents";
        final String url = "jdbc:postgresql://localhost:5432/skypro";

        try (final Connection connection = DriverManager.getConnection(url, user, password)){
            PreparedStatement statement = connection.prepareStatement("" + "SELECT * FROM employee WHERE id = (?)"); {
                statement.setInt(1,6);
                final ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()){
                    String name = "Name " + resultSet.getString("first_name");
                    String surname = "Surmname " + resultSet.getString("last_name");
                    String gender = "Gender " + resultSet.getString("gender");
                    int age = resultSet.getInt(5);

                    System.out.println(name);
                    System.out.println(surname);
                    System.out.println(gender);
                    System.out.println("Age " + age);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
