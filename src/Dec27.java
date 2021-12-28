class Dec27 {
    // בודק אם הזוגיות של כל ספרה שונה מהספרה שלפניה
    // 8365, 1234
    public static boolean isParityAlternating(int input) {
        int parity = input % 2;
        input /= 10;

        while (input > 0) {
            if (input % 2 == parity) return false;

            parity = input % 2;
            input /= 10;
        }

        return true;
    }

    // בדוק אם סכום הספרות החיצוניות (ראשונה ואחרונה) שווה לסכום הספרות הפנימיות
    // 231, 1212, 2222
    public static boolean areOuterAndInnerDigitSumsEqual(int input) {
        // outer digit sum - start with first digit
        int outer = input % 10;

        // inner digit sum - start on 0
        int inner = 0;
        // remove first digit
        input /= 10;

        // go over each digit, except the last one
        while (input > 10) {
            // add the current digit to the inner sum
            inner += input % 10;
            input /= 10;
        }
        // now that only one digit is left, add it to the outer sum

        outer += input;

        // return whether the outer and inner sums are equal
        return outer == inner;
    }
}