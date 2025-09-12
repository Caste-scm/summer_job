public class Rivista extends Pubblicazione{
    int numeroPubblicazione;

    public Rivista(String titolo, int anno, int numeroPubblicazione) {
        super(titolo, anno);
        this.numeroPubblicazione = numeroPubblicazione;
    }

    @Override
    public String toString() {
        return "Rivista: " +  titolo + " anno" + anno + ", numero " + numeroPubblicazione;
    }
}
