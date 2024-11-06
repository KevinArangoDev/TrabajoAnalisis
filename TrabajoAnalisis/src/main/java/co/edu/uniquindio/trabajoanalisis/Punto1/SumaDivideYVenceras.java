package co.edu.uniquindio.trabajoanalisis.Punto1;

public class SumaDivideYVenceras {

    public static int suma(int[] numeros, int inicio, int fin) {
        // Caso base: cuando
        if (inicio == fin) {
            return numeros[inicio];
        }
        int pivote = inicio + (fin - inicio) / 2;
        int sumaIzquierda = suma(numeros, inicio, pivote);
        int sumaDerecha = suma(numeros, pivote + 1, fin);
        return sumaIzquierda + sumaDerecha;
    }

    public static void main(String[] args) {
        int[] numeros = {1332, 24123, 123, 999, 7822};
        int resultado = suma(numeros, 0, numeros.length - 1);
        System.out.println("Suma total: " + resultado);
    }
}
