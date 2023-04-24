/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej7;

import java.util.GregorianCalendar;

public class Persona {
    private long dni;
    private String nombres;
    private String apellidos;
    private GregorianCalendar fnac;

    public Persona() {
    }

    public Persona(long dni, String nombres, String apellidos, GregorianCalendar fnac) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fnac = fnac;
    }

    public GregorianCalendar getFnac() {
        return fnac;
    }

    public void setFnac(GregorianCalendar fnac) {
        this.fnac = fnac;
    }

    public long getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }


    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void mostrarAyN(){
        System.out.println("Nombre" + this.nombres);
        System.out.println("Apellido" + this.apellidos);
    }
    
    public GregorianCalendar edad(GregorianCalendar fAct){
        GregorianCalendar f;
        f = new GregorianCalendar();
        f.set(2023, 04, 24);
        return f;
    }
    
    public boolean cumpleanios(){
        
    }
    
}
