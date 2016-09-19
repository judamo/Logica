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
public class Ejercicio16 {

    public static void main(String[] args) {
        boolean estado = true;
        do{
            String op = JOptionPane.showInputDialog("Seleccione opcion \n"
                    + "1. Realizar una suma \n"
                    + "2. Realizar una resta \n"
                    + "3. calcular Salario \n"
                    + "4. salir");
            switch (op) {
                case "1":
                    calcularSuma();
                    break;
                case "2":
                    calcularResta();
                    break;
                case "3":
                    calcularSalario();
                    break;
                case "4":
                    estado = false;
                    break;
            }
        }while(estado == true);
    }

    private static void calcularResta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void calcularSuma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void calcularSalario() {
      
        String nombre       =   "juan";
        double salario      =   1000000;
        int num_unidades    =   60;
        int categoria       =   1;
        double salarioT     =   0;
        
        if(num_unidades > 50){
            
            switch(categoria){
            
                case 1: salarioT = salario +(salario * 0.05);
                JOptionPane.showMessageDialog(null, "el salario de "+ nombre + " es " + salarioT);
                    break;
                case 2:
                    break;
                
            }
            
        }else{
            
        }
        
    }
}
