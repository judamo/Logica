package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio18 {

    public static void main(String[] args) {
        boolean estado = true;
        do {
            String op = JOptionPane.showInputDialog("Seleccione opcion \n"
                    + "1. Realizar una suma de los primeros 5 numeros \n"
                    + "2. Realizar la suma de N numeros \n"
                    + "3. Salir");
            switch (op) {
                case "1":
                    calcularCincoNumeros();
                    break;
                case "2":
                    calcularNNumeros();
                    break;
                case "3":
                    estado = false;
                    break;
            }
        } while (estado == true);
    }

    private static void calcularCincoNumeros() {
        int contador = 0;
        int acu = 0;
         while (contador <= 5) {
            acu += contador;
            contador++;
        }
        JOptionPane.showMessageDialog(null, acu);
        
    }

    private static void calcularNNumeros() {
        
        int contador    = 0;
        int acu         = 0;
        
        int hasta = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor limite"));

        while (contador <= hasta) {

            //acu = acu + contador;
            acu += contador;
            //contador = contador + 1;
            contador++;
        }
        JOptionPane.showMessageDialog(null, acu);

    }

}

