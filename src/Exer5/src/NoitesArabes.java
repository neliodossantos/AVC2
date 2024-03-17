import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

// Classe NoitesÁrabes
public class NoitesArabes {
    public static void main(String[] args) {
        LampadaMagica lampada = new LampadaMagica(4);
        for (int i = 2; i <= 5; i++) {
            boolean resultado = lampada.esfregar(i);
            System.out.println("Humor do génio " + i + ": " + (resultado ? "Amigável" : "Mal-humorado"));
        }

        GenioAmigavel genioAmigavel = new GenioAmigavel(4);
        GenioMalHumorado genioMalHumorado = new GenioMalHumorado();
        DemonioReciclavel demonioReciclavel = new DemonioReciclavel();

        System.out.println(genioAmigavel);
        System.out.println(genioMalHumorado);
        System.out.println(demonioReciclavel);

        System.out.println("Pedindo desejos...");
        System.out.println("Génio amigável: " + genioAmigavel.concederDesejo());
        System.out.println("Génio mal-humorado: " + genioMalHumorado.concederDesejo());
        System.out.println("Demónio reciclável: " + demonioReciclavel.concederDesejo());

        System.out.println(genioAmigavel);
        System.out.println(genioMalHumorado);
        System.out.println(demonioReciclavel);

        System.out.println("Pedindo desejos novamente...");
        System.out.println("Génio amigável: " + genioAmigavel.concederDesejo());
        System.out.println("Génio mal-humorado: " + genioMalHumorado.concederDesejo());
        System.out.println("Demónio reciclável: " + demonioReciclavel.concederDesejo());

        System.out.println(genioAmigavel);
        System.out.println(genioMalHumorado);
        System.out.println(demonioReciclavel);

        System.out.println("Colocando demónio reciclável de volta na lâmpada...");
        boolean reciclado = demonioReciclavel.reciclar();
        System.out.println("Reciclado: " + reciclado);

        System.out.println("Esfregando a lâmpada novamente...");
        boolean resultado = lampada.esfregar(7);
        System.out.println("Humor do génio: " + (resultado ? "Amigável" : "Demónio"));
        System.out.println("Resultado do génio: " + (resultado ? genioAmigavel : demonioReciclavel));

        System.out.println("------------------------------------------");
        System.out.println("-----------------Testes-----------------------");
        System.out.println("----------------------------------------------");
        Result result = JUnitCore.runClasses(NoitesArabes.class);

        if(result.wasSuccessful()){
            System.out.println("Sucesso em todos os testes.");
        }else{
            System.out.println("Detalhes do Testes que falharam: ");
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