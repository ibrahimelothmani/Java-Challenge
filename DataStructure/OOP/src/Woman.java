

import java.util.List;
import java.util.Stack;

public class Woman {
    private String name;
    private int age;
    private int width;
    private int height;

    public static Stack<String> getFamilly() {
        return Familly;
    }

    public static void setFamilly(Stack<String> familly) {
        Familly = familly;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Woman(String name, int age, int width, int height) {
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
        System.out.println("My name is " + name + ", I am " + age + " years old" + " I am " + width + " kg wide and " + height + " cm tall.");
        return "";
    }
}
