
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class Ejercicio13 {
    
    

    public static void main(String[] args) {

        mostrar("Hola mundo");
        mostrar("estamos en ");
        mostrar("clase de programacion");
        String nombre = "Pedro";
        mostrarSaludoNombre("hola ",nombre);

    }

    private static void mostrar(String msg) {
        
        JOptionPane.showMessageDialog(null, msg);
        
    }

    private static void mostrarSaludoNombre(String saludo, String nombre) {
        
        JOptionPane.showMessageDialog(null, saludo + nombre);
    }

    

}
