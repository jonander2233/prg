package org.jonander2233.tareas.tema08.graphics;
import javax.swing.*;
import java.awt.*;

public class Game extends JPanel implements Runnable{
    private final int width;
    private final int height;
    private final float fpsLimit;
    private Thread thread;
    private boolean finished;
    public Game (int width, int height, float fpsLimit){
        this.width = width;
        this.height = height;
        this.fpsLimit = fpsLimit ;
        this.finished = false;
        setDoubleBuffered(true);
        setPreferredSize(new Dimension(width,height));
        setBackground(Color.BLACK);
        setFocusable(true);

    }
    public void start(){
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        long currentFrame;
        long lastFrame = currentFrame = System.nanoTime();
        System.out.println("Iniciando hilo...");
        while(!finished){
            currentFrame = System.nanoTime();
//            if (){
//                processInput();
//                update();
//                draw();
//                lastFrame = currentFrame;
//            }
        }
    }
    private void draw(){
        //TODO: draw
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
