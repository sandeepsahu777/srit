import java.util.*;
public class mobileplan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int minuteuse=sc.nextInt();
        int messagesent=sc.nextInt();
        sc.close();
        double costPlanA=25.0;
        if(minuteuse>100){
            costPlanA +=(minuteuse-100)*0.10;
        }
        if(messagesent>100){
            costPlanA+=(minuteuse-100)*0.05;
        }
        double costPlanB=40.0;
        if(minuteuse>200){
            costPlanB+=(minuteuse-200)*0.08;
        }
        if(messagesent>200){
            costPlanB+=(messagesent-200)*0.03;
        }
        double costPlanC=60.0;

        System.out.printf("Cost for Plan A: $%.2f%n", costPlanA);
        System.out.printf("Cost for Plan B: $%.2f%n", costPlanB);
        System.out.printf("Cost for Plan C: $%.2f%n", costPlanC);

        if (costPlanA <= costPlanB && costPlanA <= costPlanC) {
            System.out.println("Plan A is the most suitable for you.");
        }
         else if (costPlanB <= costPlanA && costPlanB <= costPlanC) {
            System.out.println("Plan B is the most suitable for you.");
        }
         else {
            System.out.println("Plan C is the most suitable for you.");
        }
    }

    }

