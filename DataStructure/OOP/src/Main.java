import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Man man = new Man("Ali", 25, 75, 175);
        Woman woman = new Woman("Aliza", 20, 60, 160);

//        System.out.println("Man's details:" + man.getName());
//        System.out.println("Man's details:" + man.getAge());
//        System.out.println("Man's details:" + man.getWidth());
//        System.out.println("Man's details:" + man.getHeight());
        System.out.println(man.introduce());

//        System.out.println("Woman's details:" + woman.getName());
        System.out.println(woman.introduce());
try {
    Stack <String> familly = Man.Familly;
    System.out.println("Familly members: " + familly);
    familly.add("Fatima");
    familly.add("hamadi");
    familly.add("Ahmed");
    familly.add("sara");
    System.out.println("Updated Familly members: " + familly);
} catch (Exception e) {
    throw new RuntimeException(e);
}
    }
}
