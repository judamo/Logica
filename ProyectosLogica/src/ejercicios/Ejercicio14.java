
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class Ejercicio14 {
    
    public static void main(String[] args) {
        int resultado2 = calcular("+", 4, 5);
        mostrar("el resultado es " + resultado2);
    }

    private static void mostrar(String msg) {
        
        JOptionPane.showMessageDialog(null, msg);
        
    }
    
    private static int calcular(String operador,int num1,int num2){
        int resultado = 0;
        switch(operador){
        
            case "+": resultado = num1+num2;
            break;
                
            case "-": resultado = num1-num2;
            break;
        }
        
        return resultado;
    }

    

}
