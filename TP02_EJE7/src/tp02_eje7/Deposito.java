/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_eje7;

/**
 *
 * @author Sans
 */
public class Deposito {
    private Cliente titular;
    private double capital;
    private int plazo;
    private double tna;
    private double tea;

    public Deposito() {
    }

    public Deposito(Cliente titular, double capital, int plazo, double tna, double tea) {
        this.titular = titular;
        this.capital = capital;
        this.plazo = plazo;
        this.tna = tna;
        this.tea = tea;
    }
    
    //getter and setter

    public Cliente getTitular() {
        return titular;
    }

    public double getCapital() {
        return capital;
    }

    public int getPlazo() {
        return plazo;
    }

    public double getTna() {
        return tna;
    }

    public double getTea() {
        return tea;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public void setTna(double tna) {
        this.tna = tna;
    }

    public void setTea(double tea) {
        this.tea = tea;
    }

    @Override
    public String toString() {
        return "Deposito{" + "titular=" + titular + ", capital=" + capital + ", plazo=" + plazo + ", tna=" + tna + ", tea=" + tea + '}';
    }
    
    //metodos
/*    public double interes(String t){//consultar interes
        double inte=((this.tna/100)*(this.plazo*30))/365;
        if(t=="TNA"){
            return (this.capital*inte);
        }
        else{
            
        }
    }
    */
    public double[] detalle(double i){
        double l[]=new double[8];
        int j;
        for(j=0;j<8;j++){
            l[j]=0;
        }
        j=0;
        while(i>0.50){
            if(i>=100) {
                l[0]+=1;
                i=i-100;
             }
            else if (i<100&&i>=50) {
                 l[1]+=1;
                 i=i-50;
             }
            else if(i<100&&i<50&&i>=20){
                l[2]+=1;
                i=i-20;
            }
            else if(i<100&&i<50&&i<20&&i>=10){
                l[3]+=1;
                i=i-10;
            }
            else if(i<100&&i<50&&i<20&&i<10&&i>=5){
                l[4]+=1;
                i=i-5;
            }
            else if(i<100&&i<50&&i<20&&i<10&&i<5&&i>=2){
                l[5]+=1;
                i=i-2;
            }
            else if(i<100&&i<50&&i<20&&i<10&&i<5&&i<2&&i>=1){
                l[6]+=1;
                i=i-1;
            }
            else if(i<100&&i<50&&i<20&&i<10&&i<5&&i<2&&i<1&&i>=0.50){
                l[7]+=1;
                i=i-0.50;
            }
        }
        return l;
    }
    void mostrarcambio(double i){
        double l[]=new double[8];
        double l1[]=new double[8];
        l1[0]=100;
        l1[1]=50;
        l1[2]=20;
        l1[3]=10;
        l1[4]=5;
        l1[5]=2;
        l1[6]=1;
        l1[7]=0.25;
        if(i!=0){
           l=detalle(i);
           int j;
           System.out.print("$"+i+"= ");
           for(j=0;j<8;j++){
               if(l[j]!=0){
                   System.out.print("( "+l[j]+" * $"+l1[j]+" )");
               }
           }
           System.out.println(" ");
           System.out.println("Cambio Dado");
        }
        else System.out.println("No se puede dar cambio de 0");

    }
    void detallerecursivo(double i,int n){
        
    }
}
