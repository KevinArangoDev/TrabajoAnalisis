package co.edu.uniquindio.trabajoanalisis.Punto2;

import java.util.HashMap;
import java.util.Map;

public class CajeroAutomatico {

    public static Map<Integer, Integer> entregarDinero(int cantidadSolicitada, Map<Integer, Integer> billetesDisponibles) {
        Map<Integer, Integer> billetesEntregados = new HashMap<>();
        int cantidadOriginal = cantidadSolicitada;

        for (int denominacion : new int[]{100000, 50000, 20000, 10000}) {
            if (cantidadSolicitada <= 0)
                break;
            int cantidadBilletes = billetesDisponibles.getOrDefault(denominacion, 0);
            if (cantidadBilletes > 0) {
                int maxBilletes = cantidadSolicitada / denominacion;
                int billetesUtilizados = Math.min(maxBilletes, cantidadBilletes);

                cantidadSolicitada -= billetesUtilizados * denominacion;
                billetesEntregados.put(denominacion, billetesUtilizados);
            }
        }

        if (cantidadSolicitada > 0) {
            System.out.println("No hay suficientes billetes para entregar la cantidad solicitada, Por favor intente nuevamente con una cantidad inferior.");
            System.out.println("Faltan: " + cantidadSolicitada + " de " + cantidadOriginal);
            return null;
        }

        return billetesEntregados;
    }

    public static void main(String[] args) {
        int cantidadSolicitada = 760000; // Cambiar según el monto deseado

        Map<Integer, Integer> billetesDisponibles = new HashMap<>();
        billetesDisponibles.put(10000, 300);
        billetesDisponibles.put(20000, 200);
        billetesDisponibles.put(50000, 100);
        billetesDisponibles.put(100000, 50);

        Map<Integer, Integer> resultado = entregarDinero(cantidadSolicitada, billetesDisponibles);

        if (resultado != null) {
            System.out.println("Billetes entregados:");
            for (Map.Entry<Integer, Integer> entry : resultado.entrySet()) {
                System.out.println("Billetes de " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
