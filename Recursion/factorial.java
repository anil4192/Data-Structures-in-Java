import java.util.*;


public class factorial {
    public static int fact(int n){
        if(n==1)
        {
            return 1;
        }
        int ans = n * fact(n-1);

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println("Factorial of "+n+" is: "+ans);

    }
}
