/*

Programa: Automóvil Inteligente

En caso que no este en verde, el carro solo estará en reposo.
El carro solo debe arrancar si esta encendido y en verde
En caso que este en verde pero apagado el carro se debe encender y arrancar 

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
