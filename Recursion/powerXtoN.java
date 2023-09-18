import java.util.*;

// X to the powe n


public class powerXtoN {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }

        return x * power(x,n-1);
    }

    public static long power2(int N,int R){
        if(R==0){
            return 1;
        }

        long ans = power2(N, R/2) * power(N, R/2);

        if(R%2 !=0){
            ans = N * ans;
        }

        return ans;
    }
    public static void main(String[] args) {
        int x=2;
        int n =2;
        System.out.println(power(x, n));
        System.out.println(power2(x, n));
    }
}
