import java.util.Scanner;

public class logical4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x-coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter the y-coordinate: ");
        int y = sc.nextInt();

        sc.close();

        if (x > 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the first quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the fourth quadrant.");
        } else if (x == 0 && y != 0) {
            System.out.println("The point (" + x + ", " + y + ") lies on the y-axis.");
        } else if (x != 0 && y == 0) {
            System.out.println("The point (" + x + ", " + y + ") lies on the x-axis.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is at the origin.");
        }
    }
}