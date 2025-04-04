import java.util.Scanner;
public class logical5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of hours worked: ");
        int hoursWorked = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Are you a full-time employee? (yes/no): ");
        String employmentStatus = sc.nextLine().trim().toLowerCase();

        sc.close();

        if (hoursWorked > 40 && employmentStatus.equals("yes")) {
            System.out.println("You are eligible for overtime pay.");
        } else {
            System.out.println("You are not eligible for overtime pay.");
        }
    }
}