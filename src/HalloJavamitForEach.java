import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {

    private static List<String> liste;

    public static void main(String[]args){
        liste = new ArrayList<>();
        liste.add("Hallo");
        liste.add("Java");
        liste.add("Programmieren");
        liste.add("Bye");

        for(String str : liste){
            System.out.println(str);
        }
        
        liste.forEach((String s) -> System.out.println(s));

    }

}
