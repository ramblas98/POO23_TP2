/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej6;

/**
 *
 * @author medin
 */
public class Historia {
    private static int i=0;
    private int identificador;
    private String codigoPaciente;
    private Estado estadoInicial;
    private Especialidad especialidadMedico;
    private Medico medicoAgisnado;
    private boolean altaPaciente;

    public Historia(String codigoPaciente, Estado estadoInicial, Especialidad especialidadMedico) {
        this.identificador = i;
        this.codigoPaciente = codigoPaciente;
        this.estadoInicial = estadoInicial;
        this.especialidadMedico = especialidadMedico;
        this.altaPaciente = false;
        aumentarIdentificador();  
        
    }
    
    public void aumentarIdentificador(){
        i++;
    }
    public int getIdentificador() {
        return identificador;
    }

    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public Estado getEstadoInicial() {
        return estadoInicial;
    }

    public Especialidad getEspecialidadMedico() {
        return especialidadMedico;
    }

    public Medico getMedicoAgisnado() {
        return medicoAgisnado;
    }

    public boolean isAltaPaciente() {
        return altaPaciente;
    }

    public void darAltaPaciente() {
        if(this.medicoAgisnado!=null&&this.medicoAgisnado.getNombre()!=null){
            this.altaPaciente=true;
            this.medicoAgisnado.eliminarHistoria(this.getIdentificador());
        }
    }
    public boolean asignarMedico(CuadroMedico c){
        Medico m;
        m=c.obtenerMedicoMayorD(this.especialidadMedico);
        if(m.getNombre()!=null){
            this.medicoAgisnado=m;
            m.agregarHistoria(this);
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
}
