package pl.jackowiak;

import pl.jackowiak.RemoveStringSpaces.RemoveSpaces;
import pl.jackowiak.TwoToOne.TwoToOne;

import java.util.ArrayList;
import java.util.List;

/**
 * Practice repository
 * Created by Marcin Jackowiak
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello! Good day for practice!");

        System.out.println("TwoToOne | " + TwoToOne.longest("asdasd", "errasfdsfsdf"));

        System.out.println("RemoveSpaces | " + RemoveSpaces.noSpace("asdas asd asd asda sd "));


        long num = 261235;

        List<Integer> numbers = new ArrayList<>();

        int count = 0;
        int i = 0;
        while (num > 0) {
            int digit = (int) (num % 10);
            if (digit == 1)
                count++;
            num /= 10;
            numbers.add(i, digit);
            i++;
        }

        System.out.println(numbers);

    }
}
