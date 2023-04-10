import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class GerenteDeProjetoTest {
    GerenteDeProjetoTest(){

    }

    @Test
    void deveRetornarSalarioGerenteDeProjetoComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        AnalistaDeDados analistaDeDados = new AnalistaDeDados(20000.0F);
        analistaDeDados.setEscolaridade(escolaridade);
        Assertions.assertEquals(22000.0F, analistaDeDados.calcularSalario(), 0.01F);
    }

    @Test
    void deveRetornarSalarioGerenteDeProjetoComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        AnalistaDeDados analistaDeDados = new AnalistaDeDados(20000.0F);
        analistaDeDados.setEscolaridade(escolaridade);
        Assertions.assertEquals(24000.0F, analistaDeDados.calcularSalario(), 0.01F);
    }

    @Test
    void deveRetornarSalarioGerenteDeProjetoComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        AnalistaDeDados analistaDeDados = new AnalistaDeDados(20000.0F);
        analistaDeDados.setEscolaridade(escolaridade);
        Assertions.assertEquals(26000.0F, analistaDeDados.calcularSalario(), 0.01F);
    }

}
