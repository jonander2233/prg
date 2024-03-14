package org.jonander2233.tareas.tema08.ej01;

import javax.swing.*;
import java.awt.*;

public class ej01 {
    public static void ejercicio(){
        JFrame ventana = new JFrame("Hola Swing");
        int width = 800;
        int height = 600;
        ventana.setSize(width, height);
        ventana.setBounds(0,0,width, height);
        ventana.setResizable(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
