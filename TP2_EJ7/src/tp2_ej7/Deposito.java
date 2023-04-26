/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej7;


public class Deposito {
    private Cliente titular;
    private double capital;
    private int plazo;
    private double finalTNA;
    private double finalTEA;

    public Deposito() {
    }

    public Deposito(Cliente titular, double capital, int plazo, double finalTNA, double finalTEA) {
        this.titular = titular;
        this.capital = capital;
        this.plazo = plazo;
        this.finalTNA = finalTNA;
        this.finalTEA = finalTEA;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getCapital() {
        return capital;
    }

    public int getPlazo() {
        return plazo;
    }

    public double getFinalTNA() {
        return finalTNA;
    }

    public double getFinalTEA() {
        return finalTEA;
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

    public void setFinalTNA(double finalTNA) {
        this.finalTNA = finalTNA;
    }

    public void setFinalTEA(double finalTEA) {
        this.finalTEA = finalTEA;
    }
    
    public double intereses(String t){
        if (t.equals("TNA")){
            double intereses = (this.finalTNA / 365) * this.plazo;
            return intereses;
        }
        if (t.equals("TEA")){
            double intereses = (Math.pow(1 + (this.finalTEA/360),this.plazo) - 1);
            return intereses;
        }
        else return 0;
    }
    
}
