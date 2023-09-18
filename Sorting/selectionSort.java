public class selectionSort {
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++)
        {
            int minPos = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,9,0,1,5};
        selection_sort(arr);
        printArray(arr);
    }
}
