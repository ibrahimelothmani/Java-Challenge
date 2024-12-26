import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberOfDice;
        int total = 0;

        System.out.print("Enter the # of dice to roll: ");
        numberOfDice = scanner.nextInt();
        if(numberOfDice > 0) {
            for (int i = 0; i < numberOfDice; i++) {
                int roll = random.nextInt(1, 7);
                System.out.println("You rolled a " + roll);
                showDice(roll);
                total += roll;
            }
            System.out.println("You rolled the dice and the total is: " + total);
        } else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }

    static void showDice(int roll) {
        String dice1 = """
                 _______
                |       |
                |   *   |
                |_______|
                """;
        String dice2 = """
                 _______
                |       |
                | *   * |
                |_______|
                """;
        String dice3 = """
                 _______
                |     * |
                |   *   |
                |_*_____|
                """;
        String dice4 = """
                 _______
                | *   * |
                |       |
                |_*___*_|
                """;
        String dice5 = """
                 _______
                | *   * |
                |   *   |
                |_*___*_|
                """;
        String dice6 = """
                 _______
                | *   * |
                | *   * |
                |_*___*_|
                """;

        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid input");
        }
    }
}
