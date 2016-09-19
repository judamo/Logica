/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        boolean estado = true;
        while (estado == true) {
            String op = JOptionPane.showInputDialog("Seleccione opcion \n"
                    + "1. Realizar una suma \n"
                    + "2. Realizar una resta \n"
                    + "3. salir");
            switch (op) {
                case "1":
                    calcularSuma();
                    break;
                case "2":
                    calcularResta();
                    break;
                case "3":
                    estado = false;
                    break;
            }
        }
    }

    private static void calcularResta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void calcularSuma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
