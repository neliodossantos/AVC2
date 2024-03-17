// Classe LâmpadaMágica
public class LampadaMagica {
    private int capacidade;
    private int contadorEsfregadas;
    private int demóniosReciclados;

    public LampadaMagica(int capacidade) {
        this.capacidade = capacidade;
        this.contadorEsfregadas = 0;
        this.demóniosReciclados = 0;
    }

    public boolean esfregar(int desejos) {
        this.contadorEsfregadas++;
        if (this.contadorEsfregadas % 2 == 0 && this.contadorEsfregadas > 0) {
            return false; // Mal-humorado
        } else if (this.contadorEsfregadas > 0 && this.contadorEsfregadas <= capacidade) {
            return true; // Bem-humorado
        } else {
            this.demóniosReciclados++;
            return false; // Demónio reciclável
        }
    }

    public int getGeniosDisponiveis() {
        return this.capacidade - this.contadorEsfregadas;
    }

    public int getDemóniosReciclados() {
        return this.demóniosReciclados;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LampadaMagica)) {
            return false;
        }
        LampadaMagica lampada = (LampadaMagica) obj;
        return this.capacidade == lampada.capacidade && this.getGeniosDisponiveis() == lampada.getGeniosDisponiveis() && this.getDemóniosReciclados() == lampada.getDemóniosReciclados();
    }
}