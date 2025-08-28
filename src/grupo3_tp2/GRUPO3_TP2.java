/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo3_tp2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class GRUPO3_TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Luego en la Main Class, crear 3 instancias
        // 1 de orniVerde, y 2 de orniAzul (sus hermanos blue y blui), 
        // haga que cada orni ejecute TODAS sus habilidades de nado, y musicales. Ponle tu nombre al orniVerde.

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.GERMANY);//esto lo hice por un error de scanner que no me tomaba las (,)

        System.out.println("Ingrese la LONGITUD de cola del castor: ");

        double longitudCola = doubleValido(sc);

        System.out.println("Ingrese la VELOCIDAD del castor: ");

        double velocidadCastor = doubleValido(sc);

        //chicos aca creo el orni verde
        OrniVerde orniverde = new OrniVerde("axel", longitudCola, velocidadCastor);

        //aca esta el atributo propulsion
        System.out.println("Ingrese la PROPULSIÓN (entre 5 y 10): ");
        Double propulsionBlue = minMaxProp(sc, 5, 10);

        //creo a blue
        OrniAzul blue = new OrniAzul("blue", longitudCola, velocidadCastor, propulsionBlue);

        //creo a blui
        OrniAzul blui = new OrniAzul("blui", longitudCola, velocidadCastor, propulsionBlue);

        System.out.println("----Implento metodos-------- ");

        
        orniverde.nadar();
        
        
        
        orniverde.tocarGuitarra();
        
        
        orniverde.tocarOrgano(sc);
        
        System.out.println("");
        
        blue.nadar();
        
        
        

    }

    //este metodo sirve para validar si el valor que ingresa por teclado es valido!
    private static double doubleValido(Scanner sc) {

        while (!sc.hasNextDouble()) {

            System.out.println("Ingrese un valor valido");
            sc.next();
        }

       return sc.nextDouble();
        
        

    }

    //este metodo sirve para validar si el valor que ingresa por teclado esta entre 5 y 10
    private static double minMaxProp(Scanner sc, double min, double max) {

        double var;

        while (true) {

            var = doubleValido(sc);

            if (var >= min && var <= max) {

                break;

            } else {
                System.out.println("Error, ingrese nuevamente un valor entre 5 y 10 ");
            }

        }
        return var;

    }

}
