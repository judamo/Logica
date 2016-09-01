/*
Programa: Suma de dos números

Capturar los dos números requeridos para hacer una operación matemática, utilice el componente JOptionPane  para ingresar datos al programa pero tenga cuidado por que debemos transformar a entero.

Realizar operación con los operadores

Generar la siguiente salida con el JOptionPane con el siguiente texto:

“La suma de 2+2 = 4”



 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class EjercicioSeis {

    public static void main(String[] args) {

       String num1 = JOptionPane.showInputDialog("Ingrese Valor");//obtener dato
       //convertir dato a entero
       int num1c = Integer.parseInt(num1);
       
       int num2c = 2;
       
       //operacion
       
       int suma = num1c+ num2c;
       
       // la suma 2+2 = 4
       String msg = "La suma " + num1c + " + " + num2c + " = " + suma; 
       
       JOptionPane.showMessageDialog(null, msg);
       
        
        
    }

}
