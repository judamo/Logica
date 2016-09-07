package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class EjercicioNueve {

    public static void main(String[] args) {

        String nota1 = JOptionPane.showInputDialog("Ingrese nota 1");
        String nota2 = JOptionPane.showInputDialog("Ingrese nota 2");
        String nota3 = JOptionPane.showInputDialog("Ingrese nota 3");
        
        double nota1c = Double.parseDouble(nota1);
        double nota2c = Double.parseDouble(nota2);
        double nota3c = Double.parseDouble(nota3);
        
        double promedio = (nota1c + nota2c + nota3c)/3;
        
        JOptionPane.showMessageDialog(null, "El promedio es " + promedio);
        
        
    }

}
