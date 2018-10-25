package pl.jackowiak.mexicanWave;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MexicanWave {
    public static String[] wave(String str) {

        StringBuilder sb = new StringBuilder(str.toLowerCase());
        Set<String> resultList = new TreeSet<>();

        if (!str.isEmpty()) {
            char tempLow = str.charAt(0);
            char tempUp;

            for (int i = 0; i < str.length(); i++) {
                if (i == 0) {
                    tempUp = Character.toUpperCase(str.charAt(i));
                    sb.setCharAt(i, tempUp);
                    resultList.add(String.valueOf(sb));

                } else {
                    tempUp = Character.toUpperCase(str.charAt(i));
                    sb.setCharAt(i, tempUp);
                    sb.setCharAt(i - 1, tempLow);
                    if (!String.valueOf(sb).equals(str)) {
                        resultList.add(String.valueOf(sb));
                    }
                }
                tempLow = str.charAt(i);
            }
        }

        int n = resultList.size();
        String arr[] = new String[n];
        arr = resultList.toArray(arr);
        return arr;
    }
}
