/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej6;



/**
 *
 * @author diego27
 */
public class CuadroMedico {
    public Medico listaMedicos[];
    private int n = 0;

    public CuadroMedico() {
    }

    public CuadroMedico(Medico[] listaMedicos) {
        this.listaMedicos = new Medico[100];
    }
    
    public void insertarMedico(Medico m){
        this.listaMedicos[this.n] = m;
        this.n++;
    }
    
    public void eliminarMedico(int matricula){
        int pos = -1;
        for(int i=0;i<n && pos==-1;i++){
            if(listaMedicos[i].getMatricula() == matricula){
                pos = i;
            }
        }
       
        for(int i=pos;i<n;i++){
            listaMedicos[i] = listaMedicos[i+1];
        }
        this.n--;
        
        if(pos==-1){
            System.out.println("No se encontro a un medico con esa matricula");
        }
    }
    
   // public Medico obtenerMedico(){
        //return Medico;
   // }
    
}
