/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo3_tp2;

/**
 *
 * @author Adrian
 */
public class OrniAzul extends Castor {
    
    private String nombre;
    private double propulsion;

    public OrniAzul(String nombre, double longitudColaCm, double velocidadKmh, double propulsion) {
        super(longitudColaCm, velocidadKmh);
        this.nombre = nombre;
        this.propulsion = propulsion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(double propulsion) {
        this.propulsion = propulsion;
    }
    
    
 //Los ornitorrincos azules, solo heredan del papaCastor la habilidad de nadar, 
// pero la sobreescriben al nadar toman la velocidad del padre, 
// mas su atributo Propulsión: ingresada por teclado de 5 a 10 km/s.
    
    
    @Override
    public void nadar() {
        
        Double padreVelocidad=getVelocidadKmh();
        
        double resultadoProp = padreVelocidad + propulsion;
        
        System.out.println("La velocidad del padre es: "+padreVelocidad+" km/s");
        
        System.out.println(nombre+ "orni azul nada con velocidad: "+resultadoProp+" km/s");
        
    }

    

    
    
    
    
}
