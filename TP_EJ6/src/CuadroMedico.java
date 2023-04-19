/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class CuadroMedico {
    public Medico[] listaMedicos;
    private int n = 0;

    public CuadroMedico() {
    }

    public CuadroMedico(Medico[] listaMedicos) {
        this.listaMedicos = listaMedicos;
    }

    public Medico[] getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(Medico[] listaMedicos) {
        this.listaMedicos = listaMedicos;
    }
    
    public void insertarMedico(Medico m){
        this.listaMedicos[this.n]= m;
        this.n++;
        
    }
    public void eliminarMedico(int matricula){
        int i,pos = -1;
        
        for(i=0;i<this.n && pos==-1;i++){
            if(listaMedicos[i].getMatricula() == matricula ){
                pos=i;
            }
        }
        if(pos==-1) System.out.println ("No se encuentra el Medico");
        else{
            
            for(i=pos;i<n;i++){
            listaMedicos[i] = listaMedicos[i+1];
            }
            System.out.println("Se elimino el medico existosamente");
            n--;
        }
        
        
    }
    public Medico obtenerMedico(String esp){
        int i,dispAct = 0,pos= -1,dispMay=0;
        boolean b;
        
        b=false;
        for(i=0;i<n && b==false;i++){
            if(listaMedicos[i].getEspecialidad() == esp) b=true;
        }
        if(b==false)return null;
        else{
            for(i=0;i<n;i++){
                if(listaMedicos[i].getEspecialidad()==esp){
                    dispAct= listaMedicos[i].getCupo()-listaMedicos[i].getHistoria().length;
                    if(dispAct>dispMay){
                        dispMay=dispAct;
                        pos=i;
                    }
                }
            }
         return listaMedicos[pos];
        }
    }
}
