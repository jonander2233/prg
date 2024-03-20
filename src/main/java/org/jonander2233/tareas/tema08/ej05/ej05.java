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
        private static int numIntentos = 5;
    public static void ejercicio(){
        int width = 1024;        // ancho
        int height = 768;        // alto

        JFrame frame = new JFrame("Hola Swing"); // ventana
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        panel.setLayout(new GridLayout(3,1));
        JLabel texto1 = new JLabel("Intentos restantes :"+ numIntentos);
        JTextField cuadroDeTexto = new JTextField();
        JButton boton = new JButton("Aceptar");



        panel.add(texto1);
        panel.add(cuadroDeTexto);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numIntentos--;
            }

        });
        panel.add(boton);

        frame.setVisible(true);

    }
}
