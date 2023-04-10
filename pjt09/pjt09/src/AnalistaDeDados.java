public class AnalistaDeDados extends Cargo{
    public AnalistaDeDados(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1.0F + this.escolaridade.percentualAumento());
    }
}
