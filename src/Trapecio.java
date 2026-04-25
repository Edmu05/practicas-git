package Modelo;

public class Trapecio extends Figura {

    private float baseMayor;
    private float baseMenor;
    private float altura;

    public Trapecio(float baseMayor, float baseMenor, float altura) {
        super("Trapecio");
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    @Override
    public float calcularPerimetro() {
        return baseMayor + baseMenor + 2 * altura;
    }
}
