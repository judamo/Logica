
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class EjercicioDoce {

    public static void main(String[] args) {

        String mes = JOptionPane.showInputDialog("Ingrese el Numero del mes");
        int mesc = Integer.parseInt(mes);
        String salida = "";
        switch (mesc) {
            case 1:
                salida = "Enero";
                break;
            case 2:
                salida = "Febrero";
                break;
            case 3:
                salida = "Marzo";
                break;
            default:
                salida = "El mes no esta disponible";
                break;
        }
        
        String msg = "El mes " + mesc + " es " + salida;
        JOptionPane.showMessageDialog(null, msg );

    }

}
