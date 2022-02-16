import java.util.Arrays;

class Feb16 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(switchDiagonals(a)));
    }
    public static int[][] switchDiagonals(int[][] a) {
        int reverseIndex = a.length - 1;

        for (int i = 0; i < a.length; i++) {
            int temp = a[i][i]; // save the value from the main diagonal
            // put the secondary diagonal's value into the main diagonal's value
            a[i][i] = a[i][reverseIndex - i];
            // put the saved value into the secondary diagonal's value
            a[i][reverseIndex - i] = temp;
        }

        return a;
    }
}