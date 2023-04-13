/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej2;


 
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        dia = 1;
        mes = 1;
        anio = 2023;
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

    
    public String Imprimir() {
        return "Fecha{" + dia + "/" + mes + "/" + anio + '}';
    }
    
    public void reiniciar (int d,int m,int a){
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }
    
    public void adelantar(int d){
        this.dia += d;
        
    }
    
    public boolean bisiesto(){
        if (anio %100 == 0)
            return false;
        else if (anio %400 == 0 || anio %4 == 0)
            return true;
        else {return false;
        }
       }
    }
}
