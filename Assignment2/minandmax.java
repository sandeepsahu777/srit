public class minandmax{
    public static void main(String[] args) {
        int[] arr={3,1,4,1,5,9,2};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max: "+max);
        System.out.println("min:"+min);
    }
}