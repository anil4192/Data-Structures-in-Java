//First occurance of a element ina an array

public class firstOccurance {
    public static int first_occurance(int arr[],int key,int i){
        if(arr[i]==key){
            return i;
        }

        return first_occurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,6,7};
        int key = 3;
        int i=0;
        System.out.println(first_occurance(arr, key, i));
    }
}
