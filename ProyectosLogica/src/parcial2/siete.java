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
public class siete {

    public static void main(String[] args) {
        
     int edad       = 25;
     boolean ban    = validarEdad(edad);
     if(ban){
         JOptionPane.showMessageDialog(null, "es mayor");
     }else{
        JOptionPane.showMessageDialog(null, "es menor");
     }
    }

    private static boolean validarEdad(int edad) {
       
        if(edad >= 18){
            return true;
        }else{
            return false;
        }

    }

}
