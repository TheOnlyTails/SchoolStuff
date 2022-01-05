class Jan05 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i += 2 ) {
            goldbachConjecture(i);
        }
    }
    public static void goldbachConjecture(int n) {
        // go through all the primes smaller than `n`
        for (int i = 2; i <= (n + 1) / 2; i++) {
            // if both `i` and `n - i` (the other prime) are prime,
            if (isPrime(i) && isPrime(n - i)) {
                // print them out
                System.out.println(i + " + " + (n - i) + " = " + n);
                // and break out of the loop
                i = n;
            }
        }
    }

    public static boolean isPrime(int n) {
        // numbers smaller than 2 are never prime
        if (n <= 1) return false;

        // go through all numbers smaller than `n`
        for (int i = 2; i <= n / 2; i++) {
            // return false if `i` divides `n` evenly
            if (n % i == 0) return false;
        }
        // if no number divides `n` evenly, then it is prime
        return true;
    }
}