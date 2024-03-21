package org.jonander2233.tareas.tema08.ej08;

import javax.print.DocFlavor;
import java.util.Random;

public class Logic {
    private int seed;
    Random random = new Random(seed);
    private String letras = "AÁÀaáàBbCcDdEÉÈeéèFfGgHhIÍÌiíìJjKkLlMmNnÑnOÓÒoóòPpQqRrSsTtUÚÙuúùVvWwXxYÝyýZz";
    public Logic(int seed) {
        this.seed = seed;
    }


    public Logic() {
        this.seed = random.nextInt(100000,999999);
    }

//    public String encrypt1(String text,int key){
//        int offset = (pos + key)  % letras.length();
//    }

    public String encrypt(String text){
        StringBuilder sb = new StringBuilder();
        int posLetra;
        int posFinal;
        char letra;
        for (int i = 0; i < text.length(); i++) {
            letra = text.charAt(i);
            posLetra = letras.indexOf(letra);
            posFinal = posLetra + random.nextInt(1,letras.length());
            if (posFinal > letras.length()){
                posFinal = posFinal - letras.length();

            }
            sb.append(letras.charAt(posFinal));
        }
        /*

        int result;
        char letraTexto;
        for (int i = 0; i < text.length(); i++) {
            letraTexto = text.charAt(i);
            for (int j = 0; j < letras.length(); j++) {
                if (letraTexto == letras.charAt(j)){
                   result = j + random.nextInt(letras.length());
                   if ( result > letras.length()){
                       result = result - letras.length();
                   }
                }
            }
        }

         */

        reset();
        return "s";
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
