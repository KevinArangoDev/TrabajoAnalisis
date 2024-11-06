package co.edu.uniquindio.trabajoanalisis.Punto3;

public class Mochila {

    public static int mochila(int maxPeso, int[] p, int[] v) {
        int n = v.length;
        int[][] tabla = new int[n + 1][maxPeso + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= maxPeso; j++) {
                if (p[i - 1] <= j) {
                    int sinEste = tabla[i - 1][j];
                    int conEste = v[i - 1] + tabla[i - 1][j - p[i - 1]];
                    tabla[i][j] = Math.max(sinEste, conEste);
                } else {
                    tabla[i][j] = tabla[i - 1][j];
                }
            }
        }
        return tabla[n][maxPeso];
    }

    public static void main(String[] args) {
        int maxPeso = 8;
        int[] valores = {2, 5, 10, 14, 15};
        int[] pesos = {1, 3, 4, 5, 7};

        // Mostramos el resultado final
        System.out.println("Resultado: " + mochila(maxPeso, pesos, valores));
    }
}
