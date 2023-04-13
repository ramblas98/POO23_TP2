/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_EJ1;

/**
 *
 * @author Jonatan Cossio
 */
public class Complejo {
    private double re;
    private double im;

    public Complejo() {
    }

    public Complejo(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    @Override
    public String toString() {
        return "Complejo{" + "re=" + re + ", im=" + im + '}';
    }
    
    public void inc(Complejo a){
        this.re += a.re;
        this.im += a.im;
    }
    
    public void dec(Complejo a){
        this.re -= a.re;
        this.im -= a.im;
    }
    
      public void por(Complejo a){
        this.re = this.re*a.re - this.im*a.im;
        this.im = this.re*a.re * this.im*a.im;
    }
    
    public void div (Complejo a){
        double denominador = a.re*a.re + a.im*a.im; 
        this.re = (this.re*a.re + this.im*a.im)/denominador;
        this.im = (this.im * a.re - this.re * a.im)/denominador;
    }
    
    public double modulo(){
        return Math.sqrt(this.re*2 + this.im*2);
    }
    
    
    
    public Complejo conjugado(){
          return new Complejo(this.re, -this.im);
    }

}
