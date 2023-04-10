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
        Scanner teclado=new Scanner(System.in);
        int op=90;
        while(op!=0){
            System.out.println("1:Suma");
            System.out.println("2:Resta");
            System.out.println("3:Producto");
            System.out.println("4:Cociente");
            op=teclado.nextInt();
        }
    }
    
}
