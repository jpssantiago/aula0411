public class NeuronioEntrada extends Neuronio {
    public NeuronioEntrada() {
        super();
    }

    public NeuronioEntrada(double limiar, int numeroPesos) {
        super(limiar, numeroPesos);
    }

    @Override
    public double processar(double[] entrada) throws Exception {
        if (entrada.length != 1) {
            throw new Exception("Vetor de entrada incorreto.");
        }

        return entrada[0];
    }
}