package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio19 {

    public static void main(String[] args) {
        int acu = 0;
        int con = 0;
        int valor = Integer.parseInt(JOptionPane.showInputDialog("ingrese valor"));
        String msg = " Suma    Cantidad \n";
        while (valor > 0) { //repita hasta que sea cero o negativo
            acu = acu + valor;
            con = con + 1;
            msg += "  " + valor + "    " + con + "\n";
            JOptionPane.showMessageDialog(null, msg);
            valor = Integer.parseInt(JOptionPane.showInputDialog("ingrese valor"));
             
        }
       
        int prom = acu / con;
        JOptionPane.showMessageDialog(null, "El promedio es " + prom);

    }
}
