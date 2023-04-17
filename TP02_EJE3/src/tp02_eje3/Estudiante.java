/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_eje3;
import java.util.Scanner;
/**
 *
 * @author Sans
 */
public class Estudiante {
    private String apellido;
    private String nombre;
    private int lu;
    private String email;
    private boolean regular;
    private int not1;
    private int nota2;
    private int notar;
    private int asistencia;

    public Estudiante() {
    }

    public Estudiante(String apellido, String nombre, int lu, String email) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.lu = lu;
        this.email = email;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLu() {
        return lu;
    }

    public String getEmail() {
        return email;
    }

    public boolean isRegular() {
        return regular;
    }

    public int getNot1() {
        return not1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNotar() {
        return notar;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public void setNot1(int not1) {
        this.not1 = not1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setNotar(int notar) {
        this.notar = notar;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }
    public void incAsistencia(){
        this.asistencia=this.asistencia+1;
    }
    public void incAsistencia(int c){
        this.asistencia=this.asistencia+c;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "apellido=" + apellido + ", nombre=" + nombre + ", lu=" + lu + ", email=" + email + ", regular=" + regular + ", not1=" + not1 + ", nota2=" + nota2 + ", notar=" + notar + ", asistencia=" + asistencia + '}';
    }
    
}
