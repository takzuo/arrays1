import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arreglo1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Se crea el primer arreglo de 10

        int[] arreglo2 = new int[arreglo1.length / 2]; // Se crea el segundo arreglo con la mitad de la longitud de arreglo1
        int[] arreglo3 = new int[arreglo1.length - arreglo2.length]; // Se crea el tercer arreglo con la longitud restante de arreglo1

        for (int i = 0; i < arreglo1.length; i++) {
            if (i % 2 == 0) {
                arreglo2[i / 2] = arreglo1[i]; // Copiar los valores de las posiciones pares de arreglo1 a arreglo2
            } else {
                arreglo3[(i - 1) / 2] = arreglo1[i]; // Copiar los valores de las posiciones impares de arreglo1 a arreglo3
            }
        }

        System.out.println("arreglo1: " + Arrays.toString(arreglo1));
        System.out.println("arreglo2: " + Arrays.toString(arreglo2));
        System.out.println("arreglo3: " + Arrays.toString(arreglo3));
    }
}
