/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej3;
import java.util.*;
/**
 *
 * @author David
 */
public class Comision {
    private int totalClases;
    private Estudiante[] listaEstudiante;
    private int totalEstudiante;

    public Comision() {
        this.totalClases = 0;
        this.totalEstudiante = 0;
        this.listaEstudiante = new Estudiante[100];
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
    public void agregarEstudiante(){
       Scanner teclado = new Scanner(System.in);
       
        Estudiante e = new Estudiante();
        
        System.out.print("Ingrese el Apellido:");
        e.setApellido(teclado.nextLine());
        System.out.print("Ingrese el Nombre:");
        e.setNombre(teclado.nextLine());
        System.out.print("Ingrese el LU:");
        e.setLu(teclado.nextInt());
        System.out.print("Ingrese el Email:");
        e.setEmail(teclado.nextLine());
        
        this.listaEstudiante[this.totalEstudiante] = e;
        this.totalEstudiante += 1;
    }
    public Estudiante buscarEstudiante(int LU){
        int i;
        
        i=0;
        while(this.listaEstudiante[i].getLu()!=LU && this.totalEstudiante!=i){
            i += 1;
        }
        if(i<this.totalEstudiante)return listaEstudiante[i];
        else return null;
    }
    public void mostrarRegulares(){
        int i;
       
        //regularizarEstudiantes();
        for(i=0;i<this.totalEstudiante;i++){
            if(listaEstudiante[i].regular == true){
                System.out.println(listaEstudiante[i]);
            }
        }
    }
    public void regularizarEstudiante(){
        int i;
        
        for(i=0;i<this.totalEstudiante;i++){
            if(listaEstudiante[i].getNotaP1()>=60 && listaEstudiante[i].getNotaP2()>=60){
                this.listaEstudiante[i].regular=true;
            }
            else{
                if(listaEstudiante[i].getNotaP1()>=60 && listaEstudiante[i].getNotaP2()>=60){
                    this.listaEstudiante[i].regular = true;
                }
                else this.listaEstudiante[i].regular = false;
            }
        }
    }
}
