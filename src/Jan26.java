import java.util.Scanner;

class Jan26 {
    public static void tourCompany() {
        Scanner scanner = new Scanner(System.in);

        // keep track of the tour with the most countries,
        // and how long it is
        int mostCountriesTourLength = 0;
        int mostCountries = 0;

        for (int i = 0; i < 40; i++) {
            // get all the data
            System.out.print("Enter start day: ");
            int startDay = scanner.nextInt();
            System.out.print("Enter end day: ");
            int endDay = scanner.nextInt();
            System.out.print("Enter number of countries: ");
            int numOfCountries = scanner.nextInt();

            // if the tour goes through more countries
            // update the mostCountries and mostCountriesTourLength
            if (numOfCountries > mostCountries) {
                mostCountriesTourLength = endDay - startDay;
                mostCountries = numOfCountries;
            }
        }

        System.out.println(mostCountriesTourLength);
    }

    public static boolean containsPalindrome(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (isPalindrome(a[i])) return true;
        }
        return false;
    }

    public static boolean isPalindrome(int n) {
        // get a copy of the number
        int num = n;
        int reverse = 0;

        while (n != 0) {
            // go through each digit
            int digit = n % 10;
            // add the digit to the end of the reverse
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        // return whether the number is the same as the reverse
        return num == reverse;
    }
}