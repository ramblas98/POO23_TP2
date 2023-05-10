/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej6;

/**
 *
 * @author medin
 */
public class Medico {
    private String nombre;
    private int matricula;
    private Especialidad especialidad;
    private int cupo;
    private Historia[] listaHistorias;
    private int cantH=0;

    public Medico() {
        this.nombre = null;
        this.cupo = 0;
        this.listaHistorias= new Historia[100];
    }
    
    
    public Medico(String nombre, int matricula, Especialidad especialidad, int cupo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.cupo = cupo;
        this.listaHistorias= new Historia[100];
    }

    public Medico(String nombre, int matricula, int cupo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.cupo = cupo;
        this.especialidad = Especialidad.FAMILIA; 
        this.listaHistorias= new Historia[100];
    }

    public Medico(String nombre, int matricula, Especialidad especialidad) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.cupo=10;
        this.listaHistorias= new Historia[100];
    }

    public Medico(String nombre, int matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad = Especialidad.FAMILIA; 
        this.cupo=10;
        this.listaHistorias= new Historia[100];
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public int getCupo() {
        return cupo-cantH;
    }

    public Historia[] getListaHistorias() {
        return listaHistorias;
    }

    public int getCantH() {
        return cantH;
    }
    
    
    
    public void agregarHistoria(Historia hist){
        this.listaHistorias[this.cantH]=hist;
        this.cantH++;
    }
    public void eliminarHistoria(int id){
        for(int i=0;i<this.cantH;i++){
            if(id==this.listaHistorias[i].getIdentificador()){
                for(int j=i;j<cantH-1;j++){
                    this.listaHistorias[j]=this.listaHistorias[j+1];
                }
                this.cantH--;
            }
            
        }
    }
    public boolean disponibilidad(){
        return this.cupo>=this.cantH ;
    }
    
    
    
}
