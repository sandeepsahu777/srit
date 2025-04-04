import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        sc.close();
        String cleanedInput=input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reverseInput=new StringBuilder(cleanedInput).reverse().toString();
        if(cleanedInput.equals(reverseInput)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }

    }
}
