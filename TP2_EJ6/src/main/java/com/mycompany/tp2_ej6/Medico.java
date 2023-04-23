/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_ej6;

import java.util.Scanner;


enum Especialidad{
           familia,traumotologia,pediatria,internista,otorrino;
       }

public class Medico {
    private String nombre;
    private int matricula;
    private Especialidad especialdiad;
    private int cupo;
    private Historia[] listaHistoria;

    public Medico() {
    }

    public Medico(String nombre, int matricula, Especialidad especialdiad, int cupo, Historia[] listaHistoria) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialdiad = especialdiad;
        this.cupo = cupo;
        this.listaHistoria = listaHistoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public Especialidad getEspecialdiad() {
        return especialdiad;
    }

    public int getCupo() {
        return cupo;
    }

    public Historia[] getListaHistoria() {
        return listaHistoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setEspecialdiad(Especialidad especialdiad) {
        this.especialdiad = especialdiad;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public void setListaHistoria(Historia[] listaHistoria) {
        this.listaHistoria = listaHistoria;
    }

    public void Medico(){
        Scanner teclado = new Scanner (System.in);
        Medico m = new Medico();
        System.out.println ("Ingrese nombre del medico: ");
        m.setNombre(teclado.nextLine());
        System.out.println("Matricula:");
        m.setMatricula(teclado.nextInt());
        System.out.println("Especialidad:");
        System.out.println("1 = Familia");
        System.out.println("2 = Traumonologia");
        System.out.println( "3 = Pediatria");
        System.out.println("4 = Internista");
        System.out.println("5 = Otorrino");
        System.out.println("RTA:");
        int rta = teclado.nextInt();
        switch (rta){
            case 1 = especialidad = familia;
        }
        m.setEspecialdiad(familia);
        
        public boolean disponibilidad{
            
        }
    }
    
    public void Medico(String nombre, int matricula, Especialidad especialidad, int cupo){
        Medico m = new Medico();
        m.setNombre(nombre);
        m.setCupo(cupo);
        m.setEspecialdiad(especialdiad);
        m.setMatricula(matricula);
        
    }
    
    
}
