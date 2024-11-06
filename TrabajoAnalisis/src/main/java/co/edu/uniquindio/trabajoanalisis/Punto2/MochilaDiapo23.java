package co.edu.uniquindio.trabajoanalisis.Punto2;

public class MochilaDiapo23 {

    public static void mochilaMaximizarValorTotal(Objeto[] objetos, int pesoMaximo) {
        double pesoActual = 0;
        double valorTotal = 0;

        for (Objeto objeto : objetos) {
            if (pesoActual + objeto.peso <= pesoMaximo) {
                pesoActual += objeto.peso;
                valorTotal += objeto.valor;
                System.out.println("Seleccionado completo: Peso = " + objeto.peso + ", Valor = " + objeto.valor);
            } else {
                double pesoDisponible = pesoMaximo - pesoActual;
                double fraccion = pesoDisponible / objeto.peso;
                valorTotal += objeto.valor * fraccion;
                pesoActual += pesoDisponible;
                System.out.println("Seleccionado fraccionado: Peso = " + pesoDisponible + ", Valor = " + (objeto.valor * fraccion));
                break;
            }
        }

        System.out.println("Valor total de la caga: " + valorTotal);
    }

    public static void main(String[] args) {
        Objeto[] objetos = {
                new Objeto(10, 20),
                new Objeto(20, 30),
                new Objeto(30, 66),
                new Objeto(40, 40),
                new Objeto(50, 60)
        };

        int pesoMaximo = 520;
        mochilaMaximizarValorTotal(objetos, pesoMaximo);
    }
}
