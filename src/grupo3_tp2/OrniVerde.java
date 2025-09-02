/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo3_tp2;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class OrniVerde extends Castor implements MamaPata {
    
    
    private String nombre;
    private final double picoCm = 6.8;
    private final double patasCm = 7.5;

    public OrniVerde(String nombre, double colaPapa, double velocidadPapa) {
        
        super(colaPapa, velocidadPapa);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    
    @Override
    public void tocarGuitarra() {
        System.out.println(nombre + " OrniVerde está tocando la guitarra: ");
        
        super.tocarGuitarra();
    }

    
    @Override
    public void tocarOrgano(Scanner sc) {
        System.out.println(nombre + " OrniVerde toca el organo de mama pata");
        System.out.println("Do-re-mi");
        System.out.println("Presione ENTER para continuar con Fa-Sol-La-Si...");
       sc.nextLine(); 
       sc.nextLine(); 
        System.out.println("Fa-Sol-La-Si");
    }
    
    public void tocarGuitorgan(Scanner sc){
        
        System.out.println(nombre+" toca guitorgan ");
        super.tocarGuitarra();
        
        tocarOrgano(sc);
        System.out.println("Cuaaac cuaccc");
        
        
        
        
        
        
        
    }

    

    @Override
    public void graznar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void caminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
