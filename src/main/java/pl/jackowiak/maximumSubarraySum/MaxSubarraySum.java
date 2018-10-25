package pl.jackowiak.maximumSubarraySum;

import java.util.*;
import java.util.stream.Collectors;

public class MaxSubarraySum {

    public static int sequence(int[] arr) {

//        if (arr.length != 0) {
//            List<Integer> listFromArray = Arrays.stream(arr)
//                    .boxed().distinct().collect(Collectors.toList());
//
//            int largestA = listFromArray.get(0);
//            int largestB = listFromArray.get(0);
//
//            for (Integer number : listFromArray) {
//                {
//                    if (number > largestB) {
//                        if (number > largestA) {
//                            largestB = largestA;
//                            largestA = number;
//                        } else {
//                            largestB = number;
//                        }
//                    }
//                }
//            }
//
//            if (largestA + largestB > 0) {
//                return largestA + largestB;
//            }
//        }
//        System.out.println("dupa");
//
//        return 0;

        if (arr.length != 0) {
            int maxInteger = Integer.MIN_VALUE, maxTemp = 0;
            for (int number : arr) {
                maxTemp = maxTemp + number;
                if (maxInteger < maxTemp)
                    maxInteger = maxTemp;
                if (maxTemp < 0)
                    maxTemp = 0;
            }
            if (maxInteger>0){
                return maxInteger;
            }
        }
        return 0;
    }


}
