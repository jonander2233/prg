package org.jonander2233.tareas.tareas_t08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void test() {

        JFrame ventana = new JFrame("Ventana en medio de la pantalla");
        int width = 800;
        int height = 400;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        ventana.setSize(width, height);
        int x = (int) (dimension.getWidth() / 2f) - Math.round(width / 2f); //Posicionar ventana en medio.
        int y = (int) (dimension.getHeight() / 2f) - Math.round(height / 2f); //Posicionar ventana en medio.
        JPanel panel = new JPanel();
        GridLayout gridLayout = new GridLayout(4, 5);
        panel.setLayout(gridLayout);






        for(int i = 1; i <= 4 * 5; i++) {
            JButton button = new JButton("Boton" + i);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Se ha pulsado el boton" + button.getText());
                }
            });
            panel.add(button);
        }
        //panel.add(label1);
        //panel.add(label2);

        ventana.setContentPane(panel);
        ventana.setBounds(x, y , width, height);
        ventana.setResizable(true);
        ventana.pack();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

        int opcion = JOptionPane.showConfirmDialog(ventana, "¿Seguro que desea salir?");
        System.out.println(opcion);

    }
}