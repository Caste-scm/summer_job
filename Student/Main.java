import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Studente studente = new Studente("bepi","nane",10);
        Studente studente1 = new Studente("maria","verdi",8);
        Studente studente2 = new Studente("mario","bae",4);

        ArrayList<Studente> list = new ArrayList<>();
        Gestione gestione = new Gestione();

        gestione.addStudent(list,studente);
        gestione.addStudent(list,studente1);
        gestione.addStudent(list,studente2);

        double somma = 0;
        for(int i = 0; i < list.size();i++){
            System.out.print(list.get(i).getNome() + " " + list.get(i).getCognome() + " : " + list.get(i).getValutazione() + "|");
            somma = somma + list.get(i).getValutazione();
        }
        System.out.println("LA MEDIA: " + somma/3.0);

        gestione.removeStudent(list,studente);
        gestione.removeStudent(list,studente1);
        gestione.removeStudent(list,studente2);

        System.out.println();
        System.out.println("AFTER:");
        for(int i = 0; i< list.size();i++){
            System.out.print(list.get(i).getNome() + " " + list.get(i).getCognome() + " : " + list.get(i).getValutazione() + "|");
        }
    }
}