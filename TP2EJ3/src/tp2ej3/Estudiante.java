/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2ej3;
import java.util.*;
/**
 *
 * @author medin
 */
public class Estudiante {
    
    private String apellidos;
    private String nombres;
    private int lu;
    private String email;
    private int notaP1;
    private int notaP2;
    private int notaR;
    private int asistencia;
    public boolean regular;
    Scanner teclado = new Scanner(System.in);
    
    
    public Estudiante(){
        System.out.print("Nombre: ");
        this.nombres= teclado.next();
        System.out.print("Apellidos: ");
        this.apellidos= teclado.next();
        System.out.print("Lu: ");
        this.lu= teclado.nextInt();
        System.out.print("Email: ");
        this.email= teclado.next();
        this.asistencia=0;
        
    }

    public Estudiante(String apellidos, String nombres, int lu, String email) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.lu = lu;
        this.email = email;
        this.asistencia=0;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public int getLu() {
        return lu;
    }

    public String getEmail() {
        return email;
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

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public void incAsistencia(){
       this.asistencia++;
    }
    public void incAsistencia(int c){
        this.asistencia+=c;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "apellidos=" + apellidos + ", nombres=" + nombres + ", lu=" + lu + ", email=" + email + ", notaP1=" + notaP1 + ", notaP2=" + notaP2 + ", notaR=" + notaR + ", asistencia=" + asistencia + ", regular=" + regular + '}';
    }
    
    
    
}
