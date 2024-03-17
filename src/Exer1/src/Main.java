import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {
        // Solicitar informações da pessoa
        // Aqui você pode implementar um método para solicitar entrada do usuário
        // ou fornecer essas informações de outra forma
        String nome = "Nelio";
        String sobrenome = "dos Santos";
        int diaNascimento = 27;
        int mesNascimento = 11;
        int anoNascimento = 2002;

        // Criar objeto FrequenciaCardiaca com as informações fornecidas
        HeartRates pessoa = new HeartRates(nome, sobrenome, diaNascimento, mesNascimento, anoNascimento);

        // Imprimir informações da pessoa
        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Data de Nascimento: " + pessoa.getDiaNascimento() + "/" +
                pessoa.getMesNascimento() + "/" + pessoa.getAnoNascimento());

        // Calcular e imprimir a idade da pessoa
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");

        // Calcular e imprimir a frequência cardíaca máxima da pessoa
        System.out.println("Frequência Cardíaca Máxima: " + pessoa.calcularFrequenciaMaxima() + " bpm");

        // Calcular e imprimir a frequência cardíaca alvo da pessoa
        System.out.println("Frequência Cardíaca Alvo: " + pessoa.calcularFrequenciaAlvo() + " bpm");

        // Fazer os testes

        System.out.println("------------------------------------------");
        System.out.println("-----------------Testes-----------------------");
        System.out.println("----------------------------------------------");
        Result result = JUnitCore.runClasses(TesteHeartRates.class);

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

        System.out.println("Total de Teste: " + result.getRunCount());
        System.out.println("Sucesso : " + (result.getRunCount() - result.getFailureCount()));
        System.out.println("Falhas : " + result.getFailureCount());


    }
}