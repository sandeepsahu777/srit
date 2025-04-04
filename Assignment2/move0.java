import java.util.Arrays;
public class move0 {
    public static void moveZerosToEnd(int[] arr){
        int nonZeroIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                int temp=arr[i];
                arr[i]=arr[nonZeroIndex];
                arr[nonZeroIndex]=temp;
                nonZeroIndex++;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={0,1,2,0,3,0,4};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
