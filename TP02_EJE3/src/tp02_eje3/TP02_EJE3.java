/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_eje3;
import java.util.Scanner;
/**
 *
 * @author Sans
 */
public class TP02_EJE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comision a=null;
        a=new Comision();
        Estudiante e;
        Scanner teclado=new Scanner(System.in);
        int op=90,lu,nota;
        while(op!=0){
            System.out.println("1:Agregar Estudiante ");
            System.out.println("2:Mostrar la lista de Estudiantes de forma ordenada");
            System.out.println("3:Cargar la aisstencia de un estudiante");
            System.out.println("4:Cargar las notas de un estudiante");
            System.out.println("5:Mostrar Estudiantes Regualrizados");
            op=teclado.nextInt();
            switch(op){
                case 1:a.agregarEstudiante(apellido, nombre, lu, email);
                case 2:if(a==null) System.out.println("Lista Vacia");
                       else{
                            a.mostrarlista();
                        }
                       break;
                case 3:System.out.println("Ingrese el lu del estudiante");
                      lu=teclado.nextInt();
                      e=a.buscarEstudiante(lu);
                      if(e!=null){
                          System.out.println("Ingrese la asistencia de dicho estudiante");
                          lu=teclado.nextInt();
                          e.incAsistencia(lu);
                      }
                      else System.out.println("El estudiante no existe");
                      break;
                case 4:System.out.println("Ingrese el lu de l estudiante");
                       lu=teclado.nextInt();
                       e=a.buscarEstudiante(lu);
                       if(e==null) System.out.println("El estudiante no existe");
                       else{
                           System.out.println("Ingrese nota 1");
                           nota=teclado.nextInt();
                           e.setNot1(nota);
                           System.out.println("Ingrese nota 2");
                           nota=teclado.nextInt();
                           e.setNota2(nota);
                           System.out.println("Ingrese nota recuperatorio");
                           nota=teclado.nextInt();
                           e.setNotar(nota);
                       }
                       break;
                case 5:if(a==null) System.out.println("Lista vacia");
                       else{
                       a.mostrarRegulares();
                       break;
                }
            }
        }
    }
    
}
