package antjavaapplication;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alex
 */
public class SmartPhone extends SmartDevice{

    String brandPhone;
    public SmartPhone (String brandPhone,double price, String tiempo){
        super( price, tiempo);
        this.brandPhone = brandPhone;
    }

}
