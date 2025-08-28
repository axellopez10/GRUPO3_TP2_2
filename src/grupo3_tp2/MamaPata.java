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
public interface MamaPata {
    int patas=2;
    boolean tiene_Pico = true;
    
    void tocarOrgano(Scanner sc);
    void tocarOrgano();
    void graznar();
    void caminar();
    
    static void descripcion() {
    System.out.println("Una mamá pata tiene pico y " + patas + " patas.");
}
    
}
