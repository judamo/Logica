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
public class Ejercicio17 {

    public static void main(String[] args) {
        int contador = 0;
        double acu = 0;
        
        int hasta = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor limite"));
        
        while( contador <= hasta ){
        
            //acu = acu + contador;
            acu += contador;
            //contador = contador + 1;
            contador++;
        }
        JOptionPane.showMessageDialog(null, acu);
    }

}
