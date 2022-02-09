class Feb09 {
    // test array, ignore this
    public static final int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public static void main(String[] args) {
        printColumns(a);
        printRowSums(a);
        System.out.println(contains(a, 2));
    }
    // this prints each column on its side
    // an array like {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
    // is printed as
    // 1 4 7
    // 2 5 8
    // 3 6 9
    public static void printColumns(int[][] a) {
        // for each column
        for (int i = 0; i < a[0].length; i++) {
            // for each row
            for (int j = 0; j < a.length; j++) {
                // print the item in the current row
                // j: row, i: column
                System.out.print(a[j][i] + " ");
            }
            // print a new line
            System.out.println();
        }
    }
    public static void printRowSums(int[][] a) {
        // for each row
        for (int i = 0; i < a.length; i++) {
            // make a sum variable
            int sum = 0;

            // add each item in the row to it
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
            }

            // print the sum
            System.out.println(sum);
        }
    }

    public static boolean contains(int[][] a, int x) {
        // go through each row
        for (int i = 0; i < a.length; i++) {
            // go through each item in the current row
            for (int j = 0; j < a[i].length; j++) {
                // a[i][j] is the current item
                // i = row, j = column
                if (a[i][j] == x) return true;
            }
        }
        return false;
    }
}