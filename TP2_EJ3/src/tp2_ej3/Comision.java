/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej3;


import java.util.*;


/**
 *
 * @author diego27
 */
public class Comision {
    private int totalClases;
    private Estudiante listaEstudiante[];
    private int totalEstudiante;

    public Comision(){
        this.listaEstudiante = new Estudiante[100];
    }

    public Comision(int totalClases) {
        this.totalClases = totalClases;
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

    public void agregarEstudiante(){
        String apellidos;
        String nombres;
        int lu;
        String email;
        Estudiante e = new Estudiante();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa los apellidos del estudiante: ");
        apellidos = teclado.nextLine();
        System.out.println("Ingresa los nombres del estudiante: ");
        nombres = teclado.nextLine();
        System.out.println("Ingresa el numero de libreta universitaria: ");
        lu = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa el email del estudiante: ");
        email = teclado.nextLine();
        e.setApellidos(apellidos);
        e.setNombres(nombres);
        e.setLu(lu);
        e.setEmail(email);
        listaEstudiante[this.totalEstudiante] = e;
        this.totalEstudiante = this.totalEstudiante + 1;
    }
    
    public void agregarEstudiante(String apellidos,String nombres,int lu,String email){
        Estudiante e = new Estudiante();
        e.setApellidos(apellidos);
        e.setNombres(nombres);
        e.setLu(lu);
        e.setEmail(email);
        listaEstudiante[this.totalEstudiante] = e;
        this.totalEstudiante = this.totalEstudiante + 1;
    }
    
    public void mostrarLista(){
        this.ordenarLista();
        for(int i=0;i<this.totalEstudiante+1;i++){
            System.out.println(listaEstudiante[i]);
        }
    }
    
    private void ordenarLista(){
        Arrays.sort(this.listaEstudiante);
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
        regularizarEstudiantes();
        for(int i=0; i<this.totalEstudiante+1;i++){
            if(listaEstudiante[i].regular == true){
                System.out.println(listaEstudiante[i]);
            }
        }
    }
    
    public void regularizarEstudiantes(){
        int reg;
        for(int i=0;i<this.totalEstudiante+1;i++){
            reg = (listaEstudiante[i].getNotaP1() + listaEstudiante[i].getNotaP2())/2;
            listaEstudiante[i].setNotaR(reg);
            if(listaEstudiante[i].getNotaR() >= 6){
                listaEstudiante[i].setRegular(true);
            }else{
                listaEstudiante[i].setRegular(false);
            }
        }
    }
}
