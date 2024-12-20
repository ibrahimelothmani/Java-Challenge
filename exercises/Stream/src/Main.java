//A Stream represents a sequence of elements and supports different kind of operations to perform computations
//upon those elements. With Java 8, Collection interface has two methods to generate a Stream: stream() and
//parallelStream(). Stream operations are either intermediate or terminal. Intermediate operations return a Stream
//so multiple intermediate operations can be chained before the Stream is closed. Terminal operations are either
//void or return a non-stream result.

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main {
    public static void main (String[] args) throws java.lang.Exception
    {
        Stream<String> fruitStream = Stream.of("apple", "banana", "pear", "kiwi", "orange");

        fruitStream.filter(s -> s.contains("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        // Example 2

        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 42);
        // sequential
        long howManyOddNumbers
                = integerList
                  .stream()
                  .filter(e -> (e % 2) == 1)
                  .count();
        System.out.println(howManyOddNumbers); // Output: 2

    }

}