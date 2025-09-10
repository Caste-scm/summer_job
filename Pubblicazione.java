abstract class Pubblicazione {
    protected String titolo;
    protected int anno;

    public Pubblicazione(String titolo, int anno) {
        this.titolo = titolo;
        this.anno = anno;
    }
    public abstract String toString();
}
