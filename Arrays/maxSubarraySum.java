public class maxSubarraySum {
    public static void subArraySum(int arr[]){
        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum : "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subArraySum(arr);
    }
}
