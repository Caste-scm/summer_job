import java.util.Date;

public abstract class Contatore {
    protected String matricola;
    protected Date dataInstallazione;
    protected Date ultimaLettura;

    public Contatore(String matricola, Date dataInstallazione) {
        this.matricola = matricola;
        this.dataInstallazione = dataInstallazione;
        this.ultimaLettura = new Date();
    }
    public abstract void registrareLettura(double valore);
    public abstract double consumo();
}
