/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej7;

/**
 *
 * @author diego27
 */
public class Deposito {
        private Cliente titular;
        private double capital;
        private int plazo;
        private final double TNA;
        private final double TA;

    public Deposito(double TNA, double TA) {
        this.TNA = TNA;
        this.TA = TA;
    }

    public Deposito(Cliente titular, double capital, int plazo, double TNA, double TA) {
        this.titular = titular;
        this.capital = capital;
        this.plazo = plazo;
        this.TNA = TNA;
        this.TA = TA;
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

    public double getTNA() {
        return TNA;
    }

    public double getTA() {
        return TA;
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
        
      


        
        
}
