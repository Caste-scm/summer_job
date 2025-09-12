public class CensuraParole extends EditorTesto{
    @Override
    public void modificaTesto(String input) {
        input = input.replaceAll("brutto","***");
        input = input.replaceAll("stupido","***");
        System.out.println(input);
    }
}
