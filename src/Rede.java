import java.util.ArrayList;

public class Rede {
    private ArrayList<Neuronio> camadaEntrada;
    private ArrayList<Neuronio> camadaOculta;
    private ArrayList<Neuronio> camadaSaida;
    private double taxaAprendizado;
    private String nomeArquivo;

    private final double ERRO_MAXIMO = 0.05;
    private final double LIMIAR = 0.5;

    public Rede(int entrada, int oculta, int saida, int taxaAprendizado, String nomeArquivo) {
        this.camadaEntrada = new ArrayList<>(entrada);
        this.camadaOculta = new ArrayList<>(oculta);
        this.camadaSaida = new ArrayList<>(saida);
        this.taxaAprendizado = taxaAprendizado;
        this.nomeArquivo = nomeArquivo;

        for (int i = 0; i < entrada; i++) {
            this.camadaEntrada.add(new NeuronioEntrada());
        }

        for (int i = 0; i < oculta; i++) {
            this.camadaOculta.add(new NeuronioProcessamento(LIMIAR, entrada + 1));
        }

        for (int i = 0; i < saida; i++) {
            this.camadaSaida.add(new NeuronioProcessamento(LIMIAR, oculta + 1));
        }
    }

    public void train() {}
}