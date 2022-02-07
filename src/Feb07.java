class Feb07 {
    // move every item in the array one place right
    // you can use return an array by doing this
    public static int[] cycleRight(int[] a) {
        // store the last item so it doesn't get lost
        int last = a[a.length - 1];

        // go through the array backwards
        // `i` starts at 1 less than the array's length
        // and ends at 1 (not 0, since we're accessing `i - 1`)
        for (int i = a.length - 1; i > 0; i--) {
            // move each it to the place before it
            a[i] = a[i - 1];
        }

        // since we overwrote the last item, put it back in the first place
        a[0] = last;

        // if you don't want to return `a`, you can print it
        return a;
    }
}