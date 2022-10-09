/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaclase01recursividad;

/**
 *
 * @author danny
 */
public class Practica {

    public void imprime(int x) {
        if (x > 0) {
            System.out.printf("El numero es: %d\n", x);
            imprime(x - 1);
        }
    }

    public void recorrerArrayFor(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Indice %d, valor %d\n", i, array[i]);
        }
    }

    public void recorrerArrayRecursivo(int[] array, int i) {
        //Condicion de Parada con el largo de la lista
        if (i < array.length) {
            System.out.printf("Indice %d, valor %d\n", i, array[i]);
            recorrerArrayRecursivo(array, i + 1);
        }
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
