import java.io.BufferedReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Ibrahim");
        list.add("slouma");
        list.add("oussama");
        list.add("yassine");
        System.out.println(list);

        list.push("Hello");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);

        
    }
}