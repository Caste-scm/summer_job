abstract class Pagamento {
    protected double importo;

    public Pagamento(double importo) {
        this.importo = importo;
    }

    @Override
    public abstract String toString();
}
