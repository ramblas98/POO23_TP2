/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_EJ1;

/**
 *
 * @author Jonatan Cossio
 */
public class TP2_EJ1 {
    public static void main(){
         Complejo c1,c2;
    
    c1 = new Complejo(1,2);
    c2 = new Complejo(2,1);
    //Suma
    c1.inc(c2);
    System.out.println("Suma: " + c1);
    //Resta 
    c1.dec(c2);
    System.out.println("Resta:" + c1);
    }
}
