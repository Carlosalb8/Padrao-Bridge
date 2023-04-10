public class GerenteDeProjeto extends Cargo {
    public GerenteDeProjeto(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1.0F + this.escolaridade.percentualAumento());
    }

}
