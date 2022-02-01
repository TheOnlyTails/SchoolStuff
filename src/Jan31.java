class Jan31 {
    // check if the array's elements contains all digits
    public static boolean containsAllDigits(int[] a) {
        // go through digits 0 to 9
        for (int i = 0; i < 10; i++) {
            if (!containsDigit(a, i)) return false;
        }
        return true;
    }

    // check if the array's elements contains a digit
    public static boolean containsDigit(int[] a, int digit) {
        for (int i = 0; i < a.length; i++) {
            if (containsDigit(a[i], digit)) return true;
        }
        return false;
    }

    // check if the number contains a digit
    public static boolean containsDigit(int x, int digit) {
        while (x > 0) {
            if (x % 10 == digit) return true;
            x = x / 10;
        }
        return false;
    }
}