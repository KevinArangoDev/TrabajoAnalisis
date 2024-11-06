package co.edu.uniquindio.trabajoanalisis.Punto3;

public class SucesionLucasTabulacion {
    public static int lucasPorTabulacion(int n) {
        if (n == 0){
            return 2;
        }
        else if (n == 1) {
            return 1;
        }
        int[] lucas = new int[n + 1];
        lucas[0] = 2;
        lucas[1] = 1;

        int k =2;
        for (int i = k; i <= n; i++) {
            lucas[i] = lucas[i - 1] + lucas[i - 2];
        }
        return lucas[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Lucas(" + n + ") usando tabulación: " + lucasPorTabulacion(n));
    }
}