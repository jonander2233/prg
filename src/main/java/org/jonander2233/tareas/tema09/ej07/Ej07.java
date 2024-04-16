package org.jonander2233.tareas.tema09.ej07;
public class Ej07 {
    Ej07(){
        String[] array = {"Hola", "Adios", null, "Buenos dias", "Buenas tardes", "Buenas noches"};
        String[] array2 = {"Hola", "Adios", "Buenos dias", "Buenas tardes", "Buenas noches"};
        String[] array3 = {"Hola", "Adios", null, "Buenos dias", "Buenas tardes", "Buenas noches", null};
        String[] array4 = {"Hola", "Adios", null, "Buenos dias", "Buenas tardes", "Buenas noches", null, null};

        System.out.println("Array 1");
        mostrarCadenasArray(array);
        System.out.println("--------------------");
        System.out.println("Array 2");
        mostrarCadenasArray(array2);
        System.out.println("--------------------");
        System.out.println("Array 3");
        mostrarCadenasArray(array3);
        System.out.println("--------------------");
        System.out.println("Array 4");
        mostrarCadenasArray(array4);
    }

    public void mostrarCadenasArray(String[] array) {
        for (String cadena : array) {
            try {
                System.out.println(cadena.charAt(0));
            } catch (NullPointerException e) {
                System.out.println("nulo");
            }
        }
    }
}