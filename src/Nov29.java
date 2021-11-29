public class Nov29 {
    // check if the amount of even digits is equal to the amount of odd digits
    public static boolean digitCountByParityEqual(int n) {
        int even = 0;
        int odd = 0;

        while (n > 0) {
            // go over the digits
            int digit = n % 10;

            // check if the digit is even and increment the respective counter
            if (digit % 2 == 0) even++;
            else odd++;

            // remove the last digit
            n = n / 10;
        }

        return even == odd;
    }

    // check if the ones digit only appears once
    public static boolean isOnesDigitUnique(int n) {
        int ones = n % 10;

        while (n > 0) {
            // remove the last digit
            n = n / 10;

            // go over the digits
            int digit = n % 10;

            // check if the digit is one and increment the respective counter
            if (digit == ones) return false;

            // remove the last digit
        }

        return true;
    }

    // check a number's digit are sorted in descending order with step of 1
    public static boolean isSortedDescendingStep1(int n) {
        int last = n % 10 - 1;

        while (n > 0) {
            // go over the digits
            int digit = n % 10;

            // check if the digit is smaller than the last one
            if (digit - 1 == last) return false;

            // remove the last digit
            last = digit;
            n = n / 10;
        }

        return true;
    }

    // check a number's digit are sorted in descending order with step of 1 to either direction
    public static boolean isSortedDescendingStep1BothDirs(int n) {
        int last = n % 10 ;

        while (n > 0) {
            // go over the digits
            n = n / 10;
            int digit = n % 10;

            // check if the digit is smaller than the last one
            if (Math.abs(digit - last) > 1) return false;

            // remove the last digit
            last = digit;
        }

        return true;
    }
}
