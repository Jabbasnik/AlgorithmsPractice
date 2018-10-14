package pl.jackowiak.RemoveStringSpaces;

public class RemoveSpaces {

    public static String noSpace(final String x) {
        return x.replaceAll("\\s+","");
    }

}
