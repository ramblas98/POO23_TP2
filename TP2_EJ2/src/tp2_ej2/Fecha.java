/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej2;
import java.util.*;

/**
 *
 * @author diego27
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 25;
        this.mes = 03;
        this.anio = 2002;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    public void reiniciar(int d,int m, int a){
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }
    
    public void adelantar(int d){
        this.dia = this.dia + d;
    }
    
    public boolean valida(){
        return true;
    }
    
    public void normalizar(){
        
    }
    
    public int dias(int m){
        return 15;
    }
    
    public void imprimir(){
        
    }
    
    public boolean bisiesto(int a){
        return true;
    }
}
