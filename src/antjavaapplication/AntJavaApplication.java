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
        
        //    public SmartDevice(double price, String tiempo) 
        SmartDevice dispositivo =  new SmartDevice(23.10, "15 Dic 2023");

        //  public SmartPhone (String brandPhone,double price, String tiempo)
        SmartPhone celular = new SmartPhone("Samsung", 15.20, "20 Dic 2023");
        
        //  public SmartWatch (String smartWatchBrand, double price, String tiempo)
        SmartWatch reloj= new SmartWatch("RedLine", 10.50, "10 Dic 2023");
        
        
        System.out.println("Datos SmartDevice");
        System.out.println("------------------------");
        System.out.println(dispositivo.price);
        System.out.println(dispositivo.tiempo);
        System.out.println("");
        
        System.out.println("Datos SmartPhone");
        System.out.println("------------------------");
        System.out.println(celular.brandPhone);
        System.out.println(celular.price);
        System.out.println(celular.tiempo);
        System.out.println("");
        System.out.println("Datos SmartWatch");
        System.out.println("------------------------");
        System.out.println(reloj.smartWatchBrand);
        System.out.println(reloj.price);
        System.out.println(reloj.tiempo);        
    }
}
