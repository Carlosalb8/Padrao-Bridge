import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class DesenvolvedorTest {
    DesenvolvedorTest(){

    }

    @Test
    void deveRetornarSalarioDesenvolvedorComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        Desenvolvedor desenvolvedor = new Desenvolvedor(10000.0F);
        desenvolvedor.setEscolaridade(escolaridade);
        Assertions.assertEquals(11000.0F, desenvolvedor.calcularSalario(), 0.01F);

    }

    @Test
    void deveRetornarSalarioDesenvolvedorComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        Desenvolvedor desenvolvedor = new Desenvolvedor(10000.0F);
        desenvolvedor.setEscolaridade(escolaridade);
        Assertions.assertEquals(12000.0F, desenvolvedor.calcularSalario(), 0.01F);

    }

    @Test
    void deveRetornarSalarioDesenvolvedorComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        Desenvolvedor desenvolvedor = new Desenvolvedor(10000.0F);
        desenvolvedor.setEscolaridade(escolaridade);
        Assertions.assertEquals(13000.0F, desenvolvedor.calcularSalario(), 0.01F);

    }

}
