import java.util.*;
public class reverseArray {
    public static void reverse_array(int arr[]){
        int s =0;
        int e = arr.length-1;
        while(s<=e){
            //swap  
            int temp = arr[e];
            arr[e] = arr[s];
            arr[s] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        reverse_array(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
