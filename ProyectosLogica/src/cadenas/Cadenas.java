package cadenas;

import javax.swing.JOptionPane;


public class Cadenas {
     
    public static void main(String[] args) {
    
        String msg = "Hola Mundo";
        mostrar("el mensaje es " + msg);
       
        int cantidad = msg.length();
        mostrar("la cantidad de caracteres de " + msg + " es " + cantidad);
         
        int indice = 6;
        char letra = msg.charAt(indice);
        mostrar("la letra #" + indice + " es " + letra );
       
        double numero = Math.random() * 10;
        mostrar("el numero aleatorio es " + numero);
        
        int numeroSinDecimales = Integer.parseInt(Math.round(numero)+"");
        mostrar("El numero redondeado es " + numeroSinDecimales);
        
        String cadena = numero+"";//convierto a cadena
        int numerodeletra = cadena.indexOf(".");
       // mostrar("es " + numerodeletra);
        String decimales = cadena.substring(numerodeletra, cadena.length());
        mostrar("el numero aleatorio es " + numero + "y los decimales son " + decimales);

         
     }

     private static void mostrar(String m) {
        JOptionPane.showMessageDialog(null, m);
    }

 
        
    
}
