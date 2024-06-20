package org.jonander2233.ampliaciones.bbdd.test1;

import java.sql.*;

public class main {
    public static void main(String[] args) {
        final String HOST = "localhost";
        final int PORT = 3306;
        final String DB_NAME = "frases";
        String url = "jdbc:mysql://"+ HOST +":"+ PORT +"/" + DB_NAME;

        try (Connection con = DriverManager.getConnection(url,"frases","frases")){
            PreparedStatement ps = con.prepareStatement("SELECT id,frase FROM frase");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String frase = rs.getString("frase");
                System.out.println(frase);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
