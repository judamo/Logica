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
public class EjercicioSiete {

    public static void main(String[] args) {

        String semaforo = "verde";
        Boolean estado_carro = true;

        if (semaforo.equals("verde")) {

            if (semaforo.equals("verde") && estado_carro == true) {

                System.out.println("Arrancar");

            } else {

                if (semaforo.equals("verde") && estado_carro == false) {

                    System.out.println("Encender");
                    System.out.println("Arrancar");
                } else {

                   
                }
            }

        } else {

            System.out.println("Carro en reposo");

        }

        
    }

}
