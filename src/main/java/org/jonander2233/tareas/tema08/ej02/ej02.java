package org.jonander2233.tareas.tema08.ej02;

import javax.swing.*;
import java.awt.*;

public class ej02 {
    public static void ejercicio(){
        int width = 800;        //ancho
        int height = 600;       //alto
        Toolkit tk = Toolkit.getDefaultToolkit();
        JFrame ventana = new JFrame("Hola Swing"); //ventana
        JLabel contenido = new JLabel("Bienvenido al mundo de las interfaces gráficas"); //contenedor del contenido
        contenido.setLayout(null); //poner el layout del contenedor en nulo
        ventana.setContentPane(contenido); //hacer set del contenedor en la ventana
        ventana.setSize(width,height);
        ventana.setBounds(0,0,width,height);




        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
