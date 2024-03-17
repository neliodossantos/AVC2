
// Classe GénioMalHumorado
public class GenioMalHumorado {
    private boolean desejoConcedido;

    public GenioMalHumorado() {
        this.desejoConcedido = false;
    }

    public boolean concederDesejo() {
        if (!this.desejoConcedido) {
            this.desejoConcedido = true;
            return true;
        }
        return false;
    }

    public int getDesejosConcedidos() {
        return this.desejoConcedido ? 1 : 0;
    }

    public String toString() {
        return this.desejoConcedido ? "Génio mal-humorado concedeu um desejo." : "Génio mal-humorado tem um desejo para conceder.";
    }
}