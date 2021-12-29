class Dec29 {
    public static void main(String[] args) {
        longestConsecutiveSeries();
    }

    // מספר רנדומלי מX עד Y (כולל):
    // (int) (Math.random() * (Y - X + 1)) + X;

    // roll 30 dice and print consecutive rolls on the same line
    public static void sameLineConsecutiveRolls() {
        int prev = 0;

        for (int i = 1; i <= 30; i++) {
            // roll a die - 1 to 6
            int roll = (int) (Math.random() * 6) + 1;

            // print a new line if a new series is started
            if (roll != prev) System.out.println();
            // print the roll (with a space, to separate the rolls)
            System.out.print(roll + " ");

            // update the previous roll
            prev = roll;
        }
    }

    // roll 30 dice and print the length of the longest consecutive series of rolls
    public static void longestConsecutiveSeries() {
        // prev = previous roll, max = longest consecutive series length, count = current series length
        int prev = 0;
        int max = 0;
        int count = 0;

        for (int i = 1; i <= 30; i++) {
            // roll a die - 1 to 6
            int roll = (int) (Math.random() * 6) + 1;

            // if the series is broken, reset the count, otherwise increment the count
            if (roll != prev) count = 1;
            else count++;

            // if the current series is longer than the longest, update the longest
            if (count > max) max = count;

            // update the previous roll
            prev = roll;
        }

        System.out.println();
        System.out.println("Longest consecutive run: " + max);
    }
}