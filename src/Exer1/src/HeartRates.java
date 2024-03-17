// Importação de Biblioteca
import java.util.Calendar;
// Classe de Frenquencia Cardiaca
public class HeartRates {
    private String nome;
    private String sobrenome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    public HeartRates(String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    // Métodos set e get para os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    // Método para calcular e retornar a idade
    public int calcularIdade() {
        Calendar dataAtual = Calendar.getInstance();
        int anoAtual = dataAtual.get(Calendar.YEAR);
        int mesAtual = dataAtual.get(Calendar.MONTH) + 1;
        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);

        int idade = anoAtual - anoNascimento;

        if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
            idade--;
        }

        return idade;
    }

    // Método para calcular e retornar a frequência cardíaca máxima
    public int calcularFrequenciaMaxima() {
        return 220 - calcularIdade();
    }

    // Método para calcular e retornar a frequência cardíaca alvo
    public String calcularFrequenciaAlvo() {
        int frequenciaMaxima = calcularFrequenciaMaxima();
        int frequenciaAlvoMin = (int) (frequenciaMaxima * 0.5);
        int frequenciaAlvoMax = (int) (frequenciaMaxima * 0.85);
        return frequenciaAlvoMin+"-"+frequenciaAlvoMax;
    }
}
