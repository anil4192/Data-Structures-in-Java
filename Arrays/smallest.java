public class smallest {
    public static int getSmallest(int arr[]){
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){
                mini = arr[i];
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        int arr[] = {10,2,5,6,3,9,1};
        int ans = getSmallest(arr);
        System.out.println("Smallest Number is: "+ans);
        
    }
    
}
