/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej3;

/**
 *
 * @author fabricio
 */
public class Estudiante {
    private String  apellidos;
    private String  nombre;
    private int lu ;
    private String  email;
    public boolean  regular;
    private int notaP1;
    private int notaP2;
    private int notaR;
    private int asistencia;
    
    public Estudiante() {            
    }

    public Estudiante(String apellidos, String nombre, int lu, String email, boolean regular, int notaP1, int notaP2, int notaR, int asistencia) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.lu = lu;
        this.email = email;
        this.regular = regular;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaR = notaR;
        this.asistencia = asistencia;
    }

    public String getApellidos() {
        return apellidos;
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

    public int getNotaP1() {
        return notaP1;
    }

    public int getNotaP2() {
        return notaP2;
    }

    public int getNotaR() {
        return notaR;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public void setNotaP1(int notaP1) {
        this.notaP1 = notaP1;
    }

    public void setNotaP2(int notaP2) {
        this.notaP2 = notaP2;
    }

    public void setNotaR(int notaR) {
        this.notaR = notaR;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }
    
    
    /*terminar*/
    
    
}
