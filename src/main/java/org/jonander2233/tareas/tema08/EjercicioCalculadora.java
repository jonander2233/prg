package org.jonander2233.tareas.tema08;
import javax.swing.*;
import java.awt.*;

public class EjercicioCalculadora {
    public static void calc (){
        //inicio el toolkit y el jframe, además de obtener el tamaño de la pantalla
        JFrame ventana = new JFrame("Calculadora");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension pantalla = tk.getScreenSize();
        JPanel mainPanel = new JPanel();
        JPanel contenedorNumYSimbolos = new JPanel();
        JPanel  numeros= new JPanel();
        JPanel  simbolos= new JPanel();

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

        // Creamos el panel y establecemos el layout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Agregamos un componente en la fila superior
        JLabel label = new JLabel("Contenido de la fila superior");
        gbc.gridx = 0; // Columna 0
        gbc.gridy = 0; // Fila 0
        gbc.weighty = 0.2; // 20% de la altura disponible
        gbc.fill = GridBagConstraints.BOTH; // Ocupa tanto en vertical como en horizontal
        panel.add(label, gbc);

        // Creamos un nuevo panel para la fila inferior con otro GridBagLayout
        JPanel panelInferior = new JPanel(new GridBagLayout());
        GridBagConstraints gbcInferior = new GridBagConstraints();

        // Agregamos una columna que ocupa el 80% del espacio
        JLabel label80 = new JLabel("Contenido columna 80%");
        gbcInferior.gridx = 0; // Columna 0
        gbcInferior.gridy = 0; // Fila 0
        gbcInferior.weightx = 0.8; // 80% del ancho disponible
        gbcInferior.fill = GridBagConstraints.BOTH;
        panelInferior.add(label80, gbcInferior);

        // Agregamos otra columna que ocupa el 20% del espacio
        JLabel label20 = new JLabel("Contenido columna 20%");
        gbcInferior.gridx = 1; // Columna 1
        gbcInferior.weightx = 0.2; // 20% del ancho disponible
        panelInferior.add(label20, gbcInferior);

        // Agregamos el panel inferior al panel principal en la fila 1
        gbc.gridy = 1; // Fila 1
        gbc.weighty = 0.8; // 80% de la altura disponible
        panel.add(panelInferior, gbc);

        // Agregamos el panel a la ventana
//        add(panel);











        //hago la ventana visible
        ventana.setVisible(true);

        //se termina el proceso cuando se cierra la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);












    }
}
