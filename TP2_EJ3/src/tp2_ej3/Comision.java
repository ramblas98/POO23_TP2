/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej3;


public class Comision {
    private int totalClases;
    private Estudiante[] listaEstudiantes;
    private int totalEstudiante;

    public Comision() {
    }

    public Comision(int totalClases, Estudiante[] listaEstudiantes, int totalEstudiante) {
        this.totalClases = totalClases;
        this.listaEstudiantes = listaEstudiantes;
        this.totalEstudiante = totalEstudiante;
    }

    public int getTotalClases() {
        return totalClases;
    }

    public Estudiante[] getListaEstudiantes() {
        return listaEstudiantes;
    }

    public int getTotalEstudiante() {
        return totalEstudiante;
    }

    public void setTotalClases(int totalClases) {
        this.totalClases = totalClases;
    }

    public void setListaEstudiantes(Estudiante[] listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void setTotalEstudiante(int totalEstudiante) {
        this.totalEstudiante = totalEstudiante;
    }
    
   public void agregarEstudiante(){
       Estudiante e = new Estudiante();
       this.listaEstudiantes[this.totalEstudiante] = e;
       this.totalEstudiante++;
   }
   
   public void mostrarLista(){
       System.out.println("Lista de estudiantes:");
       for(int i=0 ; i<this.totalEstudiante; i++){
           Estudiante e = this.listaEstudiantes[i];
           System.out.println("Estudiante #" + (i+1));
           System.out.println("Apellido: "+e.getApellido());
           System.out.println("Nombres: "+e.getNombre());
           System.out.println("LU: "+e.getLU());
           System.out.println("Email: "+e.getEmail());
           System.out.println("Regular: "+e.regular);
           System.out.println("Nota 1:"+e.getNotaP1());
           System.out.println("Nota 2:"+e.getNotaP2());
           System.out.println("Nota R:"+e.getNotaR());
           System.out.println("Asistencias: "+e.getAsistencia());
           System.out.println("--------------------------");
           
       }
    }
   private void ordenarLista(){
       System.out.println("Lista Ordenada");
       for(int i=0 ; i<this.totalEstudiante-1 ; i++){
           
            for (int j=i+1 ; j<this.totalEstudiante ; j++){
                
                if (this.listaEstudiantes[i].getApellido().compareTo(this.listaEstudiantes[j].getApellido())>0){
                    
                    Estudiante auxiliar = this.listaEstudiantes[j];
                    this.listaEstudiantes[j] = this.listaEstudiantes[i];
                    this.listaEstudiantes[i] = auxiliar;
                }
            }
       }
   }
   
   public Estudiante buscarEstudiante(int lu){
       int i=0;
       boolean encontrado = false;
       while (i<this.totalEstudiante || encontrado!=true){
           if (this.listaEstudiantes[i].getLU() == lu){
               encontrado = true;   
           }
       }
       if (encontrado){
          return this.listaEstudiantes[i];
       }
       else return null;
   }
   
   public void mostrarRegulares(){
       for (int i=0 ; i<this.totalEstudiante ; i++){
           if (this.listaEstudiantes[i].regular == true){
               Estudiante e = this.listaEstudiantes[i];
               System.out.println("Estudiante #" + (i+1));
               System.out.println("Apellido: "+e.getApellido());
               System.out.println("Nombres: "+e.getNombre());
               System.out.println("LU: "+e.getLU());
               System.out.println("Email: "+e.getEmail());
               System.out.println("Regular: "+e.regular);
               System.out.println("Nota 1:"+e.getNotaP1());
               System.out.println("Nota 2:"+e.getNotaP2());
               System.out.println("Nota R:"+e.getNotaR());
               System.out.println("Asistencias: "+e.getAsistencia());
               System.out.println("--------------------------");           

           }
       }
   }
   
}
