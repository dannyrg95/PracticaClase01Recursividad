/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaclase01recursividad;

/**
 *
 * @author danny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Practica recursividad = new Practica();

        System.out.println("====== RECURSIVIDAD ======");
        recursividad.imprime(5);

        //Crear Array
        int[] array = {34, 56, 78, 90, 45};
        System.out.println("====== ARRAY FOR ======");
        recursividad.recorrerArrayFor(array);

        System.out.println("====== ARRAY RECURSIVO ======");
        recursividad.recorrerArrayRecursivo(array, 0);
        
        System.out.println("====== FIBONACCI 7 ======");
        System.out.println(recursividad.fibonacci(7));

    }

}
