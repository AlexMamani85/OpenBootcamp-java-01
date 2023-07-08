package antjavaapplication;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alex
 */
public class SmartWatch extends SmartDevice{
    String smartWatchBrand;
    public SmartWatch (String smartWatchBrand, double price, String tiempo){
        super(price, tiempo);
        this.smartWatchBrand = smartWatchBrand;
    }

}
