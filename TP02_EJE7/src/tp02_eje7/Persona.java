/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_eje7;
import java.util.GregorianCalendar;
import java.time.LocalDate;
/**
 *
 * @author Sans
 */
public class Persona {
    private long dni;
    private String nombre;
    private String apellido;
    private GregorianCalendar fnac;

    public Persona() {
    }

    public Persona(long dni, String nombre, String apellido, GregorianCalendar fnac) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fnac = fnac;
    }
    
    //getter and setter

    public long getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public GregorianCalendar getFnac() {
        return fnac;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFnac(GregorianCalendar fnac) {
        this.fnac = fnac;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fnac=" + fnac + '}';
    }
    
    //metodos
    
    public void mostarAyP(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
    }
    public int edad(GregorianCalendar fact){
        int j,o;
        GregorianCalendar f;
        j=fact.get(GregorianCalendar.YEAR);
        o=this.fnac.get(GregorianCalendar.YEAR);
        if(cumpleanios()==true) return j-o;
        else return j-o-1;
    }
    public boolean cumpleanios(){
        LocalDate ahora=LocalDate.now();
        if(this.fnac.get(GregorianCalendar.YEAR)==ahora.getYear()&&this.fnac.get(GregorianCalendar.MONTH)==ahora.getMonthValue()&&this.fnac.get(GregorianCalendar.DAY_OF_MONTH)==ahora.getDayOfMonth()) return true;
        else return false;
    }
}
