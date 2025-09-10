import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        libreria.add(new Libro("Il Nome della Rosa", 1980, "Umberto Eco"));
        libreria.add(new Rivista("Focus", 2020, 128));

        libreria.print();
    }
}