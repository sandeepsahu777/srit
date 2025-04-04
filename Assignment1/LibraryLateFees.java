import java.util.Scanner;

public class LibraryLateFees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOverdue = scanner.nextInt();
        String bookType = scanner.next();
        double lateFee = 0.0;
        scanner.close();
        if (bookType.equalsIgnoreCase("regular")) {
            lateFee = daysOverdue * 0.50;
        } else if (bookType.equalsIgnoreCase("fiction")) {
            lateFee = daysOverdue * 0.75;
        } else if (bookType.equalsIgnoreCase("reference")) {
            lateFee = 0.0;
        } else {
            System.out.println("Invalid book type entered.");
            return;
        }
        System.out.printf("The late fee is: $%.2f%n", lateFee);
       
       
    }
}