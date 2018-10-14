package pl.jackowiak.expandnumber;

public class ExpandNumber {

    public static String expandedForm(int num) {
        StringBuilder sb = new StringBuilder();

        char[] numberSize = String.valueOf(num).toCharArray();

        int counter = numberSize.length;

        for (int i = 0; i < numberSize.length; i++) {

            if (!String.valueOf(numberSize[i]).equals("0")) {
                sb.append(numberSize[i]);

                for (int j = numberSize.length - 1; j > i; j--) {
                    sb.append("0");
                }
                counter--;
                if (counter != 0) {
                    sb.append(" + ");
                }


            }

        }

        if (sb.toString().endsWith(" ")) {
            sb.delete(sb.length() - 3, sb.length());
        }

        return sb.toString();
    }

}
