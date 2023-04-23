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
public class Cuartomedico {
    private Medico listamedico[];
    private int cantidadmedicos;

    public Cuartomedico() {
        listamedico=new Medico[100];
    }

    public int getCantidadmedicos() {
        return cantidadmedicos;
    }

    public void setCantidadmedicos(int cantidadmedicos) {
        this.cantidadmedicos = cantidadmedicos;
    }

    @Override
    public String toString() {
        return "Cuartomedico{" + "listamedico=" + listamedico + ", cantidadmedicos=" + cantidadmedicos + '}';
    }
    
    //metodo
    
    public void incrementarmedicos(){
        this.cantidadmedicos=this.cantidadmedicos+1;
    }
    public void insertarmedico(Medico e){
        this.listamedico[cantidadmedicos]=e;
        this.incrementarmedicos();
    }
    public Medico mayorespecialidad(Especialidad espe){
        Medico a=new Medico();
        int i;
        if(cantidadmedicos==0) return a;
        else{
            for(i=0;i<this.cantidadmedicos;i++){
                if(a.getNombre()==null){
                    if(this.listamedico[i].getCupo()>0&&this.listamedico[i].getEsp()==espe) a=this.listamedico[i];
                }
                else{
                    if(a.getCupo()<this.listamedico[i].getCupo()&&this.listamedico[i].getEsp()==espe) a=this.listamedico[i];
                }
            }
        }
        return a;
    }
    public void mostrar(){
        int i;
        for(i=0;i<this.cantidadmedicos;i++){
            System.out.println("------------Medico------------");
            this.listamedico[i].mostrar();
        }
    }
}
