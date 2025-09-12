import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bonifico bonifico = new Bonifico(40.5,"bepi","nane");
        CartaDiCredito cartaDiCredito = new CartaDiCredito(50.5,"maria","intesa");
        Contanti contanti = new Contanti(30,"blu");
        ArrayList<Pagamento> list = new ArrayList<>();
        list.add(bonifico);
        list.add(cartaDiCredito);
        list.add(contanti);
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}