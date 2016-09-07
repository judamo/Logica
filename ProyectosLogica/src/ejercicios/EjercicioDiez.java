/*
 Programa: Saludo de una persona

 Capturar el nombre de una persona utilizando el componente JOptionPane para ingresar datos al programa.

 Concatenar las variables para el saludo.

 Mostrar con el componente JOptionPane la salida del saludo.


 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class EjercicioDiez {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 4;
        int r = 0;
        String op = JOptionPane.showInputDialog("Cual operador");

        switch (op) {

            case "+":
                r = num1 + num2;
                break;

            case "-":
                r = num1 - num2;
                break;

            default:
                r = 0;
                break;

        }
        
        JOptionPane.showMessageDialog(null, "La operacion es " + r);

    }

}
