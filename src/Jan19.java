class Jan19 {
    public static int biggestDigitSum(int[] a) {
        int maxSum = a[0];

        for (int i = 0; i < a.length; i++) {
            // if the sum of a[i]'s digits is bigger than the current max sum,
            // update the max sum
            if (sumDigits(a[i]) > sumDigits(maxSum)) maxSum = a[i];
        }

        return maxSum;
    }

    public static boolean areArraysEqual(int[] a, int[] b) {
        // make sure the arrays are the same length
        if (a.length != b.length) return false;

        // go over each element in the arrays and compare them
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }

    public static int sumDigits(int n) {
        int sum = 0;
        // go over each digit and add it to the sum
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}