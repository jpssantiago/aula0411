public class NeuronioProcessamento extends Neuronio {
    public NeuronioProcessamento() {
        super();
    }

    public NeuronioProcessamento(double limiar, int numeroPesos) {
        super(limiar, numeroPesos);
    }

    @Override
    public double processar(double[] entrada) throws Exception {
        double energia = pesos[0]; // 1 * pesos[0];

        for (int i = 1; i < pesos.length; i++) {
            energia += pesos[i] * entrada[i - 1];
        }

        return funcaoAtivacao(energia);
    }

    public double funcaoAtivacao(double energia) {
        return 1 / (1 + Math.exp(-energia));
    }
}
