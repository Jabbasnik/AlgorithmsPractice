package pl.jackowiak.findsmallest;

public class FindSmallest {


    public static long[] smallest(long n) {

        n = 261235L;

        int[] numbers = new int[]{};

        while (n > 0) {
            System.out.println(n % 10);

            n = n / 10;
        }


        return new long[0];

    }
}
