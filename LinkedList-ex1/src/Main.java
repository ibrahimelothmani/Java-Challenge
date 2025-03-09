import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        var linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addFirst(40);
        linkedList.addFirst(10);
        int counter = 0;
        while (counter < linkedList.size()) {
            System.out.println(LinkedList.createWithLoop());
            counter++;
        }

//        System.out.println(Arrays.asList(linkedList));
//        System.out.println(linkedList.indexOf(20));
//        System.out.println(linkedList.contains(20));
    }
}