/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej5;

/**
 *
 * @author medin
 */
public class TP2_EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vendedor vendedor1=new Vendedor("Oran");
        vendedor1.ingresarDatos("Jose", "pacu", 35890543);
        System.out.println(vendedor1.getDatos().getNombre());
        vendedor1.cargarVentas(40000,1);
        vendedor1.cargarVentas(40000,2);
        vendedor1.calcularComision();
    }
    
}
