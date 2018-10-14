package pl.jackowiak.mumbling;

public class Mumbling {

    public static String accum(String s) {

        char[] array = s.toCharArray();
        String str;

        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (char anArray : array) {
            for (int j = 0; j < counter + 1; j++) {
                if (j != 0) {
                    str = String.valueOf(anArray).toLowerCase();
                    stringBuilder.append(str);
                } else {
                    str = String.valueOf(anArray).toUpperCase();
                    stringBuilder.append(str);
                }
            }
            counter++;
            if (counter!=array.length){
                stringBuilder.append("-");
            }
        }
        return stringBuilder.toString();
    }


}
