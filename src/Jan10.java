import java.util.Scanner;

class Jan10 {
    public static void checkBagruyot() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter # of bagruyot: ");
            int numOfTests = scanner.nextInt();

            int overallUnits = 0;
            int fiveUnitTests = 0;
            int fails = 0;

            for (int j = 1; j <= numOfTests; j++) {
                System.out.print("Enter # of units: ");
                int units = scanner.nextInt();
                System.out.print("Enter grade: ");
                int grade = scanner.nextInt();

                overallUnits = overallUnits + units;
                if (units == 5) fiveUnitTests++;
                if (grade < 60) fails++;
            }

            if (overallUnits >= 20 && fiveUnitTests >= 3 && fails == 0) {
                System.out.println("You passed");
            } else {
                System.out.println("You failed");
            }
        }
    }

    public static boolean isAbsoluteDifference1(int n) {
        int prev = n % 10;
        n = n / 10;

        while (n > 0) {
            int digit = n % 10;

            if (Math.abs(digit - prev) != 1) return false;

            prev = digit;
            n = n / 10;
        }

        return true;
    }

    public static boolean canDivideByAllDigits(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (n % digit != 0) return false;

            n = n / 10;
        }

        return true;
    }
}