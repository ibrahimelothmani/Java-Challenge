
// Lesson 1: BIG O Notation

public class Main {

    // ----------- example 1 --------------
    // O(n) => O(1) + O(n) = O(n) => O(n)

    public static void log1(int[] numbers) {
         System.out.println(numbers[0]); // => O(1
         for (int i = 1; i < numbers.length; i++) {
            System.out.println(numbers[i]); // => O(n)
            for (int number : numbers){
            System.out.println(number); // => O (n)
       }
       }
    }

       // ----------- example 2 --------------

       public static void logN(int[] numbers, String[] messages) {
        
        // O (n + m ) => O(n) + O(m) = O(n + m) => O(n)
        for (int number : numbers)
            System.out.println(number); // => O (n)
        for (String message : messages)
            System.out.println(message); // => O (m)
       }


       // ----------- example 3 --------------

       // O(n * n) = O(n^2)
       public static void logO2(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) // => O(n)
        {
            for (int j = 0; j < numbers.length; j++) // => O(n)
            {
                System.out.println(numbers[i] + numbers[j]); // => O(n^2)
            }
        }


        //----------- example 4 --------------

        // O(log(n)) == LOGARITHMIC TIME

        //public static void logN(int[] numbers) {

        for (int number : numbers) { // => O(n)
            while (number > 1) { // => O(log(n))
                number = number / 2; // => O(log(n))
            }
        }

        //----------- example 5 --------------

        // O(2^n) == EXPONENTIAL TIME !=(opposit) O(log(n)) == LOGARITHMIC TIME
        //public static void logN(int[] numbers) {

        for (int number : numbers) { // => O(n)
            int result = 1;
            for (int i = 0; i < number; i++) { // => O(2^n)
                result = result * 2; // => O(2^n)
            }
        }

        //----------- example 6 --------------

        // O(n!) == FACTORIAL TIME
        //public static void logN(int[] numbers) {

        for (int number : numbers) { // => O(n)
            int result = 1;
            for (int i = 1; i <= number; i++) { // => O(n!)
                result = result * i; // => O(n!)
            }
        }
    }
}

