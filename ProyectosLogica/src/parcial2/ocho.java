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
public class ocho {

    public static void main(String[] args) {

        int dolar = 2900;
        int euro = 3300;
        int yen = 29;
        int cantidadPersonas = 0;
        int valorFinal = 0;

        while (cantidadPersonas < 5) {

            String moneda = JOptionPane.showInputDialog("Cual es su moneda");
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Cual es su moneda"));

            switch (moneda) {

                case "dolar":
                    valorFinal = valor * dolar;
                    break;

                case "euro":
                    valorFinal = valor * euro;
                    break;

                case "yen":
                    valorFinal = valor * yen;
                    break;

            }
            JOptionPane.showMessageDialog(null, "el cambio a pesos es : " + valorFinal);
            cantidadPersonas++;
        }

    }

}
