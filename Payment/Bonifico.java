public class Bonifico extends Pagamento{
    public String mittente;
    public String destinatario;

    public Bonifico(double importo, String mittente, String destinatario) {
        super(importo);
        this.mittente = mittente;
        this.destinatario = destinatario;
    }

    @Override
    public String toString() {
        return mittente + " ha inviato a " + destinatario + " " + importo + " euro.";
    }
}
