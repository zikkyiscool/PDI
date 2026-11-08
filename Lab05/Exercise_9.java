import java.util.Arrays;
import java.util.List;

public class Exercise_9 {
    public static void main(String[]args){
        List<Integer> numbers = Arrays.asList(5, 2, 9, -1, 3, -8, 20, 50);

        // a.find cube of each number
        System.out.print("The cube of each number is: ");
        numbers.stream()
                .map(n->n*n*n)
                .forEach(n -> System.out.print(n + " "));

        // b.filter out positive number
        System.out.print("\n\nPositive number: ");
        numbers.stream()
                .filter(n -> n > 0)
                .forEach(n ->System.out.print(n + " "));

        // c.sort data in a list
        System.out.print("\n\nSorted data: ");
        numbers.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));
    }
}
