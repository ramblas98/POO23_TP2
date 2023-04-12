/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej2;

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
    
/*    public boolean valida(){
       if(32>this.dia>0 && 13>this.mes>0 && 2023>this.anio>999){
         return true;  
       }else{
           return false;
       }
    }
*/
    
    public void normalizar(){
        
    }
    
    public int dias(int m){
        return 15;
    }
    
    public String imprimir(){
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    public boolean bisiesto(int a){
        return true;
    }
    
    public int dia(int m){
        switch(m){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                return 28;
            case 4: case 6: case 9: case 11: default:
                return 30;
        }
    }
}
