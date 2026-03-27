package figuras;

public class Paralelogramo {
    private double base;
    private double altura;
    private String tipo;

    public Paralelogramo(double a, double b) {
        base = a;
        altura = b;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public void mostrar() {
        tipo = "Rectángulo";
        System.out.println("Tipo: " + tipo);
        System.out.println("Ancho: " + base);
        System.out.println("Alto: " + altura);

        System.out.println("Perímetro: " + calcularPerimetro());

        double area = calcularArea();
        System.out.println("Área: " + area);
    }

    private double calcularArea() {
        return base * altura;
    }

    private double calcularPerimetro() {
        return (base * 2) + (altura * 2);
    }

    public boolean compararTamanyo(boolean exactitud, Paralelogramo paral) {
        if (exactitud) {
            return this.base == paral.base && this.altura == paral.altura;
        } else {
            return Math.abs(this.base - paral.base) < 1 &&
                    Math.abs(this.altura - paral.altura) < 1;
        }
    }
}
