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
                    caso1(conexion);
                    break;
                case 2:
                    caso2(conexion);
                    break;
                case 3:
                    sinHacer();
                    break;
                default:
                    break;
            }
        } while (!salir);
    }
    private static void caso1(Connection conexion) throws SQLException {
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

    private static void caso2(Connection conexion) throws SQLException {
        String[] opciones = new String[]{"ver todo","ver un id","ver nombre"};
        int respuesta = Menu.mostrar("VER",opciones,"volver");
        switch (respuesta) {
            case 0:
                return;
            case 1:
                verTodo(conexion);
                break;
            case 2:
                sinHacer();
                break;
            case 3:
                sinHacer();
                break;
            default:
                break;
        }
    }

    private static void caso3(){
        String[] opciones = new String[]{"","","",""};
        int respuesta = Menu.mostrar("",opciones,"volver");
        switch (respuesta) {
            case 0:
                return;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
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
            String resultado = "Usuario " + id + " = " + nombre +" "+ nombre2 +" "+ apellido +" "+ apellido2 +" "+ correo;
            System.out.println(resultado);
        }
    }
    private static void sinHacer(){
        System.out.println("falta programar xd");
    }
}
