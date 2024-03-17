// Classe GénioAmigavel
public class GenioAmigavel {
    private int desejosConcedidos;
    private int desejosRestantes;

    public GenioAmigavel(int desejosRestantes) {
        this.desejosConcedidos = 0;
        this.desejosRestantes = desejosRestantes;
    }

    public boolean concederDesejo() {
        if (this.desejosRestantes > 0) {
            this.desejosConcedidos++;
            this.desejosRestantes--;
            return true;
        }
        return false;
    }

    public int getDesejosConcedidos() {
        return this.desejosConcedidos;
    }

    public int getDesejosRestantes() {
        return this.desejosRestantes;
    }

    public boolean podeConcederDesejo() {
        return this.desejosRestantes > 0;
    }

    public String toString() {
        return "Génio amigável concedeu " + this.desejosConcedidos + " desejos e ainda tem " + this.desejosRestantes + " para conceder.";
    }
}