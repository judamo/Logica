package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio20 {

    public static void main(String[] args) {
        
        int cantidad,precio, precioProducto,acumulador = 0, cantidadProductos = 2;
        String nombre, msg = " Nombre     Cant     Precio     SubTotal \n ";
       
        while(cantidadProductos > 0){
        
            //pregunto nombre
            nombre = obtenerinfo("ingrese el nombre del producto");
            //pregunto cantidad
            cantidad = Integer.parseInt(obtenerinfo("Ingrese la cantidad"));
            //pregunto precio
            precio   = Integer.parseInt(obtenerinfo("Ingrese el valor del producto"));
            
            precioProducto  = (cantidad * precio);
            acumulador      = acumulador + precioProducto;
            msg += nombre + "          " + cantidad + "         "+ precio + "         " + precioProducto + "\n";
            cantidadProductos--;
            // QUIZ 23 [switch, repeticiones, acumuladores y contadores]
        }
        msg += "Total $ " + acumulador ;
        JOptionPane.showMessageDialog(null, msg);
    }

    private static String obtenerinfo(String msgEmergente) {
        return JOptionPane.showInputDialog(msgEmergente);
    }

}
