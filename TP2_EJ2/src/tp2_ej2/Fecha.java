/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej2;

/**
 *
 * @author medin
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;
    int aux;
    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void reiniciar(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }

    public void adelantar(int d) {
        this.dia += d;
    }

    public void imprimir() {
        System.out.println("Dia: " + this.dia + ", Mes: " + this.mes + ", Año: " + this.anio);
    }
    
    public boolean validar(){
        if (this.anio >= 1){
            if (this.mes >= 1 && this.mes <= 12) {
                if (this.dia >= 1 && this.dia <= dias(this.mes)) {
                   return true;
                }else{
                    System.out.println("Fecha no Valida sera Normalizada");
                    normalizar();
                    return false;
                }
            }else{
                System.out.println("Fecha no Valida sera Normalizada");
                normalizar();
                return false;
            }
        }else{
            System.out.println("Fecha no Valida sera Normalizada");
            normalizar();
            return false;
        }
    }
    
    public void normalizar() {

        boolean band = false;
        while (band == false) {
            if (this.anio >= 1){
                if (this.mes >= 1 && this.mes <= 12) {
                    if (this.dia >= 1 && this.dia <= dias(this.mes)) {
                        band = true;
                        
                    }else{
                        if(this.dia>0){
                            aux=this.mes;
                            this.mes = this.mes + this.dia/dias(this.mes);
                            this.dia = this.dia % dias(aux);
                        }else{
                            this.dia+=dias(this.mes);
                            this.mes--;
                        }
                    }
                }else{
                    if(this.mes>0){
                        this.anio+= this.mes/12;
                        this.mes=this.mes%12;
                    }else{
                        this.mes+=12;
                        this.anio--;
                    }
                }
            }else{
                if (this.mes >= 1 && this.mes <= 12) {
                    if (this.dia >= 1 && this.dia <= dias(this.mes)) {
                        System.out.println("ERROR: se Ingreso mal la Fecha");
                        band=true;
                    }else{
                        if(this.dia>0){
                            aux=this.mes;
                            this.mes = this.mes + this.dia/dias(this.mes);
                            this.dia = this.dia % dias(aux);
                        }else{
                            System.out.println("ERROR: se Ingreso mal la Fecha");
                            band=true;
                        }
                    }
                }else{
                    if(this.mes>0){
                        this.anio+= this.mes/12;
                        this.mes=this.mes%12;
                    }else{
                        System.out.println("ERROR: se Ingreso mal la Fecha");
                        band=true;
                    }
                }
            }
        }
    }

    public boolean bisiesto(int a) {
        return a % 400 == 0 || a % 4 == 0 && a % 10 != 0;

    }

    public int dias(int m) {

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            return 31;
        } else {
            if (m == 4 || m == 6 || m == 9 || m == 11) {
                return 30;
            } else {
                if (bisiesto(this.anio) == true) {
                    return 29;
                } else {
                    return 28;
                }
            }
        }
    }

}
