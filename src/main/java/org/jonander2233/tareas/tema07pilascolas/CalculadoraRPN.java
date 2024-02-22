package org.jonander2233.tareas.tema07pilascolas;

import org.jonander2233.lib_personal.PilaDouble;

public class CalculadoraRPN {
    private String data;
    private final PilaDouble pila;

    public CalculadoraRPN(String expresion){
        this.data = expresion;
        this.pila = new PilaDouble(10);
    }
    public double parse(){
        data = data.trim();
        double res = Double.POSITIVE_INFINITY;
        //separa el texto cada vez que encuentre uno o más espacios y guarda tod0 en el array "values"
        String[] values = data.split("\\S+");
        for (String value : values){
            if (isNum(value)){      //si es un numero hace esto
                pila.push(Double.parseDouble(value));
            }else if (isOperator(value)){ // si es un operador haz esto
                double op2 = pila.pop();
                double op1 = pila.pop();
                res = operation(value,op1,op2);
                pila.push(res);
            }
        }
        res = pila.pop();
        if (pila.isEmpty())
            return res;
                else
            return Double.POSITIVE_INFINITY;
    }
    private double operation(String operator,double op1, double op2){
        switch (operator){
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
        }
    }
    private boolean isOperator(String text){
        switch (text){
            case "+": case "-": case "*": case "/":
                return true;
        }
        return false;
    }

    private boolean isNum(String text){
        if(text == null || text.isEmpty())
            return false;
        int numDots =0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(!Character.isDigit(text.charAt(i))){
                if(c == '.'){
                    numDots++;
                    if(numDots > 1){
                        return false;
                    } else {
                        return false;
                    }

                } else {
                return false;
                }
            }
        }
        return true;
    }
}
