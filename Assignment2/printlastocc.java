import java.util.Scanner;
public class printlastocc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for (int i=arr.length-1;i>=0;i--) {
            if(arr[i]==target){
            System.out.println(i);
            break; 
            }
        }


        //hello
        sc.close();
    }
} 
    

