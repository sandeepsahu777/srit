import java.util.*;
public class findindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println(i);
            }
        }

        sc.close();
        
    }
}