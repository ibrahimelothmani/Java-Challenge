import java.util.List;
import java.util.Stack;

public class Man {

    private String name;
    private int age;
    private int width;
    private int height;

    public Man(String name, int age, int width, int height) {
        this.name = name;
        this.age = age;
        this.width = width;
        this.height = height;
    }

    public static Stack<String> Familly = new Stack<String>();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String introduce() {
        System.out.println("My name is " + name + ", I am " + age + " years old" + " I am " + width + " kg width and " + height + " cm tall.");
        return "";
    }
}
