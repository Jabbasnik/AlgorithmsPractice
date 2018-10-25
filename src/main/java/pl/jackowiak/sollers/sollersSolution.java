package pl.jackowiak.sollers;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class sollersSolution {


    public int solution(int A, int B) {
        // write your code in Java SE 8

        List<Integer> listOfResults = new ArrayList<>();

        int counter = 0;
        double squareNumber;

        for (int i = A; i <= B; i++) {
            squareNumber = Math.sqrt(i);

            do {
                squareNumber = Math.sqrt(squareNumber);
                counter++;

            } while (squareNumber == (int) squareNumber);

            listOfResults.add(counter);
            counter = 0;
        }

        if (!listOfResults.isEmpty()) {
            return listOfResults.stream()
                    .mapToInt(v -> v)
                    .max()
                    .orElseThrow(NoSuchElementException::new);
        }
        return 0;
    }
}




