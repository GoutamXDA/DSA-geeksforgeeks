package maths;

public class PalindromeNumber {
    public static void main (String[] args) {
        int number = 0;
        System.out.println(checkPalindromeNumber(number));
    }

    private static boolean checkPalindromeNumber (int number) {
        if (number < 0 || (number % 10 == 0 && number != 0))   return false;
        int rev = 0;
        int temp = number;
        while (temp > rev) {
            int lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp = temp / 10;
        }
        return (temp == rev || temp == rev / 10);
    }
}
