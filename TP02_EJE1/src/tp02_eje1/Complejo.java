/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02_eje1;

/**
 *
 * @author Sans
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
        this.re=this.re + a.re;
        this.im=this.im + a.im;
    }
    public void dec(Complejo a){
        this.re=this.re - a.re;
        this.im=this.im - a.im;
    }
    public void por(Complejo a){
        this.re=(this.re * a.re)-(this.im * a.im);
        this.im=(this.re * a.im)+(this.im * a.re);
    }
    public void por(double d){
        this.im=this.im * d;
        this.re=this.re * d;
    }
    public void div(Complejo a){
        double d,e,f;
        //parte real
        d=((this.re*a.im)+(this.im*a.re));
        e=(a.re*a.re)+(a.im*a.im);
        //parte imaginaria
        f=(this.im*a.re)-(this.re*a.im);
        this.re=d/e;
        this.im=f/e;
    }
    public double modulo(){
        return Math.sqrt(this.re+this.im);
    }
    public static Complejo suma(Complejo a,Complejo b){
        Complejo c;
        c=new Complejo(a.re+b.re,b.im+a.im);
        return c;
    }
    public static Complejo resta(Complejo a,Complejo b){
        return new Complejo(a.re-b.re,a.im-b.im);
    }
    public static Complejo producto(Complejo a,Complejo b){
        return new Complejo(a.re*b.re,a.im*b.im);
    }
    public static Complejo division(Complejo a,Complejo b){
        return new Complejo(a.re/b.re,a.im/b.im);
    }
    
}
