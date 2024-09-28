// The photocopying centre charges 0.25 DH for the first 10 photocopies, 0.20 DH for
//the next twenty and 0.10 DH beyond. Write a program in Java that asks the user to
//enter the number of photocopies made and displays the corresponding
//invoice.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of photocopies: ");
        int photocopies = scanner.nextInt();
    }
}