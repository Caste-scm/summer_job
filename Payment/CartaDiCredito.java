public class CartaDiCredito extends Pagamento{
    public String proprietarioConto;
    public String nomeBanca;

    public CartaDiCredito(double importo, String proprietarioConto, String nomeBanca) {
        super(importo);
        this.proprietarioConto = proprietarioConto;
        this.nomeBanca = nomeBanca;
    }

    @Override
    public String toString() {
        return "Proprietario del conto: " + proprietarioConto + "|Nome della banca: " + nomeBanca + "|Importo: " + importo;
    }
}
