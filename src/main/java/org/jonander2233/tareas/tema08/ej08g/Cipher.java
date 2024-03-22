package org.jonander2233.tareas.tema08.ej08g;

import java.util.Base64;
import java.util.Random;

public class Cipher {
    private static final String table = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static String encrypt2( byte[] bytes, long seed) {
        Random random = new Random(seed);
        StringBuilder sb = new StringBuilder();
        String c="";

        for (int i = 0; i < bytes.length; i++) {
            Random random1 = new Random(random.nextInt(1,9999999));
            c = encrypt(bytes,random1.nextInt());
            sb.append(c);
        }
        return c;
    }
    public static String encrypt( byte[] bytes, long seed){
        Random random = new Random(seed);
        Base64.Encoder encoder = Base64.getEncoder();
        String text = encoder.encodeToString(bytes);
        StringBuilder sb = new StringBuilder(text.length());
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '=')
                continue;
            int pos = table.indexOf(c);
            if (pos < 0 ){
                System.out.println("ERROR: No se ha encontrado el caracter" + c );
                return null;
            }
            int key = random.nextInt(1,table.length() + 1);
            System.out.println( "Key: " + key);
            int offset = Math.floorMod(pos + key, table.length());
            sb.append(table.charAt(offset));
        }
        return sb.toString();
    }

    public static String decrypt (String encriptedText, long seed){
        Random random = new Random(seed);
        StringBuilder sb = new StringBuilder(encriptedText.length());
        for (int i = 0; i < encriptedText.length(); i++) {

        }



        return "a";
    }

}
