/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package tp2_ej2;
import java.util.Scanner;

/**
 *
 * @author fabricio
 */
public class tp2_ej2 {
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int op = -1;

        FECHA fecha = new FECHA();

        while(op != 0) {
            System.out.println("-------MENU----------");
            System.out.println("1_Ingresar fecha");
            System.out.println("2_Adelantar fecha");
            System.out.println("3_Verificar si es válida");
            System.out.println("4_Normalizar fecha");
            System.out.println("5_Imprimir fecha");
            System.out.println("0_SALIR");
            System.out.println("INGRESE UNA OPCION"); 
            op = teclado.nextInt();

            switch(op) {
                case 1:
                    System.out.println("Ingrese el día: ");
                    int dia = teclado.nextInt();
                    System.out.println("Ingrese el mes: ");
                    int mes = teclado.nextInt();
                    System.out.println("Ingrese el año: ");
                    int anio = teclado.nextInt();
                    fecha.reiniciar(dia, mes, anio);
                    System.out.println("Fecha ingresada correctamente.");
                    break;
                case 2:
                    System.out.println("Ingrese los días a adelantar: ");
                    int dias = teclado.nextInt();
                    fecha.adelantar(dias);
                    System.out.println("Fecha adelantada correctamente.");
                    break;
                case 3:
                    if(fecha.valida()) {
                        System.out.println("La fecha ingresada es válida.");
                    } else {
                        System.out.println("La fecha ingresada es inválida.");
                    }
                    break;
                case 4:
                    fecha.normalizar();
                    System.out.println("Fecha normalizada correctamente.");
                    break;
                case 5:
                    fecha.imprimir();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

