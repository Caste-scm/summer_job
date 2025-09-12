
public class FormatterTesto extends EditorTesto{
    @Override
    public void modificaTesto(String input) {
        input = input.replaceAll("\\.","\n");
        String input2 = input.trim();
        input2 = input.toLowerCase();
        System.out.println(input2);
    }
}
