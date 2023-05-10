/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej3;
import java.util.*;
/**
 *
 * @author medin
 */
public class Comision {
    
    private int totalClases;
    private Estudiante[] listaEstudiante= new Estudiante[100];
    private int totalEstudiante;
    Scanner teclado = new Scanner(System.in);

    public Comision() {
        System.out.print("Total de Clases: ");
        this.totalClases= teclado.nextInt();
        this.totalEstudiante=0;
    }

    public Comision(int totalClases) {
        this.totalClases = totalClases;
        this.totalEstudiante=0;
    }

    public int getTotalClases() {
        return totalClases;
    }

    public Estudiante[] getListaEstudiante() {
        return listaEstudiante;
    }

    public int getTotalEstudiantes() {
        return totalEstudiante;
    }

    public void setTotalClases(int totalClases) {
        this.totalClases = totalClases;
    }

    public void setListaEstudiante(Estudiante[] listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }

    public void setTotalEstudiantes(int totalEstudiante) {
        this.totalEstudiante = totalEstudiante;
    }
    
    public void agregarEstudiante(){
        Estudiante e1 = new Estudiante();
        System.out.println("Ingresa los apellidos del estudiante: ");
        e1.setApellidos(teclado.nextLine());
        System.out.println("Ingresa los nombres del estudiante: ");
        e1.setNombres(teclado.nextLine());
        System.out.println("Ingresa el numero de libreta universitaria: ");
        e1.setLu(teclado.nextInt());
        System.out.println("Ingresa el email del estudiante: ");
        e1.setEmail(teclado.nextLine());
        
        listaEstudiante[this.totalEstudiante] = e1;
        this.totalEstudiante++;
    }
    
    public void agregarEstudiante(String apellidos,String nombres,int lu,String email){
        Estudiante e2 = new Estudiante(apellidos,nombres,lu,email);
        
        listaEstudiante[this.totalEstudiante] = e2;
        this.totalEstudiante++;
    }
    
    public void mostrarLista(){
        for(int i=0;i<this.totalEstudiante+1;i++){
            System.out.println(listaEstudiante[i]);
        }
    }
    
    public void ordenarLista(){
        Estudiante aux;
        for(int i=0;i<this.totalEstudiante-1;i++){
            if(listaEstudiante[i].getApellidos().compareTo(listaEstudiante[i+1].getApellidos())>0){
                aux=listaEstudiante[i];
                listaEstudiante[i]=listaEstudiante[i+1];
                listaEstudiante[i+1]=aux;
            }
        }
            
        
    }
    
    public Estudiante buscarEstudiante(int lu){
        for(int i=0;i<this.totalEstudiante+1;i++){
            if(listaEstudiante[i].getLu() == lu){
      
                return listaEstudiante[i];
            }
        }
        return null;
    }
    
    public void mostrarRegulares(){
        for(int i=0; i<this.totalEstudiante;i++){
            if(listaEstudiante[i].regular==true){
                System.out.println(listaEstudiante[i]);
            }
        }
    }
    
    public void regularizarEstudiantes(){
        
        for(int i=0;i<this.totalEstudiante;i++){
            
            if(listaEstudiante[i].getNotaP1()>=6 && listaEstudiante[i].getNotaP2() >=6){
                listaEstudiante[i].regular=true;
            }
            if(listaEstudiante[i].getNotaP1()>=6 && listaEstudiante[i].getNotaP2()<6 && listaEstudiante[i].getNotaR()>=6){
                listaEstudiante[i].regular=true;
            }
            if(listaEstudiante[i].getNotaP1()<6 && listaEstudiante[i].getNotaP2()>=6 && listaEstudiante[i].getNotaR()>=6){
                listaEstudiante[i].regular=true;
            }
            
        }
    }
    
}
