package org.jonander2233.tareas.tema08.ej03;

import javax.swing.*;
import java.awt.*;

public class ej03 {
    public static void ejercicio(){
        int width = 800;        //ancho
        int height = 600;       //alto
        Toolkit tk = Toolkit.getDefaultToolkit();
        JFrame ventana = new JFrame("Hola Swing"); //ventana
        Container container = ventana.getContentPane();
        container.setLayout(null);
        JLabel label1 = new JLabel("Bienvenido al mundo de las interfaces gráficas");
        container.add(label1);
        label1.setBounds(20, 20, width, 20);
        label1.setBackground(Color.gray);
        label1.setOpaque(true);
        ventana.setSize(width,height);
        ventana.setBounds(0,0,width,height);



        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
