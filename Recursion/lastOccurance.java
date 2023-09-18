// last occurance of a element 

public class lastOccurance {
    public static int last_occ(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
         int isFound = last_occ(arr, key, i+1);

         if(isFound==-1 && arr[i]==key)
         {
            return i;
         }

         return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int key = 6;
        int i=0;
        System.out.println(last_occ(arr, key, i));
    }
}
