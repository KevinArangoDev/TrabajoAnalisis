package co.edu.uniquindio.trabajoanalisis.Punto2;

public class Objeto {
    int peso;
    int valor;
    double valorPorPeso;

    public Objeto(int peso, int valor) {
        this.peso = peso;
        this.valor = valor;
        this.valorPorPeso = (double) valor / peso;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "peso=" + peso +
                ", valor=" + valor +
                ", valorPorPeso=" + valorPorPeso +
                '}';
    }
}