public class Main {
    public static void main(String[] args) {

        // Create a Box object for Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(10);
        System.out.println("Integer Value: " + integerBox.getItem());

        // Create a Box object for String
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello World");
        System.out.println("String Value: " + stringBox.getItem());
    }
}