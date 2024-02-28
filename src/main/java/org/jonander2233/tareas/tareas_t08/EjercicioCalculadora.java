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


        //inicio las variables de tamaño y posición de la ventana
        int alto = 800;
        int ancho= 500;
        int posX = 0;
        int posY = 0;

        //establezco la posición X Y en el centro de la pantalla

//        posX = (int)pantalla.getHeight() / 2 - ;

        //dimensiono la ventana
        ventana.setSize(ancho,alto);

        //posiciono la ventana
//        ventana.setBounds();
        //hago la ventana visible
        ventana.setVisible(true);
    }
}
