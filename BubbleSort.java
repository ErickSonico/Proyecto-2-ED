/**
 * Clase que implementa el algoritmo de ordenación Bubble Sort.
 * Elegí este algoritmo porque el arreglo para ordenar es pequeño
 * así que no representa un problema a pesar de la complejidad 
 * cuadrática del algoritmo, y también por la facilidad para implementarlo.
 * @author Erick Iram García Velasco
 */

public class BubbleSort {

    /**
     * Método para ordenar el arreglo usando Bubble sort.
     * Se le hizo una pequeña modificación para que ordene dos arreglos al mismo tiempo
     * @param arreglo a ordenar
     */
    public static void bubble(int[] arreglo, String[] arreglo2){
        for(int i = arreglo.length-1 ; i > 0 ; i--){
            for(int j = 0; j < i ;j++){
                if(arreglo[j] > arreglo[j+1]){
                    swap(arreglo,j,j+1);
                    swapString(arreglo2,j, j+1);
                }
            }
        }

    }

    /**
     * Métodos auxiliares para bubble sort
     * @param arreglo arreglo del que se intercambian los elementos
     * @param a primer elemento para intercambiar
     * @param b segundo elemento para intercambiar
     */
    public static void swap(int[] arreglo, int a, int b){
        int tmp = arreglo[b];
        arreglo[b] = arreglo[a];
        arreglo[a] = tmp;
    }

    public static void swapString(String[] arreglo, int a, int b){
        String tmp = arreglo[b];
        arreglo[b] = arreglo[a];
        arreglo[a] = tmp;
    }
    
}
