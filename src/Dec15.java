import java.util.Scanner;

class Dec15 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double longestThrowDistance = 0;

        // get throws for 10 throwers
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter ID: ");
            int id = reader.nextInt();

            // get 2 initial throws to start with
            System.out.print("Enter throw distance: ");
            double previousThrowDistance = reader.nextInt();

            System.out.print("Enter throw distance: ");
            double currentThrowDistance = reader.nextInt();

            // this whole section could be simplified with a do-while loop, but we can't use that
            // https://www.javatpoint.com/java-do-while-loop

            // only throw if the previous throw is shorter than the current one
            // currentThrowDistance starts with the highest value of double so the loop can begin
            while (previousThrowDistance < currentThrowDistance) {
                previousThrowDistance = currentThrowDistance;
                System.out.print("Enter throw distance: ");
                currentThrowDistance = reader.nextInt();
            }


            // change the longest throw distance if the current throw distance is longest
            if (previousThrowDistance > longestThrowDistance) longestThrowDistance = previousThrowDistance;

            System.out.println("Longest throw distance for thrower with ID " + id + " is " + previousThrowDistance);
        }

        System.out.println("Longest throw distance for all throwers: " + longestThrowDistance);
    }
}