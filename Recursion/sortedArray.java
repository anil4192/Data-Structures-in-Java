
//Check if array is sorted
public class sortedArray {
    public static boolean isSortedd(int arr[],int i){
        //base case
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSortedd(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]= {1,7,3,4,5};
        int i =0;
        System.out.println(isSortedd(arr, i));
    }
}
