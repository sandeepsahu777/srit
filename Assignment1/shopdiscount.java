import java.util.*;
public class shopdiscount {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int numitem=sc.nextInt();
    int totalprice=sc.nextInt();
    sc.close();
    double discount=0.0;
    if(totalprice>100&&numitem>=5){
        discount=0.10;

    }
    else if(totalprice>=50&&totalprice<=100){
        discount=0.05;
    }
    double discountAmount=totalprice*discount;
    double finalPrice=totalprice-discountAmount;
    System.out.printf("the discount amount is:$%.2f%n",discountAmount);
    System.out.printf("the final  amount after discount is:$%.2f%n",finalPrice);
   } 
}
