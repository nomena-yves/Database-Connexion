package hei.group.connexionbase.connexionbase;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Component
public class DataBaseConnexion {
    final static String URL = "jdbc:postgresql://localhost:5432/todo";
    final static String USER = "postgres";
    final static String PASSWORD = "nomena";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            if (conn != null) {
                System.out.println(" Connexion réussie à la base de données !");
            } else {
                System.out.println(" Échec de la connexion !");
            }
        } catch (SQLException e) {
            System.out.println(" Erreur de connexion : " + e.getMessage());
            e.printStackTrace();
        }
    }

}
