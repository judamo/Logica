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
public class seis {

    public static void main(String[] args) {

     formatearNumero(18456);
        
    }

    private static void formatearNumero(int i) {
       
        String msg = "el valor es $"+i+"=";
        JOptionPane.showMessageDialog(null, msg);
    }

}
