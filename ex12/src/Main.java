
// Write a program in Java that asks the age of a child and allows you to inform about
//his or her category, knowing that the categories are as follows:
//"6 to 7 years old chick"
//"Pupil from 8 to 9 years old"
//"Minimal from 10 to 11 years old"
//"cadet after 12 years"

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your child's age:");
        int age = scanner.nextInt();

        if (age >= 6 && age <= 7) {
            System.out.println("Your child is a 6 to 7 year old chick.");
        }

        if (age >= 8 && age <= 9) {
            System.out.println("Your child is a pupil from 8 to 9 years old.");
        }

        if (age >= 10 && age <= 11) {
            System.out.println("Your child is a minimal from 10 to 11 years old.");
        }

        if (age >= 12) {
            System.out.println("Your child is a cadet after 12 years.");
        }

        scanner.close();

    }
}