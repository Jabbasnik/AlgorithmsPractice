package pl.jackowiak;

import pl.jackowiak.expandnumber.ExpandNumber;
import pl.jackowiak.isogram.Isogram;
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

        sollersSolution sollersSolution = new sollersSolution();

        System.out.println(sollersSolution.solution(10,1000));


    }
}