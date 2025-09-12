import java.util.Date;

public class Elettrico extends Contatore{
    private double potenzaMassima;
    private double letturaValore;

    public Elettrico(String matricola, Date dataInstallazione, double potenzaMassima) {
        super(matricola, dataInstallazione);
        this.potenzaMassima = potenzaMassima;
    }

    @Override
    public void registrareLettura(double v) {
        letturaValore = v;
        ultimaLettura = new Date();
    }

    @Override
    public double consumo() {
        return letturaValore;
    }

    public double getPotenzaMassima() {
        return potenzaMassima;
    }
}
