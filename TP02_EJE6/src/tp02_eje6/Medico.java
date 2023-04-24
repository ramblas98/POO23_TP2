/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_eje6;

/**
 *
 * @author Sans
 */
public class Medico {
    private String nombre;
    private int matricula;
    private Especialidad esp;
    private int cupo;
    private Historia historial[];
    private int cantidadh;
    
    //constructores

    public Medico() {
        historial=new Historia[100];
        this.cupo=10;
        this.esp=Especialidad.FAMILIA;
    }

    public Medico(String nombre, int matricula, Especialidad esp) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.esp = esp;
        historial=new Historia[100];
        this.cupo = 10;
        this.cantidadh = 0;
    }
      
    //getter and setter

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public Especialidad getEsp() {
        return esp;
    }

    public int getCupo() {
        return cupo;
    }

    public Historia[] getHistorial() {
        return historial;
    }

    public int getCantidadh() {
        return cantidadh;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public void setHistorial(Historia[] Historial) {
        this.historial = Historial;
    }

    public void setCantidadh(int cantidadh) {
        this.cantidadh = cantidadh;
    }
    
        @Override
    public String toString() {
        return "Medico{" + "nombre=" + nombre + ", matricula=" + matricula + ", esp=" + esp + ", cupo=" + cupo + ", historial=" + historial + ", cantidadh=" + cantidadh + '}';
    }
    
    //metodos

    
    public boolean disponibilidad(){
        if(this.cupo > 0) return true;
        else return false;
    }
    
    public void asignarhistoria(Historia a){
        this.historial[this.cantidadh]=a;
        this.cantidadh=this.cantidadh+1;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Especialidad: "+this.esp);
        System.out.println("Cupos: "+this.cupo);
        System.out.println("Cantidad De Pacientes: "+this.cantidadh);
    }
}