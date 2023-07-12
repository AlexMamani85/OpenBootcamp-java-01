/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package antjavaapplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;


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
        String texto = "hola mundo";
        for(int i=texto.length()-1; i>=0; i--) {
            System.out.print(texto.charAt(i));
        }
//  1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.        
        String texto1 = "hola mundo";
        System.out.println("");
        for(int i=0; i<texto.length(); i++) {
            System.out.print(texto.charAt(i));
        }
// 
        int[] numeros = {2,4,6};
        System.out.println("");
        for(int i=0; i<numeros.length; i++) {
            System.out.println(i+ ": " +numeros[i] );
        }
// 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int[][] numeros2 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println("");
        for(int i=0; i<numeros2.length; i++) {
            for(int j=0; j<numeros2[0].length; j++) {
                System.out.println("i: "+i+", j:"+j+", value: "+numeros2[i][j]);
            }
        }

//3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y 
//muestra el resultado final.
/*
        Vector<Integer> lista = new Vector<>();
        
        lista.add(12);
        lista.add(23);
        lista.add(34);
        lista.add(45);
        lista.add(56);
        
        lista.remove(1);
        lista.remove(2);
        System.out.println("Vector: "+lista);
        */
//  4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 
//      1000 elementos para ser añadidos al mismo.

//      el tiempo que demora para cambiar su tamanio

//  5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando
//      únicamente el valor de cada elemento.

        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("cpu");
        lista1.add("monitor");
        lista1.add("mouse");
        lista1.add("celular");
        
        LinkedList<String> linkedList1 = new LinkedList<>(lista1);
        for(String element:linkedList1) {
            System.out.println(element);
            
        }
//  6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. 
//      A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y 
//      muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer 
//      "for" de relleno.

        ArrayList<Integer> numerosList = new ArrayList<>();
        for(int i=1; i<11; i++) {
            numerosList.add(i);
        }
        System.out.println(numerosList);

//7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException 
//que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje 
//"Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
        
        try{
            DividePorCero();
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        } finally{
            System.out.println("Demo de codigo");
        }
        
        
        
//8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". 
//La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        String fileIn = "input.txt";
        String fileOut = "output.txt";
        copyFile(fileIn, fileOut);
        System.out.println("Copia de archivo completa.");
    
        
    }
    
    public static void DividePorCero() throws ArithmeticException {
        int numerador = 10;
        int denominador = 0;
        
        if(denominador == 0) {
            throw new ArithmeticException();
        }
        int resultado = numerador/denominador;
        System.out.println("El resultado es: "+resultado);
        
    }
    
    public static void copyFile(String fileIn, String fileOut) {
        try (InputStream inputStream = new FileInputStream(fileIn);
             PrintStream outputStream = new PrintStream(new FileOutputStream(fileOut))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}
/*







*/