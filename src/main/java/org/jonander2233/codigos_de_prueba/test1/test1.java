package org.jonander2233.codigos_de_prueba.test1;

import org.jonander2233.lib_personal.Eys;

import javax.swing.*;
import java.awt.*;
import java.io.OutputStream;
import java.io.PrintStream;

public class test1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Consola en JPanel");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());

            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            panel.add(scrollPane, BorderLayout.CENTER);

            JTextField textField = new JTextField();
            panel.add(textField, BorderLayout.SOUTH);

            // Redirigir la salida estándar a JTextArea
            PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
            System.setOut(printStream);
            System.setErr(printStream);

            frame.add(panel);
            frame.setVisible(true);

            System.out.println("Hola, ¿cuál es tu edad?");

            // ActionListener para manejar la entrada cuando se presiona Enter
            textField.addActionListener(e -> {
                String input = textField.getText();
                textField.setText("");
                System.out.println("Tu edad es: " + input);
            });
        });
    }
}

class CustomOutputStream extends OutputStream {
    private JTextArea textArea;

    public CustomOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) {
        textArea.append(String.valueOf((char) b));
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}