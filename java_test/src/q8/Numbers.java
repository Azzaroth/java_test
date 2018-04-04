package q8;

public class Numbers {

    public static int numberGame(int a, int b) {
        String aString = String.valueOf(a);
        String bString = String.valueOf(b);
        String cString = "";

        int i = 0;
        int aLength = aString.length();
        int bLength = bString.length();

        while (aLength > i || bLength > i) {
            cString = (aLength > i) ? cString + aString.substring(i, i + 1) : cString;
            cString = (bLength > i) ? cString + bString.substring(i, i + 1) : cString;
            i++;
        }

        int value = Integer.parseInt(cString);

        return (value > 1000000) ? -1 : value;
    }

}
