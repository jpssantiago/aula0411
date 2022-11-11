public abstract class Neuronio {
    protected double[] pesos;
    protected double limiar;

    public Neuronio() {}

    public Neuronio(double limiar, int numeroPesos) {
        this.limiar = limiar;
        this.pesos = new double[numeroPesos];

        for (int i = 0; i < numeroPesos; i++) {
            this.pesos[i] = (Math.random() * 2) - 1;
        }
    }

    public abstract double processar(double[] entrada) throws Exception;

    public double funcaoAtivacao(double energia) {
        return energia > limiar ? 1 : 0;
    }

    public void setPesos(double[] pesos) {
        this.pesos = pesos;
    }

    public double[] getPesos() {
        return pesos;
    }
}