/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej1;



/**
 *
 * @author fabricio
 */
public class COMPLEJO {
   private double re;
   private double im;

    public COMPLEJO() {
    }

    public COMPLEJO(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
    
    
    public void inc(COMPLEJO a){
        this.re += a.getRe();
        this.im += a.getIm();
    }
    public void dec(COMPLEJO a){
        this.re-=a.re;
        this.im-=a.im;
    }
    public void por(COMPLEJO a){
    double temp_re = this.re * a.re - this.im * a.im;
    double temp_im = this.re * a.im + this.im * a.re;
    this.re = temp_re;
    this.im = temp_im;
    }
    
    public void por(double d){
        this.im*=d;
        this.re*=d;
    } 
   
  public void div(COMPLEJO a){
         double divisor = a.getRe()*a.getRe() + a.getIm()*a.getIm();
        double temp_re = (this.re*a.getRe() + this.im*a.getIm())/divisor;
        double temp_im = (this.im*a.getRe() - this.re*a.getIm())/divisor;
        this.re = temp_re;
        this.im = temp_im;
    }
  public double modulo( ){
  return Math.sqrt(this.re*this.re + this.im*this.im);
  }
  public COMPLEJO conjugado(){
     return new COMPLEJO(this.re, -this.im);
  }
  
  /* estaticos*/
public static COMPLEJO suma(COMPLEJO a,COMPLEJO b){
    a.im+=b.im;
    a.re+=b.re;
    return a;
}
public static COMPLEJO resta(COMPLEJO a,COMPLEJO b){
    a.im-=b.im;
    a.re-=b.re;
     
    return a;
}

public static COMPLEJO producto(COMPLEJO a,COMPLEJO b){
    COMPLEJO c=new COMPLEJO();
    c.setIm(a.im*b.im);
    c.setRe(a.re*b.re);
    return c;
}

public static COMPLEJO division(COMPLEJO a,COMPLEJO b){
   COMPLEJO c = new COMPLEJO();
    double divisor = b.re * b.re + b.im * b.im;
    c.setIm((a.im * b.re - a.re * b.im) / divisor);
    c.setRe((a.re * b.re + a.im * b.im) / divisor);
    return c;
}   
}