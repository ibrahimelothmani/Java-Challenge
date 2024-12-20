import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        
        var linkedList = new LinkedList();

        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
//        linkedList.addFirst(40);
//        linkedList.addFirst(10);
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf(20));
        System.out.println(linkedList.contains(20));
    }
}