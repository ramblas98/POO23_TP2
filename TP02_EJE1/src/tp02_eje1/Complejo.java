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
    
}
