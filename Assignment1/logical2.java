import java.util.*;
public class logical2 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    sc.close();
    if(number%5==0 && number%7==0){
        System.out.println("The number is divisible by both 5 and 7");
    }
    else{
        System.out.println("The number is not divisible by both 5 and 7");
    }
   } 
}
