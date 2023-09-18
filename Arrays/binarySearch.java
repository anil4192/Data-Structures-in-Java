import java.util.*;
public class binarySearch {
    public static int binary_search(int arr[],int key)
    {
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>key)
            {
                e = mid - 1;
            }
            else
            {
                s = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,7,8,9};
        int key = 2;
        int ans = binary_search(arr,key);
        System.out.println("Key Found At : "+ans);
    }
}
