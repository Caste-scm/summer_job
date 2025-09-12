import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Gas gas = new Gas("ABYA",new Date());
        Acqua acqua = new Acqua("ABUIYSBYUV",new Date());
        Elettrico elettrico = new Elettrico("ABVUA",new Date(),3.5);

        gas.registrareLettura(105.5);
        gas.registrareLettura(120.5);
        acqua.registrareLettura(150.5);
        acqua.registrareLettura(200.5);
        elettrico.registrareLettura(100.0);
        elettrico.registrareLettura(111.0);

        System.out.println(gas.consumo());
        System.out.println(acqua.consumo());

        System.out.println(elettrico.getPotenzaMassima());

    }
}