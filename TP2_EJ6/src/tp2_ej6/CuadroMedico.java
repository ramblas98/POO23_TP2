/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej6;

/**
 *
 * @author medin
 */
public class CuadroMedico {
    private Medico[][] listaMedico;
    private int cantMF=0;
    private int cantMT=0;
    private int cantMP=0;
    private int cantMI=0;
    private int cantMO=0;

    public CuadroMedico() {
        this.listaMedico=new Medico[5][100];
    }
    
    public void insertarMedico(Medico m){
        switch(m.getEspecialidad()){
            case FAMILIA:
                this.listaMedico[0][this.cantMF]=m;
                this.cantMF++;
                ordenarListaMedico(0,this.cantMF);
                break;
            case TRAUMATOLOGIA:
                this.listaMedico[1][this.cantMT]=m;
                this.cantMT++;
                ordenarListaMedico(1,this.cantMT);
                break;
            case PEDIATRA:
                this.listaMedico[2][this.cantMP]=m;
                this.cantMP++;
                ordenarListaMedico(2,this.cantMP);
                break;
            case INTERNISTA:
                this.listaMedico[3][this.cantMI]=m;
                this.cantMI++;
                ordenarListaMedico(3,this.cantMI);
                break;
            case OTORRINO:
                this.listaMedico[4][this.cantMO]=m;
                this.cantMO++;
                ordenarListaMedico(4,this.cantMO);
                break;
        }
    }
    public void ordenarListaMedico(int f,int cantM){
        Medico aux;
        for(int i=0;i<cantM-1;i++){
            if(this.listaMedico[f][i].getCupo()>this.listaMedico[f][i+1].getCupo()){
                aux=this.listaMedico[f][i];
                this.listaMedico[f][i]=this.listaMedico[f][i+1];
                this.listaMedico[f][i+1]=aux;
            }
        }
    }
    public Medico obtenerMedicoMayorD(Especialidad e){
        Medico m= new Medico();
        int c=0,f=0;
        switch(e){
            case FAMILIA:
                c=cantMF;
                f=0;
                break;
            case TRAUMATOLOGIA:
                c=cantMT;
                f=1;
                break;
            case PEDIATRA:
                c=cantMP;
                f=2;
                break;
            case INTERNISTA:
                c=cantMI;
                f=3;
                break;
            case OTORRINO:
                c=cantMO;
                f=4;
                break;
        }
        if(c==0){
            return m;
        }else{
            if(this.listaMedico[f][c-1].disponibilidad()){
                return this.listaMedico[f][c-1];
            }else{
                return m;
            }
        }
        
    }
    
    
    
}
