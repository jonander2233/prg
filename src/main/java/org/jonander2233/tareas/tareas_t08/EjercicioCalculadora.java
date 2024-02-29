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
        JPanel mainPanel = new JPanel();
        JPanel contenedorNumYSimbolos = new JPanel();
        JPanel  numeros= new JPanel();
        JPanel  simbolos= new JPanel();

        //main
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbcMain = new GridBagConstraints();
        //numeros y simbolos
        contenedorNumYSimbolos.setLayout(new GridBagLayout());
        GridBagConstraints gbcNumYSimbolos = new GridBagConstraints();
        //numeros
//        numeros.setLayout();
        //simbolos


        //componente pantalla
        JLabel pantallaDeLaCalculadora = new JLabel("pantalla de la calculadora");
        gbcMain.gridx = 0;
        gbcMain.gridy = 0;
        gbcMain.weighty = 0.3;
        gbcMain.fill = GridBagConstraints.BOTH;
        ventana.add(pantallaDeLaCalculadora,gbcMain);


        gbcMain.gridy = 1;
        gbcMain.weighty = 0.8;


        //componente numeros y simbolos
        JLabel numYSimbolos = new JLabel("paneles numeros y simbolos");
        gbcNumYSimbolos.gridx = 0;
        gbcNumYSimbolos.gridy = 1;

































        contenedorNumYSimbolos.setLayout(new GridLayout(2,1));
        numeros.setLayout(new GridLayout(3,3));
        simbolos.setLayout(new GridLayout(4,1));




        simbolos.add(new JButton("/"));
        simbolos.add(new JButton("X"));
        simbolos.add(new JButton("-"));
        simbolos.add(new JButton("+"));
        simbolos.add(new JButton("="));



        for (int i = 1; i < 3*3; i++) {
            numeros.add(new JButton(""+i));

        }







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









//        ventana.pack();-------------Redimensiona la ventana para ajustarse al tamaño de los layouts y



    }
}
