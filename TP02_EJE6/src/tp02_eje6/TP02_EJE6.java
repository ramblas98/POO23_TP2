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
public class TP02_EJE6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuartomedico a=new Cuartomedico();
        Medico b=new Medico();
        Historia h[]=new Historia[7];
        int i;
        System.out.println("Se insertar y muestran Medicos");
        Medico medic0=new Medico("Nortes",5677,Especialidad.PEDIATRIA);
        Medico medic1=new Medico("Gutierrez",4568,Especialidad.FAMILIA);
        Medico medic2=new Medico("Mayor",7890,Especialidad.FAMILIA);
        Medico medic3=new Medico("Guillen",4567,Especialidad.TRAUMATOLOGIA);
        Medico medic4=new Medico("Mateo",8976,Especialidad.TRAUMATOLOGIA);
        Medico medic5=new Medico("Nico",0100,Especialidad.ORTORRIO);
        a.insertarmedico(medic0);
        a.insertarmedico(medic1);
        a.insertarmedico(medic2);
        a.insertarmedico(medic3);
        a.insertarmedico(medic4);
        a.insertarmedico(medic5);
        System.out.println("Se muestran Medicos");
        a.mostrar();
        System.out.println("Se Ingresan Pacientes");
        h[0]=new Historia("Rocio",Estadoinicial.LEVE,Especialidad.PEDIATRIA);
        h[1]=new Historia("Andres",Estadoinicial.GRAVE,Especialidad.TRAUMATOLOGIA);
        h[2]=new Historia("Juan",Estadoinicial.MALO,Especialidad.TRAUMATOLOGIA);
        h[3]=new Historia("Marieta",Estadoinicial.LEVE,Especialidad.FAMILIA);
        h[4]=new Historia("Alfonso",Estadoinicial.MALO,Especialidad.FAMILIA);
        h[5]=new Historia("Leo",Estadoinicial.GRAVE,Especialidad.ORTORRIO);
        System.out.println("Se asignan a los medicos los pacientes");
        for(i=0;i<6;i++){
            h[i].asignarHistoriaaMedico(a);
            b=h[i].getMedicoasignado();
            int j=i+1;
            if(b==null) System.out.println("Nombre del Medico: Sin Medico  "+" Nombre del Paciente: "+h[i].getCodigoPaciente());
            else System.out.println("Nombre del Medico: "+b.getNombre()+" Nombre del Paciente: "+h[i].getCodigoPaciente());
        }
        System.out.println("Se muestran los pacientes");
        for(i=0;i<6;i++){
            h[i].mostrar();
        }
        System.out.println("Se muestran vuelven a mostrar los medicos");
        a.mostrar();
        a.eliminar(medic5);
        a.mostrar();
    }
}
