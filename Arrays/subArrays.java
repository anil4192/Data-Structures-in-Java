public class subArrays {
    public static void printSubarrays(int arr[]){
        int n = arr.length;
        int ts = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k =i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Toatal subarrays: "+ts);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubarrays(arr);
    }
}
