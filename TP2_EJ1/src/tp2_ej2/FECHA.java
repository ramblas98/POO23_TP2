/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej2;
/**
 *
 * @author fabricio
 */
public class FECHA {
    private int dia;
    private int mes;
    private int anio;

    public FECHA() {
        this.dia=1;
        this.mes=1;
        this.anio=1;
        
    }

    public FECHA(int dia, int mes, int anio) {
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
    
    public void reiniciar(int d,int m, int a){
        this.setDia(d);
        this.setMes(m);
        this.setAnio(a);
    }
   public void adelantar(int d) {
    this.dia += d;
    while (this.dia > dias(this.mes, this.anio)) {
        this.dia -= dias(this.mes, this.anio);
        this.mes++;
        if (this.mes > 12) {
            this.mes = 1;
            this.anio++;
        }
    }
    this.normalizar();
    }

  public void imprimir() {
    System.out.printf("%02d/%02d/%04d\n", this.dia, this.mes, this.anio);
}

   public  boolean valida() {
    if (this.anio < 1 || this.mes < 1 || this.mes > 12 || this.dia < 1 || this.dia > dias(this.mes, this.anio)) {
        return false;
    }
    return true;
}
    public void normalizar() {
    if (this.mes < 1) {
        this.mes = 1;
    } else if (this.mes > 12) {
        this.mes = 12;
    }
    int numDias = dias(this.mes, this.anio);
    if (this.dia < 1) {
        this.dia = 1;
    } else if (this.dia > numDias) {
        this.dia = numDias;
    }
    }

   public int dias(int mes, int anio) {
    int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int numDias = diasMes[mes - 1];
    if (mes == 2 && bisiesto(anio)) {
        numDias = 29;
    }
    return numDias;
    }
   public static boolean bisiesto(int a) {
    boolean esBisiesto = false;
    if (a % 400 == 0) {
        esBisiesto = true;
    } else if (a % 4 == 0 && a % 100 != 0) {
        esBisiesto = true;
    }
    return esBisiesto;
}

    
    
}
