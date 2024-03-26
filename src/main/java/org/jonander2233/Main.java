package org.jonander2233;
//import org.jonander2233.tareas.tareas_t07.ej06.Ej06;
//import org.jonander2233.tareas.tema08.ej05.ej05;
import org.jonander2233.tareas.tema08.ej08.Ej08;
import org.jonander2233.tareas.tema08.ej08.TestLogic;
import org.jonander2233.tareas.tema08.graphics.Game;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Game Of Life");
        Game game = new Game(1280,960, 60);
        frame.add(game);
        frame.pack();
        game.start();
        frame.setVisible(true);

    }
} 