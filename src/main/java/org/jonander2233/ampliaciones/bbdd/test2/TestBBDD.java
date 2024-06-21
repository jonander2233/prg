package org.jonander2233.ampliaciones.bbdd.test2;

import org.jonander2233.lib_personal.Eys;
import org.jonander2233.lib_personal.Menu;

import java.sql.*;

public class TestBBDD {
    public static void test(){
        final String HOST = "localhost";
        final int PORT = 3306;
        final String DB_NAME = "prg";
        String url = "jdbc:mysql://"+ HOST +":"+ PORT +"/" + DB_NAME;


        try(Connection conexion = DriverManager.getConnection(url,"prg","1234")) {
            System.out.println("conexion extablecida");

            menu(conexion);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    private static void menu(Connection conexion) throws SQLException {
        String[] opciones = new String[]{"insertar","ver","borrar"};
        boolean salir = false;
        do{
            int respuesta = Menu.mostrar("TEST BASES DE DATOS",opciones,"Salir");
            switch (respuesta) {
                case 0:
                    salir = true;
                    break;
                case 1:
                    insertar(conexion);
                    break;
                case 2:
                    ver(conexion);
                    break;
                case 3:
                    borrar(conexion);
                    break;
                default:
                    break;
            }
        } while (!salir);
    }

    private static void insertar(Connection conexion) throws SQLException {
        String nombre = Eys.imprimirYLeer("Introduce tu nombre",2,10);
        String nombre2 = Eys.imprimirYLeer("Introduce tu segundo nombre",2,10);
        String apellido = Eys.imprimirYLeer("Introduce tu apellido",2,10);
        String apellido2 = Eys.imprimirYLeer("Introduce tu segundo apellido",2,10);
        String correo = Eys.imprimirYLeer("Introduce tu correo",2,30);
        boolean insertar = Eys.ImprimirYleerCharSN("Desea insertar el usuario?");
        if(insertar){
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO usuarios (nombre,nombre_2,apellido_1,apellido_2,correo) VALUES (?,?,?,?,?)");
            ps.setString(1,nombre);
            ps.setString(2,nombre2);
            ps.setString(3,apellido);
            ps.setString(4,apellido2);
            ps.setString(5,correo);
//            ps.executeQuery();
            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Insertado");
            }
        }
    }

    private static void ver(Connection conexion) throws SQLException {
        String[] opciones = new String[]{"ver todo","ver un id","ver nombre"};
        int respuesta = Menu.mostrar("VER",opciones,"volver");
        switch (respuesta) {
            case 0:
                return;
            case 1:
                verTodo(conexion);
                break;
            case 2:
                verId(conexion);
                break;
            case 3:
                sinHacer();
                break;
            default:
                break;
        }
    }
    private static void verTodo(Connection conexion) throws SQLException {
        PreparedStatement ps = conexion.prepareStatement("SELECT * FROM usuarios");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String nombre2 = rs.getString("nombre_2");
            String apellido = rs.getString("apellido_1");
            String apellido2 = rs.getString("apellido_2");
            String correo = rs.getString("correo");
            String resultado = "Usuario " + id + " = " + nombre +" "+ nombre2 +" "+ apellido +" "+ apellido2 +" con correo: "+ correo;
            System.out.println(resultado);
        }
    }
    private static void verId(Connection conexion) throws SQLException {
        int id = Eys.imprimirYLeerInt("Introduce el id",1,Integer.MAX_VALUE);
        PreparedStatement ps = conexion.prepareStatement("SELECT * FROM usuarios WHERE id = ?");
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int id_res = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String nombre2 = rs.getString("nombre_2");
            String apellido = rs.getString("apellido_1");
            String apellido2 = rs.getString("apellido_2");
            String correo = rs.getString("correo");
            String resultado = "Usuario " + id_res + " = " + nombre +" "+ nombre2 +" "+ apellido +" "+ apellido2 +" con correo: "+ correo;
            System.out.println(resultado);
        }else {
            System.out.println("no se encontró el usuario con id: " + id);
        }
    }


    private static void borrar(Connection conexion) throws SQLException {
        boolean borrar;
        String[] opciones = new String[]{"borrar por id","borrar por nombre","borrar por correo"};
        int respuesta = Menu.mostrar("BORRAR",opciones,"volver");
        switch (respuesta) {
            case 0:
                return;
            case 1:
                int id = Eys.imprimirYLeerInt("Introduce el id del usuario que desea borrar",1,Integer.MAX_VALUE);
                borrar = Eys.ImprimirYleerCharSN("Seguro que desea borrar el id " + id + "?");
                if(borrar){
                    PreparedStatement ps = conexion.prepareStatement("DELETE FROM usuarios WHERE id = ?");
                    ps.setInt(1, id);
                    int filasAfectadas = ps.executeUpdate();
                    if(filasAfectadas > 0){
                        System.out.println("Se ha borrado el ID: " + id);
                    } else {
                        System.out.println("No se encontró el ID: " + id + " en la tabla.");
                    }
                }
                break;
            case 2:
                String nombre = Eys.imprimirYLeer("Introduce el nombre del usuario que desea borrar",1,Integer.MAX_VALUE);
                String apellido = Eys.imprimirYLeer("Introduce el primer apellido del usuario que desea borrar",1,Integer.MAX_VALUE);
                borrar = Eys.ImprimirYleerCharSN("Seguro que desea borrar el usuario?");
                if(borrar){
                    PreparedStatement ps = conexion.prepareStatement("DELETE FROM usuarios WHERE nombre = ? AND apellido_1 = ?");
                    ps.setString(1, nombre);
                    ps.setString(2,apellido);
                    int filasAfectadas = ps.executeUpdate();
                    if(filasAfectadas > 0){
                        System.out.println("Se ha borrado el usuario "+ nombre + " "+ apellido);
                    } else {
                        System.out.println("No se encontró el usuario "+ nombre + " "+ apellido);
                    }
                }
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
    }

    private static void sinHacer(){
        System.out.println("falta programar xd");
    }
}
