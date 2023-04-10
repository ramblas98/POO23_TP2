/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej1;

/**
 *
 * @author David
 */
public class TP2_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complejo c1,c2,c3;
        double Mod;
        
        c1= new Complejo(4,1);
        c2= new Complejo(2,2);
        
        c3= Complejo.suma(c1, c2);
        System.out.println(c3);
        
        c3=c2.conjugado();
        System.out.println(c3);
        
        Mod = c2.modulo();
        System.out.println(Mod);
        
        c1.inc(c2);
        System.out.println(c1);
        
        c1.dec(c2);
        System.out.println(c1);
        
        c1.por(c2);
        System.out.println(c1);
        
        
    }
    
}
