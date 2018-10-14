package pl.jackowiak.Isogram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Isogram {

    public static boolean isIsogram(String str) {

        char[] chars = str.toLowerCase().toCharArray();
        Set<Character> characters = new HashSet<>();
        List<Character> characterList = new ArrayList<>();

        for (char ch : chars) {
            characters.add(ch);
        }
        for (char ch2 : chars) {
            characterList.add(ch2);
        }
        if (characterList.size() == characters.size()) {
            return true;
        } else {
            return false;
        }
    }
}
