public class Contanti extends Pagamento{
    public String coloreBanconota;

    public Contanti(double importo, String coloreBanconota) {
        super(importo);
        this.coloreBanconota = coloreBanconota;
    }

    @Override
    public String toString() {
        return "Il colore della banconota è: " + coloreBanconota + " e l'importo è: " + importo;
    }
}
