package maths;

public class CountDigits {
    public static void main (String[] args) {
        int number = 0;
        System.out.println(countdigitsByString(number));
        System.out.println(countDigitsFromNumber(number));
    }

    // by using String.valurOf
    private static int countdigitsByString (int number) {
        int digitCount = String.valueOf(number).length();
        return digitCount;
    }

    public static int countDigitsFromNumber (int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}
