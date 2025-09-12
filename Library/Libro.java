public class Libro extends Pubblicazione{
    String autore;

    public Libro(String titolo, int anno, String autore) {
        super(titolo, anno);
        this.autore = autore;
    }

    @Override
    public String toString() {
        return "Libro: " + titolo + " anno " + anno + ", autore " + autore;
    }
}
