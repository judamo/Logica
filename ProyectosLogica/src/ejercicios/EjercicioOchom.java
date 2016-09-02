/*

Programa: Automóvil Inteligente

En caso que no este en verde, el carro solo estará en reposo.
El carro solo debe arrancar si esta encendido y en verde
En caso que este en verde pero apagado el carro se debe encender y arrancar 

 */
package ejercicios;

/**
 *
 * @author juan
 */
public class EjercicioOchom {

    public static void main(String[] args) {

        int     edad    = 22;
        char    genero  = 'H';
        
        if(edad >= 18){
        
            if(genero == 'M'){
            
                System.out.println("Entra Gratuitamente");
                
            }else{
            
                System.out.println("Es Hombre, Tiene que pagar XD");
                
            }
            
        }else{
            
            System.out.println("Menor de edad!!! Alerta no puede entrar");
            
        }
        
    }

}
