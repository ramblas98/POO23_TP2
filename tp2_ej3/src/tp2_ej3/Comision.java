/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej3;

/**
 *
 * @author David
 */
public class Comision {
    private int totalClases;
    private Estudiante[] listaEstudiante;
    private int totalEstudiante;

    public Comision() {
    }

    public Comision(int totalClases, Estudiante[] listaEstudiante, int totalEstudiante) {
        this.totalClases = totalClases;
        this.listaEstudiante = listaEstudiante;
        this.totalEstudiante = totalEstudiante;
    }

    public int getTotalClases() {
        return totalClases;
    }

    public Estudiante[] getListaEstudiante() {
        return listaEstudiante;
    }

    public int getTotalEstudiante() {
        return totalEstudiante;
    }

    public void setTotalClases(int totalClases) {
        this.totalClases = totalClases;
    }

    public void setListaEstudiante(Estudiante[] listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }

    public void setTotalEstudiante(int totalEstudiante) {
        this.totalEstudiante = totalEstudiante;
    }

    @Override
    public String toString() {
        return "Comision{" + "totalClases=" + totalClases + ", listaEstudiante=" + listaEstudiante + ", totalEstudiante=" + totalEstudiante + '}';
    }
    
    private Comision(int tClase){
        this.totalClases = tClase;
    }
    
}
