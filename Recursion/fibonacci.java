import java.util.*;
//Fibonacci seris
//0 1 1 2 3 5 8 13 ...

public class fibonacci {
    public static int nFibonacci(int n){
        //base case
        if(n==0 ){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int ans = nFibonacci(n-1) + nFibonacci(n-2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which term U want: ");
        int n = sc.nextInt();
        System.out.println(n+" th Fibonacci term is : "+nFibonacci(n));
    }
}
