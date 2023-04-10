import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class AnalistaDeDadosTest {
    AnalistaDeDadosTest(){

    }

    @Test
    void deveRetornarSalarioAnalistaDeDadosComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        AnalistaDeDados analistaDeDados = new AnalistaDeDados(15000.0F);
        analistaDeDados.setEscolaridade(escolaridade);
        Assertions.assertEquals(16500.0F, analistaDeDados.calcularSalario(), 0.01F);
    }

    @Test
    void deveRetornarSalarioAnalistaDeDadosComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        AnalistaDeDados analistaDeDados = new AnalistaDeDados(15000.0F);
        analistaDeDados.setEscolaridade(escolaridade);
        Assertions.assertEquals(18000.0F, analistaDeDados.calcularSalario(), 0.01F);
    }

    @Test
    void deveRetornarAnalistaDeDadosComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        AnalistaDeDados analistaDeDados = new AnalistaDeDados(15000.0F);
        analistaDeDados.setEscolaridade(escolaridade);
        Assertions.assertEquals(19500.0F, analistaDeDados.calcularSalario(), 0.01F);
    }

}
