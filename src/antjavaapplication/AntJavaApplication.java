/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package antjavaapplication;

/**
 *
 * @author alex
 */
public class AntJavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double precio = 20;
        double precioConIVA1 = precioConIVA(precio);
        System.out.println("precio: "+precio);
        System.out.println("precioConIVA: "+precioConIVA1);
        
    }
        static double precioConIVA(double precio) {
        return precio*1.21;
    }
}
