import java.util.Scanner;

public class Dec20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();

            System.out.print("Enter hourly wage (in ₪/hour): ");
            int wage = scanner.nextInt();

            int salary = 0;

            // שיטת הזקיף
            // allow to enter a variable amount of days
            System.out.print("Enter hours worked: ");
            int hours = scanner.nextInt();

            while (hours > -1) {
                if (hours < 5) System.out.println("Lazy!");

                salary = salary + (wage * hours);

                System.out.print("Enter hours worked: ");
                hours = scanner.nextInt();
            }

            System.out.println("Salary for worker ID " + id + " is: " + salary);
        }
    }
}
