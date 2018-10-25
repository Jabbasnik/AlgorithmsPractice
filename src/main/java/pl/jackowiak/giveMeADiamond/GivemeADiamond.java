package pl.jackowiak.giveMeADiamond;

public class GivemeADiamond {

    public static String print(int n) {
        String diamond = "";
        if (n != 0 && n % 2 != 0 && n > 0) {
            for (int i = 1; i < n + 1; i += 2) {
                for (int j = 0; j < (n - i) / 2; j++) {
                    diamond = diamond.concat(" ");
                }
                for (int j = 0; j < i; j++) {
                    diamond = diamond.concat("*");
                }
                diamond = diamond.concat("\n");
            }

            for (int i = n - 2; i > 0; i -= 2) {
                for (int j = 0; j < (n - i) / 2; j++) {
                    diamond = diamond.concat(" ");
                }

                for (int j = 0; j < i; j++) {
                    diamond = diamond.concat("*");
                }
                diamond = diamond.concat("\n");
            }

            return diamond;
        }

        return null;
    }
}