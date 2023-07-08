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
        
        String[] nombres = {"alex", "pedro", "matias", "gabriela"};
        String result = "";
        for(String nombre: nombres) {
            result+=nombre+"\n";
        }
        System.out.println(result);
    }
}
