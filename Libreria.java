import java.util.ArrayList;

public class Libreria {
    private ArrayList<Pubblicazione> list = new ArrayList<>();
    public void add(Pubblicazione p){
        list.add(p);
    }
    public void print(){
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
