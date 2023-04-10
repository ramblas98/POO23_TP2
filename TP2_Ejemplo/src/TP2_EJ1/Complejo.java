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
    
    public void por(double d){
        this.re *= d - im*0;
        this.im =
    }
    
    public void div (Complejo a){
        
    }
    
    public double modulo(){
        Complejo c3;
        c3 = new Complejo (3,2);
        double result = 
    }
    
    public Complejo conjugado(){
        Complejo c3;
        c3 = new Complejo (3,2 );
        c3.im *=(-1);
        return c3;
    }
}
