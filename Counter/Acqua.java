import java.util.Date;

public class Acqua extends Contatore{
    private double letturaAttuale;
    private double letturaPrecedente;

    public Acqua(String matricola, Date dataInstallazione) {
        super(matricola, dataInstallazione);
    }
    @Override
    public void registrareLettura(double valore) {
        letturaPrecedente = letturaAttuale;
        letturaAttuale = valore;
        ultimaLettura = new Date();
    }

    @Override
    public double consumo() {
        return letturaAttuale - letturaPrecedente;
    }
}
