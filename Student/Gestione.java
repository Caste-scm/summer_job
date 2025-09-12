import java.util.ArrayList;

public class Gestione {
    public void addStudent(ArrayList<Studente> l , Studente s){
        l.add(s);
    }
    public void removeStudent(ArrayList<Studente> l ,Studente s){
        l.remove(s);
    }
}
