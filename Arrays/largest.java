import java.util.*;
public class largest {
    public static int getLargest(int arr[]){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxi)
            {
                maxi = arr[i];
            }
        }
        return maxi;

    }
    public static void main(String[] args) {
        int arr[] = {10,30,50,5,8,80};
        int ans = getLargest(arr);
        System.out.println("Largest is : "+ans);

    }
}
