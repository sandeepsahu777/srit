import java.util.*;
public class logical3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("dear voter please enter your age");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Are you a citizen? (yes/no):");
        String citizenship = sc.nextLine().trim().toLowerCase();
        sc.close();
        if(age>=18&&citizenship.equals("yes")){
            System.out.println("Dear voter you can vote");
        }
        else{
            System.out.println("Dear voter sorry you can't vote ");
        }

    }
}
