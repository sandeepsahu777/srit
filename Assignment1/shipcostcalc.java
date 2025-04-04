import java.util.*;
public class shipcostcalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double weight=sc.nextInt();
        double distance=sc.nextInt();
        sc.close();
        double shippingCost;
        if(weight<=10 && distance<=100){
            shippingCost=5.0;

        }
        else if(weight>10 && weight <=20 || (distance>100 && distance<=500)){
            shippingCost=10.0;
        }
        else{
            shippingCost=20.0;
        }
        System.out.printf("The shipping cost is:$%.2f%n",shippingCost);
    }
}
