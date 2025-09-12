import java.util.ArrayList;

public class Studente {
    String nome;
    String cognome;
    int valutazione;

    public Studente(String nome, String cognome, int valutazione) {
        this.nome = nome;
        this.cognome = cognome;
        this.valutazione = valutazione;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getValutazione() {
        return valutazione;
    }
}
