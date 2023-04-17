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
public class Comision {
    private int totalclase;
    private int totalEstudiante;
    private Estudiante listaEstudiantes[];

    public Comision() {
        this.totalclase=0;
        this.totalEstudiante=0;
        listaEstudiantes=new Estudiante[100];
    }

    public Comision(int totalclase, int totalEstudiante, Estudiante[] listaestudiante) {
        this.totalclase = totalclase;
        this.totalEstudiante = totalEstudiante;
        listaEstudiantes=new Estudiante[100];
    }
    public void agregarEstudiante(){
        Estudiante e=new Estudiante();
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese Apellido");
        e.setApellido(teclado.nextLine());
        System.out.println("Ingrese Nombre");
        e.setNombre(teclado.nextLine());
        System.out.println("Ingrese LU");
        e.setLu(teclado.nextInt());
        System.out.println("Ingrese EMAIL");
        e.setEmail(teclado.nextLine());
        this.listaEstudiantes[this.totalEstudiante]=e;
        this.totalEstudiante=this.totalEstudiante+1;
    }

    public int getTotalclase() {
        return totalclase;
    }

    public int getTotalEstudiante() {
        return totalEstudiante;
    }

    public Estudiante[] getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setTotalclase(int totalclase) {
        this.totalclase = totalclase;
    }

    public void setTotalEstudiante(int totalEstudiante) {
        this.totalEstudiante = totalEstudiante;
    }

    public void setListaEstudiantes(Estudiante[] listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    public void mostrarlista(){
        int i;
        this.oredenarlista();
        for(i=0;i<this.totalEstudiante;i++){
            System.out.println(this.listaEstudiantes[i]);
        }
    }
    private void oredenarlista(){
        int i,j;
        Estudiante aux;
        for(i=0;i<this.totalEstudiante;i++){
            for(j=i;j<this.totalEstudiante;j++){
                if(this.listaEstudiantes[i].getLu()>this.listaEstudiantes[j].getLu()){
                    aux=this.listaEstudiantes[i];
                    this.listaEstudiantes[i]=this.listaEstudiantes[j];
                    this.listaEstudiantes[j]=aux;
                }
            }
        }
    }
    public Estudiante buscarEstudiante(int lu){
        Estudiante e=null;
        int i;
        for(i=0;i<this.totalEstudiante;i++){
            if(this.listaEstudiantes[i].getLu()==lu) e=this.listaEstudiantes[i];
          }
        return e;
    }
    public void mostrarRegulares(){
        int i;
        for(i=0;i<this.totalEstudiante;i++){
            if(this.listaEstudiantes[i].isRegular()==true) System.out.println(this.listaEstudiantes[i]);
        }
    }
    public void regularizarEstudiantes(){
        
    }
}