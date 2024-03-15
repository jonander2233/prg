package org.jonander2233.tareas.tema08.ej05;

import org.jonander2233.lib_personal.Operaciones;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ej05 {
    public static void ejercicio(){
        int width = 1024;        // ancho
        int height = 768;        // alto
        final int[] numIntentos = {5};

        JFrame ventana = new JFrame("Hola Swing"); // ventana
        Container container = ventana.getContentPane();
        JLabel label1 = new JLabel("Intentos restantes: " + numIntentos[0]);
        JTextField numIntroducido = new JTextField(10);
        JButton boton = new JButton("Aceptar");

        container.setLayout(new FlowLayout()); // Establece el diseño del contenedor

        container.add(label1);
        container.add(numIntroducido);
        container.add(boton);

        ventana.setSize(width, height);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
