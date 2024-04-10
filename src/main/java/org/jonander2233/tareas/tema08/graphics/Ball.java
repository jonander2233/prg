package org.jonander2233.tareas.tema08.graphics;

import java.awt.*;

public class Ball {
    private float X;
    private float Y;
    private float speedX;
    private float speedY;
    private final float size;
    private final Color color;
    private float worldWidth;
    private float worldHeight;

    public Ball(float x, float y, float size,float speed, Color color,float worldWidth,float worldHeight) {
        X = x;
        Y = y;
        this.size = size;
        this.speedX = speed;
        this.speedY = speed;
        this.color = color;
        this.worldWidth = worldWidth;
        this.worldHeight = worldHeight;
    }

    public float getSpeedX() {
        return speedX;
    }
    public float getSpeedY() {
        return speedY;
    }

    public float getSize() {
        return size;
    }

    public float getX() {
        return X;
    }

    public float getY() {
        return Y;
    }
    public void update(){
        if(X + speedX >= worldWidth - size  || X + speedX <=0){
            speedX += speedX * 0.05;
            speedX *= -1;
        }
        this.X += speedX;
        if(Y + speedY >= worldHeight  - size|| Y + speedY <=0){
            speedY += speedY * 0.05;
            speedY *= -1;
        }
        this.Y += speedY;

    }
    public void draw(Graphics2D g2){
        int s = Math.round(size);
        g2.setColor(color);
        g2.fillOval((Math.round(X)) ,Math.round(Y),s,s);
    }
}
