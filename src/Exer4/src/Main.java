import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando objeto filme1 do tipo Filme
        Filme filme1 = new Filme("Os Vingadores", 142);
        filme1.exibirDuracaoEmHoras();

        // Alterando atributos do filme1
        filme1.setTitulo("Os Vingadores");
        filme1.setDuracaoEmMinutos(142);
        filme1.exibirDuracaoEmHoras();

        // Criando objeto filme2 do tipo Filme
        Filme filme2 = new Filme("Hotel Transilvânia", 93);
        filme2.exibirDuracaoEmHoras();

        // Alterando atributos do filme2
        filme2.setTitulo("Hotel Transilvânia");
        filme2.setDuracaoEmMinutos(93);
        filme2.exibirDuracaoEmHoras();

        // Exibindo os títulos dos filmes
        System.out.println("Os filmes em cartaz são " + filme1.getTitulo() + " e " + filme2.getTitulo());

        // Instanciando outros 5 filmes e fazendo as mesmas ações descritas acima
        Filme filme3 = new Filme("Harry Potter e a Pedra Filosofal", 152);
        filme3.exibirDuracaoEmHoras();

        Filme filme4 = new Filme("Jurassic Park", 127);
        filme4.exibirDuracaoEmHoras();

        Filme filme5 = new Filme("Piratas do Caribe: A Maldição do Pérola Negra", 143);
        filme5.exibirDuracaoEmHoras();

        Filme filme6 = new Filme("Avatar", 162);
        filme6.exibirDuracaoEmHoras();

        Filme filme7 = new Filme("O Rei Leão", 88);
        filme7.exibirDuracaoEmHoras();



        System.out.println("------------------------------------------");
        System.out.println("-----------------Testes-----------------------");
        System.out.println("----------------------------------------------");
        Result result = JUnitCore.runClasses(FilmeTest.class);

        if(result.wasSuccessful()){
            System.out.println("Sucesso em todos os testes.");
        }else{
            System.out.println("Detalhes dos Testes que falharam: ");
            for (Failure failure : result.getFailures()) {
                System.out.println("Teste: " + failure.getTestHeader());
                System.out.println("Descricao: " + failure.getDescription());
                System.out.println("Excecao: " + failure.getException());
                System.out.println();
                System.out.println("----------------------------------------------");
            }
        }

        System.out.println("Total de Testes: " + result.getRunCount());
        System.out.println("Sucesso : " + (result.getRunCount() - result.getFailureCount()));
        System.out.println("Falhas : " + result.getFailureCount());
    }
}