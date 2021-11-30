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
    // ones digit = ספרת היחידות
    public static boolean isOnesDigitUnique(int n) {
        // get the ones digit
        int ones = n % 10;

        while (n > 0) {
            // remove the last digit so the ones digit doesn't match up with itself
            n = n / 10;

            // go over the digits
            int digit = n % 10;

            // check if the digit is the same as the ones digit
            if (digit == ones) return false;
        }

        return true;
    }

    // check a number's digit are sorted from high to low with step of 1
    public static boolean isSortedDescendingStep1(int n) {
        // get the last digit
        int last = n % 10;

        // the 10 makes sure to skip over the biggest digit, so it doesn't get checked against 0
        while (n > 10) {
            // go over the digits
            n = n / 10;
            int digit = n % 10;

            // check if the digit is smaller than the last one
            if (last + 1 != digit) return false;

            // remove the last digit
            last = digit;
        }

        return true;
    }

    // check a number's digit are sorted so that digits only go up or down 1 from one to the next
    public static boolean isStep1BothDirs(int n) {
        int last = n % 10;

        // the 10 makes sure to skip over the biggest digit, so it doesn't get checked against 0
        while (n > 10) {
            // go over the digits
            n = n / 10;
            int digit = n % 10;

            // check if the digit is smaller than the last one
            // Math.abs(x) מחזיר ערך מוחלט
            if (Math.abs(digit - last) != 1) return false;

            // remove the last digit
            last = digit;
        }

        return true;
    }
}
