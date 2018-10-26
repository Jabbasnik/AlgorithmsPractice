package pl.jackowiak.findMissingLetter;

public class FindMissingLetter {

    public static char findMissingLetter(char[] array) {

        int increment = array[0];
        int answer;
        for (Character ch : array) {
            increment++;
            if (increment - (int) ch == 0) {
                break;
            }
        }


        return (char) increment;
    }
}
