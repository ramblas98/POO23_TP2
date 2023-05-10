/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej6;

/**
 *
 * @author medin
 */
public class TP2_EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Medico m1=new Medico("nortes",5677,Especialidad.PEDIATRA);
        Medico m2=new Medico("gutierrez",4568,Especialidad.FAMILIA);
        Medico m3=new Medico("mayor",7890,Especialidad.FAMILIA);
        Medico m4=new Medico("guillen",4567,Especialidad.TRAUMATOLOGIA);
        Medico m5=new Medico("mateo",8976,Especialidad.TRAUMATOLOGIA);
        
        CuadroMedico cm=new CuadroMedico();
        cm.insertarMedico(m1);
        cm.insertarMedico(m2);
        cm.insertarMedico(m3);
        cm.insertarMedico(m4);
        cm.insertarMedico(m5);
        
        Historia h1=new Historia("Rocio",Estado.LEVE,Especialidad.PEDIATRA);
        Historia h2=new Historia("Andres",Estado.GRAVE,Especialidad.TRAUMATOLOGIA);
        Historia h3=new Historia("Juean",Estado.MODERADO,Especialidad.TRAUMATOLOGIA);
        Historia h4=new Historia("Marieta",Estado.LEVE,Especialidad.FAMILIA);
        Historia h5=new Historia("Alfonso",Estado.MODERADO,Especialidad.FAMILIA);
        
        
            h1.asignarMedico(cm);
            System.out.println("Medico: "+h1.getMedicoAgisnado().getNombre()+" Paciente: "+h1.getCodigoPaciente());
            h2.asignarMedico(cm);
            System.out.println("Medico: "+h2.getMedicoAgisnado().getNombre()+" Paciente: "+h2.getCodigoPaciente());
            h3.asignarMedico(cm);
            System.out.println("Medico: "+h3.getMedicoAgisnado().getNombre()+" Paciente: "+h3.getCodigoPaciente());
            h4.asignarMedico(cm);
            System.out.println("Medico: "+h4.getMedicoAgisnado().getNombre()+" Paciente: "+h4.getCodigoPaciente());
            h5.asignarMedico(cm);
            System.out.println("Medico: "+h5.getMedicoAgisnado().getNombre()+" Paciente: "+h5.getCodigoPaciente());
            
            
        
    }
    
}
