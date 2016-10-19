/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class nueve {

    public static void main(String[] args) {

        boolean continuar = true;
        int cantidad = 0;

        while (continuar) {

            String palabra = JOptionPane.showInputDialog("ingrese palabra");
            char c = palabra.charAt(1);

            if (c == 'a') {
                cantidad++;
                JOptionPane.showMessageDialog(null, "la cantidad son : " + cantidad);
            }
            if (cantidad == 3) {
                continuar = false;
            }

        }

    }

}
