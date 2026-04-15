import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exercicio3Test {

    @Test
    public void deveRetornarVerdadeiroParaParesSimples() {
        assertTrue(exercicio3.isValid("()"));
        assertTrue(exercicio3.isValid("[]"));
        assertTrue(exercicio3.isValid("{}"));
    }

    @Test
    public void deveRetornarVerdadeiroParaParesAninhados() {
        assertTrue(exercicio3.isValid("({[]})"));
        assertTrue(exercicio3.isValid("(((({}))))"));
    }

    @Test
    public void deveRetornarVerdadeiroParaStringVazia() {
        assertTrue(exercicio3.isValid(""));
    }

    @Test
    public void deveRetornarFalsoParaParesIncorretos() {
        assertFalse(exercicio3.isValid("(]"));
        assertFalse(exercicio3.isValid("{)"));
    }

    @Test
    public void deveRetornarFalsoParaOrdemIncorreta() {
        assertFalse(exercicio3.isValid("([)]"));
    }

    @Test
    public void deveRetornarFalsoParaFaltaDeFecho() {
        assertFalse(exercicio3.isValid("["));
    }

    @Test
    public void deveRetornarFalsoParaFechoSemAbertura() {
        assertFalse(exercicio3.isValid("]"));
    }
}