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
        answer = increment - 1;
        return (char) answer;
    }


    public static char CLEVERfindMissingLetter(char[] array)
    {
        boolean stop = false;
        int i;
        for(i = 1; i < array.length && !stop; i++)
        {
            if (array[i] - array[i-1] != 1)
                stop = true;
        }
        return (char) (array[i-1]-1);
    }
}
