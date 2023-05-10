/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ej3;

/**
 *
 * @author medin
 */
public class TP2EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comision a1;
        Estudiante[] l1;
        a1=new Comision(1);
        
        a1.agregarEstudiante("Medina", "Cristian", 1, "medinacristiancristian@gmail.com");
        
        a1.agregarEstudiante("Escudero", "Jacinta", 3, "jacinta123@gmail.com");
        
        a1.mostrarLista();
        a1.ordenarLista();
        a1.mostrarLista();
        
        l1=a1.getListaEstudiante();
        l1[0].incAsistencia(7);
        l1[0].setNotaP1(8);
        l1[0].setNotaP2(6);
        l1[1].setNotaP1(5);
        l1[1].setNotaP2(5);
        l1[1].setNotaR(6);
        a1.mostrarLista();
        
        a1.regularizarEstudiantes();
        a1.mostrarRegulares();
    }
}
