package co.edu.uniquindio.trabajoanalisis.Punto3;

public class CoeficienteBinomial {

    public static int calcularCoeficiente(int n, int k) {
        int[][] tabla = new int[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (j == 0 || j == i) {
                    tabla[i][j] = 1;
                } else if (j < i) {
                    tabla[i][j] = tabla[i - 1][j - 1] + tabla[i - 1][j];
                } else {
                    tabla[i][j] = 0;
                }
            }
        }

        return tabla[n][k];
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println("Coeficiente binomial de (" + n + " sobre " + k + ") es: " + calcularCoeficiente(n, k));
    }
}

