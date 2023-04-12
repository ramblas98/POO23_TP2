/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej1;

/**
 *
 * @author medin
 */
public class TP2_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Complejo c1,c2,c3;
        
        c1 = new Complejo(1,2);
        c2 = new Complejo(2,3);
        double d=2;
        
        c3 = Complejo.division(c1, c2);
        System.out.println(c3);
        
        
    }
    
}
