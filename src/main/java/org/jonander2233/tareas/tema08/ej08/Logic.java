package org.jonander2233.tareas.tema08.ej08;

import javax.print.DocFlavor;
import java.util.Random;

public class Logic {
    private int seed;
    Random random = new Random(seed);

    public Logic(int seed) {
        this.seed = seed;
    }

    public Logic() {
        this.seed = random.nextInt(100000,999999);
    }

    public String encrypt(String text){
        StringBuilder sb = new StringBuilder();
        int place;
        int character;
        int intResult;
        int charResult;
        String encrypted ="";
        for (int i = 0; i < text.length(); i++) {
            place = random.nextInt(1,27);
            character = (int) text.charAt(i);
            intResult = character + place;
            charResult = (char)intResult;
            sb.append(charResult);
            encrypted = sb.toString();
        }
        reset();
        return encrypted;
    }

    public String decrypt(String text) {
        int place;
        for (int i = 0; i < text.length(); i++) {
            place = random.nextInt(1,27);

        }
        return "a";

    }
    public void updateSeed(int seed){
        this.seed = seed;
    }
    public void reset(){
        this.random = new Random(this.seed);
    }
}
