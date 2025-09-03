/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo3_tp2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class GRUPO3_TP2 {

    public static void main(String[] args) {
        // Luego en la Main Class, crear 3 instancias
        // 1 de orniVerde, y 2 de orniAzul (sus hermanos blue y blui),
        // haga que cada orni ejecute TODAS sus habilidades de nado, y musicales. Ponle tu nombre al orniVerde.

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.GERMANY); // para coma decimal

        System.out.println("Ingrese la LONGITUD de cola del castor: ");
        double longitudCola = doubleValido(sc);

        System.out.println("Ingrese la VELOCIDAD del castor: ");
        double velocidadCastor = doubleValido(sc);

        // creo el orni verde
        OrniVerde orniverde = new OrniVerde("axel", longitudCola, velocidadCastor);

        // atributo propulsion
        System.out.println("Ingrese la PROPULSIÓN (entre 5 y 10): ");
        double propulsionBlue = minMaxProp(sc, 5, 10);

        // creo a blue y blui
        OrniAzul blue = new OrniAzul("blue", longitudCola, velocidadCastor, propulsionBlue);
        OrniAzul blui = new OrniAzul("blui", longitudCola, velocidadCastor, propulsionBlue);

        System.out.println("----Implento metodos-------- ");
        orniverde.nadar();
        orniverde.tocarGuitarra();
        orniverde.tocarOrgano(sc);

        System.out.println();
        System.out.println("Turno de BLUE");
        blue.nadar();

        // array
        Castor[] hermanos = new Castor[3];
        try {
            hermanos[0] = blue;
            hermanos[1] = orniverde; 
            hermanos[2] = blui;
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: fuera de rango del arreglo");
        } finally {
            System.out.println("Los ornitohermanos juntos al fin...");
        }

        //  LISTA de mejores nadadores (solo OrniAzul) 
        List<OrniAzul> nadadores = new ArrayList<>();
        for (Castor c : hermanos) {
            if (c instanceof OrniAzul) {
                nadadores.add((OrniAzul) c);
            }
        }

        // ordenar por propulsión ascendente
        nadadores.sort(Comparator.comparingDouble(OrniAzul::getPropulsion));

        //  Iterator
        System.out.println("\n--- Mejores nadadores ordenados por propulsión ---");
        Iterator<OrniAzul> it = nadadores.iterator();
        while (it.hasNext()) {
            OrniAzul o = it.next();
            System.out.println(o.getNombre() + " con propulsión: " + o.getPropulsion());
        }

        sc.close();
    }

    // valida que el valor ingresado sea double
    private static double doubleValido(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Ingrese un valor valido");
            sc.next(); // descartamos lo inválido
        }
        return sc.nextDouble();
    }

    // valida que el valor esté entre min y max
    private static double minMaxProp(Scanner sc, double min, double max) {
        double var;
        while (true) {
            var = doubleValido(sc);
            if (var >= min && var <= max) {
                break;
            } else {
                System.out.println("Error, ingrese nuevamente un valor entre " + min + " y " + max);
            }
        }
        return var;
    }
}