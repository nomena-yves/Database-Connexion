package hei.group.connexionbase.Entity;

import hei.group.connexionbase.connexionbase.DataBaseConnexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EntityTodo {
    public void getTodo(){
        String sql="Select * from utilisateurs";
        try (Connection conn = DataBaseConnexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("title"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

