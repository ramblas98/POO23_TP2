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
public class Historia {
    private static int identificador;
    private String codigoPaciente;
    private Estadoinicial estadoinicial;
    private Especialidad especialidadmedico;
    private boolean altapaciente ;
    private Medico medicoasignado;
    //constructor

    public Historia() {
    }

    public Historia(String codigoPaciente, Estadoinicial estadoinicial, Especialidad especialidadmedico) {
        this.codigoPaciente = codigoPaciente;
        this.estadoinicial = estadoinicial;
        this.especialidadmedico = especialidadmedico;
        this.altapaciente=false;
        this.identificador=this.identificador+1;
    }
    
    //getter and setter

    public static int getIdentificador() {
        return identificador;
    }

    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public Estadoinicial getEstadoinicial() {
        return estadoinicial;
    }

    public Especialidad getEspecialidadmedico() {
        return especialidadmedico;
    }

    public boolean isAltapaciente() {
        return altapaciente;
    }

    public Medico getMedicoasignado() {
        return medicoasignado;
    }
    
    

    public static void setIdentificador(int identificador) {
        Historia.identificador = identificador;
    }

    public void setCodigoPaciente(String codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public void setEstadoinicial(Estadoinicial estadoinicial) {
        this.estadoinicial = estadoinicial;
    }

    public void setEspecialidadmedico(Especialidad especialidadmedico) {
        this.especialidadmedico = especialidadmedico;
    }

    public void setAltapaciente(boolean altapaciente) {
        this.altapaciente = altapaciente;
    }

    public void setMedicoasignado(Medico medicoasignado) {
        this.medicoasignado = medicoasignado;
    }

    @Override
    public String toString() {
        return "Historia{" + "codigoPaciente=" + codigoPaciente + ", estadoinicial=" + estadoinicial + ", especialidadmedico=" + especialidadmedico + ", altapaciente=" + altapaciente + ", medicoasignado=" + medicoasignado + '}';
    }
    
    
    
    //metodo
    private void daralta(){
        if(this.medicoasignado!=null) this.altapaciente=true;
    }
    public boolean asignarHistoriaaMedico(Cuartomedico b){
        Medico a=new Medico();
        a=b.mayorespecialidad(this.especialidadmedico);
        if(a==null)return false;
        else{
            this.medicoasignado=a;
            a.asignarhistoria(this);
            a.setCupo(a.getCupo()-1);
            return true;
        }
    }
    
    public void mostrar(){
        System.out.println("--------------Paciente--------------");
        System.out.println("Nombre: "+this.codigoPaciente);
        System.out.println("Estado: "+this.estadoinicial);
        System.out.println("Medico Asignado: "+this.medicoasignado.getNombre());
    }
}
