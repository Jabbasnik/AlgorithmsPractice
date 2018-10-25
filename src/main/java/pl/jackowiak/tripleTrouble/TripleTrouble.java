package pl.jackowiak.tripleTrouble;

public class TripleTrouble {

    public static int TripleDouble(long num1, long num2) {

        char[] numberSize = String.valueOf(num1).toCharArray();
        char[] numberSize2 = String.valueOf(num2).toCharArray();

        char tempCharA;
        char tempCharA2 = 0;
        int counter = 0;
        for (int i = 0; i < numberSize.length - 1; i++) {

            tempCharA = numberSize[i];
            tempCharA2 = numberSize[i + 1];

            if (tempCharA == tempCharA2) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter == 2) {
                break;
            }
        }
        char tempCharB;
        char tempCharB2;

        for (int i = 0; i < numberSize2.length - 1; i++) {
            tempCharB = numberSize2[i];
            tempCharB2 = numberSize2[i + 1];

            if (tempCharB == tempCharB2) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter == 1 && tempCharB2 == tempCharA2) {
                return 1;
            }

        }

        return 0;
    }


    public static int TripleDoubleClever(long num1, long num2)
    {
        String n1str = String.valueOf(num1);
        String n2str = String.valueOf(num2);
        for(int i=0;i<10;i++) {
            String n = String.valueOf(i);
            if( n1str.contains(n+n+n) && n2str.contains(n+n) ) return 1;
        }
        return 0;
    }

}
