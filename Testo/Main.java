//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CensuraParole censuraParole = new CensuraParole();
        String input = "ho la mamma brutto come te che leggi. Madonna stupido dio onosauhdb. CIao a tutti i lettori cornuti";
        System.out.println("CENSURA PAROLE:");
        censuraParole.modificaTesto(input);
        FormatterTesto formatterTesto = new FormatterTesto();
        System.out.println("FORMATTER TESTO: ");
        String input2 = "ciao a tutti. bastardi vi inculo, anche a te dome. PORCODIO";
        formatterTesto.modificaTesto(input2);
    }
}