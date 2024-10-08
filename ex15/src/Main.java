
//Write a program in Java to calculate the sum S= 1+2+3+...+ 10. Using the while loop.
public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum of the first 10 natural numbers is: " + sum);
    }
}