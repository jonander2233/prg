package org.jonander2233.tareas.tema08.graphics;
import javax.swing.*;
import java.awt.*;

public class Game extends JPanel implements Runnable{
    private final int width;
    private final int height;
    private final float fpsLimit;
    private Thread thread;
    private boolean finished;
    private final GameOfLife gameOfLife;

    public Game (int width, int height, float fpsLimit){
        this.width = width;
        this.height = height;
        this.fpsLimit = fpsLimit ;
        this.finished = false;
        setDoubleBuffered(true);
        setPreferredSize(new Dimension(width,height));
        setBackground(Color.BLACK);
        setFocusable(true);
        gameOfLife = new GameOfLife(width,height,10);
    }
    public void start(){
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        final double NANOS_BETWEEN_UPDATES = 1_000_000_000 / fpsLimit;
        long currentFrame;
        long lastFrame = currentFrame = System.nanoTime();
        System.out.println("Iniciando hilo...");
        while(!finished){
            currentFrame = System.nanoTime();
            if (currentFrame - lastFrame > NANOS_BETWEEN_UPDATES){
                processInput();
                update();
                draw();
                lastFrame = currentFrame;
            }
        }
    }
    private void draw(){
        //TODO: draw

        repaint();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        gameOfLife.draw(g2);
    }

    private void update(){
        //TODO: update
        /*
        personaje.x = personaje.x + velocidad;
        */
    }
    private void processInput(){
        //TODO: processInput
    }
}
