package pl.jackowiak;

import pl.jackowiak.expandnumber.ExpandNumber;
import pl.jackowiak.isogram.Isogram;
import pl.jackowiak.maximumSubarraySum.MaxSubarraySum;
import pl.jackowiak.mumbling.Mumbling;
import pl.jackowiak.removestringspaces.RemoveSpaces;
import pl.jackowiak.sollers.sollersSolution;
import pl.jackowiak.twotoone.TwoToOne;

/**
 * Practice repository
 * Created by Marcin Jackowiak
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello! Good day for practice!");

        System.out.println("twotoone | " + TwoToOne.longest("asdasd", "errasfdsfsdf"));

        System.out.println("RemoveSpaces | " + RemoveSpaces.noSpace("asdas asd asd asda sd "));

        System.out.println("mumbling | " + Mumbling.accum("HbideVbxncC"));

        System.out.println("isogram | " + Isogram.isIsogram("Abcd"));

        System.out.println("ExpandNumber | " + ExpandNumber.expandedForm(324234234));

        System.out.println("Max subbarary | " + MaxSubarraySum.sequence(new int[]{-21, -12, -16, -14, 11, -16, 29, -2, -2, 1, -30, 26, -2, 28, -1, 4, -19, -28, -9, 4, -15, 15, -13, 13, -25, 11, 18, 16, -10, 12, -16, 17, 3, -21, 17, -20, 27, 22, -12, 22, -7, 13, 14, 7, 3, 25, 16, 9, -30, 25}));


    }
}