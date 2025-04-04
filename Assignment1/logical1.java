import java.util.*;
public class logical1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        sc.close();
        if((side1+side2>side3) && (side1+side3>side2) && (side2+side3>side1)){
            System.out.println("The given side can form a valid triangle");
        }
        else
            System.out.println("The given side cannot form a  valid triangle");
        }
    }

