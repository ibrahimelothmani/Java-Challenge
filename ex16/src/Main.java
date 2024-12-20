import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Ibrahim", "Oussama", "Slayem", "yassine");

        stream.filter(a ->a.contains("b")).map(String::toUpperCase).sorted().forEach(System.out::println);

    }
}