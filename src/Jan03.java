class Jan03 {
    // is the number divisible by the sum of its digits?
    public static boolean isHershard(int n) {
        return n % sumOfDigits(n) == 0;
    }

    // is the number divisible by the sum of its digits and is the result prime?
    public static boolean isMoran(int n) {
        // I'm using the previous method here to save space
        return isPrime(n / sumOfDigits(n)) && isHershard(n);
    }

    public static boolean isPrime(int input) {
        // make sure input is bigger than 1
        if (input <= 2) return false;
        for (int i = 2; i <= input / 2; i++) {
            // if the number is divisible by any number between 2 and half of itself,
            // it is not prime
            if (input % i == 0) return false;
        }
        // if the method hasn't ended yet, the number is prime
        return true;
    }

    private static int sumOfDigits(int n) {
        int sumOfDigit = 0;
        while (n > 0) {
            sumOfDigit += n % 10;
            n /= 10;
        }
        return sumOfDigit;
    }
}