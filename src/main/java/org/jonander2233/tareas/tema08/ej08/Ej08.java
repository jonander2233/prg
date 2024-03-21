package org.jonander2233.tareas.tema08.ej08;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ej08 {
    Logic logic = new Logic();
    private static final int COLS = 1;
    private static final int ROWS = 4;

    private static final int WIDTH = 800;
    private static final int HEIGHT = 400;
    private static final int SEMILLA = 7398368;
    public static void ej(){
        Random rnd = new Random(SEMILLA);
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("test 1");
        frame.setSize(WIDTH, HEIGHT);

        panel.setLayout(null);
        frame.setContentPane(panel);
        //cuadro de texto 1
        JTextField texto1Cuadro = new JTextField(20);
        texto1Cuadro.setBounds(150,50,500,30);

        //cuadro de texto 2
        JTextField texto2Cuadro = new JTextField(20);
        texto2Cuadro.setBounds(150,100,500,30);

        //cuadro de texto semilla
        JTextField semillaCuadro = new JTextField(20);
        semillaCuadro.setBounds(150,200,100,30);

        //texto1
        JLabel texto1 = new JLabel("TEXTO A ENCRIPTAR");
        texto1.setForeground(new Color(0,0,0,100));
        texto1.setBounds(10,50,500,30);


        //texto2
        JLabel texto2 = new JLabel("TEXTO ENCRIPTADO");
        texto2.setForeground(new Color(0,0,0,100));
        texto2.setBounds(10,100,500,30);


        //texto de la semilla
        JLabel textoSemilla = new JLabel("SEMILLA");
        textoSemilla.setForeground(new Color(0,0,0,100));
        textoSemilla.setBounds(80,200,500,30);




        //adición de componentes
        frame.getContentPane().add(textoSemilla);
        frame.getContentPane().add(texto1);
        frame.getContentPane().add(texto2);
        frame.getContentPane().add(texto1Cuadro);
        frame.getContentPane().add(texto2Cuadro);
        frame.getContentPane().add(semillaCuadro);




        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
//        semillaCuadro.setText("texto");
