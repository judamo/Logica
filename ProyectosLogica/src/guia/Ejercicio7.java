package guia;

import javax.swing.JOptionPane;

public class Ejercicio7 {

    public static void main(String[] args) {

        //identificar las entradas
        int a = 20;
        int b = 20;

        String msg = "vacio";

        // proceso
        //( 7 > 1) verdadero
        if   ( a > b ) {
            //veraderos
            msg = "A es mayor que B";

        } else {
           
            if(a < b){
                //verdadero
                msg = "A es menor que B";
            }else{
                // falso
                msg = "A es igual a B";
            }
            
        }

        //salida
        JOptionPane.showMessageDialog(null, msg);

    }

}
