package co.edu.uniquindio.trabajoanalisis.Punto3;

import java.util.HashMap;
import java.util.Map;

public class SucesionLucasMemorizacion {
    private static  Map<Integer, Integer> memorizacion = new HashMap<>();

    public static int lucasMemoizacion(int n) {
        if (n == 0){
            return 2;
        }
        else if (n == 1){
            return 1;
        }

        if (!memorizacion.containsKey(n)) {
            memorizacion.put(n, lucasMemoizacion(n - 1) + lucasMemoizacion(n - 2));
        }return memorizacion.get(n);

    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Lucas(" + n + ") usando memorización: " + lucasMemoizacion(n));
    }
}
