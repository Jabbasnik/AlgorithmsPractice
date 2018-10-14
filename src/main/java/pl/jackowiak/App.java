package pl.jackowiak;

import pl.jackowiak.RemoveStringSpaces.RemoveSpaces;
import pl.jackowiak.TwoToOne.TwoToOne;

/**
 * Practice repository
 * Created by Marcin Jackowiak
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello! Good day for practice!");

        System.out.println("TwoToOne | " + TwoToOne.longest("asdasd", "errasfdsfsdf"));

        System.out.println("RemoveSpaces | " + RemoveSpaces.noSpace("asdas asd asd asda sd "));


    }
}
