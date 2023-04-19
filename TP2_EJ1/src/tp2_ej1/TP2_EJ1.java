/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej1;
import java.util.Scanner;
/**
 *
 * @author fabricio
 */
public class TP2_EJ1 {

    public static COMPLEJO crear(int a, int b){
        COMPLEJO x=new COMPLEJO();
        x.setIm(aimport FECHA;);
        x.setRe(b);
        return x;
    } 
    /*EJERRCICCIO 1*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int op=1,a,b;
        COMPLEJO x,y;
        y=new COMPLEJO();
        x=new COMPLEJO();
        while(op!=0){
           System.out.println("-------MENU----------");
           System.out.println("1_ingresar complejo");
           System.out.println("2_suma");
           System.out.println("3_resta");
           System.out.println("4_multiplicacion");
           System.out.println("5_division");
           System.out.println("6_modulo");
           System.out.println("7_conjugado");
           System.out.println("8_suma de dos complejos");
           System.out.println("9_resta de dos complejos");
           System.out.println("10_multiplicacion por real");
           System.out.println("0_SALIR");
           System.out.println("INGRESE UNA OPCION"); 
           op=teclado.nextInt();
           switch(op){
               case 1:  System.out.println("ingrese parte imaginaria");
                        a=teclado.nextInt();
                        System.out.println("ingrese parte real");
                        b=teclado.nextInt();
                        x=crear(a,b);
                   break;
               case 2: System.out.println("ingrese parte imaginaria");
                        a=teclado.nextInt();
                        System.out.println("ingrese parte real");
                        b=teclado.nextInt();
                        y=crear(a,b);
                   
                   break;
        }
    }
    
}
