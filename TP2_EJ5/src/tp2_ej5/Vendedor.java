/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej5;

/**
 *
 * @author medin
 */
public class Vendedor {
    private int legajo=0;
    private String zonaDeVenta;
    private float[] ventasMensuales;
    private float comision;
    private Persona datos;
    
    public Vendedor(String zonaDeVenta) {
        this.legajo = legajo;
        aumentarlegajo();
        this.zonaDeVenta = zonaDeVenta;
        this.ventasMensuales = new float[13];
        this.comision=0;
    }
    
    public void ingresarDatos(String nombre, String apellido, int dni){
        this.datos = new Persona(nombre,apellido,dni);
    }
    public void aumentarlegajo(){
        this.legajo+=1;
    }
    
    public void cargarVentas(float dinero,int mes){
        this.ventasMensuales[mes]=dinero;
    }
    public float totalAnual(){
        int suma=0;
        for(int i=1;i<13;i++){
            suma += this.ventasMensuales[i];
        }
        return suma;
    }

    public String getZonaDeVenta() {
        return zonaDeVenta;
    }

    public Persona getDatos() {
        return datos;
    }

    public void setZonaDeVenta(String zonaDeVenta) {
        this.zonaDeVenta = zonaDeVenta;
    }

    public void setDatos(Persona datos) {
        this.datos = datos;
    }
    
    public void calcularComision(){
        float total=totalAnual();
        if(total<50000){
            System.out.println("No hay comision");
            this.comision=0;
        }else{
            if(total>=50000 && total<75000){
            System.out.println("La comsion es del 15%");
            this.comision = total * (float)0.15;
            }else{
                if(total>=75000 && total<100000){
                    System.out.println("La comision es del 20%");
                    this.comision=total* (float)0.20;
                }else{
                    System.out.println("La comision es del 30%");
                    this.comision= total * (float)0.30;
                }
            }
        }
    }

    
    
    
    
}
