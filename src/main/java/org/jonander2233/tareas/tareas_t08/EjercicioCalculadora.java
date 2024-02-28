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
        Dimension dimension = tk.getScreenSize();

        int alto = 800;
        int ancho= 500;

        ventana.setSize(ancho,alto);
    }
}
