/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_eje2;
import java.util.Scanner;
/**
 *
 * @author Sans
 */
public class FECHA {
    private int dia;
    private int mes;
    private int anio;
    
    //Constructores

    public FECHA() {
    }

    public FECHA(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    //Getter and Setter

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
        return "FECHA{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    //metodos
    public void reiniciar(int d,int m,int a){
        this.dia=d;
        this.mes=m;
        this.anio=a;
    }
    public void adelantar(int d){
        this.dia=this.dia+d;
    }
    public void imprimir(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.anio);
    }
    public boolean valida(){
        if(this.dia>=1&&this.dia<=31&&this.mes>=1&&this.mes<=12&&this.anio>=1){
            if(bisiesto()==false){
                if( this.mes==1 || this.mes==3 || this.mes==7 || this.mes==8 ||this.mes==10 || this.mes==12){
                    if(this.dia>=31) return true;
                            else return false;
                }
                else if(this.mes==4 || this.mes==6 || this.mes==9 || this.mes==11){
                    if(this.dia<=30) return true;
                    else return false;
                }
                else {
                    if(this.dia<=28) return true;
                    else return false;
                }
            }
            else{
                if( this.mes==1 || this.mes==3 || this.mes==7 || this.mes==8 ||this.mes==10 || this.mes==12){
                    if(this.dia>=31) return true;
                            else return false;
                }
                else if(this.mes==4 || this.mes==6 || this.mes==9 || this.mes==11){
                    if(this.dia<=30) return true;
                    else return false;
                }
                else {
                    if(this.dia<=29) return true;
                    else return false;
                }

            }
        }
        else return false;
    }
    public int dias(int d){
        if(bisiesto()==false){
           if( this.mes==1 || this.mes==3 || this.mes==7 || this.mes==8 ||this.mes==10 || this.mes==12){
               return 31;
                }
        else if(this.mes==4 || this.mes==6 || this.mes==9 || this.mes==11) return 30;     
        else return 28;
        }
        else {
            if( this.mes==1 || this.mes==3 || this.mes==7 || this.mes==8 ||this.mes==10 || this.mes==12){
               return 31;
                }
            else if(this.mes==4 || this.mes==6 || this.mes==9 || this.mes==11) return 30;     
            else return 29;
        }
    }
    public void normalizar(){
        int re=0;
        while(valida()==false){
           re=dias(this.mes);
           if(this.dia>re&&this.mes==12){
                this.dia=this.dia-re;
                this.anio=this.anio+1;
                this.mes=1;
                }
           else if(this.dia>re&&this.mes<12){
                this.dia=this.dia-re;
                this.mes=this.mes+1;
           }
        }
    }
    public boolean bisiesto(){
        if(this.anio%4==0&&this.anio%100!=0) return true;
        else return false;
    }
    
}