import org.junit.Test;

import static org.junit.Assert.*;

public class TesteHeartRates {
    @Test
    public void testCalcularIdade() {
        HeartRates pessoa = new HeartRates("João", "Silva", 15, 6, 1985);
        int idadeEsperada = 38;
        try {
            assertTrue(idadeEsperada == pessoa.calcularIdade());
        }catch (AssertionError e){
            fail("O teste deu resultados Diferentes: \n " +
                    "    Idade Actual " + pessoa.calcularIdade() +
                    " \n Idade Esperada " + idadeEsperada);

        }
    }

    @Test
    public void testCalcularFrequenciaMaxima() {
        HeartRates pessoa = new HeartRates("João", "Silva", 15, 6, 1985);
        int frequenciaMaximaEsperada = 182; // Calculado: 220 - 38 (idade)
        try {
            assertTrue(frequenciaMaximaEsperada == pessoa.calcularFrequenciaMaxima());
        } catch (AssertionError e) {
            fail("O teste deu resultados Diferentes: \n " +
                    " Frequencia Maxima Actual " + pessoa.calcularFrequenciaMaxima() +
            " \n      Frequencia Maxima Esperada " + frequenciaMaximaEsperada);
        }
    }

    @Test
    public void testCalcularFrequenciaAlvo() {
        HeartRates pessoa = new HeartRates("João", "Silva", 15, 6, 1985);
        String frequenciaAlvoEsperada = "91-155"; // Calculado: 182 * 0.5 - 182 * 0.85
        try {
            assertEquals(frequenciaAlvoEsperada, pessoa.calcularFrequenciaAlvo());
        } catch (AssertionError e) {
            fail("O teste deu resultados Diferentes: \n " +
                    "    Frequencia Maxima Actual " + pessoa.calcularFrequenciaAlvo() +
                    " \n Frequencia Maxima Esperada " + frequenciaAlvoEsperada);

        }
    }
}

