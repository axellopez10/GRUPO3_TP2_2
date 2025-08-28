/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo3_tp2;

import java.util.Random;

/**
 *
 * @author Adrian
 */
public class Castor {

    protected double longitudColaCm;
    protected double velocidadKmh; 

    private Random random = new Random();

    public Castor(double longitudColaCm, double velocidadKmh) {
        this.longitudColaCm = longitudColaCm;
        this.velocidadKmh = velocidadKmh;
    }

    
    public void nadar() {
        System.out.printf("Nadando a: %.2f km/h%n", velocidadKmh);
    }

    // tocarGuitarra: toca 3 cuerdas aleatorias (nros 1 a 6)
    public void tocarGuitarra() {
        System.out.println("tocarGuitarra():");
        for (int i = 0; i < 3; i++) {
            int cuerda = random.nextInt(6) + 1; // 1..6
            System.out.println("toca cuerda " + cuerda);

        }

    }

    public double getVelocidadKmh() {
        return velocidadKmh;
    }

    public double getLongitudColaCm() {
        return longitudColaCm;
    }
}
