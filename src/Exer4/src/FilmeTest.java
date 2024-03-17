import org.junit.Test;

import static org.junit.Assert.*;

public class FilmeTest {

    @Test
    public void test1ExibirDuracaoEmHoras() {
        Filme filme1 = new Filme("Os Vingadores", 142);
        int duracaoEsperada = 100;

        try {
            assertTrue(duracaoEsperada == filme1.getDuracaoEmMinutos());
        } catch (AssertionError e) {
            fail("O teste deu resultados Diferentes: \n " +
                    "    Duracao Actual:  " + filme1.getDuracaoEmMinutos() +
                    " \n Duracao Esperada: " + duracaoEsperada
            );
        }
    }

    public void test2ExibirDuracaoEmHoras() {
        Filme filme2 = new Filme("Hotel Transilvânia", 93);

        int duracaoEsperada = 93;

        try {
            assertTrue(duracaoEsperada == filme2.getDuracaoEmMinutos());
        } catch (AssertionError e) {
            fail("O teste deu resultados Diferentes: \n " +
                    "    Duracao Actual:  " + filme2.getDuracaoEmMinutos() +
                    " \n Duracao Esperada: " + duracaoEsperada
            );
        }
    }

    public void test3ExibirDuracaoEmHoras() {
        Filme filme3 = new Filme("Harry Potter e a Pedra Filosofal", 152);
        int duracaoEsperada = 152;

        try {
            assertTrue(duracaoEsperada == filme3.getDuracaoEmMinutos());
        } catch (AssertionError e) {
            fail("O teste deu resultados Diferentes: \n " +
                    "    Duracao Actual:  " + filme3.getDuracaoEmMinutos() +
                    " \n Duracao Esperada: " + duracaoEsperada
            );
        }
    }
    public void test4ExibirDuracaoEmHoras() {
        Filme filme4 = new Filme("Jurassic Park", 127);
        int duracaoEsperada = 127;

        try {
            assertTrue(duracaoEsperada == filme4.getDuracaoEmMinutos());
        } catch (AssertionError e) {
            fail("O teste deu resultados Diferentes: \n " +
                    "    Duracao Actual:  " + filme4.getDuracaoEmMinutos() +
                    " \n Duracao Esperada: " + duracaoEsperada
            );
        }
    }
    public void test5ExibirDuracaoEmHoras() {
        Filme filme5 = new Filme("Piratas do Caribe: A Maldição do Pérola Negra", 100);
        int duracaoEsperada = 100;

        try {
            assertTrue(duracaoEsperada == filme5.getDuracaoEmMinutos());
        } catch (AssertionError e) {
            fail("O teste deu resultados Diferentes: \n " +
                    "    Duracao Actual:  " + filme5.getDuracaoEmMinutos() +
                    " \n Duracao Esperada: " + duracaoEsperada
            );
        }
    }
    public void test6ExibirDuracaoEmHoras() {
        Filme filme6 = new Filme("Avatar", 162);
        int duracaoEsperada = 162;

        try {
            assertTrue(duracaoEsperada == filme6.getDuracaoEmMinutos());
        } catch (AssertionError e) {
            fail("O teste deu resultados Diferentes: \n " +
                    "    Duracao Actual:  " + filme6.getDuracaoEmMinutos() +
                    " \n Duracao Esperada: " + duracaoEsperada
            );
        }
    }
    public void test7ExibirDuracaoEmHoras() {
        Filme filme7 = new Filme("O Rei Leão", 88);
        int duracaoEsperada = 88;

        try {
            assertTrue(duracaoEsperada == filme7.getDuracaoEmMinutos());
        } catch (AssertionError e) {
            fail("O teste deu resultados Diferentes: \n " +
                    "    Duracao Actual:  " + filme7.getDuracaoEmMinutos() +
                    " \n Duracao Esperada: " + duracaoEsperada
            );
        }
    }
}
