import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        /* miała być tablica doube[];
        double[] tablica = new double[5];
        for (int i = 0; i < tablica.length; i++)
            tablica [i] = i + 1.2;
        */
        
       int[] tablica = new int[5];
        for (int i = 0; i < 5; i++)
            tablica [(int) i] = i +1;
        int zmienna = tablica[3];
        for (int i = 0; i < 5; i++)
            System.out.println("Kolejna komórka to: " + tablica[i]);
    }
}
