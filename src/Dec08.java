public class Dec08 {
    // calculate city tax depending on the house's overall area and area code,
    // with discounts for families with kids
    // city tax = ארנונה
    public static double calculateCityTax(double houseArea, int areaCode, int children) {
        // 50 is the base price, and each area code adds 50;
        // 1 = 100, 2 = 150, 3 = 200, 4 = 250, 5 = 300, 6 = 350
        int pricePerSquareMeter = 50 + (areaCode * 50);
        return (houseArea * pricePerSquareMeter) - (children * 200);
    }

    public static int getLeftmostDigit(int n) {
        // divide the number by 10 until only 1 digit (the first one) is left
        while (n >= 10) {
            n = n / 10;
        }

        return n;
    }

    // check whether the last (right) digit of a is equal to the first (left) digit of b
    public static boolean areEndDigitsEqual(int a, int b) {
        return a % 10 == getLeftmostDigit(b);
    }
}