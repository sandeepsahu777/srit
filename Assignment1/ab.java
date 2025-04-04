import java.util.Scanner;
public class ab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        long result = 1;
        for (int i = 0; i < b; i++) {
            result *= a; 
        }

        System.out.println(a + "^" + b + " = " + result);
    }
}
 
    

