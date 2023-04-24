/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp2_ej5;




public class TP2_EJ5 {

    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        
        v.ventasMensuales();
        
        double total = v.totalAnual();
        System.out.println("Total Anual: " + total);
        
        double comision = v.calcularComision();
        System.out.println("Comision: " + comision);
        
        
    }
}
