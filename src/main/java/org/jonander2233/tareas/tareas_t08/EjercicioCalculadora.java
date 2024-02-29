package org.jonander2233.tareas.tareas_t08;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjercicioCalculadora {
    public static void calc (){
        //inicio el toolkit y el jframe, además de obtener el tamaño de la pantalla
        JFrame ventana = new JFrame("Calculadora");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension pantalla = tk.getScreenSize();
        JPanel panel = new JPanel();

        //layouts
        panel.setLayout(new GridLayout(2,1));
        JButton boton = new JButton("boton1");
        JButton boton2 = new JButton("boton2");
//        JLabel pantallaCalc = new JLabel("pantalla");
        ventana.add (boton,boton2);



        //inicio las variables de tamaño y posición de la ventana
        int alto = 800;
        int ancho= 500;
        int posX = 0;
        int posY = 0;

        //establezco la posición X Y en el centro de la pantalla

        posX = (int)pantalla.getWidth() / 2 -(ancho/2) ;
        posY = (int)pantalla.getHeight() / 2 -(alto/2) ;

        //dimensiono la ventana
        ventana.setSize(ancho,alto);

        //posiciono la ventana
        ventana.setBounds(posX,posY,ancho,alto);

        //la ventana ya no se redimensiona
        ventana.setResizable(false);

        //hago la ventana visible
        ventana.setVisible(true);

        //se termina el proceso cuando se cierra la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);









//        tk.createImage("https://raja.scene7.com/is/image/Raja/products/calculadora-sobremesa-casio_PDT17590.jpg?template=withpicto410&$image=M_MS80VER_S_ES&$picto=NoPicto&hei=410&wid=410&fmt=jpg&qlt=85,0&resMode=sharp2&op_usm=1.75,0.3,2,0");
//        ventana.pack();-------------Redimensiona la ventana para ajustarse al tamaño de los layouts y
//componentes que contiene



    }
}
