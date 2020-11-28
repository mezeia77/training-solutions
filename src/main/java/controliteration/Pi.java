package controliteration;

public class Pi {

    private static final String PI_POET =
            "Nem a régi s durva közelítés," +
                    "Mi szótól szóig így kijön " +
                    "Betűiket számlálva." +
                    "Ludolph eredménye már," +
                    "Ha itt végezzük húsz jegyen." +
                    "De rendre kijő még tíz pontosan," +
                    "Azt is bízvást ígérhetem.";

    public String getPi() {
        String piValue = "";
        int counter = 0;

        for (int i = 0; i < PI_POET.length(); i++) {
            if (counter != 0 && !Character.isAlphabetic(PI_POET.charAt(i))) {
                piValue += counter;
                counter = 0;
            }


            if (Character.isAlphabetic(PI_POET.charAt(i))) {
                counter++;
            }
        }
        return piValue;
    }

}

