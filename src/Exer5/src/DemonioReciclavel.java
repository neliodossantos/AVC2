// Classe DemónioReciclável
public class DemonioReciclavel {
    private int desejosConcedidos;
    private boolean reciclado;

    public DemonioReciclavel() {
        this.desejosConcedidos = 0;
        this.reciclado = false;
    }

    public boolean concederDesejo() {
        if (!this.reciclado) {
            this.desejosConcedidos++;
            return true;
        }
        return false;
    }

    public boolean reciclar() {
        if (!this.reciclado) {
            this.reciclado = true;
            return true;
        }
        return false;
    }

    public boolean foiReciclado() {
        return this.reciclado;
    }

    public int getDesejosConcedidos() {
        return this.desejosConcedidos;
    }

    public String toString() {
        return this.reciclado ? "Demónio foi reciclado." : "Demónio reciclável concedeu " + this.desejosConcedidos + " desejos.";
    }
}