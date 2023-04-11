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
    public static void insertar(Complejo c1,Complejo c2){
        Scanner teclado=new Scanner(System.in);
        double real,imaginario;
        System.out.println("Ingrese real del primer complejo");
        real=teclado.nextDouble();
        System.out.println("Ingrese imaginario del primer complejo");
        imaginario=teclado.nextDouble();
        c1.setRe(real);
        c1.setIm(imaginario);
        System.out.println("Ingrese real del segundo complejo");
         real=teclado.nextDouble();
        System.out.println("Ingrese imaginario del segundo complejo");
        imaginario=teclado.nextDouble();
        c2.setRe(real);
        c2.setIm(imaginario);
    }
    public static void insertar1(Complejo c1){
        Scanner teclado=new Scanner(System.in);
        double real,imaginario;
        System.out.println("Ingrese real del primer complejo");
        real=teclado.nextDouble();
        System.out.println("Ingrese imaginario del primer complejo");
        imaginario=teclado.nextDouble();
        c1.setRe(real);
        c1.setIm(imaginario);
    }
    public static void main(String[] args) {
        Complejo c1,c2,c3;
        c1=new Complejo();
        c2=new Complejo();
        c3=new Complejo();
        double real,imaginario,n;
        Scanner teclado=new Scanner(System.in);
        int op=90;
        while(op!=0){
            System.out.println("1:Suma");
            System.out.println("2:Resta");
            System.out.println("3:Producto");
            System.out.println("4:producto por un escalar");
            System.out.println("5:cociente");
            System.out.println("6:Modulo");
            System.out.println("7:conjugado");
            System.out.println("--------Con static---------");
            System.out.println("8:Suma");
            System.out.println("9:Resta");
            System.out.println("10:Producto");
            System.out.println("11:Cociente");
            op=teclado.nextInt();
            switch(op){
                case 1:insertar(c1,c2);
                       c1.inc(c2);
                       System.out.println(c1);
                       break;
                case 2:insertar(c1,c2);
                       c1.dec(c2);
                       System.out.println(c1);
                       break;
                case 3:insertar(c1,c2);
                       c1.por(c2);
                       System.out.println(c1);
                       break;
                case 4:System.out.println("Ingreese el escalar");
                       n=teclado.nextInt();
                       insertar1(c1);
                       c1.por(n);
                       System.out.println(c1);
                       break;
                case 5:insertar(c1,c2);
                       c1.div(c2);
                       System.out.println(c1);
                       break;
                case 6:insertar1(c1);
                       c1.modulo();
                       System.out.println(c1);
                       break;
                case 7:insertar1(c1);
                       c1.conjugado();
                       System.out.println(c1); 
                       break;
                case 8:insertar(c1,c2);
                       System.out.println(c3);
                       break;
            }
        }
    }
    
}
