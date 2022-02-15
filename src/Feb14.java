class Feb14 {
    public static void main(String[] args) {
        int[][] numbers = {
                {0, 0, 0, 0, 6, 7, 8, 9},
                {0, 0, 0, 0, 4, 3, 2, 1},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        System.out.println(verticalSumArray(numbers));
        System.out.println(getNumberFromArray(numbers[0]) + getNumberFromArray(numbers[1]));
        System.out.println(6789 + 4321);
    }
    // gets an array in this format:
    // 0 0 0 0 1 2 3 4
    // 0 0 0 0 4 3 2 1
    // 0 0 0 0 0 0 0 0
    // and does vertical summing to the two numbers
    // in the first two rows then places the result in the third one
    public static int verticalSumArray(int[][] a) {
        int[] firstRow = a[0];
        int[] secondRow = a[1];
        boolean carry = false;

        for (int i = firstRow.length - 1; i >= 0; i--) {
            int sum = firstRow[i] + secondRow[i];
            if (carry) sum++; // add the carry

            a[2][i] = sum % 10; // only add the last digit, anything bigger than 10 is carried

            carry = sum >= 10; // carry the 1 if the sum is greater than 9
        }

        return getNumberFromArray(a[2]); // get the result
    }

    // gets an array in this format:
    // 0 0 0 0 1 2 3 4
    // and returns the number as an `int`
    public static int getNumberFromArray(int[] a) {
        int result = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            // (int) (value) converts the value to an int
            // adds the current value times 10 to the power of its digit number
            // so the 2nd to last item would be multiplied times 10, 3rd to last by 100, and so on
            result = result + (int) (a[i] * Math.pow(10, a.length - 1 - i));
        }

        return result;
    }
}