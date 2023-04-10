/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej1;

/**
 *
 * @author diego27
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
        this.re = this.re + a.re;
        this.im = this.im + a.im;
    }
    
    public void dec(Complejo a){
        this.re = this.re - a.re;
        this.im = this.im - a.im;
    }
    
    public void por(Complejo a){
        this.re = this.re * a.re;
        this.im = this.im * a.im;
    }
    
    public void por(double d){
        this.re = this.re * d;
        this.im = this.im * d;
    }
    
    public void div(Complejo a){
        this.re = this.re / a.re;
        this.im = this.im / a.im;
    }
    
    public double modulo(){
    double d = Math.sqrt(Math.pow(this.re,2)+Math.pow(this.im,2));
    return d;
    }
}
