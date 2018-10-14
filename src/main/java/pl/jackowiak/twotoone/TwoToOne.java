package pl.jackowiak.twotoone;

import java.util.Set;
import java.util.TreeSet;

public class TwoToOne {

    public static String longest(String s1, String s2) {

        Set<Character> stringMap = new TreeSet<>();

        StringBuilder stringBuilder = new StringBuilder();
        String appendedString = stringBuilder.append(s1).append(s2).toString();

        char[] chars = appendedString.toCharArray();

        for (char c : chars) {
            stringMap.add(c);
        }
        StringBuilder sb = new StringBuilder(stringMap.size());

        for (char c : stringMap) {
            sb.append(c);
        }


        return sb.toString();
    }

}
