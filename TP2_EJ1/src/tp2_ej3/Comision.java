/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej3;
import java.util.Scanner;
/**
 *
 * @author fabricio
 */
public class Comision {
    private int totalClases;
    private int totalEstudiante;
    private Estudiante[] listaEstudiantes;

    public Comision() {
    }

    public Comision(int totalClases, int totalEstudiante, Estudiante[] listaEstudiantes) {
        this.totalClases = totalClases;
        this.totalEstudiante = totalEstudiante;
        this.listaEstudiantes = listaEstudiantes;
    }

    public int getTotalClases() {
        return totalClases;
    }

    public int getTotalEstudiante() {
        return totalEstudiante;
    }

    public Estudiante[] getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setTotalClases(int totalClases) {
        this.totalClases = totalClases;
    }

    public void setTotalEstudiante(int totalEstudiante) {
        this.totalEstudiante = totalEstudiante;
    }

    public void setListaEstudiantes(Estudiante[] listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    
    /*terminar*/
    public void agregarEstudiante(){
        Scanner teclado=new Scanner;
        Estudiante e=new Estudiante;
        
    } ;
        
    } 
}


