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
public class EjercicioCinco {

    public static void main(String[] args) {

        //recibo el dato
        String nombre = JOptionPane.showInputDialog("Ingresar Nombre");
        
        //concateno
        String saludo = "Bienvenido " + nombre;
        
        //mostrar saludo
        JOptionPane.showMessageDialog(null, saludo);
        
        
    }

}
