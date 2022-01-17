class Jan17 {
    // return the biggest item in the array
    public static int max(int[] a) {
        // get the first item
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            // go through each item, and check if it's bigger than max
            if (a[i] > max) max = a[i];
        }

        return max;
    }

    public static boolean contains(int[] a, int x) {
        // go through each item and check if it's equal to x
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return true;
        }
        // none of the items are equal to x, so the array doesn't contain x
        return false;
    }

    // return how many times x appears in the array
    public static int count(int[] a, int x) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            // add one to the count for each time an item equal to x is found
            if (a[i] == x) count++;
        }
        return count;
    }
}