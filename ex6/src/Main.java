import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Write a program in Java that allows you to evaluate a grade entered on the keyboard
        //(if the grade is greater than 10 then it displays validated otherwise not validated
        //(NB: the grade between 0 and 20 ).

        int grade;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Put your grade please");
            grade = scanner.nextInt();

            if (grade >= 10 && grade <= 20){
                System.out.println("VALIDATED");
            break;
            }
            else if(grade >= 0 && grade <= 10){
                System.out.println("NOT VALIDATED");
            break;
            }
            else{
                System.out.println("Please Put a right grade between 0 and 20");
            continue;
        }
        }
        while (true);
    }
}