package Ciclos;

import guia.*;
import javax.swing.JOptionPane;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        int puntero = 0;
        int maxSaludos = 5;

        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, "saludo " + i);
        }
        
        
        
       while( puntero < maxSaludos){
           JOptionPane.showMessageDialog(null, "saludo " + puntero);
           puntero++;
       }
       
       puntero = 0;
       
       do{
        
           JOptionPane.showMessageDialog(null, "saludo " + puntero);
           puntero++;
       }while(puntero < maxSaludos);

    }

}
