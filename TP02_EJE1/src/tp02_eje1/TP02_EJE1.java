/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_eje1;
import java.util.Scanner;
/**
 *
 * @author Sans
 */
public class TP02_EJE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complejo c1,c2;
        c1=new Complejo(1,1);
        c2=new Complejo(2,2);
        c1.por(c2);
        System.out.println(c1);
    }
    
}
