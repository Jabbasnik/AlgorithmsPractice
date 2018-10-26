package pl.jackowiak.mexicanWave;

import java.util.Set;
import java.util.TreeSet;

public class MexicanWave {
    public static String[] wave(String str) {

        StringBuilder sb = new StringBuilder(str.toLowerCase());
        Set<String> resultList = new TreeSet<>();
        if (!str.isEmpty()) {
            char tempUp;
            for (int i = 0; i < str.length(); i++) {
                    tempUp = Character.toUpperCase(str.charAt(i));
                    sb.setCharAt(i, tempUp);
                    if (!String.valueOf(sb).equals(str)) {
                        resultList.add(String.valueOf(sb));
                    }
                    sb.setCharAt(i, Character.toLowerCase(tempUp));
            }
        }
        int n = resultList.size();
        String arr[] = new String[n];
        arr = resultList.toArray(arr);
        return arr;
    }
}
